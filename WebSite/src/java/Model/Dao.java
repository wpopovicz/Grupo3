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
    void persist(T o)  throws Exception;
    void delete(T o)  throws Exception;
    T retrieve(String email)  throws Exception;
    List<T> list()  throws Exception;
    List<T> list(Filter... filters)  throws Exception;
}