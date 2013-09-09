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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @Column(precision = 2)
    private float refeicao;
        
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<Produto> produtos = new HashSet<Produto>();
    
    @ManyToOne
    private Pessoa pessoa;
    
    public Compra() {

    }

    @Metadata(label="Id", minValue=0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", dataCompra=" + dataCompra + ", refeicao=" + refeicao + ", produtos=" + produtos + ", pessoa=" + pessoa + '}';
    }
 
    
}

