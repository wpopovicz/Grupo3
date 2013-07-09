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
 * @author imape
 */
public class DaoProfessor implements Dao<Professor> { 
    
    private static Professor converteRsParaProfessor(ResultSet rs) throws SQLException {
        Professor w = new Professor();
        w.setSiape(rs.getString("siape"));

        return w;
    }

    @Override
    public void persist(Professor w) throws SQLException{
        if(w.getId()==0)
            insert(w);
        else
            update(w);
    }
    
    private static void insert(Professor w) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("INSERT INTO Professor (siape) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, w.getSiape());

        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        w.setId(rs.getInt(1));
        
    }
    
    @Override
    public Professor retrieve(int id) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Professor WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Professor w = converteRsParaProfessor(rs);
       
        return w;
    }

    private static void update(Professor w) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE Professor SET siape = ? WHERE id = ?");
        pst.setString(1, w.getSiape());
        pst.setInt(2, w.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Professor w) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Professor WHERE id = " + w.getId());
    }
    
    @Override
    public List<Professor> list() throws SQLException{
        List<Professor> Professores = new ArrayList<Professor>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Professor");
        
        while(rs.next()){
            Professor w = converteRsParaProfessor(rs);
            Professores.add(w);
        }
        
        return Professores;
    }
}

