/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Entidade.Pessoa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author imape
 */
public class ListaGen<T> {
List objs = new ArrayList();

    public int size() {
        return objs.size();
    }

    public boolean isEmpty() {
        return objs.isEmpty();
    }

    public boolean contains(T o) {
        return objs.contains(o);
    }

    public Iterator iterator() {
        return objs.iterator();
    }

    public T[] toArray() {
        return (T[]) objs.toArray();
    }

    public boolean add(T e) {
        return objs.add(e);
    }

    public boolean remove(T o) {
        return objs.remove(o);
    }

    public void clear() {
        objs.clear();
    }

    public T get(int index) {
        return (T) objs.get(index);
    }
   
}
