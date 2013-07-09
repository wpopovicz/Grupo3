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
 * @author Popovicz
 */
public class DaoFuncionario implements Dao<Funcionario> {
   private static Funcionario converterRsParaFuncionario(ResultSet rs) throws SQLException {
        Funcionario f = new Funcionario();
        f.setSiape(rs.getString("siape"));

        return f;
    }

    @Override
    public void persist(Funcionario f) throws SQLException{
        if(f.getId()==0)
            insert(f);
        else
            update(f);
    }
    
    private static void insert(Funcionario f) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("INSERT INTO Funcionario (siape) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, f.getSiape());

        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        f.setId(rs.getInt(1));
        
    }
    
    @Override
    public Funcionario retrieve(int id) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Funcionario WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Funcionario f = converterRsParaFuncionario(rs);
       
        return f;
    }

    private static void update(Funcionario f) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE Funcionario SET siape = ? WHERE id = ?");
        pst.setString(1, f.getSiape());
        pst.setInt(2, f.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Funcionario f) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Funcionario WHERE id = " + f.getId());
    }
    
    @Override
    public List<Funcionario> list() throws SQLException{
        List<Funcionario> Funcionarios = new ArrayList<Funcionario>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Funcionario");
        
        while(rs.next()){
            Funcionario f = converterRsParaFuncionario(rs);
            Funcionarios.add(f);
        }
        
        return Funcionarios;
    }
}