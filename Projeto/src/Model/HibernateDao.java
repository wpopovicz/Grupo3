/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Categoria;
import Model.Entidade.Compra;
import Model.Entidade.Pessoa;
import Model.Entidade.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Popovicz
 */
public class HibernateDao<T> implements Dao<T> {

    Class classe = null;

    @Override
    public void persist(T o) throws Exception {
//        AnnotationConfiguration cfg = new AnnotationConfiguration();
//        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
//        cfg.setProperty("hibernate.show_sql", "true");
//        cfg.setProperty("hibernate.format_sql", "true");
//        cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
//        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
//        cfg.setProperty("hibernate.connection.user", "root");
//        cfg.setProperty("hibernate.connection.password", "root");
////        cfg.setProperty("hibernate.connection.autocommit", "true");
//
//        cfg.addAnnotatedClass(Pessoa.class);
//        cfg.addAnnotatedClass(Produto.class);
//        cfg.addAnnotatedClass(Compra.class);
//        cfg.addAnnotatedClass(Categoria.class);
//
//        SchemaExport se = new SchemaExport(cfg);
//
//        se.setOutputFile("MeuEsquema.sql");
//        se.execute(true, false, false, true);
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//
//        Session session = sessionFactory.openSession();


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
        Query query;
        T objeto = null;
        if (id > 0) {
            EntityManager em = HibernateFactory.getEntityManager();
            query = em.createQuery("FROM" + classe.getSimpleName() + " where id = " + id);
            objeto = (T) query.getSingleResult();
        }
        return objeto;

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

        Query query = em.createQuery("FROM" + classe.getSimpleName());

        return (List<T>) query;
    }

    @Override
    public List<T> list(Filter... filters) throws Exception {
        Query query;
        EntityManager em = HibernateFactory.getEntityManager();
        if (filters == null || filters.length == 0) {
            query = em.createQuery(" FROM " + classe.getSimpleName());
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
            query = em.createQuery(" FROM " + classe.getSimpleName() + sql);
        }
        return (List<T>) query;
    }
}
