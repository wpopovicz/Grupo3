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
public class DaoAluno implements Dao<Aluno> {
    
    private static Aluno converteRsParaAluno(ResultSet rs) throws SQLException {
        Aluno a = new Aluno();
        a.setRA(rs.getString("ra"));

        return a;
    }

    @Override
    public void persist(Aluno a) throws SQLException{
        if(a.getId()==0)
            insert(a);
        else
            update(a);
    }
    
    private static void insert(Aluno a) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("INSERT INTO Aluno (ra) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, a.getRA());

        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        a.setId(rs.getInt(1));
        
    }
    
    @Override
    public Aluno retrieve(int id) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Pessoa WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Aluno a = converteRsParaAluno(rs);
       
        return a;
    }

    private static void update(Aluno a) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE Aluno SET ra = ? WHERE id = ?");
        pst.setString(1, a.getRA());
        pst.setInt(2, a.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Aluno a) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Pessoa WHERE id = " + a.getId());
    }
    
    @Override
    public List<Aluno> list() throws SQLException{
        List<Aluno> Alunos = new ArrayList<Aluno>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Aluno");
        
        while(rs.next()){
            Aluno a = converteRsParaAluno(rs);
            Alunos.add(a);
        }
        
        return Alunos;
    }
}
