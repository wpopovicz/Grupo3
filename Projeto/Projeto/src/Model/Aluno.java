/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Popovicz
 */
public class Aluno extends Pessoa{
    private String RA;

    @Override
    public String toString() {
        return "Aluno{" + "RA=" + RA + '}';
    }

    public Aluno(String RA) {
        this.RA = RA;
    }

    public Aluno(String RA, int id, String nome, String Senha, String Saldo, String cod) {
        super(id, nome, Senha, Saldo, cod);
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public Aluno() {
    }
}
