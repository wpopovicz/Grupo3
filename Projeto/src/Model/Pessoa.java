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
    private String Email;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String Senha, String Saldo, String Email) {
        this.id = id;
        this.nome = nome;
        this.Senha = Senha;
        this.Saldo = Saldo;
        this.Email = Email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", Senha=" + Senha + ", Saldo=" + Saldo + ", Email=" + Email + '}';
    }

    public void setSenha(char[] password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
