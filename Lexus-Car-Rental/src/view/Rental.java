/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Kellermann Wo
 */
public class Rental extends javax.swing.JFrame {

    /**
     * Creates new form PersonRegistration
     */
    public Rental() {
        initComponents();
        desabilitarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_aluguel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_salvar = new javax.swing.JButton();
        jButton_consultar = new javax.swing.JButton();
        jButton_alterar = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();
        jLabel_codigo = new javax.swing.JLabel();
        jText_id_aluguel = new javax.swing.JTextField();
        jLabel_data = new javax.swing.JLabel();
        jText_data_aluguel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jCheckBox_hatch = new javax.swing.JCheckBox();
        jComboBox_modelo_carro_hatch = new javax.swing.JComboBox<>();
        jFormattedTextField_valor = new javax.swing.JFormattedTextField();
        jLabel_hatch = new javax.swing.JLabel();
        jLabel_valor = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jCheckBox_sedam = new javax.swing.JCheckBox();
        jLabel_sedam = new javax.swing.JLabel();
        jCheckBox_suv = new javax.swing.JCheckBox();
        jLabel_suv = new javax.swing.JLabel();
        jComboBox_modelo_carro_sedam = new javax.swing.JComboBox<>();
        jComboBox_modelo_carro_suv = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField_data_retirada = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField_data_devolucao = new javax.swing.JFormattedTextField();
        jComboBox_Cliente = new javax.swing.JComboBox();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("background"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1040, 684));
        setResizable(false);
        setSize(new java.awt.Dimension(1026, 684));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_aluguel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel_aluguel.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_aluguel.setText("A L U G A R    V E Í C U L O");
        getContentPane().add(jLabel_aluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 815, 14));

        jButton_salvar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_salvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_salvar.setForeground(new java.awt.Color(204, 204, 204));
        jButton_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        jButton_salvar.setText("Salvar");
        jButton_salvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_salvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 130, -1));

        jButton_consultar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_consultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_consultar.setForeground(new java.awt.Color(204, 204, 204));
        jButton_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search.png"))); // NOI18N
        jButton_consultar.setText("Consultar");
        jButton_consultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_consultar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 130, -1));

        jButton_alterar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_alterar.setForeground(new java.awt.Color(204, 204, 204));
        jButton_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        jButton_alterar.setText("Alterar");
        jButton_alterar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_alterar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 130, -1));

        jButton_excluir.setBackground(new java.awt.Color(0, 0, 0));
        jButton_excluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_excluir.setForeground(new java.awt.Color(204, 204, 204));
        jButton_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        jButton_excluir.setText("Excluir");
        jButton_excluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_excluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 130, -1));

        jButton_limpar.setBackground(new java.awt.Color(51, 51, 51));
        jButton_limpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_limpar.setForeground(new java.awt.Color(204, 204, 204));
        jButton_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear.png"))); // NOI18N
        jButton_limpar.setText("Limpar");
        jButton_limpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_limpar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_limpar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 110, 40));

        jLabel_codigo.setText("Código:");
        getContentPane().add(jLabel_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 23));

        jText_id_aluguel.setBackground(new java.awt.Color(102, 102, 102));
        jText_id_aluguel.setForeground(new java.awt.Color(204, 204, 204));
        jText_id_aluguel.setText("00001");
        jText_id_aluguel.setEnabled(false);
        jText_id_aluguel.setMinimumSize(new java.awt.Dimension(6, 22));
        jText_id_aluguel.setRequestFocusEnabled(false);
        jText_id_aluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_id_aluguelActionPerformed(evt);
            }
        });
        getContentPane().add(jText_id_aluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, 23));

        jLabel_data.setText("DATA:");
        getContentPane().add(jLabel_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 23));

        jText_data_aluguel.setText("21/02/2021");
        jText_data_aluguel.setMinimumSize(new java.awt.Dimension(6, 22));
        jText_data_aluguel.setRequestFocusEnabled(false);
        jText_data_aluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_data_aluguelActionPerformed(evt);
            }
        });
        getContentPane().add(jText_data_aluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 90, 23));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 224, 815, 20));

        jCheckBox_hatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_hatchActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox_hatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jComboBox_modelo_carro_hatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Onix", "Sandero" }));
        getContentPane().add(jComboBox_modelo_carro_hatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, 30));

        jFormattedTextField_valor.setText("120");
        jFormattedTextField_valor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jFormattedTextField_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 140, 35));

        jLabel_hatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hatch.jpg"))); // NOI18N
        getContentPane().add(jLabel_hatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 200, 190));

        jLabel_valor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_valor.setText("Valor Total Aluguel R$:");
        getContentPane().add(jLabel_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 140, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 534, 815, 20));

        jCheckBox_sedam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_sedamActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox_sedam, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        jLabel_sedam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sedam.jpg"))); // NOI18N
        getContentPane().add(jLabel_sedam, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 200, 190));

        jCheckBox_suv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_suvActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox_suv, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        jLabel_suv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/suv.jpg"))); // NOI18N
        getContentPane().add(jLabel_suv, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 200, 190));

        jComboBox_modelo_carro_sedam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voyage", "Ka Sedam" }));
        getContentPane().add(jComboBox_modelo_carro_sedam, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 200, 30));

        jComboBox_modelo_carro_suv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duster", "Spin" }));
        getContentPane().add(jComboBox_modelo_carro_suv, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 80, 20));

        try {
            jFormattedTextField_data_retirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_data_retirada.setText("01122020");
        jFormattedTextField_data_retirada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jFormattedTextField_data_retirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField_data_retiradaActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField_data_retirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Retirada:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Devolução:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, -1, 20));

        try {
            jFormattedTextField_data_devolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_data_devolucao.setText("05122020");
        jFormattedTextField_data_devolucao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jFormattedTextField_data_devolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 100, 30));

        getContentPane().add(jComboBox_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 300, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.setAlignmentY(0.0F);
        background.setFocusCycleRoot(true);
        background.setPreferredSize(new java.awt.Dimension(1030, 690));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1030, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvarActionPerformed

         /*if (jCheckBox_masculino.isSelected()) {
                p.setSexo("Masculino");
            } else if (jCheckBox_feminino.isSelected()) {
                p.setSexo("Feminino");
            } else {
                JOptionPane.showMessageDialog(this, "Escolha um dos sexos!", "Atencao", JOptionPane.WARNING_MESSAGE);
            }*/

    }//GEN-LAST:event_jButton_salvarActionPerformed

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_consultarActionPerformed

    private void jButton_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_alterarActionPerformed

    private void jButton_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_excluirActionPerformed

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed

        //Botão Limpar:
        //Metodo limpar, limpa todos os campos preenchidos / reseta alguns campos para o dado mais usado!
         Limpar();
    }//GEN-LAST:event_jButton_limparActionPerformed

    private void jText_id_aluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_id_aluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_id_aluguelActionPerformed

    private void jText_data_aluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_data_aluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_data_aluguelActionPerformed

    private void jCheckBox_hatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_hatchActionPerformed
        // TODO add your handling code here:

        jCheckBox_sedam.setSelected(false);
        jCheckBox_suv.setSelected(false);
        jComboBox_modelo_carro_hatch.setEnabled(true);
        jComboBox_modelo_carro_sedam.setEnabled(false);
        jComboBox_modelo_carro_suv.setEnabled(false);
        jComboBox_modelo_carro_sedam.setSelectedIndex(-1);
        jComboBox_modelo_carro_suv.setSelectedIndex(-1);
    }//GEN-LAST:event_jCheckBox_hatchActionPerformed

    private void jCheckBox_sedamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_sedamActionPerformed
        // TODO add your handling code here:

        jCheckBox_hatch.setSelected(false);
        jCheckBox_suv.setSelected(false);
        jComboBox_modelo_carro_hatch.setEnabled(false);
        jComboBox_modelo_carro_sedam.setEnabled(true);
        jComboBox_modelo_carro_suv.setEnabled(false);
        jComboBox_modelo_carro_hatch.setSelectedIndex(-1);
        jComboBox_modelo_carro_suv.setSelectedIndex(-1);
    }//GEN-LAST:event_jCheckBox_sedamActionPerformed

    private void jCheckBox_suvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_suvActionPerformed
        // TODO add your handling code here:

        jCheckBox_hatch.setSelected(false);
        jCheckBox_sedam.setSelected(false);
        jComboBox_modelo_carro_hatch.setEnabled(false);
        jComboBox_modelo_carro_sedam.setEnabled(false);
        jComboBox_modelo_carro_suv.setEnabled(true);
        jComboBox_modelo_carro_hatch.setSelectedIndex(-1);
        jComboBox_modelo_carro_sedam.setSelectedIndex(-1);
    }//GEN-LAST:event_jCheckBox_suvActionPerformed

    private void jFormattedTextField_data_retiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField_data_retiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField_data_retiradaActionPerformed

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
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton_alterar;
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JButton jButton_excluir;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JCheckBox jCheckBox_hatch;
    private javax.swing.JCheckBox jCheckBox_sedam;
    private javax.swing.JCheckBox jCheckBox_suv;
    private javax.swing.JComboBox jComboBox_Cliente;
    private javax.swing.JComboBox<String> jComboBox_modelo_carro_hatch;
    private javax.swing.JComboBox<String> jComboBox_modelo_carro_sedam;
    private javax.swing.JComboBox<String> jComboBox_modelo_carro_suv;
    private javax.swing.JFormattedTextField jFormattedTextField_data_devolucao;
    private javax.swing.JFormattedTextField jFormattedTextField_data_retirada;
    private javax.swing.JFormattedTextField jFormattedTextField_valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_aluguel;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_hatch;
    private javax.swing.JLabel jLabel_sedam;
    private javax.swing.JLabel jLabel_suv;
    private javax.swing.JLabel jLabel_valor;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jText_data_aluguel;
    private javax.swing.JTextField jText_id_aluguel;
    // End of variables declaration//GEN-END:variables

 private void Limpar(){
    
    //Metodo Limpar: limpa todos os campos preenchidos / reseta alguns campos para o dado mais usado e 
    //tambem executa o metodo desabilitarComboBox
    
    jCheckBox_hatch.setSelected(false);
    jCheckBox_sedam.setSelected(false);
    jCheckBox_suv.setSelected(false);
    jComboBox_Cliente.setSelectedIndex(-1);
    jFormattedTextField_data_retirada.setText("");
    jFormattedTextField_data_devolucao.setText("");
    jFormattedTextField_valor.setText("");
    
    desabilitarComboBox();
        
         
}

private void desabilitarComboBox(){
    
    //Metodo desabilitarComboBox: desabilita e inicia os campos de seleção sem valor nenhum.
    
    jComboBox_modelo_carro_hatch.setEnabled(false);
    jComboBox_modelo_carro_hatch.setSelectedIndex(-1);
    jComboBox_modelo_carro_sedam.setEnabled(false);
    jComboBox_modelo_carro_sedam.setSelectedIndex(-1);
    jComboBox_modelo_carro_suv.setEnabled(false);
    jComboBox_modelo_carro_suv.setSelectedIndex(-1);
}

/*if (jCheckBox_hatch.isSelected()){
           
                a.setModelo_carro((String) jComboBox_modelo_carro_hatch.getSelectedItem());
            }
            else if (jCheckBox_sedam.isSelected()){
                
                a.setModelo_carro((String) jComboBox_modelo_carro_sedam.getSelectedItem());
            }
            else if (jCheckBox_suv.isSelected()){
                
                a.setModelo_carro((String) jComboBox_modelo_carro_suv.getSelectedItem());
            }
            else {
                JOptionPane.showMessageDialog(this, "Escolha o carro!", "Atencao", JOptionPane.WARNING_MESSAGE);
            }
            
            a.setNome(jTextField_cliente.getText());
            a.setData__retirada(jFormattedTextField_data_retirada.getText());
            a.setData__devolucao(jFormattedTextField_data_devolucao.getText());
            a.setValor_total_aluguel(Double.parseDouble(jFormattedTextField_valor.getText()));

*/
}


