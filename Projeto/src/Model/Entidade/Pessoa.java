  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;

/**
 *
 * @author a1294121
 */
public class Pessoa {

    private int id;
    private String nome;
    private String senha;
    private String saldo;
    private String email;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String Senha, String Saldo, String Email) {
        this.id = id;
        this.nome = nome;
        this.senha = Senha;
        this.saldo = Saldo;
        this.email = Email;
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
        return senha;
    }
    
    

    public void setSenha(char[] senha) {
        this.senha = new String(senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String Saldo) {
        this.saldo = Saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", senha=" + senha + ", saldo=" + saldo + ", email=" + email + '}';
    }

    
}
