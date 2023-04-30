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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author K1LL3R
 */
public class AdminAddFaculty extends javax.swing.JFrame {

    /**
     * Creates new form AddFaculty
     */
    public AdminAddFaculty() {
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
        NameLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        DateCB = new javax.swing.JComboBox<>();
        MonthCB = new javax.swing.JComboBox<>();
        YearCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressField = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FatherNameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        HighestQualificationCB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        PercentageField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MaleRB = new javax.swing.JRadioButton();
        FemaleRB = new javax.swing.JRadioButton();
        OtherRB = new javax.swing.JRadioButton();
        BackButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        NameLabel1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        MobileNumberField = new javax.swing.JTextField();

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
        jLabel1.setBounds(580, 0, 110, 90);

        jLabel2.setBackground(new java.awt.Color(0, 32, 63));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 232, 215));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD FACULTY MEMBER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 20, 440, 40);

        NameLabel.setBackground(new java.awt.Color(0, 32, 63));
        NameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(187, 232, 215));
        NameLabel.setText("Password :");
        jPanel1.add(NameLabel);
        NameLabel.setBounds(140, 140, 70, 30);

        NameField.setBackground(new java.awt.Color(187, 232, 215));
        NameField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NameField.setForeground(new java.awt.Color(0, 32, 63));
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NameField);
        NameField.setBounds(310, 100, 240, 30);

        DateCB.setBackground(new java.awt.Color(187, 232, 215));
        DateCB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        DateCB.setForeground(new java.awt.Color(0, 32, 63));
        DateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateCBActionPerformed(evt);
            }
        });
        jPanel1.add(DateCB);
        DateCB.setBounds(310, 180, 60, 30);

        MonthCB.setBackground(new java.awt.Color(187, 232, 215));
        MonthCB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MonthCB.setForeground(new java.awt.Color(0, 32, 63));
        MonthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(MonthCB);
        MonthCB.setBounds(395, 180, 70, 30);

        YearCB.setBackground(new java.awt.Color(187, 232, 215));
        YearCB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        YearCB.setForeground(new java.awt.Color(0, 32, 63));
        YearCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jPanel1.add(YearCB);
        YearCB.setBounds(490, 180, 60, 30);

        jScrollPane1.setBackground(new java.awt.Color(187, 232, 215));
        jScrollPane1.setForeground(new java.awt.Color(0, 32, 63));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        AddressField.setBackground(new java.awt.Color(187, 232, 215));
        AddressField.setColumns(20);
        AddressField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        AddressField.setForeground(new java.awt.Color(0, 32, 63));
        AddressField.setRows(5);
        jScrollPane1.setViewportView(AddressField);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 220, 240, 70);

        jLabel6.setBackground(new java.awt.Color(0, 32, 63));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(187, 232, 215));
        jLabel6.setText("Date of Birth : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 180, 100, 30);

        jLabel5.setBackground(new java.awt.Color(0, 32, 63));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(187, 232, 215));
        jLabel5.setText("Address : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 220, 80, 30);

        jLabel3.setBackground(new java.awt.Color(0, 32, 63));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(187, 232, 215));
        jLabel3.setText("Father's Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 300, 120, 30);

        FatherNameField.setBackground(new java.awt.Color(187, 232, 215));
        FatherNameField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        FatherNameField.setForeground(new java.awt.Color(0, 32, 63));
        FatherNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(FatherNameField);
        FatherNameField.setBounds(310, 300, 240, 30);

        EmailField.setBackground(new java.awt.Color(187, 232, 215));
        EmailField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        EmailField.setForeground(new java.awt.Color(0, 32, 63));
        jPanel1.add(EmailField);
        EmailField.setBounds(310, 380, 240, 30);

        jLabel4.setBackground(new java.awt.Color(0, 32, 63));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(187, 232, 215));
        jLabel4.setText("Mobile no. : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 340, 90, 30);

        jLabel7.setBackground(new java.awt.Color(0, 32, 63));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(187, 232, 215));
        jLabel7.setText("Highest Qualification : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 420, 160, 30);

        HighestQualificationCB.setBackground(new java.awt.Color(187, 232, 215));
        HighestQualificationCB.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        HighestQualificationCB.setForeground(new java.awt.Color(0, 32, 63));
        HighestQualificationCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Qualification", "12th Standard", "Diploma", "Graduate", "Post Graduate", " " }));
        HighestQualificationCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighestQualificationCBActionPerformed(evt);
            }
        });
        jPanel1.add(HighestQualificationCB);
        HighestQualificationCB.setBounds(310, 420, 240, 30);

        jLabel10.setBackground(new java.awt.Color(0, 32, 63));
        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(187, 232, 215));
        jLabel10.setText("Percentage : ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 460, 85, 30);

        PercentageField.setBackground(new java.awt.Color(187, 232, 215));
        PercentageField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        PercentageField.setForeground(new java.awt.Color(0, 32, 63));
        jPanel1.add(PercentageField);
        PercentageField.setBounds(310, 460, 240, 30);

        jLabel8.setBackground(new java.awt.Color(0, 32, 63));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(187, 232, 215));
        jLabel8.setText("Gender : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 500, 85, 30);

        MaleRB.setBackground(new java.awt.Color(0, 32, 63));
        MaleRB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MaleRB.setForeground(new java.awt.Color(187, 232, 215));
        MaleRB.setText("Male");
        MaleRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaleRBMouseClicked(evt);
            }
        });
        MaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRBActionPerformed(evt);
            }
        });
        jPanel1.add(MaleRB);
        MaleRB.setBounds(310, 500, 51, 30);

        FemaleRB.setBackground(new java.awt.Color(0, 32, 63));
        FemaleRB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        FemaleRB.setForeground(new java.awt.Color(187, 232, 215));
        FemaleRB.setText("Female");
        FemaleRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FemaleRBMouseClicked(evt);
            }
        });
        jPanel1.add(FemaleRB);
        FemaleRB.setBounds(400, 500, 63, 30);

        OtherRB.setBackground(new java.awt.Color(0, 32, 63));
        OtherRB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        OtherRB.setForeground(new java.awt.Color(187, 232, 215));
        OtherRB.setText("Others");
        OtherRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OtherRBMouseClicked(evt);
            }
        });
        OtherRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherRBActionPerformed(evt);
            }
        });
        jPanel1.add(OtherRB);
        OtherRB.setBounds(485, 500, 65, 30);

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
        BackButton.setBounds(408, 570, 150, 40);

        AddButton.setBackground(new java.awt.Color(0, 32, 63));
        AddButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddButton.setForeground(new java.awt.Color(187, 232, 215));
        AddButton.setText("ADD FACULTY");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonMouseExited(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton);
        AddButton.setBounds(128, 570, 150, 40);

        NameLabel1.setBackground(new java.awt.Color(0, 32, 63));
        NameLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NameLabel1.setForeground(new java.awt.Color(187, 232, 215));
        NameLabel1.setText("Name : ");
        jPanel1.add(NameLabel1);
        NameLabel1.setBounds(140, 100, 60, 30);

        PasswordField.setBackground(new java.awt.Color(187, 232, 215));
        jPanel1.add(PasswordField);
        PasswordField.setBounds(310, 140, 240, 30);

        jLabel9.setBackground(new java.awt.Color(0, 32, 63));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(187, 232, 215));
        jLabel9.setText("Email : ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 380, 160, 30);

        MobileNumberField.setBackground(new java.awt.Color(187, 232, 215));
        MobileNumberField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        MobileNumberField.setForeground(new java.awt.Color(0, 32, 63));
        jPanel1.add(MobileNumberField);
        MobileNumberField.setBounds(310, 340, 240, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void DateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateCBActionPerformed

    private void FatherNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatherNameFieldActionPerformed

    private void MaleRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaleRBMouseClicked
        FemaleRB.setSelected(false);
        OtherRB.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_MaleRBMouseClicked

    private void MaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRBActionPerformed

    private void FemaleRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FemaleRBMouseClicked
        MaleRB.setSelected(false);
        OtherRB.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_FemaleRBMouseClicked

    private void OtherRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OtherRBMouseClicked
        MaleRB.setSelected(false);
        FemaleRB.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_OtherRBMouseClicked

    private void OtherRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherRBActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        new AdminMenu().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if (NameField.getText().trim().isEmpty() || EmailField.getText().trim().isEmpty() || PasswordField.getText().trim().isEmpty() || PercentageField.getText().trim().isEmpty() || FatherNameField.getText().trim().isEmpty() || AddressField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter all details first !");
        } 
        else if(HighestQualificationCB.getSelectedItem() == "Select Qualification"){
            JOptionPane.showMessageDialog(null, "Select proper Qualification !");
        }
        else {
            String query = "INSERT INTO `faculty`(`name`, `father_name`, `email`, `mobile_number`, `gender`, `address`, `dob`, `highest_qualification`, `percentage`) VALUES (?,?,?,?,?,?,?,?,?)";
            Connection connection;
            PreparedStatement preparedStatement;
            ResultSet rs;
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/topscholar", "root", "");
                preparedStatement = connection.prepareStatement(query);                
                preparedStatement.setString(1, NameField.getText().trim());
                preparedStatement.setString(2, FatherNameField.getText().trim());
                preparedStatement.setString(3, EmailField.getText().trim());
                preparedStatement.setString(4, MobileNumberField.getText().trim());
                preparedStatement.setString(6, AddressField.getText().trim());
                preparedStatement.setString(8, (String) HighestQualificationCB.getSelectedItem());
                preparedStatement.setString(9, PercentageField.getText().trim());
                if (MaleRB.isSelected()) {
                    preparedStatement.setString(5, "Male");
                } else if (FemaleRB.isSelected()) {
                    preparedStatement.setString(5, "Female");
                } else if (OtherRB.isSelected()) {
                    preparedStatement.setString(5, "Other");
                }

                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                format.setLenient(false);
                String date = YearCB.getSelectedItem() + "-" + MonthCB.getSelectedItem() + "-" + DateCB.getSelectedItem();
                try {
                    format.parse(date);
                    preparedStatement.setString(7, date);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Invalid Date !");
                }                
                int len=0;
                len = preparedStatement.executeUpdate();
                Statement statement = connection.createStatement();
                rs = statement.executeQuery("SELECT `faculty_id` FROM `faculty`");
                while(rs.next());
                rs.previous();
                int FacultyID=Integer.parseInt(rs.getString("faculty_id"));
                if(len >0) {
                    len = 0;
                    preparedStatement = connection.prepareStatement("INSERT INTO `accounts`(`id`, `password`, `account_type`) VALUES (?,?,?)");
                    preparedStatement.setInt(1,FacultyID);
                    String passwordString = new String(PasswordField.getPassword());
                    preparedStatement.setString(2, passwordString);
                    preparedStatement.setString(3,"faculty");
                }
                len = preparedStatement.executeUpdate();
                rs.close();
                statement.close();
                if (len > 0) {
                    JOptionPane.showMessageDialog(null, "Account added Successfully !\n Faculty ID - "+FacultyID);
                }
                connection.close();
                preparedStatement.close();
                dispose();
                new AdminAddFaculty().setVisible(true);
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void HighestQualificationCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighestQualificationCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HighestQualificationCBActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void AddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseEntered
        AddButton.setBackground(new java.awt.Color(187,232,215));
        AddButton.setForeground(new java.awt.Color(0,32,63));
        AddButton.setText("ADD FACULTY");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,32,63), 4));// TODO add your handling code here:
    }//GEN-LAST:event_AddButtonMouseEntered

    private void AddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseExited
        AddButton.setBackground(new java.awt.Color(0, 32, 63));
        AddButton.setForeground(new java.awt.Color(187, 232, 215));
        AddButton.setText("ADD FACULTY");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 232, 215), 4));// TODO add your handling code here:
    }//GEN-LAST:event_AddButtonMouseExited

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
            java.util.logging.Logger.getLogger(AdminAddFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddFaculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextArea AddressField;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> DateCB;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FatherNameField;
    private javax.swing.JRadioButton FemaleRB;
    private javax.swing.JComboBox<String> HighestQualificationCB;
    private javax.swing.JRadioButton MaleRB;
    private javax.swing.JTextField MobileNumberField;
    private javax.swing.JComboBox<String> MonthCB;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JRadioButton OtherRB;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField PercentageField;
    private javax.swing.JComboBox<String> YearCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}