/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ControleProduto;
import entities.Produto;
import Model.HibernateDao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author imape
 */
public class CadastroProduto extends javax.swing.JFrame {

    private Visao telaAnterior;
    private Produto produto;
    private AtualizarProduto atualizarProduto;
    private HibernateDao hibernatedao = new HibernateDao();

    /**
     * Creates new form CadastroProduto
     */
    private CadastroProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public CadastroProduto(Visao telaAnterior) {
        this();
        this.telaAnterior = telaAnterior;
    }

    public CadastroProduto(AtualizarProduto atualizarProduto, Produto p) {
        this();

        this.atualizarProduto = atualizarProduto;
        this.produto = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldnome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldvenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldcusto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), java.awt.Color.black)); // NOI18N

        jTextFieldnome.setToolTipText("Informe o nome do Produto");

        jLabel1.setText("Nome:");

        jToggleButton1.setText("Cancelar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Salvar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Informe as espicificações técnicas");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Especificação");

        jLabel3.setText("Preço Venda");
        jLabel3.setToolTipText("");

        jTextFieldvenda.setToolTipText("Informe o preço de venda");
        jTextFieldvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldvendaActionPerformed(evt);
            }
        });
        jTextFieldvenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldvendaKeyTyped(evt);
            }
        });

        jLabel4.setText("Preço Custo");

        jTextFieldcusto.setToolTipText("Informe o preço de custo");
        jTextFieldcusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldcustoKeyTyped(evt);
            }
        });

        jLabel5.setText("Habilitador de vendas");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Desabilitado", "Habilitado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldvenda)
                                    .addComponent(jTextFieldcusto)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldvenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldcusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldvendaActionPerformed
    }//GEN-LAST:event_jTextFieldvendaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // cancelar
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        System.out.println("Salvar aqui");
        Produto p = new Produto();

        String nome = jTextFieldnome.getText();
        String especificacoes = jTextArea1.getText();

        String precoVenda = jTextFieldvenda.getText(); // preco venda
        String precoCusto = jTextFieldcusto.getText(); // preco custo


        int itemSelecionado = jComboBox1.getSelectedIndex();

            int id = 0;
            float pv = 0.0f;
            float pc = 0.0f;
    
            try {
                pv = Float.parseFloat(precoVenda);
                pc = Float.parseFloat(precoCusto);
            } catch (Exception e) {
    
                JOptionPane.showMessageDialog(this,
                        "Preço inválido");
    
                return;
            }
    
            p = this.produto;
    
            if (p == null) {
                // criar um objeto Produto
                p = new Produto(id,
                        nome,
                        especificacoes,
                        pv,
                        pc,
                        itemSelecionado == 0 ? false : true);
    
    
            } else {
                // atualiza dados do produto
                p.setNome(nome);
                p.setEspecificacoes(especificacoes);
                p.setPrecoCusto(pc);
                p.setPrecoVenda(pv);
                p.setHabilitadoVendas(itemSelecionado == 0 ? false : true);
                
            }

            // chamar o controle para tentar cadastrar
            ControleProduto controlador = new ControleProduto();
            if (this.produto == null) {
                try {
                    if (controlador.cadastrarProduto(p)) {                    
                        JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
                        jTextFieldnome.setText("");
                        jTextFieldcusto.setText("");
                        jTextFieldvenda.setText("");
                        jTextArea1.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Cadastro Não realizado. "
                                + "\n\nFaltando dados");
             jTextFieldnome.setBorder(new LineBorder(Color.red));
             jTextFieldcusto.setBorder(new LineBorder(Color.red));
             jTextFieldvenda.setBorder(new LineBorder(Color.red));
             jTextArea1.setBorder(new LineBorder(Color.red));
        
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
    
            } else {
                try {
                    if (controlador.atualizarProduto(p)) {
                        JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
                        if (this.atualizarProduto != null) {
                            System.out.println("tentando repintar tela");
                            this.atualizarProduto.atualizarModelo();
                        }
                        this.dispose();
                        this.atualizarProduto.toFront();
    
                    } else {
                        JOptionPane.showMessageDialog(this, "Atualização Não realizada. "
                                + "\n\nFaltando dados");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
    
            }


    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // quando fechar ou ativa a visão ou atualizaproduto
        if (telaAnterior != null) {
            telaAnterior.setEnabled(true);
            this.telaAnterior.toFront();
        } else if (atualizarProduto != null) {
            atualizarProduto.setEnabled(true);
            atualizarProduto.toFront();
        }
    }//GEN-LAST:event_formWindowClosed

    private void jTextFieldvendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldvendaKeyTyped
        String caracteres = "0987654321.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldvendaKeyTyped

    private void jTextFieldcustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldcustoKeyTyped
        String caracteres = "0987654321.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldcustoKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (this.produto != null) {
            carregarProdutoNosCampos();
        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroProduto v = new CadastroProduto();
                v.setVisible(true);
                v.setLocationRelativeTo(null);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldcusto;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldvenda;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

    private void carregarProdutoNosCampos() {

        jTextFieldnome.setText(this.produto.getNome());
        jTextFieldvenda.setText(this.produto.getPrecoVenda() + "");
        jTextFieldcusto.setText(this.produto.getPrecoCusto() + "");
        jTextArea1.setText(this.produto.getEspecificacoes());
        jComboBox1.setSelectedIndex(this.produto.isHabilitadoVendas() ? 1 : 0);


    }
}
