/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1294121
 */
public class DaoPessoa implements Dao<Pessoa> {

    private static Pessoa converteRsParaPessoa(ResultSet rs) throws SQLException {
        Pessoa p = new Pessoa();
        p.setId(rs.getInt("id"));
        p.setNome(rs.getString("nome"));
        p.setEmail(rs.getString("email"));
        p.setSenha(rs.getString("senha"));
        return p;
    }

    @Override
    public void persist(Pessoa p) throws SQLException{
        if(p.getId()==0)
            insert(p);
        else
            update(p);
    }
    
    private static void insert(Pessoa p) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("INSERT INTO Pessoa (nome, email, senha) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, p.getNome());
        pst.setString(2, p.getEmail());
        pst.setString(3, p.getSenha());

        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        p.setId(rs.getInt(1));
        
    }
    
    @Override
    public Pessoa retrieve(int id) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Pessoa WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Pessoa p = converteRsParaPessoa(rs);
       
        return p;
    }

    private static void update(Pessoa p) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE Pessoa SET nome = ?, Email = ?,Senha = ? WHERE id = ?");
        pst.setString(1, p.getNome());
        pst.setString(2, p.getEmail());
        pst.setString(3,p.getSenha());
        pst.setInt(4, p.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Pessoa p) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Pessoa WHERE id = " + p.getId());
    }
    
    @Override
    public List<Pessoa> list() throws SQLException{
        List<Pessoa> Pessoas = new ArrayList<Pessoa>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Pessoa");
        
        while(rs.next()){
            Pessoa p = converteRsParaPessoa(rs);
            Pessoas.add(p);
        }
        
        return Pessoas;
    }
}
