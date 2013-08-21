/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;

import Control.Metadata;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author willian
 */
@Entity
public class Compra implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @Temporal(TemporalType.DATE)
    private Calendar dataCompra = Calendar.getInstance();
    private float refeicao;
        
    @ManyToMany(mappedBy="compras")
    private Set<Produto> Produtos = new HashSet<Produto>();
    
    @ManyToOne
    private Pessoa pessoa;
    public Compra() {
              
//        Pessoa p = new Pessoa();
//        p.setCategoria(Categoria.PROFESSOR);
//        p.getCategoria().equals(Categoria.ALUNO);
    }

    public Compra(int id, float refeicao, Pessoa pessoa) {
        this.id = id;
        this.refeicao = refeicao;
        this.pessoa = pessoa;
    }
    @Metadata(label="Id", minValue=0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Calendar dataCompra) {
        this.dataCompra = dataCompra;
    }

    public float getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(float refeicao) {
        this.refeicao = refeicao;
    }

    public Set<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(Set<Produto> Produtos) {
        this.Produtos = Produtos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", dataCompra=" + dataCompra + ", refeicao=" + refeicao + ", Produtos=" + Produtos + ", pessoa=" + pessoa + '}';
    }
    
}

