/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;

import Model.Entidade.Pessoa;

/**
 *
 * @author Popovicz
 */
public class Aluno extends Pessoa{
    private String RA;

    public Aluno() {
    }

    
    
    public Aluno(String RA) {
        this.RA = RA;
    }

    public Aluno(String RA, int id, String nome, String Senha, String Saldo, String Email) {
        super(id, nome, Senha, Saldo, Email);
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    @Override
    public String toString() {
        return "Aluno{" + "RA=" + RA + '}';
    }

    public void setRa(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
