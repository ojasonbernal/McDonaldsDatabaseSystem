/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojaso
 */
public class Rm_Condiments extends javax.swing.JFrame {

    /**
     * Creates new form Rm_Condiments
     */
    public Rm_Condiments() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jCheckBox_C01 = new javax.swing.JCheckBox();
        jCheckBox_C10 = new javax.swing.JCheckBox();
        jCheckBox_C02 = new javax.swing.JCheckBox();
        jCheckBox_C03 = new javax.swing.JCheckBox();
        jCheckBox_C06 = new javax.swing.JCheckBox();
        jCheckBox_C07 = new javax.swing.JCheckBox();
        jCheckBox_C05 = new javax.swing.JCheckBox();
        jCheckBox_C08 = new javax.swing.JCheckBox();
        jCheckBox_C09 = new javax.swing.JCheckBox();
        jCheckBox_C04 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton_Clear = new javax.swing.JButton();
        jButton_Next = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Add Condiments");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Add Condiments");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jCheckBox_C01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C01.setText("Ketchup");
        jCheckBox_C01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_C01ActionPerformed(evt);
            }
        });

        jCheckBox_C10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C10.setText("Barbecue Sauce");

        jCheckBox_C02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C02.setText("Mustard");

        jCheckBox_C03.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C03.setText("Mayonnaise");
        jCheckBox_C03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_C03ActionPerformed(evt);
            }
        });

        jCheckBox_C06.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C06.setText("Onions");

        jCheckBox_C07.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C07.setText("Lettuce");

        jCheckBox_C05.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C05.setText("Pickles");

        jCheckBox_C08.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C08.setText("Tomatoes");

        jCheckBox_C09.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C09.setText("Jalapenos");
        jCheckBox_C09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_C09ActionPerformed(evt);
            }
        });

        jCheckBox_C04.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_C04.setText("Tartar Sauce");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCheckBox_C01, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox_C02, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox_C04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox_C10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jCheckBox_C03, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox_C08, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox_C09, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox_C07, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox_C05)
                    .addComponent(jCheckBox_C06, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_C01)
                    .addComponent(jCheckBox_C05))
                .addGap(42, 42, 42)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_C06)
                    .addComponent(jCheckBox_C10))
                .addGap(41, 41, 41)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_C02)
                    .addComponent(jCheckBox_C07))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_C03)
                    .addComponent(jCheckBox_C08))
                .addGap(34, 34, 34)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_C04)
                    .addComponent(jCheckBox_C09))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Remove Condiments");

        jButton_Clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Clear.setText("Clear items");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jButton_Next.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Next.setText("Next");
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jButton_Clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Clear)
                    .addComponent(jButton_Next))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_C01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_C01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_C01ActionPerformed

    private void jCheckBox_C09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_C09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_C09ActionPerformed

    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextActionPerformed
        String[] condimentsID = new String [10];
        for (int i = 0; i < 10; ++i){
            condimentsID[i] = null;
        }
        if (jCheckBox_C01.isSelected()){
            condimentsID[0] = "C01";
        }
        if (jCheckBox_C02.isSelected()){
            condimentsID[1] = "C02";
        }
        if (jCheckBox_C03.isSelected()){
            condimentsID[2] = "C03";
        }
        if (jCheckBox_C04.isSelected()){
            condimentsID[3] = "C04";
        }
        if (jCheckBox_C05.isSelected()){
            condimentsID[4] = "C05";
        }
        if (jCheckBox_C06.isSelected()){
            condimentsID[5] = "C06";
        }
        if (jCheckBox_C07.isSelected()){
            condimentsID[6] = "C07";
        }
        if (jCheckBox_C08.isSelected()){
            condimentsID[7] = "C08";
        }
        if (jCheckBox_C09.isSelected()){
            condimentsID[8] = "C09";
        }
        if (jCheckBox_C10.isSelected()){
            condimentsID[9] = "C10";
        }
        
        Order.removeCondiments = condimentsID;
        this.dispose();
        new Sides_page().setVisible(true);
    }//GEN-LAST:event_jButton_NextActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jCheckBox_C03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_C03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_C03ActionPerformed

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
            java.util.logging.Logger.getLogger(Rm_Condiments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rm_Condiments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rm_Condiments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rm_Condiments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rm_Condiments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JCheckBox jCheckBox_C01;
    private javax.swing.JCheckBox jCheckBox_C02;
    private javax.swing.JCheckBox jCheckBox_C03;
    private javax.swing.JCheckBox jCheckBox_C04;
    private javax.swing.JCheckBox jCheckBox_C05;
    private javax.swing.JCheckBox jCheckBox_C06;
    private javax.swing.JCheckBox jCheckBox_C07;
    private javax.swing.JCheckBox jCheckBox_C08;
    private javax.swing.JCheckBox jCheckBox_C09;
    private javax.swing.JCheckBox jCheckBox_C10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    // End of variables declaration//GEN-END:variables
}
