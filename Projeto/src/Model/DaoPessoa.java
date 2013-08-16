/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Pessoa;
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
    public List<Pessoa> list(String whereClause, String orderClause) throws SQLException{
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        Statement st =  Conection.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM pessoa" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
            Pessoa p = converteRsParaPessoa(rs);
            pessoas.add(p);
        }
        
        return pessoas;
    }
    
//    @Override
//    public List<Pessoa> list(Filter... filters) throws SQLException{
//        
//        List<Pessoa> pessoas = new ArrayList<Pessoa>();
//        
//        ResultSet rs = null;
//        
//        /* Verifica se algum friltro foi fornecido para o método */
//        if(filters == null || filters.length == 0){
//            Statement st =  Conection.prepareConnection().createStatement();
//            rs =  st.executeQuery("SELECT * FROM pessoa");
//        }else{
//            String sql = "SELECT * FROM pessoa WHERE ";
//            
//            for(int i = 0; i < filters.length; i++){
//                Filter f = filters[i];
//                System.out.println(f);
//                switch(f.getOperator()){
//                    case IS_NOT_NULL: sql += f.getAttribute() + " IS NOT NULL"; break;
//                    case IS_NULL: sql += f.getAttribute() + " IS NULL"; break;
//                    case LIKE: sql += f.getAttribute() + " LIKE '%?" + f.getValue()+ "%'"; break;
//                    case EQUAL: sql += f.getAttribute() + "='?" + f.getValue()+ "'"; break;
//                    case MORE_THAN: sql += f.getAttribute() + ">?'" + f.getValue()+ "'"; break;
//                    case MORE_THAN_EQUAL: sql += f.getAttribute() + ">=?'" + f.getValue()+ "'"; break;
//                    default:
//                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
//                }
//                
//                /* No ultimo elemento não se coloca o operador AND */
//                if(i < filters.length -1){
//                    sql += " AND ";
//                }
//            }
//            PreparedStatement pst =  Conection.prepareConnection().prepareStatement(sql);
//            System.out.println("SQL:" + sql);
//            rs =  pst.executeQuery();
//        }
//        
//        /* Converte o ResultSet da query para uma lista de objetos */
//        while(rs.next()){
//            Pessoa p = converteRsParaPessoa(rs);
//            pessoas.add(p);
//        }
//        
//        return pessoas;
//    }
}
