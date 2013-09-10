/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Compra;

/**
 *
 * @author willian
 */
public class DaoCompra extends HibernateDao<Compra>{
    public DaoCompra() {
        clazz = Compra.class;
    }
}
