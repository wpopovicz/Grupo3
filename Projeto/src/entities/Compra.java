/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
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
        
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<Produto> produtos = new HashSet<Produto>();
    
    @ManyToOne
    private Pessoa pessoa;

    public Compra() {
    }

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

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Compra(int id, Pessoa pessoa) {
        this.id = id;
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", dataCompra=" + dataCompra + ", produtos=" + produtos + ", pessoa=" + pessoa + '}';
    }
    
   
    
}

