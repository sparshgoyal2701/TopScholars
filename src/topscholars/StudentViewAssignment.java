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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author K1LL3R
 */
public class StudentViewAssignment extends javax.swing.JFrame {

    /**
     * Creates new form StudentViewAssignment
     */
    public StudentViewAssignment() {
        initComponents();
        //AssignmentTable.
        TableCellRenderer rendererFromHeader = AssignmentTable.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/topscholar","root","");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT `question` FROM `assignment` where `course` = ?");
            preparedStatement.setString(1, UserID.Course);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                rs.previous();
                while(rs.next()){
                DefaultTableModel model = (DefaultTableModel) AssignmentTable.getModel();
                Object [] rowData = new Object[1];
                rowData[0] = rs.getObject(1);
                model.addRow(rowData);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"No Record Found !");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AssignmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 32, 63));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 32, 63));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(187, 232, 215));
        jLabel3.setText("ASSIGNMENTS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 30, 270, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(590, 0, 110, 90);

        BackButton.setBackground(new java.awt.Color(0, 32, 63));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(187, 232, 215));
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(275, 360, 150, 40);

        AssignmentTable.setBackground(new java.awt.Color(0, 32, 63));
        AssignmentTable.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        AssignmentTable.setForeground(new java.awt.Color(187, 232, 215));
        AssignmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "QUESTION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AssignmentTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 680, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        new StudentMenu().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentViewAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentViewAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentViewAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentViewAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentViewAssignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AssignmentTable;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
