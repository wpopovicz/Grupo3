package Model;

import Model.Entidade.Categoria;
import Model.Entidade.Compra;
import Model.Entidade.Pessoa;
import Model.Entidade.Produto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author popovicz
 */
public class DaoManager {
    
    private SessionFactory buildSessionFactory;
    
    public Session openSession(){
        AnnotationConfiguration cfg = Create();
        buildSessionFactory = cfg.buildSessionFactory();
        return buildSessionFactory.openSession();
    }
    
    public Session getCurrentSession(){
        AnnotationConfiguration cfg = Create();
        buildSessionFactory = cfg.buildSessionFactory();
        return buildSessionFactory.getCurrentSession();
    }
    private AnnotationConfiguration Create() {
            //alterei as configuracoes da conexao para poder mexer em casa, olhe isto caso der erro
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "root");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        cfg.setProperty("hibernate.connection.autocommit", "true");
        cfg.addAnnotatedClass(Pessoa.class);
        cfg.addAnnotatedClass(Categoria.class);
        cfg.addAnnotatedClass(Compra.class);
        cfg.addAnnotatedClass(Produto.class);        
        buildSessionFactory = cfg.buildSessionFactory();
        
        return cfg;
        
    }
    public void CriarBanco(){
        AnnotationConfiguration cfg = Create();
        SchemaExport se = new SchemaExport(cfg);
        se.setOutputFile("MyScript.sql");
        se.create(true, true);
    }
}