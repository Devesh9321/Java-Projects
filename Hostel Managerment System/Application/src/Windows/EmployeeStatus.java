
package Windows;

import javax.swing.JOptionPane;

public class EmployeeStatus extends javax.swing.JFrame {

    public EmployeeStatus() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEmpSurname = new javax.swing.JTextField();
        txtEmpAddressArea = new java.awt.TextArea();
        EmpSubmitBtn = new javax.swing.JButton();
        CancleBtn = new javax.swing.JButton();
        txtEmpName = new javax.swing.JTextField();
        txtPEmphoneNumber = new javax.swing.JTextField();
        txtEmpNationality = new javax.swing.JTextField();
        EmpCasetComBox = new javax.swing.JComboBox<>();
        EmpGenderComBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        EmpwkAllotted = new javax.swing.JComboBox<>();
        txtSalary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        EmpCityComBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(670, 700));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Employee Name");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, 32));

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nationality");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 230, 30));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Scheduled Castes");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 230, 30));

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Phone Number ");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 230, 32));

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Address :");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 230, 30));

        jLabel10.setBackground(new java.awt.Color(204, 255, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("City");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, 32));

        jLabel12.setBackground(new java.awt.Color(204, 255, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Gender");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 230, 30));

        jLabel14.setBackground(new java.awt.Color(204, 255, 204));
        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Surname");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 230, 32));

        txtEmpSurname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmpSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmpSurname.setText(" ");
        txtEmpSurname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtEmpSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpSurnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmpSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 250, 30));

        txtEmpAddressArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmpAddressArea.setRows(3);
        jPanel1.add(txtEmpAddressArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 250, 60));

        EmpSubmitBtn.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        EmpSubmitBtn.setText("EMPLOYEE ADD");
        EmpSubmitBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        EmpSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpSubmitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EmpSubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 150, 30));

        CancleBtn.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        CancleBtn.setText("Cancle");
        CancleBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        CancleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 150, 30));

        txtEmpName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmpName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmpName.setText(" ");
        txtEmpName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 250, 30));

        txtPEmphoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPEmphoneNumber.setText(" ");
        txtPEmphoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtPEmphoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPEmphoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtPEmphoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 250, 30));

        txtEmpNationality.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmpNationality.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmpNationality.setText(" ");
        txtEmpNationality.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtEmpNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNationalityActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmpNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 250, 30));

        EmpCasetComBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmpCasetComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S.C", "S.T", "N.T", "OBC", "OPEN" }));
        EmpCasetComBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(EmpCasetComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 250, 30));

        EmpGenderComBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmpGenderComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        EmpGenderComBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(EmpGenderComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 250, 30));

        jLabel11.setBackground(new java.awt.Color(204, 255, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Work  Allotted");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 230, 30));

        EmpwkAllotted.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmpwkAllotted.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Security Gaurd", "Maintance", "Cleaning", "Warder", "Mess" }));
        EmpwkAllotted.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(EmpwkAllotted, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 250, 30));

        txtSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalary.setText(" ");
        txtSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 250, 30));

        jLabel13.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Salary Allotted");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 230, 32));

        EmpCityComBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmpCityComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amravati", "Mumbai", "Pune", "Aurangabad", "Nagpur", "Nashik", "Solapur", "Thane", "Latur", "Chandrapur", " ", " " }));
        EmpCityComBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(EmpCityComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 250, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1129, 70));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYEE Information Form");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpSurnameActionPerformed
    String EmpName,Empsurname,EmpCity,EmpPhoneNumber,EmpCast,EmpNationality,
            workdo,EmpSalary,EmpAddress,EmpGender;
    private void EmpSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpSubmitBtnActionPerformed
        if(txtPEmphoneNumber.getText().trim().length()!=10)
        {
            JOptionPane.showMessageDialog(null, "Length enter : "+txtPEmphoneNumber.getText().length()+"\n\nPlease Enter Valied Phone Number");    
        }
        else if (txtEmpName.getText().equals(" ")||txtEmpSurname.getText().equals(" ")||txtEmpAddressArea.getText().equals(" "))
        {
            JOptionPane.showMessageDialog(this, "Please Fill All Information Fully");
        }
        else{
            EmpName = txtEmpName.getText();
            Empsurname = txtEmpSurname.getText();
            EmpPhoneNumber = txtPEmphoneNumber.getText().trim().toString();
            EmpCity = EmpCityComBox.getSelectedItem().toString();
            EmpNationality = txtEmpNationality.getText();
            EmpCast = EmpCasetComBox.getSelectedItem().toString();
            EmpAddress = txtEmpAddressArea.getText();
            EmpSalary = txtSalary.getText().toString();
            EmpGender = EmpGenderComBox.getSelectedItem().toString();
            workdo = EmpwkAllotted.getSelectedItem().toString();
            
            JOptionPane.showMessageDialog(null, "The Employee is Successfully added in the System!");
            
            String[] list = {EmpName,Empsurname,EmpSalary,workdo,EmpPhoneNumber,EmpGender,EmpCity,EmpCast,EmpNationality,EmpAddress};
            EmployeeWorking.AddEmpDataTable(list);
            this.dispose();
        }
        
    }//GEN-LAST:event_EmpSubmitBtnActionPerformed

    public String[] sendInfo(){
        String[] list = {EmpName,Empsurname,EmpCity,EmpPhoneNumber,EmpCast,EmpNationality,
            EmpAddress,EmpGender};
        return list;
    }
    private void CancleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancleBtnActionPerformed

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void txtPEmphoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPEmphoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPEmphoneNumberActionPerformed

    private void txtEmpNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNationalityActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancleBtn;
    private javax.swing.JComboBox<String> EmpCasetComBox;
    private javax.swing.JComboBox<String> EmpCityComBox;
    private javax.swing.JComboBox<String> EmpGenderComBox;
    private javax.swing.JButton EmpSubmitBtn;
    private javax.swing.JComboBox<String> EmpwkAllotted;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextArea txtEmpAddressArea;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpNationality;
    private javax.swing.JTextField txtEmpSurname;
    private javax.swing.JTextField txtPEmphoneNumber;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
