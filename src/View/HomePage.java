package View;
/**
 *
 * @author DELL
 */
import Model.DBConnection;
import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMakeBooking = new javax.swing.JMenu();
        BookMovie = new javax.swing.JMenuItem();
        btnBookingDetails = new javax.swing.JMenu();
        BookingDetails = new javax.swing.JMenuItem();
        RegistrationDetails = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 4, 4));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("P M J M");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 700, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("C    I    N    E    M    A    S");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Untitled design.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1370, 690));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 153));

        btnMakeBooking.setText("HOME");
        btnMakeBooking.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        BookMovie.setText("Make Booking");
        BookMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookMovieActionPerformed(evt);
            }
        });
        btnMakeBooking.add(BookMovie);

        jMenuBar1.add(btnMakeBooking);

        btnBookingDetails.setText("ADMIN");
        btnBookingDetails.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        BookingDetails.setText("View Booking Details");
        BookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingDetailsActionPerformed(evt);
            }
        });
        btnBookingDetails.add(BookingDetails);

        RegistrationDetails.setText("View Registration Details");
        RegistrationDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationDetailsActionPerformed(evt);
            }
        });
        btnBookingDetails.add(RegistrationDetails);

        jMenuBar1.add(btnBookingDetails);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BookMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookMovieActionPerformed
       MovieDetails M=new MovieDetails();
       M.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_BookMovieActionPerformed

    private void BookingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingDetailsActionPerformed
       Receipt q=new Receipt();
       q.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_BookingDetailsActionPerformed

    private void RegistrationDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationDetailsActionPerformed
       Registration w=new Registration();
       w.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_RegistrationDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DBConnection.closeCon();
        JOptionPane.showMessageDialog(this, "Log Out Successfully");
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BookMovie;
    private javax.swing.JMenuItem BookingDetails;
    private javax.swing.JMenuItem RegistrationDetails;
    private javax.swing.JMenu btnBookingDetails;
    private javax.swing.JMenu btnMakeBooking;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
