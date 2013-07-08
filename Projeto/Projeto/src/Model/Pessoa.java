  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author a1294121
 */
public class Pessoa {
   private int id;
   private String nome;
   private String Senha;
   private String Saldo;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String Senha, String Saldo) {
        this.id = id;
        this.nome = nome;
        this.Senha = Senha;
        this.Saldo = Saldo;
    }
   
   

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", Senha=" + Senha + " , Saldo=" + Saldo + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return Senha;
    }
}
