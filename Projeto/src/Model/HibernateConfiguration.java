/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Categoria;
import Model.Entidade.Compra;
import Model.Entidade.Pessoa;
import Model.Entidade.Produto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author willian
 */
public class HibernateConfiguration {

    public static final String userName = "root";
    public static final String password = "root";
    public static final String dataBase = "aluno";
    private static AnnotationConfiguration cfg = null;
    private static SessionFactory factory = null;

    
    @Deprecated
    public static SessionFactory getSessionFactory() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.connection.username", userName);
            cfg.setProperty("hibernate.connection.password", password);
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/" + dataBase);
            cfg.setProperty("hibernate.show_sql", "false");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.connection.autocommit", "true");

            cfg.addAnnotatedClass(Pessoa.class);
            cfg.addAnnotatedClass(Categoria.class);
            cfg.addAnnotatedClass(Produto.class);
            cfg.addAnnotatedClass(Compra.class);



            factory = cfg.buildSessionFactory();
        }
        return factory;
    }
}

