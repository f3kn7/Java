/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;

/**
 *
 * @author Felipe Kellermann Wo
 */
public class MainLexus extends javax.swing.JFrame {

    /**
     * Creates new form PersonRegist
     */
    public MainLexus() {
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

        Backcground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCliente = new javax.swing.JMenu();
        SubMenuClienteNovo = new javax.swing.JMenuItem();
        SubMenuClienteAtualizar = new javax.swing.JMenuItem();
        SubMenuClienteConsultar = new javax.swing.JMenuItem();
        SubMenuClienteExcluir = new javax.swing.JMenuItem();
        MenuVeiculo = new javax.swing.JMenu();
        SubMenuVeiculoNovo = new javax.swing.JMenuItem();
        MenuAluguel = new javax.swing.JMenu();
        SubMenuAluguelNovo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Lexus Autolocadora");
        setResizable(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0);
        flowLayout1.setAlignOnBaseline(true);
        getContentPane().setLayout(flowLayout1);

        Backcground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/2013_lexus_ls_.png"))); // NOI18N
        Backcground.setText("jLabel1");
        Backcground.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(Backcground);

        jMenuBar1.setMinimumSize(new java.awt.Dimension(117, 40));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(117, 60));

        MenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Pessoa/seguidor_44px.png"))); // NOI18N
        MenuCliente.setText("Cliente");
        MenuCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        MenuCliente.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MenuClienteMenuSelected(evt);
            }
        });

        SubMenuClienteNovo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubMenuClienteNovo.setText("Novo");
        SubMenuClienteNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuClienteNovoActionPerformed(evt);
            }
        });
        MenuCliente.add(SubMenuClienteNovo);

        SubMenuClienteAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubMenuClienteAtualizar.setText("Alterar");
        SubMenuClienteAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuClienteAtualizarActionPerformed(evt);
            }
        });
        MenuCliente.add(SubMenuClienteAtualizar);

        SubMenuClienteConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubMenuClienteConsultar.setText("Consultar");
        MenuCliente.add(SubMenuClienteConsultar);

        SubMenuClienteExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubMenuClienteExcluir.setText("Excluir");
        MenuCliente.add(SubMenuClienteExcluir);

        jMenuBar1.add(MenuCliente);

        MenuVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Carro/carADD_54px.png"))); // NOI18N
        MenuVeiculo.setText("Veículo");
        MenuVeiculo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        SubMenuVeiculoNovo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubMenuVeiculoNovo.setText("Novo");
        SubMenuVeiculoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuVeiculoNovoActionPerformed(evt);
            }
        });
        MenuVeiculo.add(SubMenuVeiculoNovo);

        jMenuBar1.add(MenuVeiculo);

        MenuAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Carro/carSELECT_54px.png"))); // NOI18N
        MenuAluguel.setText("Aluguel");
        MenuAluguel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        SubMenuAluguelNovo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubMenuAluguelNovo.setText("Novo");
        SubMenuAluguelNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuAluguelNovoActionPerformed(evt);
            }
        });
        MenuAluguel.add(SubMenuAluguelNovo);

        jMenuBar1.add(MenuAluguel);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubMenuClienteNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuClienteNovoActionPerformed
        PersonRegistration pr = new PersonRegistration();
        pr.setVisible(true);


    }//GEN-LAST:event_SubMenuClienteNovoActionPerformed

    private void SubMenuClienteAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuClienteAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubMenuClienteAtualizarActionPerformed

    private void SubMenuVeiculoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuVeiculoNovoActionPerformed
        CarRegistration cr = new CarRegistration();
        cr.setVisible(true);
    }//GEN-LAST:event_SubMenuVeiculoNovoActionPerformed

    private void SubMenuAluguelNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuAluguelNovoActionPerformed
        RentalCar rc = new RentalCar();
        rc.setVisible(true);
    }//GEN-LAST:event_SubMenuAluguelNovoActionPerformed

    private void MenuClienteMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MenuClienteMenuSelected
       
    }//GEN-LAST:event_MenuClienteMenuSelected

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
            java.util.logging.Logger.getLogger(MainLexus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLexus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLexus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLexus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLexus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backcground;
    private javax.swing.JMenu MenuAluguel;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuVeiculo;
    private javax.swing.JMenuItem SubMenuAluguelNovo;
    private javax.swing.JMenuItem SubMenuClienteAtualizar;
    private javax.swing.JMenuItem SubMenuClienteConsultar;
    private javax.swing.JMenuItem SubMenuClienteExcluir;
    private javax.swing.JMenuItem SubMenuClienteNovo;
    private javax.swing.JMenuItem SubMenuVeiculoNovo;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
