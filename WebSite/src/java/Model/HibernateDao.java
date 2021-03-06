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
    protected static Class clazz;

    @Override
    public void persist(T o) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();

        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();

//        em.flush();

  //      em.close();

    }

    @Override
    public void delete(T o) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();

        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    @Override
    public T retrieve(String email) throws Exception {
        T o = null;
        if (!(email.equals(null))) {
            EntityManager em = HibernateFactory.getEntityManager();
            em.getTransaction().begin();
            o = (T) em.find(clazz, email);
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
    public List<T> list() throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        System.out.println(clazz);
        Query q = em.createQuery("FROM " + clazz.getSimpleName());
        List<T> result = q.getResultList();
        return result;
    }

    @Override
    public List<T> list(Filter... filters) throws Exception {
        Query q;
        List<T> result;
        EntityManager em = HibernateFactory.getEntityManager();
        if (filters == null || filters.length == 0) {
            q = em.createQuery(" FROM " + clazz.getSimpleName());
            result = q.getResultList();
        } else {
            String sql = "SELECT a FROM " + clazz.getSimpleName() + " a WHERE ";

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
            q = em.createQuery(sql);
            result = q.getResultList();
        }
        return result;
    }
}
