/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willian
 */
public class NovoCredito {
    private String nome, email, valor;
    
    public List<String> validar(){
        List<String> mensagens = new ArrayList<String>();
        if(nome.trim().length() == 0) {
            mensagens.add("Nome não pode ser vazio!");
        }
        if(valor.trim().length() == 0) {
            mensagens.add("Nome não pode ser vazio!");
        }
        if(valor.trim().length() < 0) {
            mensagens.add("Nome não pode ser negativo!");
        }
        if(!email.contains("@")) {
            mensagens.add("E-mail está em formato incorreto!");
        }
        return (mensagens.isEmpty()?null:mensagens);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
