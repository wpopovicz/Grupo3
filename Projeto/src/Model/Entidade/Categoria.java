/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;

import Control.Metadata;
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
    private int RA;
    @Column(length = 100)
    private int SIAPE;
    @Column(length = 100)
    private String cargo;
//    @Column(precision = 2)
//    private float refeicao;
//        

    
    public Categoria() {
    }

    public Categoria(int id) {
        this.id = id;
    }
    
//    public static String ALUNO="Aluno";
//    public static String PROFESSOR="Professor";
//    public static String FUNCIONARIO="Funcionário";

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", cargo=" + cargo + '}';
    }
    @Metadata(label="Id", minValue=0)
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

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public int getSIAPE() {
        return SIAPE;
    }

    public void setSIAPE(int SIAPE) {
        this.SIAPE = SIAPE;
    }
    
}