/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.calculator.project;

/**
 *
 * @author USER
 */
public class myCALCULATOR extends javax.swing.JFrame {
      int f=0;
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    
    
    
    
    public myCALCULATOR() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void EnterNumbers(String q) 
    {
        String Nums =jtxtResult.getText() + q;
        jtxtResult.setText(Nums);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        choice1 = new java.awt.Choice();
        label1 = new java.awt.Label();
        jToggleButton2 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jbtnON = new javax.swing.JRadioButton();
        jbtnOFF = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jtxtResult = new javax.swing.JTextField();
        jbtnALLClear = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jbtnDivision = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnMUlti = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnDOT = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtnpercent = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jbtnTan = new javax.swing.JButton();
        jbtnXcube = new javax.swing.JButton();
        jbtnXsqr = new javax.swing.JButton();
        jbtnXn = new javax.swing.JButton();
        jbtncos = new javax.swing.JButton();
        jbtnSqrt = new javax.swing.JButton();

        jButton21.setText("jButton1");

        jButton22.setText("jButton1");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("jButton1");

        jButton24.setText("jButton1");

        jButton27.setBackground(new java.awt.Color(102, 255, 255));
        jButton27.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton27.setText("jButton1");
        jButton27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToggleButton1.setText("jToggleButton1");

        label1.setText("label1");

        jToggleButton2.setText("jToggleButton2");

        jbtnON.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnON.setSelected(true);
        jbtnON.setText("ON");
        jbtnON.setBorderPainted(true);
        jbtnON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnONActionPerformed(evt);
            }
        });

        jbtnOFF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnOFF.setSelected(true);
        jbtnOFF.setText("OFF");
        jbtnOFF.setBorderPainted(true);
        jbtnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOFFActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 54, 171));
        jLabel1.setText("                   MY CALCULATOR");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, 340, 34));

        jtxtResult.setBackground(new java.awt.Color(0, 0, 0));
        jtxtResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtResult.setForeground(new java.awt.Color(255, 255, 255));
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 348, 60));

        jbtnALLClear.setBackground(new java.awt.Color(102, 255, 255));
        jbtnALLClear.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnALLClear.setText("AC");
        jbtnALLClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnALLClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnALLClearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnALLClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 70, 45));

        jbtnBackspace.setBackground(new java.awt.Color(102, 255, 255));
        jbtnBackspace.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jbtnBackspace.setForeground(new java.awt.Color(255, 51, 51));
        jbtnBackspace.setText("←");
        jbtnBackspace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBackspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 50));

        jbtnDivision.setBackground(new java.awt.Color(255, 255, 102));
        jbtnDivision.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDivision.setText("÷");
        jbtnDivision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 70, 45));

        jbtnClear.setBackground(new java.awt.Color(102, 255, 255));
        jbtnClear.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jbtnClear.setText("©");
        jbtnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 70, 45));

        jbtnDigit8.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 70, 45));

        jbtnDigit7.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 45));

        jbtnMUlti.setBackground(new java.awt.Color(255, 255, 102));
        jbtnMUlti.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnMUlti.setText("×");
        jbtnMUlti.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnMUlti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMUltiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMUlti, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 70, 45));

        jbtnDigit9.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 70, 45));

        jbtnDigit5.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 70, 45));

        jbtnDigit4.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 70, 45));

        jbtnMinus.setBackground(new java.awt.Color(255, 255, 102));
        jbtnMinus.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 70, 45));

        jbtnDigit6.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 70, 45));

        jbtnDigit2.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 70, 45));

        jbtnDigit1.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, 45));

        jbtnPlus.setBackground(new java.awt.Color(255, 255, 102));
        jbtnPlus.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 70, 45));

        jbtnDigit3.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 70, 45));

        jbtnDOT.setBackground(new java.awt.Color(102, 255, 255));
        jbtnDOT.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDOT.setText(".");
        jbtnDOT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDOTActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 70, 45));

        jbtnDigit0.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDigit0.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 70, 45));

        jbtnEqual.setBackground(new java.awt.Color(0, 0, 0));
        jbtnEqual.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jbtnEqual.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEqual.setText("=");
        jbtnEqual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 70, 45));

        jbtnpercent.setBackground(new java.awt.Color(102, 255, 255));
        jbtnpercent.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnpercent.setText("%");
        jbtnpercent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnpercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpercentActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnpercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 70, 45));

        jbtnSin.setBackground(new java.awt.Color(255, 102, 102));
        jbtnSin.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jbtnSin.setText("Sin");
        jbtnSin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 70, 45));

        jbtnLog.setBackground(new java.awt.Color(255, 102, 102));
        jbtnLog.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jbtnLog.setText("Log");
        jbtnLog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, 45));

        jbtnTan.setBackground(new java.awt.Color(255, 102, 102));
        jbtnTan.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jbtnTan.setText("Tan");
        jbtnTan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 70, 45));

        jbtnXcube.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jbtnXcube.setText("x3");
        jbtnXcube.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnXcube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXcubeActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnXcube, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 70, 45));

        jbtnXsqr.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jbtnXsqr.setText("x²");
        jbtnXsqr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnXsqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXsqrActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnXsqr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, 45));

        jbtnXn.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jbtnXn.setText("ln");
        jbtnXn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnXn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXnActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnXn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 70, 45));

        jbtncos.setBackground(new java.awt.Color(255, 102, 102));
        jbtncos.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jbtncos.setText("Cos");
        jbtncos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncosActionPerformed(evt);
            }
        });
        getContentPane().add(jbtncos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 70, 45));

        jbtnSqrt.setBackground(new java.awt.Color(102, 255, 255));
        jbtnSqrt.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnSqrt.setText("√");
        jbtnSqrt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jbtnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSqrtActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 70, 45));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed
       
    }//GEN-LAST:event_jtxtResultActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
        String Bs=null;
        if(jtxtResult.getText().length()>0){
            StringBuilder sb=new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length()-1);
            Bs=sb.toString();
            jtxtResult.setText(Bs);
        }
    }//GEN-LAST:event_jbtnBackspaceActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
      if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("7");
       
    }                                          
    else{
        EnterNumbers("7");
    }
    f=0;
    
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
  if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("4");
       
    }                                          
    else{
        EnterNumbers("4");
    }
    f=0;       // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
  if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("1");
       
    }                                          
    else{
        EnterNumbers("1");
    }
    f=0;        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
 if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("0");
       
    }                                          
    else{
        EnterNumbers("0");
    }
    f=0;      // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogActionPerformed
       if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("0"); double ans=(Double.parseDouble(jtxtResult.getText()));
        double anss=Math.log10(ans);
       jtxtResult.setText(String.valueOf(anss));
       
    }                                          
    else{
         double ans=(Double.parseDouble(jtxtResult.getText()));
        double anss=Math.log10(ans);
       jtxtResult.setText(String.valueOf(anss));
    }
    f=0; 
     
    }//GEN-LAST:event_jbtnLogActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
jtxtResult.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
    if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("8");
       
    }//GEN-LAST:event_jbtnDigit8ActionPerformed
    else{
        EnterNumbers("8");
    }
    f=0;
    }
    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
     if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("9");
       
    }                                          
    else{
        EnterNumbers("9");
    }
    f=0;
           // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
 if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("5");
       
    }                                          
    else{
        EnterNumbers("5");
    }
    f=0;       // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
 if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("6");
       
    }                                          
    else{
        EnterNumbers("6");
    }
    f=0;       // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
  if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("2");
       
    }                                          
    else{
        EnterNumbers("2");
    }
    f=0;        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
  if(f==1){
       jtxtResult.setText(" ");
        EnterNumbers("3");
       
    }                                          
    else{
        EnterNumbers("3");
    }
    f=0;       // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivisionActionPerformed
       NumEnter1= Double.parseDouble(jtxtResult.getText());
       jtxtResult.setText("");
       op ="÷";
    }//GEN-LAST:event_jbtnDivisionActionPerformed

    private void jbtnMUltiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMUltiActionPerformed
NumEnter1= Double.parseDouble(jtxtResult.getText());
       jtxtResult.setText("");
       op ="×";        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMUltiActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
NumEnter1= Double.parseDouble(jtxtResult.getText());
       jtxtResult.setText("");
       op ="-";        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
NumEnter1= Double.parseDouble(jtxtResult.getText());
       jtxtResult.setText("");
       op ="+";    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnALLClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnALLClearActionPerformed
jtxtResult.setText("");
String Fn,Sn;
Fn=String.valueOf(NumEnter1);
Sn=String.valueOf(NumEnter2);
Fn="";
Sn="";
    }//GEN-LAST:event_jbtnALLClearActionPerformed

    private void jbtnDOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDOTActionPerformed
     if(!jtxtResult.getText().contains(".")){
         jtxtResult.setText(jtxtResult.getText()+jbtnDOT.getText()) ;
     }
    }//GEN-LAST:event_jbtnDOTActionPerformed

    private void jbtnXsqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXsqrActionPerformed
         if(f==1){
       jtxtResult.setText(" ");
      double a=(Double.parseDouble(jtxtResult.getText()));
       a=a*a;
      jtxtResult.setText("");
      jtxtResult.setText(jtxtResult.getText()+ a);
       
    }                                          
    else{
       double a=(Double.parseDouble(jtxtResult.getText()));
       a=a*a;
      jtxtResult.setText("");
      jtxtResult.setText(jtxtResult.getText()+ a);
    }
    f=0; 
      
                                             
    
    }//GEN-LAST:event_jbtnXsqrActionPerformed

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinActionPerformed
    if(f==1){
       jtxtResult.setText(" ");
      double a=(Double.parseDouble(jtxtResult.getText()));
       double ans=Math.sin(Math.toRadians((a)));
      
     // jtxtResult.setText(jtxtResult.getText()+ a);
    // jtxtResult.setText("");
     jtxtResult.setText(String.valueOf(ans));
       
    }                                          
    else{
       double a=(Double.parseDouble(jtxtResult.getText()));
       double ans=Math.sin(Math.toRadians((a)));
      
     // jtxtResult.setText(jtxtResult.getText()+ a);
    // jtxtResult.setText("");
     jtxtResult.setText(String.valueOf(ans));
    }
    f=1; 
      
    }//GEN-LAST:event_jbtnSinActionPerformed

    private void jbtncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncosActionPerformed
        if (!jtxtResult.getText().isEmpty()) {
        double a = Double.parseDouble(jtxtResult.getText());
        double ans;

        // Always compute the cosine as this method is specifically for cosine
        ans = Math.cos(Math.toRadians(a));

        // Handle precision issues by rounding very small values close to zero
        if (Math.abs(ans) < 1e-10) {
            ans = 0;
        }

        // Display the result in the text field
        jtxtResult.setText(String.valueOf(ans));
    } else {
        // Handle empty input gracefully
        jtxtResult.setText("Error: Empty input");
    }
    f=1; 
      
    }//GEN-LAST:event_jbtncosActionPerformed

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanActionPerformed
      
     double a = Double.parseDouble(jtxtResult.getText());

    // Adjust precision handling to check for angles close to undefined points like 90°, 270°, etc.
    if (Math.abs((a % 180) - 90) < 1e-10) {
        // For angles that are effectively 90°, 270°, etc., display "Undefined"
        jtxtResult.setText("Undefined");
    } else {
        double ans = Math.tan(Math.toRadians(a));

        // Handle precision issues by rounding small values close to zero
        if (Math.abs(ans) < 1e-10) {
            ans = 0;
        }

        // Display the result in the text field
        jtxtResult.setText(String.valueOf(ans));
        f=1;
    }
      
     
    }//GEN-LAST:event_jbtnTanActionPerformed

    private void jbtnXcubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXcubeActionPerformed
       if(f==1){
       jtxtResult.setText(" ");
      double a=(Double.parseDouble(jtxtResult.getText()));
       a=a*a*a;
      jtxtResult.setText("");
      jtxtResult.setText(jtxtResult.getText()+ a);
       
    }                                          
    else{
       double a=(Double.parseDouble(jtxtResult.getText()));
       a=a*a*a;
      jtxtResult.setText("");
      jtxtResult.setText(jtxtResult.getText()+ a);
    }
    f=0; 
      
    }//GEN-LAST:event_jbtnXcubeActionPerformed

    private void jbtnXnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXnActionPerformed
      if(f==1){
       jtxtResult.setText(" ");
      double a=(Double.parseDouble(jtxtResult.getText()));
       double ans=Math.log(a);
      
     // jtxtResult.setText(jtxtResult.getText()+ a);
    // jtxtResult.setText("");
     jtxtResult.setText(String.valueOf(ans));
    }                                          
    else{
       double a=(Double.parseDouble(jtxtResult.getText()));
       double ans=Math.log(a);
      
     // jtxtResult.setText(jtxtResult.getText()+ a);
    // jtxtResult.setText("");
     jtxtResult.setText(String.valueOf(ans));
    }
    f=0; 
      
    }//GEN-LAST:event_jbtnXnActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
if(op=="+"){
    NumEnter2= Double.parseDouble(jtxtResult.getText());
         Result= NumEnter1 +NumEnter2;
         jtxtResult.setText(String.valueOf(Result));
      }       
else if(op=="-"){
         NumEnter2= Double.parseDouble(jtxtResult.getText());
    Result=NumEnter1 -NumEnter2;
         jtxtResult.setText(String.valueOf(Result));
      }
else if(op=="×")
        {
            NumEnter2= Double.parseDouble(jtxtResult.getText());
            Result= NumEnter1 * NumEnter2;
    String ans = String.format("%.2f", Result);
            jtxtResult.setText(ans);
        }
else if(op=="÷"){
         NumEnter2= Double.parseDouble(jtxtResult.getText());
    Result=NumEnter1 /NumEnter2;
         jtxtResult.setText(String.valueOf(Result));
      }
else if(op=="%"){
         NumEnter2= Double.parseDouble(jtxtResult.getText());
    Result=NumEnter1 / 100;
         jtxtResult.setText(String.valueOf(Result +"%"));
      }
//else if(op == "x^n"){
   //NumEnter2= Double.parseDouble(jtxtResult.getText());
    //double result=1;
 
    //or(int i=0;i<NumEnter2;i++){
     //Result=NumEnter1 * result;
//}
        
        // jtxtResult.setText(String.valueOf(Result));
      //}



f=1;
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtnpercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpercentActionPerformed
        try {
        double num = Double.parseDouble(jtxtResult.getText());
        // Divide the number by 100 to get the percentage value
        double result = num / 100;
        jtxtResult.setText(String.valueOf(result));
        
    } 
catch (NumberFormatException e) {
        jtxtResult.setText("Error");
    }
              
    }//GEN-LAST:event_jbtnpercentActionPerformed

    private void jbtnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSqrtActionPerformed
       double a=Math.sqrt(Double.parseDouble(jtxtResult.getText()));
      jtxtResult.setText("");
      jtxtResult.setText(jtxtResult.getText()+ a);
    }//GEN-LAST:event_jbtnSqrtActionPerformed

    private void jbtnONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnONActionPerformed

 
    }//GEN-LAST:event_jbtnONActionPerformed

    private void jbtnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOFFActionPerformed
 
 
 
    }//GEN-LAST:event_jbtnOFFActionPerformed

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
            java.util.logging.Logger.getLogger(myCALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myCALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myCALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myCALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myCALCULATOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton jbtnALLClear;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDOT;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDivision;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnMUlti;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JRadioButton jbtnOFF;
    private javax.swing.JRadioButton jbtnON;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSqrt;
    private javax.swing.JButton jbtnTan;
    private javax.swing.JButton jbtnXcube;
    private javax.swing.JButton jbtnXn;
    private javax.swing.JButton jbtnXsqr;
    private javax.swing.JButton jbtncos;
    private javax.swing.JButton jbtnpercent;
    private javax.swing.JTextField jtxtResult;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
