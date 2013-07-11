/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        p.setSenha(rs.getString("senha"));
        p.setSaldo(rs.getString("saldo"));
        p.setEmail(rs.getString("email"));
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
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("INSERT INTO pessoa (nome, senha, saldo, email) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, p.getNome());
        pst.setString(2, p.getSenha());
        pst.setString(3, p.getSaldo());
        pst.setString(4, p.getEmail());
        
        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        p.setId(rs.getInt(1));
        
    }
    
    @Override
    public Pessoa retrieve(int id) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM pessoa WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Pessoa p = converteRsParaPessoa(rs);
       
        return p;
    }

    public void update(Pessoa p) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE pessoa SET nome = ?, Senha = ?, saldo = ?, email = ? WHERE id = ?");
        pst.setString(1, p.getNome());
        pst.setString(2, p.getSenha());
        pst.setString(3, p.getSaldo());
        pst.setString(4, p.getEmail());
        pst.setInt(5, p.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Pessoa p) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("DELETE FROM pessoa WHERE id = " + p.getId());
    }
    
    @Override
    public List<Pessoa> list() throws SQLException{
        List<Pessoa> Pessoas = new ArrayList<Pessoa>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM pessoa");
        
        while(rs.next()){
            Pessoa p = converteRsParaPessoa(rs);
            Pessoas.add(p);
        }
        
        return Pessoas;
    }
}
