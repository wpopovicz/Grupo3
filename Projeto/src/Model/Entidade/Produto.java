/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;

import Control.Metadata;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



/**
 *
 * @author Popovicz
 */
    @Entity
    public class Produto implements Serializable{
    @Id
    @GeneratedValue
    private Long codigo;
    @Column(length= 100)
    private String nome;
    //@Column(length= 200)
    @Column(length= 100)
    private String especificacoes;
    //@Column(precision = 2)
    @Column(length= 100)
    private float precoVenda;
    //@Column(precision = 2)
    @Column(length= 100)
    private float precoCusto;
    private boolean habilitadoVendas;
    
    @ManyToMany(cascade= CascadeType.PERSIST)
    private Set<Compra> compras = new HashSet<Compra>();
    
    public Produto() {
    }

    public Produto(Long codigo, String nome, String especificacoes, float precoVenda, float precoCusto, boolean habilitadoVendas) {
        this.codigo = codigo;
        this.nome = nome;
        this.especificacoes = especificacoes;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.habilitadoVendas = habilitadoVendas;
    }
    @Metadata(label="Codigo", minValue=0)
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }
    @Metadata(label="precoVenda", mask="000.00", required=true)
    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    @Metadata(label="precoCusto", mask="000.00", required=true)
    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public boolean isHabilitadoVendas() {
        return habilitadoVendas;
    }

    public Set<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }

    public void setHabilitadoVendas(boolean habilitadoVendas) {
        this.habilitadoVendas = habilitadoVendas;
    }
    @Override
    public String toString() {
        String valores = "codigo="+codigo+
                         ", nome="+nome+
                         ", preco custo="+precoCusto+
                         ", preco venda="+precoVenda+
                         ", habilitado vendas="+habilitadoVendas;
        
        return valores;
    }

    public void setcodigo(long aLong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setHabilitadoVendas(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
