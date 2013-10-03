/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.HibernateDao;
import entities.Pessoa;

/**
 *
 * @author Popovicz
 */
public class GerenciaTransacoes {
    private HibernateDao hibernatedao = new HibernateDao();
    public void debitar(Pessoa p, float valor) throws Exception{
        p.setSaldo(p.getSaldo() - valor);
        hibernatedao.persist(p);
    }
    public void creditar(Pessoa p, float valor) throws Exception{
        p.setSaldo(p.getSaldo() + valor);
        hibernatedao.persist(p);
    }
}
