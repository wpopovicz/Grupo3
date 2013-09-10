/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Produto;

/**
 *
 * @author willian
 */
public class DaoProduto extends HibernateDao<Produto>{
    public DaoProduto() {
        clazz = Produto.class;
    }
}
