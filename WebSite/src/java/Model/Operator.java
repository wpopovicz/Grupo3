/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.Categoria;
import Beans.Pessoa;

/**
 *
 * @author willian
 */
public enum Operator {
    IS_NULL, 
    IS_NOT_NULL, 
    LIKE, 
    EQUAL, 
    MORE_THAN, 
    MORE_THAN_EQUAL, 
    LESS_THAN, 
    LESS_THAN_EQUAL;
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();
        Categoria c = new Categoria();
        c.setCargo("Funcionário");
        float refeicao = 2.5f;
        c.setRefeicao(refeicao);
        HibernateDao h = new HibernateDao();
        h.persist(c);
    }
}
