/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author imape
 */
public class Funcionario extends Pessoa{

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Funcionario(String codigo) {
        this.codigo = codigo;
    }

    public Funcionario(String codigo, int id, String nome, String Senha, String Saldo, String cod) {
        super(id, nome, Senha, Saldo, cod);
        this.codigo = codigo;
    }
    private String codigo;
}
