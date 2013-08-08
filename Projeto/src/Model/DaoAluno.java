/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Aluno;
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
    public List<Aluno> list(String whereClause, String orderClause) throws SQLException{
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM pessoa" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
            Aluno  a= converteRsParaAluno(rs);
            alunos.add(a);
        }
        
        return alunos;
    }
    
    @Override
    public List<Aluno> list(Filter... filters) throws SQLException{
        
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        ResultSet rs = null;
        
        /* Verifica se algum friltro foi fornecido para o método */
        if(filters == null || filters.length == 0){
            Statement st =  Conection.prepareConnection().createStatement();
            rs =  st.executeQuery("SELECT * FROM pessoa");
        }else{
            String sql = "SELECT * FROM pessoa WHERE ";
            
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
            Aluno a = converteRsParaAluno(rs);
            alunos.add(a);
        }
        
        return alunos;
    }
}
