package Model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author popovicz
 */
public class Conexao {

    private static Connection con;
    private static Driver driver;
    private static String usuario;
    private static String senha;
    private static String endereco;

    public Conexao() {
        usuario = "aluno";
        senha = "aluno";
        endereco = "jdbc:mysql://localhost:3306/aluno";
    }

    /**
     * Cria e retorna a conexao do driver JDBC ao banco de dados
     */
    public static Connection getConnection() {
        if (con == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aluno", "root", "root");
            } catch (SQLException erro) {
//                System.out.println("Falha na conexao, comando sql = " + erro);
                return null;
            } catch (Exception erro) {
                erro.printStackTrace();
                System.out.println("Nao foi possivel efetuar a conexao!");
                return null;
            }
        }
        return con;

    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        con.close();
        DriverManager.deregisterDriver(driver);
    }
}