  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author a1294121
 */
@Entity
public class Pessoa implements Serializable{
    @Id
    @GeneratedValue()
    private int id;
    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String senha;
    @Column(length = 100)
    private String saldo;
    @Column(length = 100)
    private String email;
    @Column(length = 7)
    private int codigo;
    @ManyToOne
    private Categoria categoria;

    public Pessoa() {
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

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Pessoa(int id, String nome, String senha, String saldo, String email, int codigo, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
        this.email = email;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", senha=" + senha + ", saldo=" + saldo + ", email=" + email + ", codigo=" + codigo + ", categoria=" + categoria + '}';
    }

    
}
