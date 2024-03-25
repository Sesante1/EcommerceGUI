

public class dashBoard extends javax.swing.JFrame {

    public dashBoard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        userPass = new javax.swing.JPasswordField();
        LogIn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showPass = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("E-commerce");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 920, 50);

        jTextField1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(340, 150, 240, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email Address");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 130, 80, 30);

        password.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("Password");
        jPanel1.add(password);
        password.setBounds(320, 190, 100, 30);

        userPass.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        userPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPassActionPerformed(evt);
            }
        });
        jPanel1.add(userPass);
        userPass.setBounds(340, 210, 240, 30);

        LogIn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogIn.setText("LOG IN");
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
        });
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        jPanel1.add(LogIn);
        LogIn.setBounds(420, 270, 80, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-name-24.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 150, 20, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-password-24.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 210, 24, 24);

        showPass.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setText("Show Password");
        showPass.setOpaque(false);
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        jPanel1.add(showPass);
        showPass.setBounds(340, 240, 110, 21);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-in-love.gif"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 90, 50, 60);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(280, 120, 350, 210);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backGroundImage/photo-1495085461086-ae0ad0a8fd74-1344x734.jpeg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-410, -220, 1510, 734);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseClicked
        landingOptions options = new landingOptions();
        options.show();
        
        dispose();
    }//GEN-LAST:event_LogInMouseClicked

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        // TODO add your handling code here:
        if (showPass.isSelected()){
            userPass.setEchoChar((char)0);
        } else {
            userPass.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void userPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassActionPerformed

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
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel password;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JPasswordField userPass;
    // End of variables declaration//GEN-END:variables
}
