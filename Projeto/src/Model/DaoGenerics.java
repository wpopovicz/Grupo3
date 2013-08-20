/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author willian
 */
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;



public class DaoGenerics<T> implements Dao<T> {

    private Session session = null;
    protected Class<T> clazz;

    public DaoGenerics(Class<T> persistentClass) {
        this.clazz = persistentClass;
        open();
    }

    private void open() {
        if (session == null || !session.isOpen()) {
            session = HibernateUtil.getSessionFactory().openSession();
        }
    }

    @Override
    public void persistir(T o) {
        open();
        session.saveOrUpdate(o);
        session.flush();
        session.close();
    }

    @Override
    public void remover(T o) {
        open();
        session.delete(o);
        session.flush();
        session.close();
    }

    @SuppressWarnings("unchecked")
	@Override
    public T findById(int id) {
        open();
        T objeto = null;
        if (id > 0) {
            open();
            Query select = session.createQuery("From " + clazz.getSimpleName() + " where id = " + id);
            objeto = (T) select.uniqueResult();
            session.close();
        }
        return objeto;
    }

    @Override
    public List<T> listar(String filtro) {
        open();
        List<T> lista = null;
        if (filtro != null) {
            Query query = session.createQuery(filtro);
            lista = query.list();
            session.close();
        }
        return lista;
    }

    @Override
    public List<T> listar() {
        open();
        Query query = session.createQuery("From " + clazz.getSimpleName());
        List<T> lista = query.list();
        session.close();
        return lista;
    }
}
