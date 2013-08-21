/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import Model.Entidade.Produto;
import java.util.ArrayList;

/**
 *
 * @author imape
 */
public class RepositoriosManager {

    // metodos serao acessado usando padrao SINGLETON
    private static RepositoriosManager instancia;
    
    // contador de produtos
    private long contadorProdutos = 1;

    
    // guarda os dados de PRODUTOS
    private ArrayList<Produto> listaProdutos;
    
    
    // retorna a instancia do repositorio manager
    public static RepositoriosManager getInstance() {
        
        if (instancia == null) {
            
            instancia = new RepositoriosManager();
        }
        
        return instancia;
    }

    // construtor private
    private RepositoriosManager() {
        
        listaProdutos = new ArrayList<Produto>();
        
    }
    
    
    /**
     * Usado para obter o contador atual
     * @return o numero atual do contador
     */
    public long getContadorProdutos() {
        return contadorProdutos;
    }
    
    
    
    public void inserirProduto(Produto p) throws Exception {
        
        listaProdutos.add(p);
        contadorProdutos++; // atualizar contador de produtos
        
    }
    
    
    public ArrayList<Produto> obterListaProdutos() {
        
        return listaProdutos;
    }

    /**
     * Altera o produto.
     * 
     * @param p o produto a ser alterado 
     */
    public void modificarProduto(Produto p) {
        
        if (listaProdutos.contains(p)) {
            
            int index = listaProdutos.indexOf(p);
            listaProdutos.set(index, p);
            
        }
        
    }
    
    
}
