package welcome_scrn;

import Choose_role.Role;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class splashForm extends javax.swing.JFrame {

    public splashForm() {
        initComponents();
        
        //Constructor for Logo
        Image icon = new ImageIcon(getClass().getResource("/resources/icon.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgressBar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        white_lineShort = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OTOG");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar.setToolTipText("");
        ProgressBar.setStringPainted(true);
        getContentPane().add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 203, 410, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(OTOG)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));
        jLabel3.getAccessibleContext().setAccessibleParent(jLabel3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("One Team, One Goal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        white_lineShort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/white_Line.jpg"))); // NOI18N
        white_lineShort.setText("jLabel4");
        getContentPane().add(white_lineShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -40, 60, 270));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_line.jpg"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 320, 330));

        jPanel1.setBackground(new java.awt.Color(35, 59, 119));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 20, 220));

        setSize(new java.awt.Dimension(389, 218));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Instantiation for splashForm
        final splashForm sf = new splashForm();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                //True - show splash screen
                sf.setVisible(true);
            }
        });
        
        Thread t = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                //Loop for Progression Bar
                for (int i = 0; i <= 100; i++){
                    
                    try {
                        sf.ProgressBar.setValue(i);
                        Thread.sleep(40);
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                //making instance for role to be visible
                new Role().setVisible(true);
                //making splash screen disappear once role is shown
                sf.setVisible(false);
                
            }
        });
        t.start();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel white_lineShort;
    // End of variables declaration//GEN-END:variables
}
