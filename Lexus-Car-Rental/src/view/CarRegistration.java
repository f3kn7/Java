/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.Date;
import javax.swing.JOptionPane;
import model.dao.CarDao;
import model.dao.DaoFactory;
import model.entities.Car;
import model.entities.CarCategory;

/**
 *
 * @author Felipe Kellermann Wo
 */
public class CarRegistration extends javax.swing.JFrame {

    /**
     * Creates new form PersonRegistration
     */
    public CarRegistration() {
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
        jButton_salvar = new javax.swing.JButton();
        jButton_consultar = new javax.swing.JButton();
        jButton_alterar = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();
        jTextField_motor = new javax.swing.JTextField();
        jLabel_transmissao = new javax.swing.JLabel();
        jLabel_obs_carro = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jText_data_cadastro_carro = new javax.swing.JTextField();
        jComboBox_combustivel = new javax.swing.JComboBox<>();
        jComboBox_qnt_passageiros = new javax.swing.JComboBox<>();
        jLabel_fundo = new javax.swing.JLabel();
        jLabel_renavam = new javax.swing.JLabel();
        jLabel_cap_porta_malas = new javax.swing.JLabel();
        jTextField_renavam = new javax.swing.JTextField();
        jLabel_modelo1 = new javax.swing.JLabel();
        jTextField_modelo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_obs_carro = new javax.swing.JTextArea();
        jText_codigo = new javax.swing.JTextField();
        jComboBox_cap_porta_malas = new javax.swing.JComboBox<>();
        jLabel_km = new javax.swing.JLabel();
        jTextField_cor = new javax.swing.JTextField();
        jFormattedTextField_valor = new javax.swing.JFormattedTextField();
        jComboBox_transmissao = new javax.swing.JComboBox<>();
        jLabel_codigo = new javax.swing.JLabel();
        jComboBox_qnt_portas = new javax.swing.JComboBox<>();
        jLabel_modelo = new javax.swing.JLabel();
        jLabel_data = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel_motor = new javax.swing.JLabel();
        jLabel_qnt_passageiros = new javax.swing.JLabel();
        jTextField_chassi = new javax.swing.JTextField();
        jLabel_tracao = new javax.swing.JLabel();
        jComboBox_tracao = new javax.swing.JComboBox<>();
        jLabel_chassi = new javax.swing.JLabel();
        jTextField_placa = new javax.swing.JTextField();
        jTextField_km = new javax.swing.JTextField();
        jLabel_qnt_portas = new javax.swing.JLabel();
        jLabel_combustivel = new javax.swing.JLabel();
        jTextField_potencia = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_valor = new javax.swing.JLabel();
        jTextField_marca = new javax.swing.JTextField();
        jLabel_marca = new javax.swing.JLabel();
        jLabel_placa = new javax.swing.JLabel();
        jLabel_ano = new javax.swing.JLabel();
        jTextField_ano = new javax.swing.JTextField();
        jLabel_potencia = new javax.swing.JLabel();
        jLabel_categoria = new javax.swing.JLabel();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("background"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1026, 684));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Cadastro_de_pessoas.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel_Cadastro_de_pessoas.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Cadastro_de_pessoas.setText("C A D A S T R O    D E    V E Í C U L O S");
        getContentPane().add(jLabel_Cadastro_de_pessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 30));
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

        jTextField_motor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_motor.setText("1.0 TURBO ");
        jTextField_motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_motorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 110, 30));

        jLabel_transmissao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_transmissao.setText("Transmissao:");
        getContentPane().add(jLabel_transmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, 30));

        jLabel_obs_carro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_obs_carro.setText("Obs:");
        getContentPane().add(jLabel_obs_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, 25));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 815, 14));

        jText_data_cadastro_carro.setText("21/02/2021");
        jText_data_cadastro_carro.setMinimumSize(new java.awt.Dimension(6, 22));
        jText_data_cadastro_carro.setRequestFocusEnabled(false);
        jText_data_cadastro_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_data_cadastro_carroActionPerformed(evt);
            }
        });
        getContentPane().add(jText_data_cadastro_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 90, 23));

        jComboBox_combustivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_combustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Alcool", "Diesel", "Gas/Alcool" }));
        getContentPane().add(jComboBox_combustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 100, 30));

        jComboBox_qnt_passageiros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_qnt_passageiros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "5" }));
        jComboBox_qnt_passageiros.setSelectedIndex(2);
        getContentPane().add(jComboBox_qnt_passageiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 40, 30));

        jLabel_fundo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        jLabel_renavam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_renavam.setText("Renavam:");
        getContentPane().add(jLabel_renavam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, 30));

        jLabel_cap_porta_malas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_cap_porta_malas.setText("Cap. Porta Malas:");
        getContentPane().add(jLabel_cap_porta_malas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, 30));

        jTextField_renavam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_renavam.setText("BRA2E20");
        jTextField_renavam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_renavamActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_renavam, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 110, 30));

        jLabel_modelo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_modelo1.setText("Cor:");
        getContentPane().add(jLabel_modelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, 30));

        jTextField_modelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_modelo.setText("Onix");
        getContentPane().add(jTextField_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 110, 30));

        jTextArea_obs_carro.setColumns(20);
        jTextArea_obs_carro.setRows(5);
        jTextArea_obs_carro.setText("the gray fox jumped over the lazy dog");
        jScrollPane1.setViewportView(jTextArea_obs_carro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 480, 90));

        jText_codigo.setBackground(new java.awt.Color(102, 102, 102));
        jText_codigo.setForeground(new java.awt.Color(204, 204, 204));
        jText_codigo.setText("00001");
        jText_codigo.setEnabled(false);
        jText_codigo.setMinimumSize(new java.awt.Dimension(6, 22));
        jText_codigo.setRequestFocusEnabled(false);
        jText_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_codigoActionPerformed(evt);
            }
        });
        getContentPane().add(jText_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 110, 23));

        jComboBox_cap_porta_malas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_cap_porta_malas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Grande" }));
        getContentPane().add(jComboBox_cap_porta_malas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 100, 30));

        jLabel_km.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_km.setText("KM:");
        getContentPane().add(jLabel_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, 30));

        jTextField_cor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_cor.setText("Branco");
        getContentPane().add(jTextField_cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 90, 30));

        try {
            jFormattedTextField_valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.00")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_valor.setText("120");
        jFormattedTextField_valor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jFormattedTextField_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 140, 35));

        jComboBox_transmissao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_transmissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatico" }));
        getContentPane().add(jComboBox_transmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 100, 30));

        jLabel_codigo.setText("Código:");
        getContentPane().add(jLabel_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 23));

        jComboBox_qnt_portas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_qnt_portas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));
        jComboBox_qnt_portas.setSelectedIndex(2);
        getContentPane().add(jComboBox_qnt_portas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 40, 30));

        jLabel_modelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_modelo.setText("Modelo:");
        getContentPane().add(jLabel_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, 30));

        jLabel_data.setText("DATA:");
        getContentPane().add(jLabel_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, 23));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 815, 14));

        jLabel_motor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_motor.setText("Motor:");
        getContentPane().add(jLabel_motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 30));

        jLabel_qnt_passageiros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_qnt_passageiros.setText("Qnt. Passageiros:");
        getContentPane().add(jLabel_qnt_passageiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 30));

        jTextField_chassi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_chassi.setText("BRA2E20");
        jTextField_chassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_chassiActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_chassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 110, 30));

        jLabel_tracao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_tracao.setText("Tração:");
        getContentPane().add(jLabel_tracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, 30));

        jComboBox_tracao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_tracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dianteira", "Traseira", "4x4", "4x2" }));
        getContentPane().add(jComboBox_tracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 100, 30));

        jLabel_chassi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_chassi.setText("Chassi:");
        getContentPane().add(jLabel_chassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, 30));

        jTextField_placa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_placa.setText("BRA2E20");
        jTextField_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_placaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 90, 30));

        jTextField_km.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_km.setText("0");
        jTextField_km.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_kmActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 110, 30));

        jLabel_qnt_portas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_qnt_portas.setText("Qnt. Portas:");
        getContentPane().add(jLabel_qnt_portas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, 30));

        jLabel_combustivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_combustivel.setText("Combustivel:");
        getContentPane().add(jLabel_combustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, 30));

        jTextField_potencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_potencia.setText("116 CV");
        jTextField_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_potenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 110, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 815, 14));

        jLabel_valor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_valor.setText("Valor Aluguel R$:");
        getContentPane().add(jLabel_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, 35));

        jTextField_marca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_marca.setText("Chevrolet");
        jTextField_marca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_marcaFocusGained(evt);
            }
        });
        jTextField_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_marcaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, 30));

        jLabel_marca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_marca.setText("Marca:");
        getContentPane().add(jLabel_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        jLabel_placa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_placa.setText("Placa:");
        getContentPane().add(jLabel_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 30));

        jLabel_ano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_ano.setText("Ano:");
        getContentPane().add(jLabel_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, 30));

        jTextField_ano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_ano.setText("2021");
        getContentPane().add(jTextField_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 60, 30));

        jLabel_potencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_potencia.setText("Potencia:");
        getContentPane().add(jLabel_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, 30));

        jLabel_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_categoria.setText("Categoria:");
        getContentPane().add(jLabel_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, 30));

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HATCH", "SEDAM", "SUV" }));
        jComboBox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_categoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 90, 30));

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

        CarDao carDao = DaoFactory.createCarDao();

        Car car = new Car();       

        CarCategory cat = new CarCategory(jComboBox_categoria.getSelectedIndex()+1);

        car.setMarca(jTextField_marca.getText());
        car.setModelo(jTextField_modelo.getText());
        car.setAno(jTextField_ano.getText());
        car.setCor(jTextField_cor.getText());
        car.setQntPassageiros((String) jComboBox_qnt_passageiros.getSelectedItem());
        car.setQntPortas((String) jComboBox_qnt_portas.getSelectedItem());
        car.setQntPortas((String) jComboBox_qnt_portas.getSelectedItem());
        car.setCapPortaMalas((String) jComboBox_cap_porta_malas.getSelectedItem());
        car.setTracao((String) jComboBox_tracao.getSelectedItem());
        car.setMotor(jTextField_motor.getText());
        car.setPotencia(jTextField_potencia.getText());
        car.setTransmissao((String) jComboBox_transmissao.getSelectedItem());
        car.setTipoCombustivel((String) jComboBox_combustivel.getSelectedItem());
        car.setPlaca(jTextField_placa.getText());
        car.setRenavam(jTextField_renavam.getText());
        car.setCodChassi(jTextField_chassi.getText());
        car.setKm(Double.parseDouble(jTextField_km.getText()));
        car.setValorAluguel(Double.parseDouble(jFormattedTextField_valor.getText()));
        car.setCarCategory(cat);

        carDao.insert(car);     


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

    private void jTextField_motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_motorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_motorActionPerformed

    private void jText_data_cadastro_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_data_cadastro_carroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_data_cadastro_carroActionPerformed

    private void jTextField_renavamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_renavamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_renavamActionPerformed

    private void jText_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_codigoActionPerformed

    private void jTextField_chassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_chassiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_chassiActionPerformed

    private void jTextField_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_placaActionPerformed

    private void jTextField_kmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_kmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_kmActionPerformed

    private void jTextField_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_potenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_potenciaActionPerformed

    private void jTextField_marcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_marcaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_marcaFocusGained

    private void jTextField_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_marcaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_marcaActionPerformed

    private void jComboBox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_categoriaActionPerformed

    }//GEN-LAST:event_jComboBox_categoriaActionPerformed

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
            java.util.logging.Logger.getLogger(CarRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarRegistration().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox_cap_porta_malas;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_combustivel;
    private javax.swing.JComboBox<String> jComboBox_qnt_passageiros;
    private javax.swing.JComboBox<String> jComboBox_qnt_portas;
    private javax.swing.JComboBox<String> jComboBox_tracao;
    private javax.swing.JComboBox<String> jComboBox_transmissao;
    private javax.swing.JFormattedTextField jFormattedTextField_valor;
    private javax.swing.JLabel jLabel_Cadastro_de_pessoas;
    private javax.swing.JLabel jLabel_ano;
    private javax.swing.JLabel jLabel_cap_porta_malas;
    private javax.swing.JLabel jLabel_categoria;
    private javax.swing.JLabel jLabel_chassi;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_combustivel;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_fundo;
    private javax.swing.JLabel jLabel_km;
    private javax.swing.JLabel jLabel_marca;
    private javax.swing.JLabel jLabel_modelo;
    private javax.swing.JLabel jLabel_modelo1;
    private javax.swing.JLabel jLabel_motor;
    private javax.swing.JLabel jLabel_obs_carro;
    private javax.swing.JLabel jLabel_placa;
    private javax.swing.JLabel jLabel_potencia;
    private javax.swing.JLabel jLabel_qnt_passageiros;
    private javax.swing.JLabel jLabel_qnt_portas;
    private javax.swing.JLabel jLabel_renavam;
    private javax.swing.JLabel jLabel_tracao;
    private javax.swing.JLabel jLabel_transmissao;
    private javax.swing.JLabel jLabel_valor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea_obs_carro;
    private javax.swing.JTextField jTextField_ano;
    private javax.swing.JTextField jTextField_chassi;
    private javax.swing.JTextField jTextField_cor;
    private javax.swing.JTextField jTextField_km;
    private javax.swing.JTextField jTextField_marca;
    private javax.swing.JTextField jTextField_modelo;
    private javax.swing.JTextField jTextField_motor;
    private javax.swing.JTextField jTextField_placa;
    private javax.swing.JTextField jTextField_potencia;
    private javax.swing.JTextField jTextField_renavam;
    private javax.swing.JTextField jText_codigo;
    private javax.swing.JTextField jText_data_cadastro_carro;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {

        //Metodo Limpar: limpa todos os campos preenchidos / reseta alguns campos para o dado mais usado! 
        jTextField_marca.setText("");
        jTextField_modelo.setText("");
        jTextField_ano.setText("");
        jTextField_cor.setText("");
        jComboBox_categoria.setSelectedIndex(0);
        jComboBox_qnt_passageiros.setSelectedIndex(2);
        jComboBox_qnt_portas.setSelectedIndex(2);
        jComboBox_cap_porta_malas.setSelectedIndex(1);
        jComboBox_tracao.setSelectedIndex(0);
        jTextField_motor.setText("");
        jTextField_potencia.setText("");
        jComboBox_transmissao.setSelectedIndex(0);
        jComboBox_combustivel.setSelectedIndex(-1);
        jTextField_placa.setText("");
        jTextField_renavam.setText("");
        jTextField_chassi.setText("");
        jTextField_km.setText("");
        jFormattedTextField_valor.setText("");
        jTextArea_obs_carro.setText("");

        jTextField_marca.requestFocus();
    }

}