/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Pessoa;
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
   public static void main(String[] args) {
        ListaGen<Pessoa> lp = new ListaGen();
        lp.add(new Pessoa());
        lp.add(new Pessoa());
        lp.get(0).setNome("Primeira pessoa");
        lp.get(1).setNome("Segunda pessoa");
        
        List l = new ArrayList();
        l.add(new Pessoa());
        l.add(new Pessoa());
        ((Pessoa) l.get(0)).setNome("Primeira Pessoa");
        ((Pessoa) l.get(1)).setNome("sgunda Pessoa");
        
    }
}