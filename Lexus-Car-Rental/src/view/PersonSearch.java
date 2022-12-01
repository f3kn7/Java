/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Felipe Kellermann Wo
 */
public class PersonSearch extends javax.swing.JFrame {

    /**
     * Creates new form PersonRegistration
     */
    public PersonSearch() {
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

        jLabel_Cadastro_de_pessoas = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_consultar = new javax.swing.JButton();
        jLabel_codigo = new javax.swing.JLabel();
        jText_codigo = new javax.swing.JTextField();
        jLabel_nome = new javax.swing.JLabel();
        jText_nome = new javax.swing.JTextField();
        jLabel_resultado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("background"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1040, 684));
        setResizable(false);
        setSize(new java.awt.Dimension(1026, 684));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Cadastro_de_pessoas.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel_Cadastro_de_pessoas.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Cadastro_de_pessoas.setText("C O N S U L T A R     C L I E N T E");
        getContentPane().add(jLabel_Cadastro_de_pessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 815, 14));

        jButton_consultar.setBackground(new java.awt.Color(102, 102, 102));
        jButton_consultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_consultar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search.png"))); // NOI18N
        jButton_consultar.setText("BUSCAR");
        jButton_consultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_consultar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 150, -1));

        jLabel_codigo.setText("Resultado:");
        getContentPane().add(jLabel_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));

        jText_codigo.setBackground(new java.awt.Color(102, 102, 102));
        jText_codigo.setForeground(new java.awt.Color(204, 204, 204));
        jText_codigo.setText("00001");
        jText_codigo.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jText_codigo.setMinimumSize(new java.awt.Dimension(6, 22));
        jText_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_codigoActionPerformed(evt);
            }
        });
        getContentPane().add(jText_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 111, 30));

        jLabel_nome.setText("Nome:");
        getContentPane().add(jLabel_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, 30));

        jText_nome.setText("João Silva da Silva da Silva da Silva");
        jText_nome.setMinimumSize(new java.awt.Dimension(6, 25));
        jText_nome.setPreferredSize(new java.awt.Dimension(6, 26));
        jText_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(jText_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 350, 30));

        jLabel_resultado.setText("Código:");
        getContentPane().add(jLabel_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 815, 14));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 740, 290));

        background.setBackground(new java.awt.Color(153, 153, 153));
        background.setForeground(new java.awt.Color(102, 102, 102));
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

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_consultarActionPerformed

    private void jText_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_codigoActionPerformed

    private void jText_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(PersonSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonSearch().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JLabel jLabel_Cadastro_de_pessoas;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_resultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jText_codigo;
    private javax.swing.JTextField jText_nome;
    // End of variables declaration//GEN-END:variables

   

}