/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import entities.Produto;

/**
 *
 * @author willian
 */
public class DaoProduto extends HibernateDao<Produto>{
    public DaoProduto() {
        clazz = Produto.class;
    }
}
