/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

/**
 *
 * @author jefe
 */
public class RegisterUser extends javax.swing.JFrame {

    /**
     * Creates new form RegisterUser
     */
    public RegisterUser() {
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

        jpRegisterUser = new javax.swing.JPanel();
        jpcontenResister = new javax.swing.JPanel();
        jtUser = new javax.swing.JTextField();
        jtName = new javax.swing.JTextField();
        jtPassword = new javax.swing.JTextField();
        jtConfirPassword = new javax.swing.JTextField();
        jtGmail = new javax.swing.JTextField();
        jbBack = new javax.swing.JButton();
        jbCreateUser = new javax.swing.JButton();
        jlResigister = new javax.swing.JLabel();
        jlUsername = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        jlConfirPassword = new javax.swing.JLabel();
        jlGmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpRegisterUser.setBackground(new java.awt.Color(204, 204, 204));
        jpRegisterUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpcontenResister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUserActionPerformed(evt);
            }
        });
        jpcontenResister.add(jtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 560, 40));

        jtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNameActionPerformed(evt);
            }
        });
        jpcontenResister.add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 560, 40));

        jtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPasswordActionPerformed(evt);
            }
        });
        jpcontenResister.add(jtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 560, 40));

        jtConfirPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtConfirPasswordActionPerformed(evt);
            }
        });
        jpcontenResister.add(jtConfirPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 560, 40));
        jpcontenResister.add(jtGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 560, 40));

        jbBack.setText("Atras");
        jpcontenResister.add(jbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 130, 50));

        jbCreateUser.setText("Crear");
        jpcontenResister.add(jbCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 130, 50));

        jlResigister.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jlResigister.setText("Registro de Usuario");
        jpcontenResister.add(jlResigister, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jlUsername.setText("Ingrese su usuario");
        jpcontenResister.add(jlUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jlName.setText("Nombre");
        jpcontenResister.add(jlName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jlPassword.setText("Ingrese su contraseña");
        jpcontenResister.add(jlPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jlConfirPassword.setText("Confirma contraseña");
        jpcontenResister.add(jlConfirPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jlGmail.setText("Gmail ");
        jpcontenResister.add(jlGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        jpRegisterUser.add(jpcontenResister, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 770, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpRegisterUser, javax.swing.GroupLayout.DEFAULT_SIZE, 2015, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpRegisterUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUserActionPerformed

    private void jtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNameActionPerformed

    private void jtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPasswordActionPerformed

    private void jtConfirPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtConfirPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtConfirPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBack;
    private javax.swing.JButton jbCreateUser;
    private javax.swing.JLabel jlConfirPassword;
    private javax.swing.JLabel jlGmail;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlResigister;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JPanel jpRegisterUser;
    private javax.swing.JPanel jpcontenResister;
    private javax.swing.JTextField jtConfirPassword;
    private javax.swing.JTextField jtGmail;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextField jtPassword;
    private javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables
}