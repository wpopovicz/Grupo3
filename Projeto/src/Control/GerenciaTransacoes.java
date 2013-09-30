/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import entities.Pessoa;

/**
 *
 * @author Popovicz
 */
public class GerenciaTransacoes {
    public void debitar(Pessoa pes, float valor){
        pes.setSaldo(pes.getSaldo() - valor);
    }
    public void creditar(Pessoa pes, float valor){
        pes.setSaldo(pes.getSaldo() + valor);
    }
}
