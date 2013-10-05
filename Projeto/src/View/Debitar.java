/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.FachadaBanco;
import Model.DaoPessoa;
import Model.DaoProduto;
import Model.Filter;
import Model.HibernateDao;
import Model.Operator;
import entities.Categoria;
import entities.Compra;
import entities.Pessoa;
import entities.Produto;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a1294121
 */
public class Debitar extends javax.swing.JFrame {

    private Visao telaAnterior;
    private AtualizarProduto atualizarProduto;
    private Produto produto;
    private Compra compra = new Compra();
    private Categoria categoria;
    private DaoProduto daoProduto = new DaoProduto();
    private DaoPessoa daoPessoa = new DaoPessoa();
    private HibernateDao hibernatedao = new HibernateDao();
    private Pessoa pessoa = new Pessoa();

    /**
     * Creates new form Debitar
     */
    public Debitar() throws Exception {
        initComponents();
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Preço Venda");
        jTable1.setModel(modelo);
//        carregarProduto();

        setLocationRelativeTo(null);
    }

    public Debitar(Visao telaAnterior) throws Exception {
        this();
        this.telaAnterior = telaAnterior;
    }

    public Debitar(AtualizarProduto atualizarProduto, Produto p) throws Exception {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdicionarProduto = new javax.swing.JButton();
        jButtonDiminuirProduto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Cancelar = new javax.swing.JButton();
        jTextFieldValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Débito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), java.awt.Color.black)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jLabel1.setText("R$");

        jLabel2.setText("RA/SIAPE:");

        jTextFieldRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRAActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Produto", "Valor R$"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/adicionar.png"))); // NOI18N
        jButtonAdicionarProduto.setToolTipText("Adicionar");
        jButtonAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarProdutoActionPerformed(evt);
            }
        });

        jButtonDiminuirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Excluir.png"))); // NOI18N
        jButtonDiminuirProduto.setToolTipText("Excluir");
        jButtonDiminuirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiminuirProdutoActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jTextFieldValor.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jButton1.setText("Debitar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRA))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDiminuirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancelar)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAdicionarProduto)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonDiminuirProduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Cancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarProdutoActionPerformed
        // Abrir a tela para adicionar o produto e valor para ser comprado:
        CompraProduto k = null;
        try {
            k = new CompraProduto(this);
            k.setVisible(true);
            k.setLocationRelativeTo(null);
        } catch (Exception ex) {
            Logger.getLogger(Debitar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonAdicionarProdutoActionPerformed

    private void jButtonDiminuirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiminuirProdutoActionPerformed
        // excluir da lista de compra o produto selecionado:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            int linha = jTable1.getSelectedRow();
            Produto p = daoProduto.list().get(linha);
            System.out.println(p.toString());


            jButtonDiminuirProduto.setEnabled(true);
            Object[] options = {"OK",
                "Cancel"};
            int n = JOptionPane.showOptionDialog(this,
                    "Deseja realmente excluir do carrinhoo produto"
                    + p.getNome() + " ?", "Excluir",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            if (n == JOptionPane.YES_OPTION) {
                //codigo para remover da tabela do carrinho               
                modelo.removeRow(linha);
                jTable1.setModel(modelo);
                atualizarModelo();
            }
        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Selecione um produto!");
            jButtonDiminuirProduto.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonDiminuirProdutoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (this.produto != null) {
            try {
                carregarProduto(null);
            } catch (Exception ex) {
                Logger.getLogger(Debitar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        telaAnterior.setEnabled(true);
        this.telaAnterior.toFront();
    }//GEN-LAST:event_formWindowClosed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
        telaAnterior.setEnabled(true);
        this.telaAnterior.toFront();
    }//GEN-LAST:event_CancelarActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        Pessoa p = new Pessoa();
        DaoPessoa daoP = new DaoPessoa();
        int RA = Integer.parseInt(jTextFieldRA.getText());
        float valor = Float.parseFloat(jTextFieldValor.getText());
        //cria a fachada com o banco
        Filter f = new Filter("codigo", Operator.EQUAL, RA);
        List<Pessoa> lista;
        try {
            lista = daoP.list(f);
            p = (Pessoa) lista.get(0);
            for (Pessoa e : lista) {
                p.setId(e.getId());
                p.setSaldo(e.getSaldo());
                p.setCategoria(e.getCategoria());
                p.setCodigo(e.getCodigo());
                p.setNome(e.getNome());
                p.setSenha(e.getSenha());
                p.setEmail(e.getEmail());

            }
            if (p.getSaldo() > valor) {
                double cod = p.getSaldo();
                double saldo = cod - valor;
                p.setSaldo(cod - valor);
                System.out.println(p);
                compra.setDataCompra(Calendar.getInstance());
                compra.setProdutos((Set<Produto>) produto);
                compra.setPessoa(p);
                hibernatedao.persist(compra);
                JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "saldo insulficiente!");
            }
        } catch (Exception ex) {
            
            Logger.getLogger(Debitar.class.getName()).log(Level.SEVERE, null, ex);
        }




    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRAActionPerformed
    }//GEN-LAST:event_jTextFieldRAActionPerformed

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
            java.util.logging.Logger.getLogger(Debitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Debitar d;
                try {
                    d = new Debitar();
                    d.setVisible(true);
                    d.setLocationRelativeTo(null);
                } catch (Exception ex) {
                    Logger.getLogger(Debitar.class.getName()).log(Level.SEVERE, null, ex);
                }


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionarProduto;
    private javax.swing.JButton jButtonDiminuirProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldRA;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
    // Pega produto selecionado da lista de compras

    public void carregarProduto(Produto pro) throws Exception {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        if (pro != null) {
            modelo.addRow(new String[]{
                pro.getNome(),
                pro.getPrecoVenda() + ""});
        }
        jTable1.setModel(modelo);
        atualizarModelo();
    }
    //Pega pessoa do debitar

    public void carregarPessoa(Pessoa p) {
        Pessoa pessoa = p;
        jTextFieldRA.setText(String.valueOf(pessoa.getCodigo()));
    }

    public void atualizarModelo() {
        float soma = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            float valor = Float.parseFloat(jTable1.getValueAt(i, 1).toString());
            soma += valor;
        }
        jTextFieldValor.setText(String.valueOf(soma));
    }
}
