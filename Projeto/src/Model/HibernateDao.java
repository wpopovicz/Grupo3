/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Popovicz
 */
public class HibernateDao<T> implements Dao<T> {

    Class classe = null;

    @Override
    public void persist(T o) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();

        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();

        em.flush();
        em.close();
    }

    @Override
    public void delete(T o) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();

        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    @Override
    public T retrieve(int id) throws Exception {
        T o = null;
        if (id > 0) {
            EntityManager em = HibernateFactory.getEntityManager();
            em.getTransaction().begin();
            o = (T) em.find(classe, id);
            em.getTransaction().commit();
        }
        return o;
    }

    /**
     *
     * @param whereClause
     * @param orderClause
     * @return
     * @throws Exception
     */
    @Override
    public List<T> list(String whereClause, String orderClause) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();

        Query q = em.createQuery("FROM" + classe.getSimpleName());
        List<T> result = q.getResultList();
        return result;
    }

    @Override
    public List<T> list(Filter... filters) throws Exception {
        Query q;
        List<T> result;
        EntityManager em = HibernateFactory.getEntityManager();
        if (filters == null || filters.length == 0) {
            q = em.createQuery(" FROM " + classe.getSimpleName());
            result = q.getResultList();
        } else {
            String sql = "SELECT * FROM " + classe.getSimpleName() + " WHERE ";

            for (int i = 0; i < filters.length; i++) {
                Filter f = filters[i];
                System.out.println(f);
                sql += f.getAttribute();
                switch (f.getOperator()) {
                    case IS_NOT_NULL:
                        sql += "IS NOT NULL";
                        break;
                    case IS_NULL:
                        sql += "IS NULL";
                        break;
                    case LIKE:
                        sql += " LIKE '%" + f.getValue() + "%'";
                        break;
                    case EQUAL:
                        sql += " ='" + f.getValue() + "'";
                        break;
                    case MORE_THAN:
                        sql += " >'" + f.getValue() + "'";
                        break;
                    case MORE_THAN_EQUAL:
                        sql += " >='" + f.getValue() + "'";
                        break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
                /* No ultimo elemento não se coloca o operador AND */
                if (i < filters.length - 1) {
                    sql += " AND ";
                }
            }
            q = em.createQuery(" FROM " + classe.getSimpleName() + sql);
            result = q.getResultList();
        }
        return result;
    }
}
