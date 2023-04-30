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
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author K1LL3R
 */
public class FacultyUploadAssignment extends javax.swing.JFrame {

    /**
     * Creates new form FacultyUploadAssignment
     */
    public FacultyUploadAssignment() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NameLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuestionField = new javax.swing.JTextArea();
        UploadButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        NameLabel2 = new javax.swing.JLabel();
        CourseCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 32, 63));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 32, 63));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 232, 215));
        jLabel2.setText("UPLOAD ASSIGNMENT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 30, 410, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(540, 0, 110, 90);

        NameLabel1.setBackground(new java.awt.Color(0, 32, 63));
        NameLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NameLabel1.setForeground(new java.awt.Color(187, 232, 215));
        NameLabel1.setText("Questions for :");
        jPanel1.add(NameLabel1);
        NameLabel1.setBounds(140, 110, 110, 30);

        jScrollPane1.setBackground(new java.awt.Color(187, 232, 215));
        jScrollPane1.setForeground(new java.awt.Color(0, 32, 63));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        QuestionField.setBackground(new java.awt.Color(187, 232, 215));
        QuestionField.setColumns(20);
        QuestionField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        QuestionField.setForeground(new java.awt.Color(0, 32, 63));
        QuestionField.setRows(5);
        jScrollPane1.setViewportView(QuestionField);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 170, 440, 90);

        UploadButton.setBackground(new java.awt.Color(0, 32, 63));
        UploadButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UploadButton.setForeground(new java.awt.Color(187, 232, 215));
        UploadButton.setText("UPLOAD");
        UploadButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        UploadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UploadButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UploadButtonMouseExited(evt);
            }
        });
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UploadButton);
        UploadButton.setBounds(100, 320, 150, 40);

        BackButton.setBackground(new java.awt.Color(0, 32, 63));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(187, 232, 215));
        BackButton.setText("BACK");
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
        BackButton.setBounds(370, 320, 150, 40);

        NameLabel2.setBackground(new java.awt.Color(0, 32, 63));
        NameLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NameLabel2.setForeground(new java.awt.Color(187, 232, 215));
        NameLabel2.setText("Question :");
        jPanel1.add(NameLabel2);
        NameLabel2.setBounds(70, 170, 130, 30);

        CourseCB.setBackground(new java.awt.Color(187, 232, 215));
        CourseCB.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        CourseCB.setForeground(new java.awt.Color(0, 32, 63));
        CourseCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COURSES", "BCA", "BBA", "B.Com.", "B.Ed.", "B.Sc.", "B.Tech." }));
        CourseCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseCBMouseClicked(evt);
            }
        });
        jPanel1.add(CourseCB);
        CourseCB.setBounds(300, 110, 180, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void UploadButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadButtonMouseEntered
        UploadButton.setBackground(new java.awt.Color(187,232,215));
        UploadButton.setForeground(new java.awt.Color(0,32,63));
        UploadButton.setText("UPLOAD");
        UploadButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,32,63), 4));// TODO add your handling code here:
    }//GEN-LAST:event_UploadButtonMouseEntered

    private void UploadButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadButtonMouseExited
        UploadButton.setBackground(new java.awt.Color(0, 32, 63));
        UploadButton.setForeground(new java.awt.Color(187, 232, 215));
        UploadButton.setText("UPLOAD");
        UploadButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));// TODO add your handling code here:
    }//GEN-LAST:event_UploadButtonMouseExited

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
        if (QuestionField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter Question !");
        }
        else if("COURSE".equals(CourseCB.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Select Course !");
        }
        else {
            String query = "INSERT INTO `assignment`(`course`, `question`)VALUES (?,?)";
            Connection connection;
            PreparedStatement preparedStatement;
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/topscholar", "root", "");
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, (String) CourseCB.getSelectedItem());
                preparedStatement.setString(2,QuestionField.getText().trim());
                int len=0;
                len = preparedStatement.executeUpdate();
                if (len > 0) {
                    JOptionPane.showMessageDialog(null, "Question added Successfully !");
                }
                connection.close();
                preparedStatement.close();
                dispose();
                new FacultyUploadAssignment().setVisible(true);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_UploadButtonActionPerformed

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setBackground(new java.awt.Color(187,232,215));
        BackButton.setForeground(new java.awt.Color(0,32,63));
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,32,63), 4));// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setBackground(new java.awt.Color(0, 32, 63));
        BackButton.setForeground(new java.awt.Color(187, 232, 215));
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseExited

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        new FacultyMenu().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CourseCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseCBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseCBMouseClicked

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
            java.util.logging.Logger.getLogger(FacultyUploadAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyUploadAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyUploadAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyUploadAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyUploadAssignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> CourseCB;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel NameLabel2;
    private javax.swing.JTextArea QuestionField;
    private javax.swing.JButton UploadButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}