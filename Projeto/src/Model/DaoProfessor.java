/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Professor;
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
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("INSERT INTO pessoa (nome, senha, saldo, email, siape) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, w.getNome());
        pst.setString(2, w.getSenha());
        pst.setString(3, w.getSaldo());
        pst.setString(4, w.getEmail());
        pst.setString(5, w.getSiape());

        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        w.setId(rs.getInt(1));
        
    }
    
    @Override
    public Professor retrieve(int id) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM pessoa WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Professor w = converteRsParaProfessor(rs);
       
        return w;
    }

    private static void update(Professor w) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE pessoa SET nome = ?, Senha = ?, saldo = ?, email = ?, siape = ?, WHERE id = ?");
        pst.setString(1, w.getNome());
        pst.setString(2, w.getSenha());
        pst.setString(3, w.getSaldo());
        pst.setString(4, w.getEmail());
        pst.setString(5, w.getSiape());
        pst.setInt(6, w.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Professor w) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("DELETE FROM pessoa WHERE id = " + w.getId());
    }
    
    @Override
    public List<Professor> list(String whereClause, String orderClause) throws SQLException{
        List<Professor> professores = new ArrayList<Professor>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM pessoa" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
            Professor w = converteRsParaProfessor(rs);
            professores.add(w);
        }
        
        return professores;
    }
    
    @Override
    public List<Professor> list(Filter... filters) throws SQLException{
        
        List<Professor> professores = new ArrayList<Professor>();
        
        ResultSet rs = null;
        
        /* Verifica se algum friltro foi fornecido para o método */
        if(filters == null || filters.length == 0){
            Statement st =  Conection.prepareConnection().createStatement();
            rs =  st.executeQuery("SELECT * FROM pessoas");
        }else{
            String sql = "SELECT * FROM pessoas WHERE ";
            
            for(int i = 0; i < filters.length; i++){
                Filter f = filters[i];
                System.out.println(f);
                switch(f.getOperator()){
                    case IS_NOT_NULL: sql += f.getAttribute() + " IS NOT NULL"; break;
                    case IS_NULL: sql += f.getAttribute() + " IS NULL"; break;
                    case LIKE: sql += f.getAttribute() + " LIKE '%?" + f.getValue()+ "%'"; break;
                    case EQUAL: sql += f.getAttribute() + "='?" + f.getValue()+ "'"; break;
                    case MORE_THAN: sql += f.getAttribute() + ">?'" + f.getValue()+ "'"; break;
                    case MORE_THAN_EQUAL: sql += f.getAttribute() + ">=?'" + f.getValue()+ "'"; break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
                
                /* No ultimo elemento não se coloca o operador AND */
                if(i < filters.length -1){
                    sql += " AND ";
                }
            }
            PreparedStatement pst =  Conection.prepareConnection().prepareStatement(sql);
            System.out.println("SQL:" + sql);
            rs =  pst.executeQuery();
        }
        
        /* Converte o ResultSet da query para uma lista de objetos */
        while(rs.next()){
            Professor w = converteRsParaProfessor(rs);
            professores.add(w);
        }
        
        return professores;
    }
}

