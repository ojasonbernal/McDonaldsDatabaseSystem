/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojaso
 */
public class Averages extends javax.swing.JFrame {

    /**
     * Creates new form Averages
     */
    public Averages(String time, String food) {
        initComponents();
        String [][] information = DatabaseAccess.averages(time, food);
        jTextField_Top1.setText(information[0][0]);
        jTextField_Top2.setText(information[0][1]);
        jTextField_Top3.setText(information[0][2]);
        jTextField_Top4.setText(information[0][3]);
        jTextField_Top5.setText(information[0][4]);
        jTextField_Top6.setText(information[0][5]);
        jTextField_Top7.setText(information[0][6]);
        jTextField_Top8.setText(information[0][7]);
        jTextField_Top9.setText(information[0][8]);
        jTextField_Top10.setText(information[0][9]);
        jTextField_Avg1.setText(information[1][0]);
        jTextField_Avg2.setText(information[1][1]);
        jTextField_Avg3.setText(information[1][2]);
        jTextField_Avg4.setText(information[1][3]);
        jTextField_Avg5.setText(information[1][4]);
        jTextField_Avg6.setText(information[1][5]);
        jTextField_Avg7.setText(information[1][6]);
        jTextField_Avg8.setText(information[1][7]);
        jTextField_Avg9.setText(information[1][8]);
        jTextField_Avg10.setText(information[1][9]);
        
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
        jButton_Exit = new javax.swing.JButton();
        jTextField_Top1 = new javax.swing.JTextField();
        jTextField_Top2 = new javax.swing.JTextField();
        jTextField_Top3 = new javax.swing.JTextField();
        jTextField_Top4 = new javax.swing.JTextField();
        jTextField_Top5 = new javax.swing.JTextField();
        jTextField_Top6 = new javax.swing.JTextField();
        jTextField_Top7 = new javax.swing.JTextField();
        jTextField_Top8 = new javax.swing.JTextField();
        jTextField_Top9 = new javax.swing.JTextField();
        jTextField_Top10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Avg1 = new javax.swing.JTextField();
        jTextField_Avg2 = new javax.swing.JTextField();
        jTextField_Avg3 = new javax.swing.JTextField();
        jTextField_Avg4 = new javax.swing.JTextField();
        jTextField_Avg5 = new javax.swing.JTextField();
        jTextField_Avg6 = new javax.swing.JTextField();
        jTextField_Avg7 = new javax.swing.JTextField();
        jTextField_Avg8 = new javax.swing.JTextField();
        jTextField_Avg9 = new javax.swing.JTextField();
        jTextField_Avg10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Item Averages");

        jButton_Exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Exit.setForeground(new java.awt.Color(255, 0, 51));
        jButton_Exit.setText("EXIT");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        jTextField_Top1.setEditable(false);
        jTextField_Top1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top1ActionPerformed(evt);
            }
        });

        jTextField_Top2.setEditable(false);
        jTextField_Top2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top2ActionPerformed(evt);
            }
        });

        jTextField_Top3.setEditable(false);
        jTextField_Top3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top3ActionPerformed(evt);
            }
        });

        jTextField_Top4.setEditable(false);
        jTextField_Top4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top4ActionPerformed(evt);
            }
        });

        jTextField_Top5.setEditable(false);
        jTextField_Top5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top5ActionPerformed(evt);
            }
        });

        jTextField_Top6.setEditable(false);
        jTextField_Top6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top6ActionPerformed(evt);
            }
        });

        jTextField_Top7.setEditable(false);
        jTextField_Top7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top7ActionPerformed(evt);
            }
        });

        jTextField_Top8.setEditable(false);
        jTextField_Top8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top8ActionPerformed(evt);
            }
        });

        jTextField_Top9.setEditable(false);
        jTextField_Top9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top9ActionPerformed(evt);
            }
        });

        jTextField_Top10.setEditable(false);
        jTextField_Top10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Top10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Top10ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Item Names:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Percent of Orders Containing Item");

        jTextField_Avg1.setEditable(false);
        jTextField_Avg1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg1ActionPerformed(evt);
            }
        });

        jTextField_Avg2.setEditable(false);
        jTextField_Avg2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg2ActionPerformed(evt);
            }
        });

        jTextField_Avg3.setEditable(false);
        jTextField_Avg3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg3ActionPerformed(evt);
            }
        });

        jTextField_Avg4.setEditable(false);
        jTextField_Avg4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg4ActionPerformed(evt);
            }
        });

        jTextField_Avg5.setEditable(false);
        jTextField_Avg5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg5ActionPerformed(evt);
            }
        });

        jTextField_Avg6.setEditable(false);
        jTextField_Avg6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg6ActionPerformed(evt);
            }
        });

        jTextField_Avg7.setEditable(false);
        jTextField_Avg7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg7ActionPerformed(evt);
            }
        });

        jTextField_Avg8.setEditable(false);
        jTextField_Avg8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg8ActionPerformed(evt);
            }
        });

        jTextField_Avg9.setEditable(false);
        jTextField_Avg9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg9ActionPerformed(evt);
            }
        });

        jTextField_Avg10.setEditable(false);
        jTextField_Avg10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Avg10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Avg10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Top1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top4, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top5, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top6, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top7, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top8, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top9, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top10, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Top2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Avg1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Avg10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(230, 230, 230)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Top10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Avg10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jTextField_Top1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top1ActionPerformed

    private void jTextField_Top2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top2ActionPerformed

    private void jTextField_Top3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top3ActionPerformed

    private void jTextField_Top4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top4ActionPerformed

    private void jTextField_Top5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top5ActionPerformed

    private void jTextField_Top6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top6ActionPerformed

    private void jTextField_Top7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top7ActionPerformed

    private void jTextField_Top8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top8ActionPerformed

    private void jTextField_Top9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top9ActionPerformed

    private void jTextField_Top10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Top10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Top10ActionPerformed

    private void jTextField_Avg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg1ActionPerformed

    private void jTextField_Avg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg2ActionPerformed

    private void jTextField_Avg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg3ActionPerformed

    private void jTextField_Avg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg4ActionPerformed

    private void jTextField_Avg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg5ActionPerformed

    private void jTextField_Avg6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg6ActionPerformed

    private void jTextField_Avg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg7ActionPerformed

    private void jTextField_Avg8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg8ActionPerformed

    private void jTextField_Avg9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg9ActionPerformed

    private void jTextField_Avg10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Avg10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Avg10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String time, String food) {
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
            java.util.logging.Logger.getLogger(Averages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Averages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Averages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Averages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Averages(time, food).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_Avg1;
    private javax.swing.JTextField jTextField_Avg10;
    private javax.swing.JTextField jTextField_Avg2;
    private javax.swing.JTextField jTextField_Avg3;
    private javax.swing.JTextField jTextField_Avg4;
    private javax.swing.JTextField jTextField_Avg5;
    private javax.swing.JTextField jTextField_Avg6;
    private javax.swing.JTextField jTextField_Avg7;
    private javax.swing.JTextField jTextField_Avg8;
    private javax.swing.JTextField jTextField_Avg9;
    private javax.swing.JTextField jTextField_Top1;
    private javax.swing.JTextField jTextField_Top10;
    private javax.swing.JTextField jTextField_Top2;
    private javax.swing.JTextField jTextField_Top3;
    private javax.swing.JTextField jTextField_Top4;
    private javax.swing.JTextField jTextField_Top5;
    private javax.swing.JTextField jTextField_Top6;
    private javax.swing.JTextField jTextField_Top7;
    private javax.swing.JTextField jTextField_Top8;
    private javax.swing.JTextField jTextField_Top9;
    // End of variables declaration//GEN-END:variables
}