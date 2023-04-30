/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topscholars;

/**
 *
 * @author K1LL3R
 */
public class StudentMenu extends javax.swing.JFrame {

    /**
     * Creates new form StudentMenu
     */
    public StudentMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ViewResultButton = new javax.swing.JButton();
        ViewAssignmentButton = new javax.swing.JButton();
        ViewTimeTableButton = new javax.swing.JButton();
        ViewEbookButton = new javax.swing.JButton();
        GiveFeedbackButton = new javax.swing.JButton();
        ViewProfileButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(363, 144));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 32, 63));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(530, 0, 110, 90);

        jLabel2.setBackground(new java.awt.Color(0, 32, 63));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 232, 215));
        jLabel2.setText("STUDENT MENU");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 40, 290, 40);

        ViewResultButton.setBackground(new java.awt.Color(0, 32, 63));
        ViewResultButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewResultButton.setForeground(new java.awt.Color(187, 232, 215));
        ViewResultButton.setText("View Result");
        ViewResultButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        ViewResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewResultButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewResultButton);
        ViewResultButton.setBounds(100, 340, 160, 50);

        ViewAssignmentButton.setBackground(new java.awt.Color(0, 32, 63));
        ViewAssignmentButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewAssignmentButton.setForeground(new java.awt.Color(187, 232, 215));
        ViewAssignmentButton.setText("View Assignment");
        ViewAssignmentButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        ViewAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAssignmentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewAssignmentButton);
        ViewAssignmentButton.setBounds(100, 230, 160, 50);

        ViewTimeTableButton.setBackground(new java.awt.Color(0, 32, 63));
        ViewTimeTableButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewTimeTableButton.setForeground(new java.awt.Color(187, 232, 215));
        ViewTimeTableButton.setText("View Time Table");
        ViewTimeTableButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        ViewTimeTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTimeTableButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewTimeTableButton);
        ViewTimeTableButton.setBounds(380, 230, 160, 50);

        ViewEbookButton.setBackground(new java.awt.Color(0, 32, 63));
        ViewEbookButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewEbookButton.setForeground(new java.awt.Color(187, 232, 215));
        ViewEbookButton.setText("Update Profile");
        ViewEbookButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        ViewEbookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEbookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewEbookButton);
        ViewEbookButton.setBounds(380, 120, 160, 50);

        GiveFeedbackButton.setBackground(new java.awt.Color(0, 32, 63));
        GiveFeedbackButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GiveFeedbackButton.setForeground(new java.awt.Color(187, 232, 215));
        GiveFeedbackButton.setText("Give Feedback");
        GiveFeedbackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        GiveFeedbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiveFeedbackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(GiveFeedbackButton);
        GiveFeedbackButton.setBounds(380, 340, 160, 50);

        ViewProfileButton.setBackground(new java.awt.Color(0, 32, 63));
        ViewProfileButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewProfileButton.setForeground(new java.awt.Color(187, 232, 215));
        ViewProfileButton.setText("View Profile");
        ViewProfileButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        ViewProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProfileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewProfileButton);
        ViewProfileButton.setBounds(100, 120, 160, 50);

        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/Logout.png"))); // NOI18N
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });
        jPanel1.add(LogoutButton);
        LogoutButton.setBounds(590, 400, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        dispose();
        new StudentLogin().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void GiveFeedbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiveFeedbackButtonActionPerformed
        dispose();
        new GiveFeedback().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_GiveFeedbackButtonActionPerformed

    private void ViewResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewResultButtonActionPerformed
        dispose();
        new StudentViewResult().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ViewResultButtonActionPerformed

    private void ViewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProfileButtonActionPerformed
        dispose();
        new StudentViewProfile().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ViewProfileButtonActionPerformed

    private void ViewTimeTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTimeTableButtonActionPerformed
        dispose();
        new StudentViewTimeTable().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ViewTimeTableButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void ViewAssignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAssignmentButtonActionPerformed
        dispose();
        new StudentViewAssignment().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ViewAssignmentButtonActionPerformed

    private void ViewEbookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEbookButtonActionPerformed
        dispose();
        new StudentUpdateProfile().setVisible(true);
    }//GEN-LAST:event_ViewEbookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GiveFeedbackButton;
    private javax.swing.JLabel LogoutButton;
    private javax.swing.JButton ViewAssignmentButton;
    private javax.swing.JButton ViewEbookButton;
    private javax.swing.JButton ViewProfileButton;
    private javax.swing.JButton ViewResultButton;
    private javax.swing.JButton ViewTimeTableButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}