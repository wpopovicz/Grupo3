/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.Categoria;

/**
 *
 * @author willian
 */
public class DaoCategoria extends HibernateDao<Categoria>{
    public DaoCategoria() {
        clazz = Categoria.class;
    }
}
