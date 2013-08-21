/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Entidade.Produto;
import Model.HibernateDao;

/**
 *
 * @author imape
 */
public class ControleProduto {

private HibernateDao hibernatedao = new HibernateDao();
    public boolean cadastrarProduto(Produto p) throws Exception {
     
        boolean result = false;
        
        
        if (p != null && p.getNome().length() > 0
                && p.getEspecificacoes().length() > 0 && p.getPrecoCusto() != 0.0f
                && p.getPrecoVenda() != 0.0f) {
            
            // seta codigo valido
            p.setCodigo(RepositoriosManager.getInstance().getContadorProdutos());
            
            // insere no modelo de dados
            hibernatedao.persist(p);
            RepositoriosManager.getInstance().inserirProduto(p);
            System.out.println(p.toString());
            
            result = true;
        }
        
        
        return result;
    }

    public boolean atualizarProduto(Produto p) {
        
        
        boolean result = false;
        
        if (p != null && p.getNome().length() > 0
                && p.getEspecificacoes().length() > 0 && p.getPrecoCusto() != 0.0f
                && p.getPrecoVenda() != 0.0f) {
            
            
           
            RepositoriosManager.getInstance().modificarProduto(p);
            System.out.println("UPDATED -> " + p.toString());
            result = true;
        }
        
        
        return result;
        
        
    }
}
