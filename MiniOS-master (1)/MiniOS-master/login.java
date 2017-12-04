import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    
    public login() {
        this.setUndecorated(true);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        userl = new javax.swing.JLabel();
        passl = new javax.swing.JLabel();
        userf = new javax.swing.JTextField();
        passf = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desk1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desk1.add(jLabel1);
        jLabel1.setBounds(1008, 68, 362, 453);

        userl.setForeground(new java.awt.Color(255, 255, 255));
        userl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userl.setText("Username :");
        desk1.add(userl);
        userl.setBounds(432, 256, 182, 26);

        passl.setForeground(new java.awt.Color(255, 255, 255));
        passl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passl.setText("Password :");
        desk1.add(passl);
        passl.setBounds(432, 305, 182, 22);

        userf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfActionPerformed(evt);
            }
        });
        desk1.add(userf);
        userf.setBounds(624, 255, 206, 29);
        desk1.add(passf);
        passf.setBounds(624, 302, 206, 29);

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        desk1.add(Login);
        Login.setBounds(574, 349, 85, 33);

        Clear.setText("Reset");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        desk1.add(Clear);
        Clear.setBounds(665, 349, 84, 33);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 133, 64));
        jLabel2.setText("                MINI OS");
        desk1.add(jLabel2);
        jLabel2.setBounds(432, 178, 351, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic.jpg"))); // NOI18N
        desk1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1390, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desk1, javax.swing.GroupLayout.DEFAULT_SIZE, 1380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desk1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userfActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        userf.setText(null);
        passf.setText(null);
    }//GEN-LAST:event_ClearActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String password = passf.getText();
        String username = userf.getText();
        if(password.equals("we") && username.equals("we"))
        {
            home ter =new home();
            desk1.add(ter);
            ter.show();
            userf.setText(null);
            passf.setText(null);
            System.out.println("Success");
        } else{
            JOptionPane.showMessageDialog(this,"Invalid Username or Password");
        }   
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }  
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Login;
    private javax.swing.JDesktopPane desk1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passf;
    private javax.swing.JLabel passl;
    private javax.swing.JTextField userf;
    private javax.swing.JLabel userl;
    // End of variables declaration//GEN-END:variables
}