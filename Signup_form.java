/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author hp
 */
public class Signup_form extends javax.swing.JFrame {

    /**
     * Creates new form Signup_form
     */
    public Signup_form() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label3 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        label4 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        label5 = new java.awt.Label();
        jPasswordField1 = new javax.swing.JPasswordField();
        label6 = new java.awt.Label();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        label7 = new java.awt.Label();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE", "DOCTOR", "PATIENT", "ADMIN" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 190, 60));

        label1.setFont(new java.awt.Font("Castellar", 1, 48)); // NOI18N
        label1.setText("SIGNUP FORM");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText("NAME");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        textField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 630, 30));

        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setText("PHONE NO");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        textField2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 630, 30));

        label4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label4.setText("EMAIL");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        textField3.setEnabled(false);
        textField3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 610, 30));

        label5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label5.setText("PASSWORD");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 610, 30));

        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setText("RETYPE PASSWORD");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, -1, 40));

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPasswordField2.setText("jPasswordField2");
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 610, 30));

        jButton1.setFont(new java.awt.Font("Algerian", 2, 36)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.setActionCommand("");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 430, -1, -1));

        label7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label7.setText("DATE OF BIRTH");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, 350, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1666544.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
