/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Produto;

/**
 *
 * @author imape
 */
public class ControleProduto {

    public boolean cadastrarProduto(Produto q) {
        boolean result = false;
        if (q != null && q.getNome().length() > 0 && q.getEspecificacoes().length() > 0
                && q.getPrecoCusto() != 0.0f && q.getPrecoVenda() != 0.0f) {

            result = true;
        }
        return result;
    }
}
