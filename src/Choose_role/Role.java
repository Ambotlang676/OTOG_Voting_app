/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Choose_role;

import Login.Login;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Role extends javax.swing.JFrame {

    public Role() {
        initComponents();
        //Making Constructor for Logo
        Image icon = new ImageIcon(getClass().getResource("/resources/icon.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_admin = new javax.swing.JButton();
        btn_student = new javax.swing.JButton();
        white_line1 = new javax.swing.JLabel();
        white_line = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OTOG");
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 59, 119));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(OTOG)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(35, 59, 119));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select User Role");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("One Team, One Goal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        btn_admin.setText("Admin");
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });
        jPanel1.add(btn_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        btn_student.setText("Student");
        btn_student.setToolTipText("");
        btn_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentActionPerformed(evt);
            }
        });
        jPanel1.add(btn_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        white_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/white_Line.jpg"))); // NOI18N
        white_line1.setText("jLabel1");
        jPanel1.add(white_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, 30));

        white_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/white_Line.jpg"))); // NOI18N
        white_line.setText("jLabel2");
        jPanel1.add(white_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, 30));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_line.jpg"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(412, 268));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
        //hide role frame
        this.setVisible(false);
        //Show the login panel when clicked
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentActionPerformed
        //hide role frame
        this.setVisible(false);
        //Show the login panel when clicked
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_studentActionPerformed

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
            java.util.logging.Logger.getLogger(Role.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Role.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Role.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Role.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Role().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_student;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel white_line;
    private javax.swing.JLabel white_line1;
    // End of variables declaration//GEN-END:variables
}
