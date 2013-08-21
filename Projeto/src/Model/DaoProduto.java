/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author willian
 */
public class DaoProduto implements Dao<Produto> {
    DaoGenerico dao = new DaoGenerico();
    
    private static Produto converteRsParaProduto(ResultSet rs) throws SQLException, Exception {
        Produto w = new Produto();
        w.setCodigo(rs.getLong("codigo"));
        w.setNome(rs.getString("nome"));
        w.setEspecificacoes(rs.getString("especificacoes"));
        w.setPrecoVenda(rs.getFloat("precovenda"));
        w.setPrecoCusto(rs.getFloat("precocusto"));
        w.setHabilitadoVendas(rs.getBoolean("habilitado"));
        return w;
    }

    @Override
    public void persist(Produto w) throws Exception {
         if(w.getCodigo()==0)
            insert(w);
        else
            update(w);
    }
     public void update(Produto w) throws SQLException{
        PreparedStatement pst =  Conexao.getConnection().prepareStatement("UPDATE produto SET nome = ?, especificacoes = ?, precovenda = ?, precocusto = ?, habilitado = ? WHERE id = ?");
        pst.setString(1, w.getNome());
        pst.setString(2, w.getEspecificacoes());
        pst.setFloat(3, w.getPrecoVenda());
        pst.setFloat(4, w.getPrecoVenda());
        pst.setBoolean(5, w.isHabilitadoVendas());
        pst.setLong(6, w.getCodigo());
        pst.execute();
    }   
        public List<Produto> list(String nome) throws SQLException{
        List produtos = dao.listarNome(nome, Produto.class);
//        
        return produtos;
    }
    
    public void insert(Produto w) throws SQLException, Exception{        
       dao.insert(w);
        
    }
    
    @Override
    public void delete(Produto w) throws Exception {
        dao.delete(w);
    }

    @Override
    public Produto retrieve(int id) throws Exception {
       Produto w = (Produto) dao.listarPorCodigo(id, Produto.class);       
        return w;
    }

    @Override
    public List<Produto> list(String whereClause, String orderClause) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> list(Filter... filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}