/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entidade.Aluno;
import Model.Entidade.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Paulo
 */
public class CreditarAluno {

    public static Pessoa converteRsParaPessoa(ResultSet rs) throws SQLException {
        Aluno a = new Aluno();
        a.setSaldo(rs.getString("saldo"));
        
        return a;
    }

    public static void update(Aluno a) throws SQLException{
        PreparedStatement pst =  Conection.prepareConnection().prepareStatement("UPDATE pessoa SET saldo = ? WHERE ra = ?");
        pst.setString(1, a.getSaldo());
        pst.setString(2, a.getRA());
        pst.execute();
}
}
