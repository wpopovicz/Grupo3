/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Categoria;
import Model.Entidade.Compra;
import Model.Entidade.Pessoa;
import Model.Entidade.Produto;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Popovicz
 */
public class HibernateDao implements Dao<Object>{
    Class classe = null;
    @Override
    public void persist(Object o) throws Exception {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.format_sql", "true");
        cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        cfg.setProperty("hibernate.connection.user", "root");
        cfg.setProperty("hibernate.connection.password", "root");
//        cfg.setProperty("hibernate.connection.autocommit", "true");

        cfg.addAnnotatedClass(Pessoa.class);
        cfg.addAnnotatedClass(Produto.class);
        cfg.addAnnotatedClass(Compra.class);
        cfg.addAnnotatedClass(Categoria.class);
        
        SchemaExport se = new SchemaExport(cfg);
        
        se.setOutputFile("MeuEsquema.sql");
        se.execute(true, false , false, true);
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession(); 
        
//      Map<String, String> map = new HashMap<String, String>();
//        map.put("hibernate.dialec","org.hibernate.dialect.MySQLDialect");
//        map.put("hibernate.hbm2ddl.auto","update");
//        map.put("hibernate.show_sql","true");
//        map.put("hibernate.format_sql","true");      
//        map.put("hibernate.connection.driver", "com.mysql.jdbc.Driver");
//        map.put("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
//        map.put("hibernate.connection.user", "aluno");
//        map.put("hibernate.connection.password", "aluno");
//        
//        map.add(Pessoa.class);
//        map.add(Produto.class);
//        map.add(Compra.class);
//        map.add(Categoria.class);

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);
        
//        EntityManager em = emf.createEntityManager();
        
        session.beginTransaction().begin();
        session.persist(o);
        session.beginTransaction().commit();
        
        session.flush();
        session.close();        
    }

    @Override
    public void delete(Object o) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        map.put("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        map.put("hibernate.connection.user", "aluno");
        map.put("hibernate.connection.password", "aluno");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    @Override
    public Object retrieve(int id) throws Exception {
        Query query;
        Object objeto = null;
        Map<String, String> map = new HashMap<String, String>();
        map.put("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        map.put("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        map.put("hibernate.connection.user", "aluno");
        map.put("hibernate.connection.password", "aluno");
        
        if(id > 0){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);
        EntityManager em = emf.createEntityManager();
        query = em.createQuery("FROM" + classe.getSimpleName() + " where id = " +id);
        objeto = (Object) query.getSingleResult();
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
    public List<Object> list(String whereClause, String orderClause) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        map.put("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        map.put("hibernate.connection.user", "aluno");
        map.put("hibernate.connection.password", "aluno");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("FROM" + classe.getSimpleName());

        return (List<Object>) query;
    }

    @Override
    public List<Object> list(Filter... filters) throws Exception {
        Query query;
        Map<String, String> map = new HashMap<String, String>();
        map.put("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        map.put("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        map.put("hibernate.connection.user", "aluno");
        map.put("hibernate.connection.password", "aluno");
        
         if(filters == null || filters.length == 0){
             
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);
        EntityManager em = emf.createEntityManager();
        query = em.createQuery("FROM" + classe.getSimpleName());
        
        }else{
            String sql = "SELECT * FROM"+ classe +"WHERE";
            
            for(int i = 0; i < filters.length; i++){
                Filter f = filters[i];
                System.out.println(f);
                switch(f.getOperator()){
                    case IS_NOT_NULL: sql += f.getAttribute() + " IS NOT NULL"; break;
                    case IS_NULL: sql += f.getAttribute() + " IS NULL"; break;
                    case LIKE: sql += f.getAttribute() + " LIKE '%?" + f.getValue()+ "%'"; break;
                    case EQUAL: sql += f.getAttribute() + "='?" + f.getValue()+ "'"; break;
                    case MORE_THAN: sql += f.getAttribute() + ">?'" + f.getValue()+ "'"; break;
                    case MORE_THAN_EQUAL: sql += f.getAttribute() + ">=?'" + f.getValue()+ "'"; break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
                
                /* No ultimo elemento não se coloca o operador AND */
                if(i < filters.length -1){
                    sql += " AND ";
                }
            }
             EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);
             EntityManager em = emf.createEntityManager();
             query = em.createQuery("FROM" + classe.getSimpleName()+ sql);
        }
     return (List<Object>) query;
    }
}
