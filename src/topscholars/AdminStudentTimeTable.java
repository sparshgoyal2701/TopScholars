/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topscholars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author K1LL3R
 */
public class AdminStudentTimeTable extends javax.swing.JFrame {

    /**
     * Creates new form AdminStudentTimeTable
     */
    public AdminStudentTimeTable() {
        initComponents();
        System.out.println(TimeTable.getValueAt(0,0));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TimeTable = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        CourseCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 32, 63));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/topscholars/Images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(690, 0, 110, 90);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 232, 215));
        jLabel2.setText("TIME TABLE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 30, 220, 40);

        jScrollPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        TimeTable.setBackground(new java.awt.Color(0, 32, 63));
        TimeTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimeTable.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        TimeTable.setForeground(new java.awt.Color(187, 232, 215));
        TimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "1", "2", null, "3", "4", null, "5", "6"},
                {"MONDAY", null, null, "BREAK", null, null, "BREAK", null, null},
                {"TUESDAY", null, null, "BREAK", null, null, "BREAK", null, null},
                {"WEDNESDAY", null, null, "BREAK", null, null, "BREAK", null, null},
                {"THRUSDAY", null, null, "BREAK", null, null, "BREAK", null, null},
                {"FRIDAY", null, null, "BREAK", null, null, "BREAK", null, null}
            },
            new String [] {
                "TIME", "9:00-9:50", "9:50-10:40", "10:40-10:50", "10:50-11:40", "11:40-12:30", "12:30-1:00", "1:00-1:50", "1:50-2:40"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TimeTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TimeTable.setRowHeight(28);
        jScrollPane1.setViewportView(TimeTable);
        if (TimeTable.getColumnModel().getColumnCount() > 0) {
            TimeTable.getColumnModel().getColumn(0).setResizable(false);
            TimeTable.getColumnModel().getColumn(1).setResizable(false);
            TimeTable.getColumnModel().getColumn(2).setResizable(false);
            TimeTable.getColumnModel().getColumn(3).setResizable(false);
            TimeTable.getColumnModel().getColumn(4).setResizable(false);
            TimeTable.getColumnModel().getColumn(5).setResizable(false);
            TimeTable.getColumnModel().getColumn(6).setResizable(false);
            TimeTable.getColumnModel().getColumn(7).setResizable(false);
            TimeTable.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 760, 200);

        SaveButton.setBackground(new java.awt.Color(0, 32, 63));
        SaveButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(187, 232, 215));
        SaveButton.setText("SAVE");
        SaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveButtonMouseExited(evt);
            }
        });
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SaveButton);
        SaveButton.setBounds(190, 390, 150, 40);

        BackButton.setBackground(new java.awt.Color(0, 32, 63));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
        BackButton.setBounds(430, 390, 150, 40);

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
        CourseCB.setBounds(330, 100, 180, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(187, 232, 215));
        jLabel3.setText("Time Table For :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 100, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if("COURSES".equals(CourseCB.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Select proper Course !");
        }
        else{
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/topscholar", "root", "");;
                PreparedStatement preparedStatement;
                int len = 0;
                int count = 0;
                for(int i=0;i<6;i++){
                    preparedStatement = connection.prepareStatement("INSERT INTO `timetable`(`course`, `days`, `1`, `2`, `break1`, `3`, `4`, `break2`, `5`, `6`) VALUES (?,?,?,?,?,?,?,?,?,?)");
                    preparedStatement.setString(1, (String) CourseCB.getSelectedItem());
                    for(int j =0;j<9;j++){
                        preparedStatement.setString(j+2, (String) TimeTable.getValueAt(i,j));
                    }
                    len = preparedStatement.executeUpdate();
                    if(len > 0){
                        count++;
                        len = 0;
                    }
                    preparedStatement.close();
                }
                if(count == 6){
                    JOptionPane.showMessageDialog(null, "TimeTable for "+CourseCB.getSelectedItem()+" Saved !");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        new AdminMenu().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseEntered
        SaveButton.setBackground(new java.awt.Color(187,232,215));
        SaveButton.setForeground(new java.awt.Color(0,32,63));
        SaveButton.setText("SAVE");
        SaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,32,63), 4));// TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonMouseEntered

    private void SaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseExited
        SaveButton.setBackground(new java.awt.Color(0, 32, 63));
        SaveButton.setForeground(new java.awt.Color(187, 232, 215));
        SaveButton.setText("SAVE");
        SaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));// TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonMouseExited

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
            java.util.logging.Logger.getLogger(AdminStudentTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminStudentTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminStudentTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminStudentTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminStudentTimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> CourseCB;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTable TimeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}