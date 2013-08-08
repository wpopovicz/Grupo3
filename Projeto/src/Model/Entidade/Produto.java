/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;

import javax.persistence.Entity;

/**
 *
 * @author Popovicz
 */
@Entity
public class Produto {
    private Long codigo;
    private String nome;
    private String especificacoes;
    private float precoVenda;
    private float precoCusto;
    private boolean habilitadoVendas;

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

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

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
  
}
