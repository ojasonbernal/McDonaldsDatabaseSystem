
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
public class Beverages_page extends javax.swing.JFrame {

    /**
     * Creates new form Entrees_page
     */
    public Beverages_page() {
        initComponents();
        String[] prices = DatabaseAccess.getPrices("beverage");
        jTextField_B01.setText(String.valueOf(prices[0]));
        jTextField_B02.setText(String.valueOf(prices[1]));
        jTextField_B03.setText(String.valueOf(prices[2]));
        jTextField_B04.setText(String.valueOf(prices[3]));
        jTextField_B05.setText(String.valueOf(prices[4]));
        jTextField_B06.setText(String.valueOf(prices[5]));
        jTextField_B07.setText(String.valueOf(prices[6]));
        jTextField_B08.setText(String.valueOf(prices[7]));
        jTextField_B09.setText(String.valueOf(prices[8]));
        jTextField_B10.setText(String.valueOf(prices[9]));
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
        jTextField_B02 = new javax.swing.JTextField();
        jCheckBox_B01 = new javax.swing.JCheckBox();
        jTextField_B01 = new javax.swing.JTextField();
        jCheckBox_B02 = new javax.swing.JCheckBox();
        jCheckBox_B03 = new javax.swing.JCheckBox();
        jTextField_B03 = new javax.swing.JTextField();
        jTextField_B07 = new javax.swing.JTextField();
        jTextField_B08 = new javax.swing.JTextField();
        jCheckBox_B08 = new javax.swing.JCheckBox();
        jCheckBox_B10 = new javax.swing.JCheckBox();
        jTextField_B10 = new javax.swing.JTextField();
        jTextField_B09 = new javax.swing.JTextField();
        jCheckBox_B09 = new javax.swing.JCheckBox();
        jTextField_B06 = new javax.swing.JTextField();
        jCheckBox_B06 = new javax.swing.JCheckBox();
        jTextField_B05 = new javax.swing.JTextField();
        jCheckBox_B05 = new javax.swing.JCheckBox();
        jTextField_B04 = new javax.swing.JTextField();
        jCheckBox_B04 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox_B07 = new javax.swing.JCheckBox();
        jButton_Next = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Beverages");

        jTextField_B02.setEditable(false);
        jTextField_B02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox_B01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B01.setText("Small Premium Roast Coffee");
        jCheckBox_B01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B01ActionPerformed(evt);
            }
        });

        jTextField_B01.setEditable(false);
        jTextField_B01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox_B02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B02.setText("Medium Premium Roast Coffee");
        jCheckBox_B02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B02ActionPerformed(evt);
            }
        });

        jCheckBox_B03.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B03.setText("Large Premium Roast Coffee");
        jCheckBox_B03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B03ActionPerformed(evt);
            }
        });

        jTextField_B03.setEditable(false);
        jTextField_B03.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_B07.setEditable(false);
        jTextField_B07.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_B08.setEditable(false);
        jTextField_B08.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox_B08.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B08.setText("Medium Iced Tea");
        jCheckBox_B08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B08ActionPerformed(evt);
            }
        });

        jCheckBox_B10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B10.setText("Small Sweet Tea");
        jCheckBox_B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B10ActionPerformed(evt);
            }
        });

        jTextField_B10.setEditable(false);
        jTextField_B10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_B09.setEditable(false);
        jTextField_B09.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox_B09.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B09.setText("Large Iced Tea");
        jCheckBox_B09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B09ActionPerformed(evt);
            }
        });

        jTextField_B06.setEditable(false);
        jTextField_B06.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox_B06.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B06.setText("Large Soft Drink");
        jCheckBox_B06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B06ActionPerformed(evt);
            }
        });

        jTextField_B05.setEditable(false);
        jTextField_B05.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox_B05.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B05.setText("Medium Soft Drink");
        jCheckBox_B05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B05ActionPerformed(evt);
            }
        });

        jTextField_B04.setEditable(false);
        jTextField_B04.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox_B04.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B04.setText("Small Soft Drink");
        jCheckBox_B04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B04ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Price:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Price:");

        jCheckBox_B07.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_B07.setText("Small Iced Tea");
        jCheckBox_B07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_B07ActionPerformed(evt);
            }
        });

        jButton_Next.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Next.setText("Next");
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        jButton_Clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Clear.setText("Clear Items");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_B01)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox_B02, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox_B03, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox_B08)
                            .addComponent(jCheckBox_B07))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_B07, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_B03, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_B01, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_B02, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_B08, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox_B04, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(jTextField_B04, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox_B05, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jCheckBox_B06)
                                                .addComponent(jCheckBox_B09)
                                                .addComponent(jCheckBox_B10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField_B06, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField_B05, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField_B09, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField_B10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_B04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_B04, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_B01, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_B01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_B02, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_B02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_B05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_B05, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_B03, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_B03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_B06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_B06, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_B07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_B09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_B09, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_B07, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_B08, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBox_B10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_B08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_B10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Next)
                    .addComponent(jButton_Clear))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_B01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B01ActionPerformed

    private void jCheckBox_B02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B02ActionPerformed

    private void jCheckBox_B03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B03ActionPerformed

    private void jCheckBox_B08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B08ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B08ActionPerformed

    private void jCheckBox_B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B10ActionPerformed

    private void jCheckBox_B09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B09ActionPerformed

    private void jCheckBox_B06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B06ActionPerformed

    private void jCheckBox_B05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B05ActionPerformed

    private void jCheckBox_B04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B04ActionPerformed

    private void jCheckBox_B07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_B07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_B07ActionPerformed

    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextActionPerformed
        String[] prices = DatabaseAccess.getPrices("beverage");
        String beverageID = "";
        if (jCheckBox_B01.isSelected() && !jTextField_B01.getText().equals("NA")){
            beverageID = "B01";
            Order.price += Double.parseDouble(prices[0]);
        } else if (jCheckBox_B02.isSelected() && !jTextField_B02.getText().equals("NA")){
            beverageID = "B02";
            Order.price += Double.parseDouble(prices[1]);
        } else if (jCheckBox_B03.isSelected() && !jTextField_B03.getText().equals("NA")){
            beverageID = "B03";
            Order.price += Double.parseDouble(prices[2]);
        } else if (jCheckBox_B04.isSelected() && !jTextField_B04.getText().equals("NA")){
            beverageID = "B04";
            Order.price += Double.parseDouble(prices[3]);
        } else if (jCheckBox_B05.isSelected() && !jTextField_B05.getText().equals("NA")){
            beverageID = "B05";
            Order.price += Double.parseDouble(prices[4]);
        } else if (jCheckBox_B06.isSelected() && !jTextField_B06.getText().equals("NA")){
            beverageID = "B06";
            Order.price += Double.parseDouble(prices[5]);
        } else if (jCheckBox_B07.isSelected() && !jTextField_B07.getText().equals("NA")){
            beverageID = "B07";
            Order.price += Double.parseDouble(prices[6]);
        } else if (jCheckBox_B08.isSelected() && !jTextField_B08.getText().equals("NA")){
            beverageID = "B08";
            Order.price += Double.parseDouble(prices[7]);
        } else if (jCheckBox_B09.isSelected() && !jTextField_B09.getText().equals("NA")){
            beverageID = "B09";
            Order.price += Double.parseDouble(prices[8]);
        } else if (jCheckBox_B10.isSelected() && !jTextField_B10.getText().equals("NA")){
            beverageID = "B10";
            Order.price += Double.parseDouble(prices[9]);
        }
        if(!beverageID.equals("")){
            Order.beverage = beverageID;
            this.dispose();
            new Dessert_page().setVisible(true);
        }
    }//GEN-LAST:event_jButton_NextActionPerformed

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
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JCheckBox jCheckBox_B01;
    private javax.swing.JCheckBox jCheckBox_B02;
    private javax.swing.JCheckBox jCheckBox_B03;
    private javax.swing.JCheckBox jCheckBox_B04;
    private javax.swing.JCheckBox jCheckBox_B05;
    private javax.swing.JCheckBox jCheckBox_B06;
    private javax.swing.JCheckBox jCheckBox_B07;
    private javax.swing.JCheckBox jCheckBox_B08;
    private javax.swing.JCheckBox jCheckBox_B09;
    private javax.swing.JCheckBox jCheckBox_B10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField_B01;
    private javax.swing.JTextField jTextField_B02;
    private javax.swing.JTextField jTextField_B03;
    private javax.swing.JTextField jTextField_B04;
    private javax.swing.JTextField jTextField_B05;
    private javax.swing.JTextField jTextField_B06;
    private javax.swing.JTextField jTextField_B07;
    private javax.swing.JTextField jTextField_B08;
    private javax.swing.JTextField jTextField_B09;
    private javax.swing.JTextField jTextField_B10;
    // End of variables declaration//GEN-END:variables
}