/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulário;

import View.JFrameReport;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Exemplo de uso da lib JasperReports. Passos para uso:
 * - executar o script_banco.sql para criar base, tabelas e povoar o banco.
 * - executar o main() desta classe.
 * 
 * @author marcos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JRException {
//        new Main().relatorioPronto();
        //new Main().relatorioDeConsultaSQL();
        new Main().relatorioEmJFrame();
    }


    public void relatorioDeConsultaSQL() {
        try {
            // obtem conexao com BD
            Connection con = DBConnection.getConnection();

            // monta e executa SQL (nomes das colunas devem ser iguais aos dos campos no relatorio)
            String sql = "SELECT id AS contato_ID, nascimento AS contato_NASCIMENTO, "
                    + "nome AS contato_NOME, telefone AS contato_TELEFONE, "
                    + "tipo AS contato_TIPO FROM contato";
            ResultSet res = DBConnection.executeSQL(sql);

            // cria objeto JasperReports para resultado tipo ResultSet
            JRResultSetDataSource jrRS = new JRResultSetDataSource(res);

            // monta relatorio
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/ireportsteste/report1.jasper", new HashMap(), jrRS);
            
            // exibe em janela
            JasperViewer.viewReport(jasperPrint);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }
    }

    private void relatorioPronto() throws JRException {
        try {
            // obtem o arquivo de relatorio compilado
            URL arquivo = getClass().getResource("report1.jasper");

            // carrega o relatorio
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);

            // preenche o relatorio com os dados do BD
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), DBConnection.getConnection());

            // cria visualizador de relatorio
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            // mostra o visualizador
            jrviewer.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }
    }

    private void relatorioEmJFrame() throws JRException {
        try {
            // obtem o arquivo de relatorio compilado
            URL arquivo = getClass().getResource("report1.jasper");

            // carrega o relatorio
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);

            // preenche o relatorio com os dados do BD
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), DBConnection.getConnection());

            // cria visualizador de relatorio
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);

            // adicionar visualizador ao frame
            JFrameReport frame = new JFrameReport();
            // adicionamos o visualizador a um JPanel dentro do JFrame
            frame.getjPanelReport().add(jrviewer.getContentPane());
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }
    }
}