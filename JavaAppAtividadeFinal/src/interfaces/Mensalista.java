/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus
 */
public class Mensalista extends javax.swing.JFrame {

    /**
     * Creates new form Mensalista
     */
    public Mensalista() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbMensal = new javax.swing.JTable();
        BtInserir = new javax.swing.JButton();
        BtAlterar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtConcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVe�culo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPlacadove�culo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Assinatura mensal");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Torne-se mensalista!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Pague R$ 200,00 por m�s e tenha a sua pr�pria vaga. ");

        TbMensal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome ", "CPF", "Ve�culo", "Placa do ve�culo"
            }
        ));
        jScrollPane1.setViewportView(TbMensal);

        BtInserir.setText("Inserir");
        BtInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInserirActionPerformed(evt);
            }
        });

        BtAlterar.setText("Alterar");
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        BtExcluir.setText("Excluir");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtConcluir.setText("Concluir");
        BtConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConcluirActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Ve�culo:");

        jLabel6.setText("Placa do ve�culo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtInserir)
                            .addComponent(BtAlterar)
                            .addComponent(BtExcluir))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVe�culo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtPlacadove�culo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(BtConcluir)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVe�culo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPlacadove�culo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtInserir)
                        .addGap(46, 46, 46)
                        .addComponent(BtAlterar)
                        .addGap(51, 51, 51)
                        .addComponent(BtExcluir)
                        .addGap(43, 43, 43)))
                .addGap(18, 18, 18)
                .addComponent(BtConcluir)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
        // TODO add your handling code here:
        if(TbMensal.getSelectedRow() != -1){
            TbMensal.setValueAt(txtNome.getText(), TbMensal.getSelectedRow(), 0);
            TbMensal.setValueAt(txtCPF.getText(), TbMensal.getSelectedRow(), 1);
            TbMensal.setValueAt(txtVe�culo.getText(), TbMensal.getSelectedRow(), 2);
            TbMensal.setValueAt(txtPlacadove�culo.getText(),TbMensal.getSelectedRow(), 3);
        }
    }//GEN-LAST:event_BtAlterarActionPerformed

    private void BtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInserirActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Mensal = (DefaultTableModel) TbMensal.getModel();
        Object [] dados = {txtNome.getText(),txtCPF.getText(),txtVe�culo.getText(),txtPlacadove�culo.getText()};
        Mensal.addRow(dados);
    }//GEN-LAST:event_BtInserirActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        // TODO add your handling code here:
         if(TbMensal.getSelectedRow() != -1){
            DefaultTableModel Produtos = (DefaultTableModel) TbMensal.getModel();
            Produtos.removeRow(TbMensal.getSelectedRow());
        }
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConcluirActionPerformed
        // TODO add your handling code here:
        ImageIcon java = new ImageIcon("C:\\Users\\mateus.zlcarmo\\Downloads\\java.png");
        if(TbMensal.getRowCount()== 0){
        JOptionPane.showMessageDialog(null, "ERRO!!! Tabela n�o preenchida", "Assinatura", 0);
        }
        JOptionPane.showMessageDialog(null, "Assinatura realizada com sucesso!!!", "Assinatura", 1,java);
        
    }//GEN-LAST:event_BtConcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Mensalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensalista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtConcluir;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtInserir;
    private javax.swing.JTable TbMensal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlacadove�culo;
    private javax.swing.JTextField txtVe�culo;
    // End of variables declaration//GEN-END:variables
}
