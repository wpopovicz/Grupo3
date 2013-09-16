/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import entities.Pessoa;

/**
 *
 * @author willian
 */
public class DaoPessoa extends HibernateDao<Pessoa>{
    public DaoPessoa() {
        clazz = Pessoa.class;
    }
}
