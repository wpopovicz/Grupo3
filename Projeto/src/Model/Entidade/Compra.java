/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author willian
 */
@Entity
public class Compra {
    @Id
    @GeneratedValue
    private int id;
    @Temporal(TemporalType.DATE)
    private Calendar dataCompra = Calendar.getInstance();
    private float refeicao;
        
    @ManyToMany(mappedBy="compras")
    private Set<Produto> Produtos = new HashSet<Produto>();
    
    @ManyToOne
    private Set<Pessoa> pessoas = new HashSet<Pessoa>();
    
    public Compra(int id, float refeicao) {
        this.id = id;
        this.refeicao = refeicao;
    }

    public Compra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  
    public float getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(float refeicao) {
        this.refeicao = refeicao;
    }

    public Calendar getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Calendar dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Set<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(Set<Produto> Produtos) {
        this.Produtos = Produtos;
    }

    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", dataCompra=" + dataCompra + ", refeicao=" + refeicao + ", Produtos=" + Produtos + ", pessoas=" + pessoas + '}';
    }
    

}

