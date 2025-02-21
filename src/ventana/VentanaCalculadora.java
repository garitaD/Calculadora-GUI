/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Daniel
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private double numero1, resultado;
    private String operacion = "nula";
    private boolean activado = true;
    private boolean punto = true;

    public VentanaCalculadora() {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        lblMuestra = new javax.swing.JLabel();
        lblNumeros = new javax.swing.JLabel();
        btnC = new javax.swing.JButton();
        btnRaizCuadrada = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnCambiarSigno = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        CalculadoraEstandar = new javax.swing.JMenuItem();
        ConversorDivisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora DGB");

        panel.setLayout(new java.awt.GridBagLayout());

        lblMuestra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(lblMuestra, gridBagConstraints);

        lblNumeros.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumeros.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(lblNumeros, gridBagConstraints);

        btnC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnC, gridBagConstraints);

        btnRaizCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/raizCuadrada.png"))); // NOI18N
        btnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCuadradaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnRaizCuadrada, gridBagConstraints);

        btnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dividir.png"))); // NOI18N
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnDividir, gridBagConstraints);

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnBorrar, gridBagConstraints);

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn7, gridBagConstraints);

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn8, gridBagConstraints);

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn9, gridBagConstraints);

        btnMultiplicar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnMultiplicar.setText("X");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnMultiplicar, gridBagConstraints);

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn4, gridBagConstraints);

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn5, gridBagConstraints);

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn6, gridBagConstraints);

        btnRestar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnRestar, gridBagConstraints);

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn1, gridBagConstraints);

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn2, gridBagConstraints);

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn3, gridBagConstraints);

        btnSumar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnSumar, gridBagConstraints);

        btnCambiarSigno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/masMenos.png"))); // NOI18N
        btnCambiarSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarSignoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnCambiarSigno, gridBagConstraints);

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn0, gridBagConstraints);

        btnPunto.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnPunto, gridBagConstraints);

        btnIgual.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnIgual, gridBagConstraints);

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        CalculadoraEstandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora.png"))); // NOI18N
        CalculadoraEstandar.setText("Calculadora Estándar");
        CalculadoraEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraEstandarActionPerformed(evt);
            }
        });
        menu.add(CalculadoraEstandar);

        ConversorDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/divisas.png"))); // NOI18N
        ConversorDivisas.setText("Conversor de Divisas");
        ConversorDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversorDivisasActionPerformed(evt);
            }
        });
        menu.add(ConversorDivisas);
        menu.add(jSeparator1);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculadoraEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraEstandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalculadoraEstandarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void ConversorDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversorDivisasActionPerformed
        // TODO add your handling code here:
        VentanaDivisas conversor = new VentanaDivisas();
        conversor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ConversorDivisasActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }

        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (lblNumeros.getText() == "0") {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        lblNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (cadenaNumeros != "") {
            if (lblNumeros.getText() == "0") {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros += "0";
            }
            lblNumeros.setText(cadenaNumeros);
            activado = true;
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed

        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            lblMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            //Se define la operacion
            operacion = "sumar";
            //se "deshabilita el btn para que no se pueda sumar sin tener un segundo numero"
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        double numero2;

        if (operacion.equals("nula")) {
            lblNumeros.setText(cadenaNumeros);

        } else if (operacion.equals("sumar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 + numero2;
            lblNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("restar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 - numero2;
            lblNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("multiplicar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 * numero2;
            lblNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("dividir")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 / numero2;
            lblNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        lblMuestra.setText("");
        activado = true;
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
        if (punto == true) {
            if (cadenaNumeros == "") {
                cadenaNumeros = "0.";
            } else {
                cadenaNumeros += ".";
            }
            lblNumeros.setText(cadenaNumeros);
            punto = false;
        }

    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnCambiarSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarSignoActionPerformed

        if (cadenaNumeros.charAt(0) != '-') {
            cadenaNumeros = "-" + cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        lblNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_btnCambiarSignoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //Primeramente se comprueba el tamaño de la cadena 
        int tam = cadenaNumeros.length();
        if (tam > 0) {
            if (tam == 1) {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1); //se van borrando elementos por la derecha
            }

            lblNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            lblMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            //Se define la operacion
            operacion = "restar";
            //se "deshabilita el btn para que no se pueda sumar sin tener un segundo numero"
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            lblMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            //Se define la operacion
            operacion = "multiplicar";
            //se "deshabilita el btn para que no se pueda sumar sin tener un segundo numero"
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed

        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            lblMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            //Se define la operacion
            operacion = "dividir";
            //se "deshabilita el btn para que no se pueda sumar sin tener un segundo numero"
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCuadradaActionPerformed

        numero1 = Double.parseDouble(cadenaNumeros);
        lblMuestra.setText("sqrt(" + cadenaNumeros + ")");
        resultado = Math.sqrt(numero1);
        lblNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
        operacion = "nula";
        punto = true;
    }//GEN-LAST:event_btnRaizCuadradaActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        lblMuestra.setText("");
        lblNumeros.setText("0");
        cadenaNumeros = "";
        operacion = "nula";
        activado = true;
        punto = true;
    }//GEN-LAST:event_btnCActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(ventanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(ventanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(ventanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //  Logger.getLogger(ventanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CalculadoraEstandar;
    private javax.swing.JMenuItem ConversorDivisas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCambiarSigno;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaizCuadrada;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblMuestra;
    private javax.swing.JLabel lblNumeros;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
