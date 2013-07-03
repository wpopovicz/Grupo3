/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Popovicz
 */
public class DaoManager {
 private static final Map<Class, Dao> daos = new HashMap<Class, Dao>();
    
    static{
        daos.put(Pessoa.class, new DaoPessoa());       
    }
    

    private static Dao obtemDao(Class co) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return daos.get(co);
    }

    public static void persist(Object o) throws Exception {
        Dao daoObject = obtemDao(o.getClass());
        
        daoObject.persist(o);
    }

    public void delete(Object o) throws Exception {
        Dao daoObject = obtemDao(o.getClass());
        
        daoObject.delete(o);
    }

    public Object retrieve(Class tipoObjeto, int id) throws Exception {
        Dao daoObject = obtemDao(tipoObjeto);
        
        return daoObject.retrieve(id);
    }

    public List list(Class tipoObjeto) throws Exception {
        Dao daoObject = obtemDao(tipoObjeto);
        
        return daoObject.list();
    }    
}
