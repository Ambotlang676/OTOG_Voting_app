package Student;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Stud_Dashboard extends javax.swing.JFrame {

    public Stud_Dashboard() {
        initComponents();
        //Making Constructor for Logo
        Image icon = new ImageIcon(getClass().getResource("/resources/icon.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Icon_dash = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();
        show_menu = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Profile = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        party_list = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Voting_rules = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Voting = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hide_menu = new javax.swing.JPanel();
        menu_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 51, 112));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(36, 68, 145));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard");
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        Icon_dash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png"))); // NOI18N
        jPanel13.add(Icon_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        jPanel2.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, 190));

        jPanel7.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 30));

        jPanel3.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 130, 30));

        jPanel4.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 100, 50));

        jPanel6.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 60, 250));

        jPanel8.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, 50));

        jPanel5.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 110, 90));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background.png"))); // NOI18N
        jPanel12.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        show_menu.setBackground(new java.awt.Color(0, 51, 112));
        show_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main-menu.png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        show_menu.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel12.add(show_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, 370));

        Home.setBackground(new java.awt.Color(27, 45, 72));
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("Home");
        Home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel12.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 50));

        Profile.setBackground(new java.awt.Color(44, 69, 107));
        Profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel4.setText("Profile");
        Profile.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel12.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 100, 50));

        party_list.setBackground(new java.awt.Color(60, 100, 159));
        party_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel5.setText("Party");
        party_list.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel6.setText("lists");
        party_list.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel12.add(party_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 100, 60));

        Voting_rules.setBackground(new java.awt.Color(71, 121, 196));
        Voting_rules.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel7.setText("Voting Rules");
        Voting_rules.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel8.setText("and");
        Voting_rules.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel9.setText("Regulations");
        Voting_rules.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel12.add(Voting_rules, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, 70));

        Voting.setBackground(new java.awt.Color(131, 175, 240));
        Voting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel10.setText("Vote");
        Voting.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel11.setText(" Now!");
        Voting.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel12.add(Voting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 100, 80));

        hide_menu.setBackground(new java.awt.Color(0, 51, 112));
        hide_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main-menu.png"))); // NOI18N
        menu_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_1MouseClicked(evt);
            }
        });
        hide_menu.add(menu_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel12.add(hide_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 60));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 504, 430));

        setSize(new java.awt.Dimension(518, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //animation para makita ang lists
    int x = 210;    
    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        if (x == 210 ) {
            show_menu.setSize(210, 552);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try {
                        for ( int i = 210; i >= 0; i--){
                            Thread.sleep(1);
                            show_menu.setSize(i, 552);
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=0;
        }
    }//GEN-LAST:event_menuMouseClicked

    //Animation para ma tabunan ang lists
    private void menu_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_1MouseClicked
        if (x == 0){
            show_menu.show();
            show_menu.setSize(x,552);
            Thread th = new Thread (){
                @Override
                public void run(){
                    try {
                        for (int i = 0; i <= x; i++){
                            Thread.sleep(1);
                            show_menu.setSize(i,552);
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=210;
        }
    }//GEN-LAST:event_menu_1MouseClicked

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
            java.util.logging.Logger.getLogger(Stud_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stud_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stud_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stud_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stud_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Icon_dash;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Voting;
    private javax.swing.JPanel Voting_rules;
    private javax.swing.JPanel hide_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel menu_1;
    private javax.swing.JPanel party_list;
    private javax.swing.JPanel show_menu;
    // End of variables declaration//GEN-END:variables
}
