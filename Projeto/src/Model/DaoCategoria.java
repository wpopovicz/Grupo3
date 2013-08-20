/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Categoria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author `Popovicz
 */
public class DaoCategoria implements Dao<Categoria> {

    DaoGenerico dao = new DaoGenerico();

    private static Categoria converteRsParaCategoria(ResultSet rs) throws SQLException {
        Categoria c = new Categoria();
        c.setId(rs.getInt("id"));
        c.setRA(rs.getInt("ra"));
        c.setSIAPE(rs.getInt("siape"));
        c.setCargo(rs.getString("cargo"));

        return c;
    }

    @Override
    public void persist(Categoria c) throws Exception {

        if (c.getId() == 0) {
            insert(c);
        } else {
            update(c);
        }
    }

    public void insert(Categoria c) throws SQLException, Exception {
        dao.insert(c);

    }

    @Override
    public void delete(Categoria c) throws Exception {
        dao.delete(c);
    }

    @Override
    public Categoria retrieve(int id) throws Exception {
       Categoria c = (Categoria) dao.listarPorCodigo(id, Categoria.class);       
        return c;
    }

    public void update(Categoria c) throws SQLException{
//        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE categoria SET RA = ?, SIAPE = ?, CARGO = ? WHERE id = ?");
//        pst.setString(1, p.getNome());
//        pst.setString(2, p.getSenha());
//        pst.setString(3, p.getSaldo());
//        pst.setInt(5, p.getId());
//        pst.execute();
    }      

    @Override
    public List<Categoria> list(String whereClause, String orderClause) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> list(Filter... filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
