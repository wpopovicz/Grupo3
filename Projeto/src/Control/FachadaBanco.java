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

    public void deposito(int codigo, String senha, float valor) {
        Pessoa p = gerenciaLogin.localizarPessoa(codigo, senha);
        if (p != null) {
            gerenciaTransacoes.debitar(p, valor);
            System.out.println("Debitado com sucesso!");
            JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
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
}
