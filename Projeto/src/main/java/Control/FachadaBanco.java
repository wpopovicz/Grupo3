/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import entities.Pessoa;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Popovicz
 */
public class FachadaBanco {

    private GerenciaLogin gerenciaLogin;
    private GerenciaTransacoes gerenciaTransacoes;

    public FachadaBanco(){
        try {
            gerenciaLogin = new GerenciaLogin();
        } catch (Exception ex) {
            Logger.getLogger(FachadaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
            gerenciaTransacoes = new GerenciaTransacoes();
        
    }

    public void debitar(int codigo, float valor) throws Exception {
        Pessoa p = gerenciaLogin.localizarPessoa(codigo);
        if (p != null) {
            gerenciaTransacoes.debitar(p, valor);
            System.out.println("Debitado com sucesso!");
        } else {
            System.out.println("Erro: Usuário Inexistente!");
        }
    }

    public void creditar(int codigo, float valor) throws Exception {
        Pessoa p = gerenciaLogin.localizarPessoa(codigo);
        if (p != null) {
            gerenciaTransacoes.creditar(p, valor);
            System.out.println("Creditado com sucesso!");
        } else {
            System.out.println("Erro: Usuário Inexistente!");
        }
    }

    public void addPessoa(Pessoa p) {
        gerenciaLogin.addPessoa(p);
    }

    public void debitar(String RA, String senha, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
