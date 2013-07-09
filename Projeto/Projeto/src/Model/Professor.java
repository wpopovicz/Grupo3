/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Popovicz
 */
public class Professor extends Pessoa{
    private String Email;

    public Professor(String Email) {
        this.Email = Email;
    }

    public Professor(String Email, int id, String nome, String Senha, String Saldo) {
        super(id, nome, Senha, Saldo);
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Professor{" + "Email=" + Email + '}';
    }

    public Professor() {
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
