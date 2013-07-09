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
   private String cod;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String Senha, String Saldo, String cod) {
        this.id = id;
        this.nome = nome;
        this.Senha = Senha;
        this.Saldo = Saldo;
        this.cod = cod;
    }
   
   

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", Senha=" + Senha + ", Saldo=" + Saldo + ", cod=" + cod + '}';
    }

    

    public String getcod() {
        return cod;
    }

    public void setcod(String cod) {
        this.cod = cod;
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
