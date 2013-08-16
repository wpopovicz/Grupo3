/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author willian
 */
@Entity
public class Categoria {
    @Id
    @GeneratedValue()
    private int id;
    
    public static String ALUNO="Aluno";
    public static String PROFESSOR="Professor";
    public static String FUNCIONARIO="Funcionário";
}