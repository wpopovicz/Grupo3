/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import Control.Metadata;
import Model.Filter;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




/**
 *
 * @author Popovicz
 */
    @Entity
    public class Produto implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    @Column(length= 100)
    private String nome;
    @Column(length= 200)
    private String especificacoes;
    @Column(precision = 2)
    private float precoVenda;
    @Column(precision = 2)
    private float precoCusto;
    private boolean habilitadoVendas;
        
    public Produto() {
    }

    public Produto(int id, String nome, String especificacoes, float precoVenda, float precoCusto, boolean habilitadoVendas) {
        this.id = id;
        this.nome = nome;
        this.especificacoes = especificacoes;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.habilitadoVendas = habilitadoVendas;
    }
    @Metadata(label="id", minValue=0)
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

    public void setHabilitadoVendas(boolean habilitadoVendas) {
        this.habilitadoVendas = habilitadoVendas;
    }
    @Override
    public String toString() {
        String valores = "id="+id+
                         ", nome="+nome+
                         ", preco custo="+precoCusto+
                         ", preco venda="+precoVenda+
                         ", habilitado vendas="+habilitadoVendas;
        
        return valores;
    }

   
}
