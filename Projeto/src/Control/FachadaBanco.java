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
public class FachadaBanco {

    private GerenciaLogin gerenciaLogin;
    private GerenciaTransacoes gerenciaTransacoes;

    public FachadaBanco() {
        gerenciaLogin = new GerenciaLogin();
        gerenciaTransacoes = new GerenciaTransacoes();
    }

    public void debitar(int codigo, String senha, float valor) {
        Pessoa p = gerenciaLogin.localizarPessoa(codigo, senha);
        if (p != null) {
            gerenciaTransacoes.debitar(p, valor);
            System.out.println("Debitado com sucesso!");
        } else {
            System.out.println("Erro: Usuário Inexistente!");
        }
    }

    public void creditar(int codigo, String senha, float valor) {
        Pessoa p = gerenciaLogin.localizarPessoa(codigo, senha);
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
