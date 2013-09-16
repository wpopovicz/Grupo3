/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import entities.Categoria;

/**
 *
 * @author willian
 */
public class DaoCategoria extends HibernateDao<Categoria>{
    public DaoCategoria() {
        clazz = Categoria.class;
    }
}
