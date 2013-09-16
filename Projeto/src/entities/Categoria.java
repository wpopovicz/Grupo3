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

/**
 *
 * @author willian
 */
@Entity
public class Categoria implements Serializable{
    @Id
    @GeneratedValue()
    private int id;
    @Column(length = 100)
    private String cargo;
    @Column(precision = 2)
    private float refeicao;

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(float refeicao) {
        this.refeicao = refeicao;
    }

    public Categoria(int id, String cargo, float refeicao) {
        this.id = id;
        this.cargo = cargo;
        this.refeicao = refeicao;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", cargo=" + cargo + ", refeicao=" + refeicao + '}';
    }
    
   
}