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
    private String Siape;

    @Override
    public String toString() {
        return "Professor{" + "siape=" + Siape + '}';
    }

    public String getSiape() {
        return Siape;
    }

    public void setSiape(String Siape) {
        this.Siape = Siape;
    }

    public Professor(String Siape) {
        this.Siape = Siape;
    }

    public Professor() {
    }

    public Professor(String Siape, int id, String nome, String Senha, String Saldo, String cod) {
        super(id, nome, Senha, Saldo, cod);
        this.Siape = Siape;
    }

}