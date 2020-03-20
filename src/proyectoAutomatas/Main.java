package proyectoAutomatas;

import java.awt.Color;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Main extends javax.swing.JFrame implements Runnable {

    //escenarios
    public static int E_CONFIGURACION_1 = 0;
    public static int E_CONFIGURACION_2 = 1;
    public static int E_CONFIGURACION_3 = 2;
    public static int E_CONFIGURACION_4 = 3;

    Instrumento instrumento1;
    Instrumento instrumento2;
    Instrumento instrumento3;

    int posibilidades1;
    int posibilidades2;
    int posibilidades3;

    ColorRGB color;

    public Main() {
        initComponents();
        this.configurarFrame();
        this.llenarNumeroTranciciones();
        this.ocultarPestañas();
        color = ColorRGB.aleatorio();

        new Thread(this).start();
    }

    @SuppressWarnings("unchecked")
    private void desabilitar_configuracion2() {

    }
    // <editor-fold defaultstate="collapsed" desc="todos los aceptar">  

    private void aceptar1() {

        cb_estados_1.setEnabled(false);
        cb_tranciciones_1.setEnabled(false);
        cb_instrumento_1.setEnabled(false);
        btn_aceptar_1.setEnabled(false);

        btn_aceptar2_1.setEnabled(true);
        txt_regla_1.setEnabled(true);
    }

    private void aceptar2() {

        cb_estados_2.setEnabled(false);
        cb_tranciciones_2.setEnabled(false);
        cb_instrumento_2.setEnabled(false);
        btn_aceptar_2.setEnabled(false);

        btn_aceptar2_2.setEnabled(true);
        txt_regla_2.setEnabled(true);
    }

    private void aceptar3() {

        cb_estados_3.setEnabled(false);
        cb_tranciciones_3.setEnabled(false);
        cb_instrumento_3.setEnabled(false);
        btn_aceptar_3.setEnabled(false);

        btn_aceptar2_3.setEnabled(true);
        txt_regla_3.setEnabled(true);
    }

    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        configuracion1 = new javax.swing.JPanel();
        automata1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_instrumento_1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cb_estados_1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cb_tranciciones_1 = new javax.swing.JComboBox<>();
        btn_aceptar_1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_regla_1 = new javax.swing.JLabel();
        txt_regla_1 = new javax.swing.JTextField();
        btn_aceptar2_1 = new javax.swing.JButton();
        cadenaEstados_1 = new javax.swing.JPanel();
        btn_aceptar3_1 = new javax.swing.JButton();
        configuracion2 = new javax.swing.JPanel();
        automata4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cb_instrumento_2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cb_estados_2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cb_tranciciones_2 = new javax.swing.JComboBox<>();
        btn_aceptar_2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lbl_regla_2 = new javax.swing.JLabel();
        txt_regla_2 = new javax.swing.JTextField();
        btn_aceptar2_2 = new javax.swing.JButton();
        cadenaEstados_2 = new javax.swing.JPanel();
        btn_aceptar3_2 = new javax.swing.JButton();
        configuracion3 = new javax.swing.JPanel();
        automata3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cb_instrumento_3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cb_estados_3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cb_tranciciones_3 = new javax.swing.JComboBox<>();
        btn_aceptar_3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lbl_regla_3 = new javax.swing.JLabel();
        txt_regla_3 = new javax.swing.JTextField();
        btn_aceptar2_3 = new javax.swing.JButton();
        cadenaEstados_3 = new javax.swing.JPanel();
        btn_aceptar3_3 = new javax.swing.JButton();
        automatas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sp_1 = new javax.swing.JSpinner();
        sp_2 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        sp_3 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        mute_1 = new javax.swing.JButton();
        mute_2 = new javax.swing.JButton();
        mute_3 = new javax.swing.JButton();
        txtNota_1 = new javax.swing.JLabel();
        txtNota_2 = new javax.swing.JLabel();
        txtNota_3 = new javax.swing.JLabel();
        lb_instrumento_1 = new javax.swing.JLabel();
        lb_instrumento_3 = new javax.swing.JLabel();
        lb_instrumento_2 = new javax.swing.JLabel();
        panelDibujo1 = new proyectoAutomatas.Lienzo();
        panelDibujo3 = new proyectoAutomatas.Lienzo();
        panelDibujo2 = new proyectoAutomatas.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        automata1.setBackground(new java.awt.Color(153, 255, 255));
        automata1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Instrumento: ");

        cb_instrumento_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_instrumento_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basoon", "Clarinete", "Flauta", "Guitarra", "Saxofón", "Tambor", "Tuba", "Violin", "piano", "trompeta" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("N° estados:");

        cb_estados_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_estados_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("N° transiciones:");

        cb_tranciciones_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_aceptar_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar_1.setText("Aceptar");
        btn_aceptar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar_1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Regla");

        lbl_regla_1.setText("Estado: ");

        txt_regla_1.setEnabled(false);
        txt_regla_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_regla_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regla_1ActionPerformed(evt);
            }
        });

        btn_aceptar2_1.setEnabled(false);
        btn_aceptar2_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar2_1.setText("Aceptar");
        btn_aceptar2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar2_1ActionPerformed(evt);
            }
        });

        cadenaEstados_1.setVisible(false);
        cadenaEstados_1.setBackground(new java.awt.Color(255, 255, 255));
        cadenaEstados_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_aceptar2_1.setEnabled(false);
        btn_aceptar3_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar3_1.setText("Aceptar");
        btn_aceptar3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar3_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadenaEstados_1Layout = new javax.swing.GroupLayout(cadenaEstados_1);
        cadenaEstados_1.setLayout(cadenaEstados_1Layout);
        cadenaEstados_1Layout.setHorizontalGroup(
            cadenaEstados_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadenaEstados_1Layout.createSequentialGroup()
                .addContainerGap(694, Short.MAX_VALUE)
                .addComponent(btn_aceptar3_1)
                .addGap(37, 37, 37))
        );
        cadenaEstados_1Layout.setVerticalGroup(
            cadenaEstados_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadenaEstados_1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btn_aceptar3_1)
                .addContainerGap())
        );

        javax.swing.GroupLayout automata1Layout = new javax.swing.GroupLayout(automata1);
        automata1.setLayout(automata1Layout);
        automata1Layout.setHorizontalGroup(
            automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automata1Layout.createSequentialGroup()
                .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(automata1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(automata1Layout.createSequentialGroup()
                                .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_estados_1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_tranciciones_1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_instrumento_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(btn_aceptar_1))
                            .addGroup(automata1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_regla_1)
                                    .addGroup(automata1Layout.createSequentialGroup()
                                        .addComponent(txt_regla_1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(btn_aceptar2_1))))))
                    .addGroup(automata1Layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addComponent(cadenaEstados_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        automata1Layout.setVerticalGroup(
            automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automata1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_instrumento_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_estados_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_tranciciones_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar_1))
                .addGap(52, 52, 52)
                .addComponent(lbl_regla_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(automata1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_regla_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar2_1))
                .addGap(20, 20, 20)
                .addComponent(cadenaEstados_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout configuracion1Layout = new javax.swing.GroupLayout(configuracion1);
        configuracion1.setLayout(configuracion1Layout);
        configuracion1Layout.setHorizontalGroup(
            configuracion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuracion1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(automata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        configuracion1Layout.setVerticalGroup(
            configuracion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuracion1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(automata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("configuración1", configuracion1);

        automata4.setBackground(new java.awt.Color(204, 255, 204));
        automata4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Instrumento: ");

        cb_instrumento_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_instrumento_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basoon", "Clarinete", "Flauta", "Guitarra", "Saxofón", "Tambor", "Tuba", "Violin", "piano", "trompeta" }));
        cb_instrumento_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_instrumento_2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("N° estados:");

        cb_estados_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_estados_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("N° transiciones:");

        cb_tranciciones_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_aceptar_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar_2.setText("Aceptar");
        btn_aceptar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar_2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Regla");

        lbl_regla_2.setText("Estado: ");

        txt_regla_2.setEnabled(false);
        txt_regla_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_regla_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regla_2ActionPerformed(evt);
            }
        });

        btn_aceptar2_2.setEnabled(false);
        btn_aceptar2_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar2_2.setText("Aceptar");
        btn_aceptar2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar2_2ActionPerformed(evt);
            }
        });

        cadenaEstados_2.setVisible(false);
        cadenaEstados_2.setBackground(new java.awt.Color(255, 255, 255));
        cadenaEstados_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_aceptar2_1.setEnabled(false);
        btn_aceptar3_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar3_2.setText("Aceptar");
        btn_aceptar3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar3_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadenaEstados_2Layout = new javax.swing.GroupLayout(cadenaEstados_2);
        cadenaEstados_2.setLayout(cadenaEstados_2Layout);
        cadenaEstados_2Layout.setHorizontalGroup(
            cadenaEstados_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadenaEstados_2Layout.createSequentialGroup()
                .addContainerGap(712, Short.MAX_VALUE)
                .addComponent(btn_aceptar3_2)
                .addGap(37, 37, 37))
        );
        cadenaEstados_2Layout.setVerticalGroup(
            cadenaEstados_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadenaEstados_2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btn_aceptar3_2)
                .addContainerGap())
        );

        javax.swing.GroupLayout automata4Layout = new javax.swing.GroupLayout(automata4);
        automata4.setLayout(automata4Layout);
        automata4Layout.setHorizontalGroup(
            automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automata4Layout.createSequentialGroup()
                .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(automata4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(automata4Layout.createSequentialGroup()
                                .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_estados_2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_tranciciones_2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_instrumento_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(btn_aceptar_2))
                            .addGroup(automata4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(28, 28, 28)
                                .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_regla_2)
                                    .addGroup(automata4Layout.createSequentialGroup()
                                        .addComponent(txt_regla_2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(btn_aceptar2_2))))))
                    .addGroup(automata4Layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addComponent(cadenaEstados_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        automata4Layout.setVerticalGroup(
            automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automata4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_instrumento_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_estados_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cb_tranciciones_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar_2))
                .addGap(52, 52, 52)
                .addComponent(lbl_regla_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(automata4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_regla_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar2_2))
                .addGap(38, 38, 38)
                .addComponent(cadenaEstados_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout configuracion2Layout = new javax.swing.GroupLayout(configuracion2);
        configuracion2.setLayout(configuracion2Layout);
        configuracion2Layout.setHorizontalGroup(
            configuracion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuracion2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(automata4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        configuracion2Layout.setVerticalGroup(
            configuracion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuracion2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(automata4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("configuración2", configuracion2);

        automata3.setBackground(new java.awt.Color(255, 204, 204));
        automata3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Instrumento: ");

        cb_instrumento_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_instrumento_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basoon", "Clarinete", "Flauta", "Guitarra", "Saxofón", "Tambor", "Tuba", "Violin", "piano", "trompeta" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("N° estados:");

        cb_estados_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_estados_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("N° transiciones:");

        cb_tranciciones_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_aceptar_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar_3.setText("Aceptar");
        btn_aceptar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar_3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Regla");

        lbl_regla_3.setText("Estado: ");

        txt_regla_3.setEnabled(false);
        txt_regla_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_regla_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regla_3ActionPerformed(evt);
            }
        });

        btn_aceptar2_3.setEnabled(false);
        btn_aceptar2_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar2_3.setText("Aceptar");
        btn_aceptar2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar2_3ActionPerformed(evt);
            }
        });

        cadenaEstados_3.setVisible(false);
        cadenaEstados_3.setBackground(new java.awt.Color(255, 255, 255));
        cadenaEstados_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_aceptar2_1.setEnabled(false);
        btn_aceptar3_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_aceptar3_3.setText("Aceptar");
        btn_aceptar3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar3_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadenaEstados_3Layout = new javax.swing.GroupLayout(cadenaEstados_3);
        cadenaEstados_3.setLayout(cadenaEstados_3Layout);
        cadenaEstados_3Layout.setHorizontalGroup(
            cadenaEstados_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadenaEstados_3Layout.createSequentialGroup()
                .addContainerGap(694, Short.MAX_VALUE)
                .addComponent(btn_aceptar3_3)
                .addGap(37, 37, 37))
        );
        cadenaEstados_3Layout.setVerticalGroup(
            cadenaEstados_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadenaEstados_3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btn_aceptar3_3)
                .addContainerGap())
        );

        javax.swing.GroupLayout automata3Layout = new javax.swing.GroupLayout(automata3);
        automata3.setLayout(automata3Layout);
        automata3Layout.setHorizontalGroup(
            automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automata3Layout.createSequentialGroup()
                .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(automata3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(automata3Layout.createSequentialGroup()
                                .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_estados_3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_tranciciones_3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_instrumento_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(btn_aceptar_3))
                            .addGroup(automata3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(28, 28, 28)
                                .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_regla_3)
                                    .addGroup(automata3Layout.createSequentialGroup()
                                        .addComponent(txt_regla_3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(btn_aceptar2_3))))))
                    .addGroup(automata3Layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addComponent(cadenaEstados_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        automata3Layout.setVerticalGroup(
            automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automata3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_instrumento_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_estados_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cb_tranciciones_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar_3))
                .addGap(52, 52, 52)
                .addComponent(lbl_regla_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(automata3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_regla_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar2_3))
                .addGap(38, 38, 38)
                .addComponent(cadenaEstados_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout configuracion3Layout = new javax.swing.GroupLayout(configuracion3);
        configuracion3.setLayout(configuracion3Layout);
        configuracion3Layout.setHorizontalGroup(
            configuracion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuracion3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(automata3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        configuracion3Layout.setVerticalGroup(
            configuracion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuracion3Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(automata3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("configuración3", configuracion3);

        automatas.setBackground(new java.awt.Color(153, 51, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Retraso:");

        sp_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sp_1.setModel(new javax.swing.SpinnerNumberModel(100, 100, 2000, 100));
        sp_1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_1StateChanged(evt);
            }
        });

        sp_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sp_2.setModel(new javax.swing.SpinnerNumberModel(100, 100, 2000, 100));
        sp_2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_2StateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Retraso:");

        sp_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sp_3.setModel(new javax.swing.SpinnerNumberModel(100, 100, 2000, 100));
        sp_3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_3StateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Retraso:");

        mute_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mute_1.setText("Mute");
        mute_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mute_1ActionPerformed(evt);
            }
        });

        mute_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mute_2.setText("Mute");
        mute_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mute_2ActionPerformed(evt);
            }
        });

        mute_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mute_3.setText("Mute");
        mute_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mute_3ActionPerformed(evt);
            }
        });

        txtNota_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNota_1.setText("NOTA:");

        txtNota_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNota_2.setText("NOTA:");

        txtNota_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNota_3.setText("NOTA:");

        lb_instrumento_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_instrumento_1.setText("jLabel17");

        lb_instrumento_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_instrumento_3.setText("jLabel17");

        lb_instrumento_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_instrumento_2.setText("jLabel17");

        javax.swing.GroupLayout panelDibujo1Layout = new javax.swing.GroupLayout(panelDibujo1);
        panelDibujo1.setLayout(panelDibujo1Layout);
        panelDibujo1Layout.setHorizontalGroup(
            panelDibujo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        panelDibujo1Layout.setVerticalGroup(
            panelDibujo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelDibujo3Layout = new javax.swing.GroupLayout(panelDibujo3);
        panelDibujo3.setLayout(panelDibujo3Layout);
        panelDibujo3Layout.setHorizontalGroup(
            panelDibujo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        panelDibujo3Layout.setVerticalGroup(
            panelDibujo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelDibujo2Layout = new javax.swing.GroupLayout(panelDibujo2);
        panelDibujo2.setLayout(panelDibujo2Layout);
        panelDibujo2Layout.setHorizontalGroup(
            panelDibujo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        panelDibujo2Layout.setVerticalGroup(
            panelDibujo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout automatasLayout = new javax.swing.GroupLayout(automatas);
        automatas.setLayout(automatasLayout);
        automatasLayout.setHorizontalGroup(
            automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automatasLayout.createSequentialGroup()
                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, automatasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(automatasLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(automatasLayout.createSequentialGroup()
                                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(automatasLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(sp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mute_1)
                                    .addComponent(txtNota_1))
                                .addGap(159, 159, 159)
                                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(automatasLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(sp_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mute_2)
                                    .addComponent(txtNota_2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, automatasLayout.createSequentialGroup()
                                        .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(automatasLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(sp_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(mute_3))
                                        .addGap(136, 136, 136))
                                    .addGroup(automatasLayout.createSequentialGroup()
                                        .addComponent(txtNota_3)
                                        .addGap(65, 65, 65))))
                            .addGroup(automatasLayout.createSequentialGroup()
                                .addComponent(panelDibujo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelDibujo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, automatasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_instrumento_2)
                        .addGap(281, 281, 281)
                        .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_instrumento_3)
                            .addComponent(panelDibujo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addContainerGap())
            .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(automatasLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(lb_instrumento_1)
                    .addContainerGap(997, Short.MAX_VALUE)))
        );
        automatasLayout.setVerticalGroup(
            automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automatasLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_instrumento_3)
                    .addComponent(lb_instrumento_2))
                .addGap(25, 25, 25)
                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDibujo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDibujo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDibujo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sp_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(sp_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(sp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mute_1)
                    .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mute_3)
                        .addComponent(mute_2)))
                .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(automatasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))
                    .addGroup(automatasLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNota_1)
                            .addComponent(txtNota_2)
                            .addComponent(txtNota_3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(automatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(automatasLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(lb_instrumento_1)
                    .addContainerGap(617, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("automatas", automatas);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar_1ActionPerformed
        final int numeroEstado = Integer.parseInt((String) cb_estados_1.getSelectedItem());
        final int numeroTranciciones = Integer.parseInt((String) cb_tranciciones_1.getSelectedItem());
        final String instrumento = (String) cb_instrumento_1.getSelectedItem();
        final int posibilidades = calcularPosibilidades(numeroEstado);
        llenarRegla(numeroEstado, posibilidades);

        aceptar1();
        lbl_regla_1.setText("ingrese un numero desde 0 hasta " + ((int) (Math.pow(numeroEstado, 8) - 1)));
        this.posibilidades1 = (int) (Math.pow(numeroEstado, 8)) - 1;

        instrumento1 = new Instrumento(instrumento, numeroEstado, numeroTranciciones, posibilidades);
        instrumento1.d = llenarPosiblesEstados(numeroEstado, posibilidades);


    }//GEN-LAST:event_btn_aceptar_1ActionPerformed

    private void txt_regla_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regla_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regla_1ActionPerformed


    private void btn_aceptar2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar2_1ActionPerformed
        try {
            capturarRegla(txt_regla_1, posibilidades1, instrumento1);
            instrumento1.CrearVectorTexto();
            for (JComboBox campo : instrumento1.getCampos()) {
                this.cadenaEstados_1.add(campo);
            }
            this.cadenaEstados_1.repaint();

            btn_aceptar2_1.setEnabled(false);
            txt_regla_1.setEnabled(false);
            cadenaEstados_1.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            String mensaje[] = e.getMessage().split(":");
            if (mensaje[0].trim().equals("100")) {
                JOptionPane.showMessageDialog(this, mensaje[1].trim());
            } else if (mensaje[0].trim().equals("110")) {
                JOptionPane.showMessageDialog(this, mensaje[1].trim());
            }
        }
    }//GEN-LAST:event_btn_aceptar2_1ActionPerformed
    private void ocultarPestañas() {
        jTabbedPane1.setUI(new BasicTabbedPaneUI() {
            @Override
            public void paint(Graphics grphcs, JComponent jc) {

            }

            @Override
            protected int calculateTabHeight(int i, int i2, int i3) {

                return 0;
            }

            @Override
            protected int calculateTabWidth(int i, int i2, FontMetrics fm) {

                return 0;
            }
        });

    }
    private void btn_aceptar3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar3_1ActionPerformed
        instrumento1.calcularVectorInicial();

        cambiarEscenario(E_CONFIGURACION_2);

        instrumento1.recorrerD();
    }//GEN-LAST:event_btn_aceptar3_1ActionPerformed

    private void btn_aceptar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar_2ActionPerformed
        final int numeroEstado = Integer.parseInt((String) cb_estados_2.getSelectedItem());
        final int numeroTranciciones = Integer.parseInt((String) cb_tranciciones_2.getSelectedItem());
        final String instrumento = (String) cb_instrumento_2.getSelectedItem();
        final int posibilidades = calcularPosibilidades(numeroEstado);
        llenarRegla(numeroEstado, posibilidades);

        aceptar2();
        lbl_regla_2.setText("ingrese un numero desde 0 hasta " + ((int) (Math.pow(numeroEstado, 8) - 1)));
        this.posibilidades2 = (int) (Math.pow(numeroEstado, 8)) - 1;

        instrumento2 = new Instrumento(instrumento, numeroEstado, numeroTranciciones, posibilidades);
        instrumento2.d = llenarPosiblesEstados(numeroEstado, posibilidades);

    }//GEN-LAST:event_btn_aceptar_2ActionPerformed

    private void txt_regla_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regla_2ActionPerformed

    }//GEN-LAST:event_txt_regla_2ActionPerformed

    private void btn_aceptar2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar2_2ActionPerformed
        try {
            capturarRegla(txt_regla_2, posibilidades2, instrumento2);
            instrumento2.CrearVectorTexto();
            for (JComboBox campo : instrumento2.getCampos()) {
                this.cadenaEstados_2.add(campo);
            }
            this.cadenaEstados_2.repaint();

            btn_aceptar2_2.setEnabled(false);
            txt_regla_2.setEnabled(false);
            cadenaEstados_2.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            String mensaje[] = e.getMessage().split(":");
            if (mensaje[0].trim().equals("100")) {
                JOptionPane.showMessageDialog(this, mensaje[1].trim());
            } else if (mensaje[0].trim().equals("110")) {
                JOptionPane.showMessageDialog(this, mensaje[1].trim());
            }
        }
    }//GEN-LAST:event_btn_aceptar2_2ActionPerformed

    private void btn_aceptar3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar3_2ActionPerformed
        instrumento2.calcularVectorInicial();
        instrumento2.recorrerD();
        cambiarEscenario(E_CONFIGURACION_3);
    }//GEN-LAST:event_btn_aceptar3_2ActionPerformed

    private void btn_aceptar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar_3ActionPerformed
        final int numeroEstado = Integer.parseInt((String) cb_estados_3.getSelectedItem());
        final int numeroTranciciones = Integer.parseInt((String) cb_tranciciones_3.getSelectedItem());
        final String instrumento = (String) cb_instrumento_3.getSelectedItem();
        final int posibilidades = calcularPosibilidades(numeroEstado);
        llenarRegla(numeroEstado, posibilidades);

        aceptar3();

        lbl_regla_3.setText("ingrese un numero desde 0 hasta " + ((int) (Math.pow(numeroEstado, 8) - 1)));
        this.posibilidades3 = (int) (Math.pow(numeroEstado, 8)) - 1;

        instrumento3 = new Instrumento(instrumento, numeroEstado, numeroTranciciones, posibilidades);
        instrumento3.d = llenarPosiblesEstados(numeroEstado, posibilidades);

    }//GEN-LAST:event_btn_aceptar_3ActionPerformed

    private void txt_regla_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regla_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regla_3ActionPerformed

    private void btn_aceptar2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar2_3ActionPerformed
        try {
            capturarRegla(txt_regla_3, posibilidades3, instrumento3);
            instrumento2.CrearVectorTexto();
            for (JComboBox campo : instrumento3.getCampos()) {
                this.cadenaEstados_3.add(campo);
            }
            this.cadenaEstados_3.repaint();

            btn_aceptar2_3.setEnabled(false);
            txt_regla_3.setEnabled(false);
            cadenaEstados_3.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            String mensaje[] = e.getMessage().split(":");
            if (mensaje[0].trim().equals("100")) {
                JOptionPane.showMessageDialog(this, mensaje[1].trim());
            } else if (mensaje[0].trim().equals("110")) {
                JOptionPane.showMessageDialog(this, mensaje[1].trim());
            }
        }
    }//GEN-LAST:event_btn_aceptar2_3ActionPerformed

    private void btn_aceptar3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar3_3ActionPerformed
        cambiarEscenario(E_CONFIGURACION_4);
        instrumento3.calcularVectorInicial();

        panelDibujo1.instrumento = instrumento1;
        panelDibujo2.instrumento = instrumento2;
        panelDibujo3.instrumento = instrumento3;
        instrumento3.recorrerD();

    }//GEN-LAST:event_btn_aceptar3_3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        panelDibujo1.run = true;
        panelDibujo2.run = true;
        panelDibujo3.run = true;

        jButton1.setEnabled(false);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_instrumento_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_instrumento_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_instrumento_2ActionPerformed

    private void sp_1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_1StateChanged
        panelDibujo1.time = (int) sp_1.getValue();
    }//GEN-LAST:event_sp_1StateChanged

    private void sp_2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_2StateChanged
        panelDibujo2.time = (int) sp_2.getValue();
    }//GEN-LAST:event_sp_2StateChanged

    private void sp_3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_3StateChanged
        panelDibujo3.time = (int) sp_3.getValue();
    }//GEN-LAST:event_sp_3StateChanged

    private void mute_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mute_1ActionPerformed
        panelDibujo1.mute = !panelDibujo1.mute;
        if (panelDibujo1.mute) {
            mute_1.setBackground(Color.RED);
        } else {
            mute_1.setBackground(Color.white);
        }
    }//GEN-LAST:event_mute_1ActionPerformed

    private void mute_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mute_2ActionPerformed
        panelDibujo2.mute = !panelDibujo2.mute;
        if (panelDibujo2.mute) {
            mute_2.setBackground(Color.RED);
        } else {
            mute_2.setBackground(Color.white);
        }
    }//GEN-LAST:event_mute_2ActionPerformed

    private void mute_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mute_3ActionPerformed
        panelDibujo3.mute = !panelDibujo3.mute;
        if (panelDibujo3.mute) {
            mute_3.setBackground(Color.RED);
        } else {
            mute_3.setBackground(Color.white);
        }
    }//GEN-LAST:event_mute_3ActionPerformed

    private void capturarRegla(JTextField txt_regla_1, int posibilidades, Instrumento instrumento) throws Exception {
        int regla;
        try {

            regla = Integer.parseInt(txt_regla_1.getText());

            if (regla >= 0 && regla <= posibilidades) {
                instrumento.setRegla(regla);
                // JOptionPane.showMessageDialog(this, instrumento.toString());
            } else {
                throw new Exception("110:el número no está en el rango");
            }
        } catch (Exception e) {

            throw new Exception("100:debe de ingresar un número");
        }
    }

    private String[] llenarPosiblesEstados(int numeroEstado, int posibilidades) {
        String[] regla = new String[posibilidades];
        String formatoDeseado = "000";
        DecimalFormat formateador = new DecimalFormat(formatoDeseado);
        for (int i = 0; i < posibilidades; i++) {
            regla[i] = formateador.format(convertirBase(numeroEstado, i));
        }

        return regla;
    }

    private int convertirBase(int base, int numero) {
        String digitos[] = new String[base];

        for (int i = 0; i < base; i++) {
            digitos[i] = String.valueOf(i);
        }

        String baseNueva = "";
        int resto, aux = numero;

        while (aux > 0) {
            resto = aux % base;
            baseNueva = digitos[resto] + baseNueva;
            aux /= base;
        }

        return numero == 0 ? 0 : Integer.parseInt(baseNueva);
    }

    private int calcularPosibilidades(int numeroEstados) {
        final int VECINOS = 3;
        return (int) Math.pow(numeroEstados, VECINOS);
    }
    // <editor-fold defaultstate="collapsed" desc="Configuración del Frame">         

    private void cambiarEscenario(int i) {
        jTabbedPane1.setSelectedIndex(i);
    }

    private void configurarFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    private void llenarNumeroTranciciones() {
        final int INICIAL = 8;
        final int FINAL = 15;

        for (int i = INICIAL; i <= FINAL; i++) {
            cb_tranciciones_1.addItem(String.valueOf(i));
            cb_tranciciones_2.addItem(String.valueOf(i));
            cb_tranciciones_3.addItem(String.valueOf(i));
        }
    }

    private void llenarRegla(int numeroEstado, int posibilidaes) {
        int cantRegla = (int) Math.pow(numeroEstado, posibilidaes);

    }
// </editor-fold>  
    // <editor-fold defaultstate="collapsed" desc="Main">     

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Variables GUI">  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel automata1;
    private javax.swing.JPanel automata3;
    private javax.swing.JPanel automata4;
    private javax.swing.JPanel automatas;
    private javax.swing.JButton btn_aceptar2_1;
    private javax.swing.JButton btn_aceptar2_2;
    private javax.swing.JButton btn_aceptar2_3;
    private javax.swing.JButton btn_aceptar3_1;
    private javax.swing.JButton btn_aceptar3_2;
    private javax.swing.JButton btn_aceptar3_3;
    private javax.swing.JButton btn_aceptar_1;
    private javax.swing.JButton btn_aceptar_2;
    private javax.swing.JButton btn_aceptar_3;
    private javax.swing.JPanel cadenaEstados_1;
    private javax.swing.JPanel cadenaEstados_2;
    private javax.swing.JPanel cadenaEstados_3;
    private javax.swing.JComboBox<String> cb_estados_1;
    private javax.swing.JComboBox<String> cb_estados_2;
    private javax.swing.JComboBox<String> cb_estados_3;
    private javax.swing.JComboBox<String> cb_instrumento_1;
    private javax.swing.JComboBox<String> cb_instrumento_2;
    private javax.swing.JComboBox<String> cb_instrumento_3;
    private javax.swing.JComboBox<String> cb_tranciciones_1;
    private javax.swing.JComboBox<String> cb_tranciciones_2;
    private javax.swing.JComboBox<String> cb_tranciciones_3;
    private javax.swing.JPanel configuracion1;
    private javax.swing.JPanel configuracion2;
    private javax.swing.JPanel configuracion3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_instrumento_1;
    private javax.swing.JLabel lb_instrumento_2;
    private javax.swing.JLabel lb_instrumento_3;
    private javax.swing.JLabel lbl_regla_1;
    private javax.swing.JLabel lbl_regla_2;
    private javax.swing.JLabel lbl_regla_3;
    private javax.swing.JButton mute_1;
    private javax.swing.JButton mute_2;
    private javax.swing.JButton mute_3;
    private proyectoAutomatas.Lienzo panelDibujo1;
    private proyectoAutomatas.Lienzo panelDibujo2;
    private proyectoAutomatas.Lienzo panelDibujo3;
    private javax.swing.JSpinner sp_1;
    private javax.swing.JSpinner sp_2;
    private javax.swing.JSpinner sp_3;
    private javax.swing.JLabel txtNota_1;
    private javax.swing.JLabel txtNota_2;
    private javax.swing.JLabel txtNota_3;
    private javax.swing.JTextField txt_regla_1;
    private javax.swing.JTextField txt_regla_2;
    private javax.swing.JTextField txt_regla_3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(50);
                configuracion1.setBackground(color.Retornarse());
                configuracion2.setBackground(color.Retornarse());
                configuracion3.setBackground(color.Retornarse());

                lb_instrumento_1.setText(instrumento1.instrumento);
                lb_instrumento_2.setText(instrumento2.instrumento);
                lb_instrumento_3.setText(instrumento3.instrumento);

                txtNota_1.setText("Nota: " + instrumento1.notaActual);
                txtNota_2.setText("Nota: " + instrumento2.notaActual);
                txtNota_3.setText("Nota: " + instrumento3.notaActual);
            } catch (Exception e) {
            }

        }
    }

//</editor-fold>
}
