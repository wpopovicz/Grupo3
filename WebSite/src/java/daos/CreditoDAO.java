/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import Beans.Creditar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willian
 */
public class CreditoDAO {

    public static void insert(Creditar c) {
        PreparedStatement ps = null;
        try {
            ps = DBConnection.prepareStatement("INSERT INTO Palpite(campeao,vice,palpiteiro) VALUES (?,?)");
            ps.setString(1, c.getValor());
            ps.setInt(2, c.getId_usuario());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }
    public static Creditar find(int id) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = DBConnection.prepareStatement("SELECT * FROM Usuario WHERE idUsuario=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            Creditar usuario = null;
            if (rs.next()) {
                usuario = new Creditar();
                usuario.setId_usuario(rs.getInt("id"));
                usuario.setValor(rs.getString("valor"));
            }
            return usuario;

        } finally {
            rs.close();
            ps.close();
        }
    }
    public List<Creditar> listarTodosCreditos() {
        List<Creditar> creditados = new ArrayList<Creditar>();
        PreparedStatement ps = null;
        try {
            ps = DBConnection.prepareStatement("SELECT * FROM Palpite");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Creditar c = new Creditar();
                String valor = rs.getString("valor");
                int id_usuario = rs.getInt("cliente");
                
                c.setValor(valor);
                c.setId_usuario(id_usuario);
                creditados.add(c);
            }
            rs.close();

        } catch (Exception e) {
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
        return creditados;
    }

    
}
