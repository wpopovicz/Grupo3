/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294121
 */
public class Visao extends javax.swing.JFrame {

    /**
     * Creates new form Visao
     */
    public Visao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1Cliente = new javax.swing.JMenu();
        jMenuItemClienteCadastrar = new javax.swing.JMenuItem();
        jMenuItemClienteAlterar = new javax.swing.JMenuItem();
        jMenu2Produto = new javax.swing.JMenu();
        jMenuItemProdutoCadastro = new javax.swing.JMenuItem();
        jMenuItemProdutoAlterar = new javax.swing.JMenuItem();
        jMenu7Debitar = new javax.swing.JMenu();
        jMenu6Creditar = new javax.swing.JMenu();
        jMenu1Ajuda = new javax.swing.JMenu();
        jMenu2Sobre = new javax.swing.JMenu();

        jButton3.setText("jButton3");

        jMenu3.setText("jMenu3");

        jMenuItem3.setText("jMenuItem3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cartão Universitário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373341100_shopping_cart.png"))); // NOI18N
        jButton1.setToolTipText("Debitar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373341006_client.png"))); // NOI18N
        jToggleButton1.setToolTipText("Cliente");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373340942_03.png"))); // NOI18N
        jToggleButton2.setToolTipText("Creditar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jTextField1.setText("Consulta por Nome");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373341694_search_magnifying_glass_find.png"))); // NOI18N
        jButton2.setToolTipText("Pesquisa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/a1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28))
        );

        jMenuBar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMenuBar1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jMenuBar1FocusLost(evt);
            }
        });

        jMenu1Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373341006_client.png"))); // NOI18N
        jMenu1Cliente.setToolTipText("Cliente");

        jMenuItemClienteCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemClienteCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1375980201_executive.png"))); // NOI18N
        jMenuItemClienteCadastrar.setText("Cadastrar");
        jMenuItemClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteCadastrarActionPerformed(evt);
            }
        });
        jMenu1Cliente.add(jMenuItemClienteCadastrar);

        jMenuItemClienteAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemClienteAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1375980328_121.png"))); // NOI18N
        jMenuItemClienteAlterar.setText("Localizar");
        jMenuItemClienteAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteAlterarActionPerformed(evt);
            }
        });
        jMenu1Cliente.add(jMenuItemClienteAlterar);

        jMenuBar1.add(jMenu1Cliente);

        jMenu2Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/product.png"))); // NOI18N
        jMenu2Produto.setToolTipText("Produto");

        jMenuItemProdutoCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemProdutoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1375981249_product.png"))); // NOI18N
        jMenuItemProdutoCadastro.setText("Cadastrar");
        jMenuItemProdutoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoCadastroActionPerformed(evt);
            }
        });
        jMenu2Produto.add(jMenuItemProdutoCadastro);

        jMenuItemProdutoAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemProdutoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1375980328_121.png"))); // NOI18N
        jMenuItemProdutoAlterar.setText("Localizar");
        jMenuItemProdutoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoAlterarActionPerformed(evt);
            }
        });
        jMenu2Produto.add(jMenuItemProdutoAlterar);

        jMenuBar1.add(jMenu2Produto);

        jMenu7Debitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373341100_shopping_cart.png"))); // NOI18N
        jMenu7Debitar.setToolTipText("Debitar");
        jMenu7Debitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7DebitarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7Debitar);

        jMenu6Creditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373340942_03.png"))); // NOI18N
        jMenu6Creditar.setToolTipText("Creditar");
        jMenu6Creditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6CreditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6Creditar);

        jMenu1Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373341015_help-browser.png"))); // NOI18N
        jMenu1Ajuda.setToolTipText("Ajuda");
        jMenu1Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1AjudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1Ajuda);

        jMenu2Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1373342732_application-x-desktop.png"))); // NOI18N
        jMenu2Sobre.setToolTipText("Sobre");
        jMenu2Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2SobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2Sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Debitar d = new Debitar();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        Cliente c;
        try {
            c = new Cliente(this);
            c.setVisible(true);
        c.setLocationRelativeTo(null);
        } catch (Exception ex) {
            Logger.getLogger(Visao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        Credito s = new Credito();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        NewConsulta q = new NewConsulta();
        q.setVisible(true);
        q.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItemClienteAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteAlterarActionPerformed
        NewConsulta q = new NewConsulta();
        q.setVisible(true);
        q.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItemClienteAlterarActionPerformed

    private void jMenuBar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenuBar1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1FocusGained

    private void jMenuBar1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenuBar1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1FocusLost

    private void jMenuItemClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteCadastrarActionPerformed
       this.setEnabled(false);
        Cliente c;
        try {
            c = new Cliente(this);
            c.setVisible(true);
        c.setLocationRelativeTo(null);
        } catch (Exception ex) {
            Logger.getLogger(Visao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemClienteCadastrarActionPerformed

    private void jMenu1AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1AjudaMouseClicked
        Desktop desktop = null;
        desktop = Desktop.getDesktop();
        URI uri = null;
        try {
            String local = System.getProperty("user.dir"); 
            //uri = new URI("C:\\Users\\willian\\Desktop\\Grupo3\\Projeto\\Site");
            uri = new URI(local+"\\Site\\Help.xhtml");
            desktop.browse(uri);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (URISyntaxException use) {
            use.printStackTrace();
        }                            
    }//GEN-LAST:event_jMenu1AjudaMouseClicked

    private void jMenu2SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2SobreMouseClicked
        Sobre w = new Sobre();
        w.setVisible(true);
        w.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenu2SobreMouseClicked

    private void jMenu6CreditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6CreditarMouseClicked
       Credito s = new Credito();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenu6CreditarMouseClicked

    private void jMenu7DebitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7DebitarMouseClicked
        Debitar d = new Debitar();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenu7DebitarMouseClicked

    private void jMenuItemProdutoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoAlterarActionPerformed
        this.setEnabled(false);
        AtualizarProduto a = null;
        try {
            a = new AtualizarProduto(this);
        } catch (Exception ex) {
            Logger.getLogger(Visao.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItemProdutoAlterarActionPerformed

    private void jMenuItemProdutoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoCadastroActionPerformed
        this.setEnabled(false);
        CadastroProduto l = new CadastroProduto(this);
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItemProdutoCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Visao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Visao v = new Visao();
                v.setVisible(true);
                v.setLocationRelativeTo(null);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1Ajuda;
    private javax.swing.JMenu jMenu1Cliente;
    private javax.swing.JMenu jMenu2Produto;
    private javax.swing.JMenu jMenu2Sobre;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6Creditar;
    private javax.swing.JMenu jMenu7Debitar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemClienteAlterar;
    private javax.swing.JMenuItem jMenuItemClienteCadastrar;
    private javax.swing.JMenuItem jMenuItemProdutoAlterar;
    private javax.swing.JMenuItem jMenuItemProdutoCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
