    /* 
 * To change this template, choose Tools | Templates 
 * and open the template in the editor. 
 */
package Model;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DaoGenerico {

    private DaoManager daoManager = new DaoManager();
    private Session session;
    private Transaction transaction;

    public DaoGenerico() {
    }

    public boolean insert(Object obj) {
        session = daoManager.openSession();
        try {
            transaction = session.beginTransaction();
            session.save(obj);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            System.out.println("Save_HibernateDAO: " + e);
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean update(Object obj) {
        session = daoManager.openSession();
        try {
            transaction = session.beginTransaction();
            session.update(obj);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            System.out.println("Update_HibernateDAO: " + e);
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }

    }

    public boolean persist(Object obj) {
        session.close();
        session = daoManager.openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(obj);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            System.out.println("Update_HibernateDAO: " + e);
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean delete(Object obj) {
        session.close();
        session = daoManager.openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(obj);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            System.out.println("Delete_HibernateDAO: " + e);
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }

    }

    public List listarTodos(Class classe) {
        List<Object> resultList = null;
        session = daoManager.openSession();
        try {
            transaction = session.beginTransaction();
            resultList = session.createCriteria(classe).list();
            session.flush();
            transaction.commit();
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e);
            transaction.rollback();
        } finally {
            session.close();
            return resultList;
        }
    }

    public Object listarPorCodigo(long code, Class classe) {
        Object obj = null;
        session = daoManager.openSession();
        try {
            transaction = session.beginTransaction();
            obj = session.load(classe, code);
            transaction.commit();
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e);
            transaction.rollback();
        } finally {
//            session.close();
            return obj;

        }

    }

    public List listarNome(String name, Class classe) {
        List<Object> resultList = null;
        session = daoManager.openSession();
        try {
            transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(classe).add(Restrictions.ilike("nome", "%" + name + "%"));
            resultList = criteria.list();
            transaction.commit();
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e);
            transaction.rollback();
        } finally {
//            session.close();
            return resultList;
        }
    }
    
}
