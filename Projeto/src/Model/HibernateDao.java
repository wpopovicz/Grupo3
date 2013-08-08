/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Aluno;
import Model.Entidade.Funcionario;
import Model.Entidade.Pessoa;
import Model.Entidade.Produto;
import Model.Entidade.Professor;
import java.sql.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Popovicz
 */
public class HibernateDao implements Dao<Object>{
    @Override
    public void persist(Object o) throws Exception {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.format_sql", "true");
        cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        cfg.setProperty("hibernate.connection.user", "aluno");
        cfg.setProperty("hibernate.connection.password", "aluno");
//        cfg.setProperty("hibernate.connection.autocommit", "true");

        cfg.addAnnotatedClass(Pessoa.class);
        cfg.addAnnotatedClass(Aluno.class);
        cfg.addAnnotatedClass(Funcionario.class);
        cfg.addAnnotatedClass(Professor.class);
        cfg.addAnnotatedClass(Produto.class);
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession(); 
        
        session.beginTransaction().begin();
        session.persist(o);
        session.beginTransaction().commit();
        
        session.flush();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void delete(Object o) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Object o, Connection con) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object retrieve(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Object> list(String whereClause, String orderClause) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Object> list(Filter... filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
