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

        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("INSERT INTO pessoa (nome, senha, saldo, email, ra) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, a.getNome());
        pst.setString(2, a.getSenha());
        pst.setString(3, a.getSaldo());
        pst.setString(4, a.getEmail());
        pst.setString(5, a.getRA());

        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        a.setId(rs.getInt(1));
        
    }
    
    @Override
    public Aluno retrieve(int id) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM pessoa WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Aluno a = converteRsParaAluno(rs);
       
        return a;
    }

    public void update(Aluno a) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE pessoa SET nome = ?, Senha = ?, saldo = ?, email = ?, ra = ?, WHERE id = ?");
        pst.setString(1, a.getNome());
        pst.setString(2, a.getSenha());
        pst.setString(3, a.getSaldo());
        pst.setString(4, a.getEmail());
        pst.setString(5, a.getRA());
        pst.setInt(6, a.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Aluno a) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("DELETE FROM pessoa WHERE id = " + a.getId());
    }
    
    @Override
    public List<Aluno> list() throws SQLException{
        List<Aluno> Alunos = new ArrayList<Aluno>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM pessoa");
        
        while(rs.next()){
            Aluno a = converteRsParaAluno(rs);
            Alunos.add(a);
        }
        
        return Alunos;
    }
}
