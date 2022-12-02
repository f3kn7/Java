/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import model.dao.CarDao;
import model.dao.ClientNaturalDao;
import model.dao.DaoFactory;
import model.dao.RentalDao;
import model.entities.Car;
import model.entities.ClientNatural;
import model.entities.Rental;

/**
 *
 * @author Felipe Kellermann Wo
 */
public class RentalCar extends javax.swing.JFrame {

    /**
     * Creates new form PersonRegistration
     */
    public RentalCar() {
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
        jButton_calcular = new javax.swing.JButton();
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
        jLabel_cliente = new javax.swing.JLabel();
        jFormattedTextField_data_retirada = new javax.swing.JFormattedTextField();
        jLabel_retirada = new javax.swing.JLabel();
        jLabel_devolucao = new javax.swing.JLabel();
        jFormattedTextField_data_devolucao = new javax.swing.JFormattedTextField();
        jComboBox_Cliente = new javax.swing.JComboBox();
        jButton_consultar = new javax.swing.JButton();
        jLabel_categoria_escolhida = new javax.swing.JLabel();
        jLabel_categoria = new javax.swing.JLabel();
        jLabel_veiculo = new javax.swing.JLabel();
        jLabel_veiculo_escolhido = new javax.swing.JLabel();
        jLabel_valor_diaria = new javax.swing.JLabel();
        jLabel_vlr_diaria = new javax.swing.JLabel();
        jLabel_total_diarias = new javax.swing.JLabel();
        jLabel_diarias = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 684));
        setName("background"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1040, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 684));
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

        jButton_calcular.setBackground(new java.awt.Color(0, 0, 0));
        jButton_calcular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_calcular.setForeground(new java.awt.Color(204, 204, 204));
        jButton_calcular.setText("Calcular");
        jButton_calcular.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 140, 40));

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
        jComboBox_modelo_carro_hatch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_modelo_carro_hatchItemStateChanged(evt);
            }
        });
        jComboBox_modelo_carro_hatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modelo_carro_hatchActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_modelo_carro_hatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, 30));

        jFormattedTextField_valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField_valor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jFormattedTextField_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField_valorActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 140, 35));

        jLabel_hatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hatch.jpg"))); // NOI18N
        getContentPane().add(jLabel_hatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 200, 190));

        jLabel_valor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_valor.setText("Valor Total R$:");
        getContentPane().add(jLabel_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 140, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 815, 20));

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
        jComboBox_modelo_carro_sedam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_modelo_carro_sedamItemStateChanged(evt);
            }
        });
        jComboBox_modelo_carro_sedam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modelo_carro_sedamActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_modelo_carro_sedam, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 200, 30));

        jComboBox_modelo_carro_suv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duster", "Spin" }));
        jComboBox_modelo_carro_suv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_modelo_carro_suvItemStateChanged(evt);
            }
        });
        jComboBox_modelo_carro_suv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modelo_carro_suvActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_modelo_carro_suv, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 200, 30));

        jLabel_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_cliente.setText("Cliente:");
        getContentPane().add(jLabel_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 80, 20));

        try {
            jFormattedTextField_data_retirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_data_retirada.setText("02/12/2020");
        jFormattedTextField_data_retirada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jFormattedTextField_data_retirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField_data_retiradaActionPerformed(evt);
            }
        });
        jFormattedTextField_data_retirada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField_data_retiradaKeyTyped(evt);
            }
        });
        getContentPane().add(jFormattedTextField_data_retirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 100, 30));

        jLabel_retirada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_retirada.setText("Retirada:");
        getContentPane().add(jLabel_retirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, 20));

        jLabel_devolucao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_devolucao.setText("Devolução:");
        getContentPane().add(jLabel_devolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, -1, 20));

        try {
            jFormattedTextField_data_devolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_data_devolucao.setText("05122020");
        jFormattedTextField_data_devolucao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jFormattedTextField_data_devolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField_data_devolucaoActionPerformed(evt);
            }
        });
        jFormattedTextField_data_devolucao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextField_data_devolucaoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField_data_devolucaoKeyTyped(evt);
            }
        });
        getContentPane().add(jFormattedTextField_data_devolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 100, 30));

        jComboBox_Cliente.setSelectedIndex(-1);
        jComboBox_Cliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox_ClienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jComboBox_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 300, 30));

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

        jLabel_categoria_escolhida.setToolTipText("");
        jLabel_categoria_escolhida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel_categoria_escolhida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 130, 30));

        jLabel_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_categoria.setText("Categoria escolhida:");
        getContentPane().add(jLabel_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, 20));

        jLabel_veiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_veiculo.setText("Veiculo escolhido:");
        getContentPane().add(jLabel_veiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, 20));

        jLabel_veiculo_escolhido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel_veiculo_escolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 130, 30));

        jLabel_valor_diaria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel_valor_diaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 100, 30));

        jLabel_vlr_diaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_vlr_diaria.setText("Valor da diaria:");
        getContentPane().add(jLabel_vlr_diaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, -1, 20));

        jLabel_total_diarias.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel_total_diarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 100, 30));

        jLabel_diarias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_diarias.setText("Total diarias:");
        getContentPane().add(jLabel_diarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, -1, 20));

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

        RentalDao rentalDao = DaoFactory.createRentalDao();
        ClientNaturalDao clientNaturalDao = DaoFactory.createClientNaturalDao();
        CarDao carDao = DaoFactory.createCarDao();

        //criando objetos
        Rental rent = new Rental();
        ClientNatural cli = new ClientNatural();
        Car car = new Car();

        cli.setNome((String) jComboBox_Cliente.getSelectedItem()); //pegando o #nome do objeto cliente

        clientNaturalDao.getIdByName(cli); //passando o #nome do cliente para funcao pegar o #id do cliente  

        if (jCheckBox_hatch.isSelected()) {
            car.setModelo((String) jComboBox_modelo_carro_hatch.getSelectedItem());
        } else if (jCheckBox_sedam.isSelected()) {

            car.setModelo((String) jComboBox_modelo_carro_sedam.getSelectedItem());
        } else if (jCheckBox_suv.isSelected()) {

            car.setModelo((String) jComboBox_modelo_carro_suv.getSelectedItem());
        } else {
            JOptionPane.showMessageDialog(this, "Escolha o carro!", "Atencao", JOptionPane.WARNING_MESSAGE);
        }

        carDao.getIdByModel(car);

        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");

        try {
            rent.setPessoaFisica(cli);
            rent.setCarro(car);

            rent.setDataRetirada(form.parse(jFormattedTextField_data_retirada.getText()));
            rent.setDataDevolucao(form.parse(jFormattedTextField_data_devolucao.getText()));

            rent.setValorTotal(Double.parseDouble(jFormattedTextField_valor.getText()));

            //Inserir o aluguel no banco
            rentalDao.insert(rent);

        } catch (ParseException | NullPointerException ex) {
            ex.getMessage();
        }


    }//GEN-LAST:event_jButton_salvarActionPerformed

    private void jButton_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcularActionPerformed

        //Calculando o tempo do aluguel em dias          
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String data1 = jFormattedTextField_data_retirada.getText();
        LocalDate ld1 = LocalDate.parse(data1, formatter);

        String data2 = jFormattedTextField_data_devolucao.getText();
        LocalDate ld2 = LocalDate.parse(data2, formatter);

        Period per = Period.between(ld1, ld2);
        int dias = per.getDays();

        jLabel_total_diarias.setText(Integer.toString(dias));

        //Calculando o valor R$ total do aluguel
        double valorAluguel;
        double result;

        valorAluguel = Double.parseDouble(jLabel_valor_diaria.getText());

        result = valorAluguel * dias;

        jFormattedTextField_valor.setText(Double.toString(result));


    }//GEN-LAST:event_jButton_calcularActionPerformed

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
        jLabel_categoria_escolhida.setText("HATCH");
        jFormattedTextField_valor.setText("");


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
        jLabel_categoria_escolhida.setText("SEDAM");
        jFormattedTextField_valor.setText("");

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
        jLabel_categoria_escolhida.setText("SUV");
        jFormattedTextField_valor.setText("");


    }//GEN-LAST:event_jCheckBox_suvActionPerformed

    private void jFormattedTextField_data_retiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField_data_retiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField_data_retiradaActionPerformed

    private void jFormattedTextField_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField_valorActionPerformed


    }//GEN-LAST:event_jFormattedTextField_valorActionPerformed

    private void jFormattedTextField_data_devolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField_data_devolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField_data_devolucaoActionPerformed

    private void jFormattedTextField_data_devolucaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField_data_devolucaoKeyPressed

    }//GEN-LAST:event_jFormattedTextField_data_devolucaoKeyPressed

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_consultarActionPerformed

    private void jComboBox_modelo_carro_suvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modelo_carro_suvActionPerformed
        jLabel_veiculo_escolhido.setText((String) jComboBox_modelo_carro_suv.getSelectedItem());
    }//GEN-LAST:event_jComboBox_modelo_carro_suvActionPerformed

    private void jComboBox_modelo_carro_sedamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modelo_carro_sedamActionPerformed
        jLabel_veiculo_escolhido.setText((String) jComboBox_modelo_carro_sedam.getSelectedItem());
    }//GEN-LAST:event_jComboBox_modelo_carro_sedamActionPerformed

    private void jComboBox_modelo_carro_hatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modelo_carro_hatchActionPerformed
        jLabel_veiculo_escolhido.setText((String) jComboBox_modelo_carro_hatch.getSelectedItem());
    }//GEN-LAST:event_jComboBox_modelo_carro_hatchActionPerformed

    private void jComboBox_ClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox_ClienteAncestorAdded

        //Lotando o comboBox com os clientes cadastrados no banco de dados
        ClientNaturalDao clientNaturalDao = DaoFactory.createClientNaturalDao();

        List<ClientNatural> lista = clientNaturalDao.findAll();

        jComboBox_Cliente.removeAll();

        for (ClientNatural c : lista) {
            jComboBox_Cliente.addItem(c.toStringNaturalClient());
        }


    }//GEN-LAST:event_jComboBox_ClienteAncestorAdded

    private void jComboBox_modelo_carro_hatchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_modelo_carro_hatchItemStateChanged
        pegarValorCarroHatch();
        jFormattedTextField_valor.setText("");
    }//GEN-LAST:event_jComboBox_modelo_carro_hatchItemStateChanged

    private void jComboBox_modelo_carro_sedamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_modelo_carro_sedamItemStateChanged
        pegarValorCarroSedam();
        jFormattedTextField_valor.setText("");
    }//GEN-LAST:event_jComboBox_modelo_carro_sedamItemStateChanged

    private void jComboBox_modelo_carro_suvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_modelo_carro_suvItemStateChanged
        pegarValorCarroSuv();
        jFormattedTextField_valor.setText("");

    }//GEN-LAST:event_jComboBox_modelo_carro_suvItemStateChanged

    private void jFormattedTextField_data_retiradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField_data_retiradaKeyTyped
        jLabel_total_diarias.setText("");
        jFormattedTextField_valor.setText("");
    }//GEN-LAST:event_jFormattedTextField_data_retiradaKeyTyped

    private void jFormattedTextField_data_devolucaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField_data_devolucaoKeyTyped
        jLabel_total_diarias.setText("");
        jFormattedTextField_valor.setText("");
    }//GEN-LAST:event_jFormattedTextField_data_devolucaoKeyTyped

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
            java.util.logging.Logger.getLogger(RentalCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentalCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentalCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentalCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentalCar().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton_alterar;
    private javax.swing.JButton jButton_calcular;
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
    private javax.swing.JLabel jLabel_aluguel;
    private javax.swing.JLabel jLabel_categoria;
    private javax.swing.JLabel jLabel_categoria_escolhida;
    private javax.swing.JLabel jLabel_cliente;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_devolucao;
    private javax.swing.JLabel jLabel_diarias;
    private javax.swing.JLabel jLabel_hatch;
    private javax.swing.JLabel jLabel_retirada;
    private javax.swing.JLabel jLabel_sedam;
    private javax.swing.JLabel jLabel_suv;
    private javax.swing.JLabel jLabel_total_diarias;
    private javax.swing.JLabel jLabel_valor;
    private javax.swing.JLabel jLabel_valor_diaria;
    private javax.swing.JLabel jLabel_veiculo;
    private javax.swing.JLabel jLabel_veiculo_escolhido;
    private javax.swing.JLabel jLabel_vlr_diaria;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jText_data_aluguel;
    private javax.swing.JTextField jText_id_aluguel;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {

        //Metodo Limpar: limpa todos os campos preenchidos / reseta alguns campos para o dado mais usado e 
        //tambem executa o metodo desabilitarComboBox
        jCheckBox_hatch.setSelected(false);
        jCheckBox_sedam.setSelected(false);
        jCheckBox_suv.setSelected(false);
        jComboBox_Cliente.setSelectedIndex(-1);
        jFormattedTextField_data_retirada.setText("");
        jFormattedTextField_data_devolucao.setText("");
        jFormattedTextField_valor.setText("");
        jLabel_total_diarias.setText("");
        jLabel_valor_diaria.setText("");
        jLabel_categoria_escolhida.setText("");
        jLabel_veiculo_escolhido.setText("");

        desabilitarComboBox();

    }

    private void desabilitarComboBox() {

        //Metodo desabilitarComboBox: desabilita e inicia os campos de seleção sem valor nenhum.
        jComboBox_modelo_carro_hatch.setEnabled(false);
        jComboBox_modelo_carro_hatch.setSelectedIndex(-1);
        jComboBox_modelo_carro_sedam.setEnabled(false);
        jComboBox_modelo_carro_sedam.setSelectedIndex(-1);
        jComboBox_modelo_carro_suv.setEnabled(false);
        jComboBox_modelo_carro_suv.setSelectedIndex(-1);
    }

    private void pegarValorCarroHatch() {

        CarDao carDao = DaoFactory.createCarDao();

        Car car = new Car();

        car.setModelo((String) jComboBox_modelo_carro_hatch.getSelectedItem());
        carDao.getCarModelValue(car);
        jLabel_valor_diaria.setText(Double.toString(car.getValorAluguel()));

    }

    private void pegarValorCarroSedam() {

        CarDao carDao = DaoFactory.createCarDao();

        Car car = new Car();

        car.setModelo((String) jComboBox_modelo_carro_sedam.getSelectedItem());
        carDao.getCarModelValue(car);
        jLabel_valor_diaria.setText(Double.toString(car.getValorAluguel()));

    }

    private void pegarValorCarroSuv() {

        CarDao carDao = DaoFactory.createCarDao();

        Car car = new Car();

        car.setModelo((String) jComboBox_modelo_carro_suv.getSelectedItem());
        carDao.getCarModelValue(car);
        jLabel_valor_diaria.setText(Double.toString(car.getValorAluguel()));

    }

}
