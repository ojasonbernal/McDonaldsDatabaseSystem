
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josec
 */
public class Dessert_page extends javax.swing.JFrame {

    /**
     * Creates new form Entrees_page
     */
    public Dessert_page() {
        initComponents();
        String[] prices = DatabaseAccess.getPrices("dessert");
        jTextField_D01.setText(String.valueOf(prices[0]));
        jTextField_D02.setText(String.valueOf(prices[1]));
        jTextField_D03.setText(String.valueOf(prices[2]));
        jTextField_D04.setText(String.valueOf(prices[3]));
        jTextField_D05.setText(String.valueOf(prices[4]));
        jTextField_D06.setText(String.valueOf(prices[5]));
        jTextField_D07.setText(String.valueOf(prices[6]));
        jTextField_D08.setText(String.valueOf(prices[7]));
        jTextField_D09.setText(String.valueOf(prices[8]));
        jTextField_D10.setText(String.valueOf(prices[9]));
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
        jButton_Cart = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jCheckBox_D05 = new javax.swing.JCheckBox();
        jCheckBox_D08 = new javax.swing.JCheckBox();
        jCheckBox_D07 = new javax.swing.JCheckBox();
        jCheckBox_D06 = new javax.swing.JCheckBox();
        jTextField_D06 = new javax.swing.JTextField();
        jTextField_D07 = new javax.swing.JTextField();
        jTextField_D08 = new javax.swing.JTextField();
        jTextField_D04 = new javax.swing.JTextField();
        jTextField_D05 = new javax.swing.JTextField();
        jTextField_D02 = new javax.swing.JTextField();
        jTextField_D01 = new javax.swing.JTextField();
        jCheckBox_D01 = new javax.swing.JCheckBox();
        jCheckBox_D02 = new javax.swing.JCheckBox();
        jCheckBox_D09 = new javax.swing.JCheckBox();
        jCheckBox_D10 = new javax.swing.JCheckBox();
        jCheckBox_D03 = new javax.swing.JCheckBox();
        jTextField_D03 = new javax.swing.JTextField();
        jTextField_D10 = new javax.swing.JTextField();
        jTextField_D09 = new javax.swing.JTextField();
        jCheckBox_D04 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Desserts");

        jButton_Cart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Cart.setText("Add to Cart");
        jButton_Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CartActionPerformed(evt);
            }
        });

        jButton_Clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Clear.setText("Clear items");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jCheckBox_D05.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D05.setText("McFlurry");
        jCheckBox_D05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D05ActionPerformed(evt);
            }
        });

        jCheckBox_D08.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D08.setText("Large Cone");
        jCheckBox_D08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D08ActionPerformed(evt);
            }
        });

        jCheckBox_D07.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D07.setText("Medium Cone");
        jCheckBox_D07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D07ActionPerformed(evt);
            }
        });

        jCheckBox_D06.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D06.setText("Small Cone");
        jCheckBox_D06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D06ActionPerformed(evt);
            }
        });

        jTextField_D06.setEditable(false);
        jTextField_D06.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_D07.setEditable(false);
        jTextField_D07.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_D08.setEditable(false);
        jTextField_D08.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_D04.setEditable(false);
        jTextField_D04.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_D05.setEditable(false);
        jTextField_D05.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_D02.setEditable(false);
        jTextField_D02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_D01.setEditable(false);
        jTextField_D01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_D01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_D01ActionPerformed(evt);
            }
        });

        jCheckBox_D01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D01.setText("Small Shake");
        jCheckBox_D01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D01ActionPerformed(evt);
            }
        });

        jCheckBox_D02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D02.setText("Medium Shake");
        jCheckBox_D02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D02ActionPerformed(evt);
            }
        });

        jCheckBox_D09.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D09.setText("Small Fruit & Oatmeal");
        jCheckBox_D09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D09ActionPerformed(evt);
            }
        });

        jCheckBox_D10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D10.setText("Large Fruit & Oatmeal");
        jCheckBox_D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D10ActionPerformed(evt);
            }
        });

        jCheckBox_D03.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D03.setText("Large Shake");
        jCheckBox_D03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D03ActionPerformed(evt);
            }
        });

        jTextField_D03.setEditable(false);
        jTextField_D03.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_D10.setEditable(false);
        jTextField_D10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_D09.setEditable(false);
        jTextField_D09.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox_D04.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_D04.setText("Sundae");
        jCheckBox_D04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_D04ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Price:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Cart, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_D02, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jCheckBox_D03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jCheckBox_D10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jCheckBox_D02)
                                                .addComponent(jCheckBox_D01, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(36, 36, 36))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox_D09, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_D09, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_D10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_D03, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_D01, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_D08)
                                    .addComponent(jCheckBox_D04, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_D08, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_D04, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCheckBox_D05, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jTextField_D05, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCheckBox_D07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBox_D06, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_D06, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_D07, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(250, 250, 250))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_D01, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_D01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_D02, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_D02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_D10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_D10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_D04, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_D04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_D06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_D06, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_D07, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_D07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_D08, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_D08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_D03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_D03, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_D09, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_D09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_D05, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_D05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Clear)
                    .addComponent(jButton_Cart))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_D05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D05ActionPerformed

    private void jCheckBox_D08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D08ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D08ActionPerformed

    private void jCheckBox_D07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D07ActionPerformed

    private void jCheckBox_D06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D06ActionPerformed

    private void jCheckBox_D01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D01ActionPerformed

    private void jCheckBox_D02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D02ActionPerformed

    private void jCheckBox_D09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D09ActionPerformed

    private void jCheckBox_D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D10ActionPerformed

    private void jCheckBox_D03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D03ActionPerformed

    private void jCheckBox_D04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_D04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_D04ActionPerformed

    private void jTextField_D01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_D01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_D01ActionPerformed

    private void jButton_CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CartActionPerformed
        String[] prices = DatabaseAccess.getPrices("dessert");
        String dessertID = null;
        if (jCheckBox_D01.isSelected() && !jTextField_D01.getText().equals("NA")){
            dessertID = "D01";
            Order.price += Double.parseDouble(prices[0]);
        } else if (jCheckBox_D02.isSelected() && !jTextField_D02.getText().equals("NA")){
            dessertID = "D02";
            Order.price += Double.parseDouble(prices[1]);
        } else if (jCheckBox_D03.isSelected() && !jTextField_D03.getText().equals("NA")){
            dessertID = "D03";
            Order.price += Double.parseDouble(prices[2]);
        } else if (jCheckBox_D04.isSelected() && !jTextField_D04.getText().equals("NA")){
            dessertID = "D04";
            Order.price += Double.parseDouble(prices[3]);
        } else if (jCheckBox_D05.isSelected() && !jTextField_D05.getText().equals("NA")){
            dessertID = "D05";
            Order.price += Double.parseDouble(prices[4]);
        } else if (jCheckBox_D06.isSelected() && !jTextField_D06.getText().equals("NA")){
            dessertID = "D06";
            Order.price += Double.parseDouble(prices[5]);
        } else if (jCheckBox_D07.isSelected() && !jTextField_D07.getText().equals("NA")){
            dessertID = "D07";
            Order.price += Double.parseDouble(prices[6]);
        } else if (jCheckBox_D08.isSelected() && !jTextField_D08.getText().equals("NA")){
            dessertID = "D08";
            Order.price += Double.parseDouble(prices[7]);
        } else if (jCheckBox_D09.isSelected() && !jTextField_D09.getText().equals("NA")){
            dessertID = "D09";
            Order.price += Double.parseDouble(prices[8]);
        } else if (jCheckBox_D10.isSelected() && !jTextField_D10.getText().equals("NA")){
            dessertID = "D10";
            Order.price += Double.parseDouble(prices[9]);
        }
        
        Order.dessert = dessertID;
        DatabaseAccess.saveData();
        this.dispose();
        new Cart().setVisible(true);

    }//GEN-LAST:event_jButton_CartActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(Entrees_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrees_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrees_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrees_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrees_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cart;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JCheckBox jCheckBox_D01;
    private javax.swing.JCheckBox jCheckBox_D02;
    private javax.swing.JCheckBox jCheckBox_D03;
    private javax.swing.JCheckBox jCheckBox_D04;
    private javax.swing.JCheckBox jCheckBox_D05;
    private javax.swing.JCheckBox jCheckBox_D06;
    private javax.swing.JCheckBox jCheckBox_D07;
    private javax.swing.JCheckBox jCheckBox_D08;
    private javax.swing.JCheckBox jCheckBox_D09;
    private javax.swing.JCheckBox jCheckBox_D10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField_D01;
    private javax.swing.JTextField jTextField_D02;
    private javax.swing.JTextField jTextField_D03;
    private javax.swing.JTextField jTextField_D04;
    private javax.swing.JTextField jTextField_D05;
    private javax.swing.JTextField jTextField_D06;
    private javax.swing.JTextField jTextField_D07;
    private javax.swing.JTextField jTextField_D08;
    private javax.swing.JTextField jTextField_D09;
    private javax.swing.JTextField jTextField_D10;
    // End of variables declaration//GEN-END:variables
}
