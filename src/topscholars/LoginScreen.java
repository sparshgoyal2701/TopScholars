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
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginNew
     */
    public LoginScreen() {
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
        LogoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        StudentButton = new javax.swing.JButton();
        FacultyButton = new javax.swing.JButton();
        AdminButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(233, 134));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 32, 63));
        jPanel1.setLayout(null);

        LogoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\K1LL3R\\Pictures\\logo.png")); // NOI18N
        jPanel1.add(LogoLabel);
        LogoLabel.setBounds(790, 0, 110, 80);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(187, 232, 215));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 30, 300, 50);

        ExitButton.setBackground(new java.awt.Color(0, 32, 63));
        ExitButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(187, 232, 215));
        ExitButton.setText("EXIT");
        ExitButton.setToolTipText("");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton);
        ExitButton.setBounds(850, 470, 50, 30);

        StudentButton.setBackground(new java.awt.Color(0, 32, 63));
        StudentButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        StudentButton.setForeground(new java.awt.Color(187, 232, 215));
        StudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewStudentG.png"))); // NOI18N
        StudentButton.setText("STUDENT");
        StudentButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        StudentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentButton.setIconTextGap(10);
        StudentButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StudentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StudentButtonMouseExited(evt);
            }
        });
        StudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StudentButton);
        StudentButton.setBounds(610, 140, 240, 300);

        FacultyButton.setBackground(new java.awt.Color(0, 32, 63));
        FacultyButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        FacultyButton.setForeground(new java.awt.Color(187, 232, 215));
        FacultyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewTeacherG.png"))); // NOI18N
        FacultyButton.setText("ADMIN");
        FacultyButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        FacultyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FacultyButton.setIconTextGap(10);
        FacultyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FacultyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FacultyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FacultyButtonMouseExited(evt);
            }
        });
        FacultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(FacultyButton);
        FacultyButton.setBounds(330, 140, 240, 300);

        AdminButton.setBackground(new java.awt.Color(0, 32, 63));
        AdminButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(187, 232, 215));
        AdminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewAdminG.png"))); // NOI18N
        AdminButton.setText("ADMIN");
        AdminButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        AdminButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminButton.setIconTextGap(10);
        AdminButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdminButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdminButtonMouseExited(evt);
            }
        });
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AdminButton);
        AdminButton.setBounds(50, 140, 240, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        ExitButton.setBackground(new java.awt.Color(187, 232, 215));
        ExitButton.setForeground(new java.awt.Color(0, 32, 63));
        ExitButton.setText("EXIT");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 63), 4));// TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        ExitButton.setBackground(new java.awt.Color(0, 32, 63));
        ExitButton.setForeground(new java.awt.Color(187, 232, 215));
        ExitButton.setText("EXIT");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));// TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonMouseExited

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void StudentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentButtonMouseEntered
        StudentButton.setBackground(new java.awt.Color(187, 232, 215));
        StudentButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        StudentButton.setForeground(new java.awt.Color(0, 32, 63));
        StudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewStudentB.png"))); // NOI18N
        StudentButton.setText("STUDENT");
        StudentButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 63), 4));
        StudentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentButton.setIconTextGap(10);
        StudentButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);       // TODO add your handling code here:
    }//GEN-LAST:event_StudentButtonMouseEntered

    private void StudentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentButtonMouseExited
        StudentButton.setBackground(new java.awt.Color(0, 32, 63));
        StudentButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        StudentButton.setForeground(new java.awt.Color(187, 232, 215));
        StudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewStudentG.png"))); // NOI18N
        StudentButton.setText("STUDENT");
        StudentButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        StudentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentButton.setIconTextGap(10);
        StudentButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);        // TODO add your handling code here:
    }//GEN-LAST:event_StudentButtonMouseExited

    private void StudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentButtonActionPerformed
        dispose();
        new StudentLogin().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_StudentButtonActionPerformed

    private void FacultyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyButtonMouseEntered
        FacultyButton.setBackground(new java.awt.Color(187, 232, 215));
        FacultyButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        FacultyButton.setForeground(new java.awt.Color(0, 32, 63));
        FacultyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewTeacherB.png"))); // NOI18N
        FacultyButton.setText("FACULTY");
        FacultyButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 63), 4));
        FacultyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FacultyButton.setIconTextGap(10);
        FacultyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }//GEN-LAST:event_FacultyButtonMouseEntered

    private void FacultyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyButtonMouseExited
        FacultyButton.setBackground(new java.awt.Color(0, 32, 63));
        FacultyButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        FacultyButton.setForeground(new java.awt.Color(187, 232, 215));
        FacultyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewTeacherG.png"))); // NOI18N
        FacultyButton.setText("FACULTY");
        FacultyButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        FacultyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FacultyButton.setIconTextGap(10);
        FacultyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }//GEN-LAST:event_FacultyButtonMouseExited

    private void FacultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyButtonActionPerformed
        dispose();
        new FacultyLogin().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_FacultyButtonActionPerformed

    private void AdminButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminButtonMouseEntered
        AdminButton.setBackground(new java.awt.Color(187, 232, 215));
        AdminButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(0, 32, 63));
        AdminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewAdminB.png"))); // NOI18N
        AdminButton.setText("ADMIN");
        AdminButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 63), 4));
        AdminButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminButton.setIconTextGap(10);
        AdminButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }//GEN-LAST:event_AdminButtonMouseEntered

    private void AdminButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminButtonMouseExited
        AdminButton.setBackground(new java.awt.Color(0, 32, 63));
        AdminButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(187, 232, 215));
        AdminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/NewAdminG.png"))); // NOI18N
        AdminButton.setText("ADMIN");
        AdminButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        AdminButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminButton.setIconTextGap(10);
        AdminButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }//GEN-LAST:event_AdminButtonMouseExited

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        dispose();
        new AdminLogin().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton FacultyButton;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JButton StudentButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
