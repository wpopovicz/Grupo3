/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Funcionario;
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
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("INSERT INTO pessoa (nome, senha, saldo, email, siape) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, f.getNome());
        pst.setString(2, f.getSenha());
        pst.setString(3, f.getSaldo());
        pst.setString(4, f.getEmail());
        pst.setString(5, f.getSiape());
        
        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        f.setId(rs.getInt(1));
        
    }
    
    @Override
    public Funcionario retrieve(int id) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM pessoa WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Funcionario f = converterRsParaFuncionario(rs);
       
        return f;
    }

    private static void update(Funcionario f) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE pessoa SET nome = ?, Senha = ?, saldo = ?, email = ?, siape = ?, WHERE id = ?");
        pst.setString(1, f.getNome());
        pst.setString(2, f.getSenha());
        pst.setString(3, f.getSaldo());
        pst.setString(4, f.getEmail());
        pst.setString(5, f.getSiape());
        pst.setInt(6, f.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Funcionario f) throws SQLException{
        Statement st =  Conection.prepareConnection().createStatement();                                
        st.execute("DELETE FROM pessoa WHERE id = " + f.getId());
    }
    
     @Override
    public List<Funcionario> list(String whereClause, String orderClause) throws SQLException{
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM pessoa" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
            Funcionario f = converterRsParaFuncionario(rs);
            funcionarios.add(f);
        }
        
        return funcionarios;
    }
    
    @Override
    public List<Funcionario> list(Filter... filters) throws SQLException{
        
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
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
            Funcionario f = converterRsParaFuncionario(rs);
            funcionarios.add(f);
        }
        
        return funcionarios;
    }
}