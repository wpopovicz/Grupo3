/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Popovicz
 */
public class Funcionario extends Pessoa{
    private String Siape;

    public Funcionario() {
    }

    public Funcionario(String Siape) {
        this.Siape = Siape;
    }

    public Funcionario(String Siape, int id, String nome, String Senha, String Saldo, String Email) {
        super(id, nome, Senha, Saldo, Email);
        this.Siape = Siape;
    }

    public String getSiape() {
        return Siape;
    }

    public void setSiape(String Siape) {
        this.Siape = Siape;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "Siape=" + Siape + '}';
    }
     
}
