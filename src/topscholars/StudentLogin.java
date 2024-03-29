/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topscholars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author K1LL3R
 */
public class StudentLogin extends javax.swing.JFrame {

    /**
     * Creates new form StudentLogin
     */
    public StudentLogin() {
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
        jLabel2 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UserNameField = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        RequestButton = new javax.swing.JButton();
        RequestLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        ShowHideLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(363, 144));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 32, 63));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));
        jPanel1.setLayout(null);

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/Logo.png"))); // NOI18N
        jPanel1.add(LogoLabel);
        LogoLabel.setBounds(530, 0, 110, 90);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 232, 215));
        jLabel2.setText("STUDENT LOGIN PANEL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 70, 450, 70);

        UsernameLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(187, 232, 215));
        UsernameLabel.setText("USERNAME : ");
        jPanel1.add(UsernameLabel);
        UsernameLabel.setBounds(50, 160, 190, 40);

        PasswordLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(187, 232, 215));
        PasswordLabel.setText("PASSWORD :");
        jPanel1.add(PasswordLabel);
        PasswordLabel.setBounds(50, 260, 190, 40);

        UserNameField.setBackground(new java.awt.Color(187, 232, 215));
        UserNameField.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        UserNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameFieldMouseClicked(evt);
            }
        });
        UserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UserNameField);
        UserNameField.setBounds(300, 160, 240, 35);

        BackButton.setBackground(new java.awt.Color(0, 32, 63));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(187, 232, 215));
        BackButton.setText("BACK");
        BackButton.setToolTipText("");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackButtonMouseExited(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(340, 340, 140, 40);

        LoginButton.setBackground(new java.awt.Color(0, 32, 63));
        LoginButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(187, 232, 215));
        LoginButton.setText("LOG IN");
        LoginButton.setToolTipText("");
        LoginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton);
        LoginButton.setBounds(120, 340, 140, 40);

        RequestButton.setBackground(new java.awt.Color(0, 32, 63));
        RequestButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        RequestButton.setForeground(new java.awt.Color(187, 232, 215));
        RequestButton.setText("CLICK HERE");
        RequestButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        RequestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RequestButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RequestButtonMouseExited(evt);
            }
        });
        RequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RequestButton);
        RequestButton.setBounds(369, 420, 87, 30);

        RequestLabel.setBackground(new java.awt.Color(0, 32, 63));
        RequestLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        RequestLabel.setForeground(new java.awt.Color(187, 232, 215));
        RequestLabel.setText("Request for Admission  -->");
        jPanel1.add(RequestLabel);
        RequestLabel.setBounds(120, 420, 360, 30);

        PasswordField.setBackground(new java.awt.Color(187, 232, 215));
        PasswordField.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(0, 32, 63));
        PasswordField.setAutoscrolls(false);
        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldMouseClicked(evt);
            }
        });
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordField);
        PasswordField.setBounds(300, 260, 240, 35);

        ShowHideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/hide.png"))); // NOI18N
        ShowHideLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShowHideLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShowHideLabelMouseExited(evt);
            }
        });
        jPanel1.add(ShowHideLabel);
        ShowHideLabel.setBounds(570, 250, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        new LoginScreen().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if(UserNameField.getText().trim().isEmpty()  || PasswordField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"First enter the credentials !");
        }
        else{
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/topscholar","root","");
                PreparedStatement preparedStatement = connection
                .prepareStatement("select accounts.id, accounts.password, student.course from accounts,student where accounts.id = ? and accounts.password = ? and accounts.account_type = ? and student.student_id = ?");
                preparedStatement.setInt(1,Integer.parseInt(UserNameField.getText()));
                String passwordString = new String(PasswordField.getPassword());
                preparedStatement.setString(2,passwordString);
                preparedStatement.setString(3,"student");
                preparedStatement.setInt(4,Integer.parseInt(UserNameField.getText()));
                ResultSet rs = preparedStatement.executeQuery();
                if(rs.next()){
                    UserID.UserID = Integer.parseInt(UserNameField.getText());
                    UserID.AccountType = "student";
                    UserID.Course = rs.getString("course");
                    dispose();
                    new StudentMenu().setVisible(true);
                    JOptionPane.showMessageDialog(null,"Welcome !");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Username or Password!");
                }
                connection.close();
                preparedStatement.close();
                rs.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setBackground(new java.awt.Color(187, 232, 215));
        BackButton.setForeground(new java.awt.Color(0, 32, 63));
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 63), 4));// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setBackground(new java.awt.Color(0, 32, 63));
        BackButton.setForeground(new java.awt.Color(187, 232, 215));
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseExited

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        LoginButton.setBackground(new java.awt.Color(187, 232, 215));
        LoginButton.setForeground(new java.awt.Color(0, 32, 63));
        LoginButton.setText("LOG IN");
        LoginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 63), 4));// TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        LoginButton.setBackground(new java.awt.Color(0, 32, 63));
        LoginButton.setForeground(new java.awt.Color(187, 232, 215));
        LoginButton.setText("LOG IN");
        LoginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));// TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonMouseExited

    private void UserNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameFieldMouseClicked
         
    }//GEN-LAST:event_UserNameFieldMouseClicked

    private void RequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestButtonActionPerformed
        dispose();
        new StudentRequestForm().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_RequestButtonActionPerformed

    private void RequestButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestButtonMouseEntered
        RequestButton.setBackground(new java.awt.Color(187, 232, 215));
        RequestButton.setForeground(new java.awt.Color(0, 32, 63));
        RequestButton.setText("CLICK HERE");
        RequestButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 63), 4));// TODO add your handling code here:
    }//GEN-LAST:event_RequestButtonMouseEntered

    private void RequestButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestButtonMouseExited
        RequestButton.setBackground(new java.awt.Color(0, 32, 63));
        RequestButton.setForeground(new java.awt.Color(187, 232, 215));
        RequestButton.setText("CLICK HERE");
        RequestButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));// TODO add your handling code here:
    }//GEN-LAST:event_RequestButtonMouseExited

    private void PasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMouseClicked
        
    }//GEN-LAST:event_PasswordFieldMouseClicked

    private void ShowHideLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowHideLabelMouseEntered
        ShowHideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/show.png")));
        PasswordField.setEchoChar((char)0);
    }//GEN-LAST:event_ShowHideLabelMouseEntered

    private void ShowHideLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowHideLabelMouseExited
        ShowHideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/hide.png")));
        PasswordField.setEchoChar('●');
    }//GEN-LAST:event_ShowHideLabelMouseExited

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RequestButton;
    private javax.swing.JLabel RequestLabel;
    private javax.swing.JLabel ShowHideLabel;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
