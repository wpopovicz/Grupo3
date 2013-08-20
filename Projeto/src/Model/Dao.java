/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author a1294121
 */
public interface Dao<T> {

    void persistir(T entidade);

    void remover(T entidade);

    T findById(int id);

    List<T> listar(String filtro);

    List<T> listar();
}