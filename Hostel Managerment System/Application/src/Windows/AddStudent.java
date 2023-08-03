
package Windows;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class AddStudent extends javax.swing.JFrame {

    public AddStudent() {
        
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MotherLabel = new javax.swing.JLabel();
        StdLabel = new javax.swing.JLabel();
        NatioLabel = new javax.swing.JLabel();
        CastLabel = new javax.swing.JLabel();
        PNLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        FatherLabel = new javax.swing.JLabel();
        txtFather = new javax.swing.JTextField();
        SurnameLabel = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        txtAddressArea = new java.awt.TextArea();
        SubmitBtn = new javax.swing.JButton();
        CancleBtn = new javax.swing.JButton();
        txtStdName = new javax.swing.JTextField();
        txtMother = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        GenderComBox = new javax.swing.JComboBox<>();
        RoomLabel = new javax.swing.JLabel();
        stdCasetComBox = new javax.swing.JComboBox<>();
        stdCityComBox = new javax.swing.JComboBox<>();
        RoomNumber = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MotherLabel.setBackground(new java.awt.Color(204, 255, 204));
        MotherLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        MotherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MotherLabel.setText("Mother name:");
        MotherLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        MotherLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        MotherLabel.setOpaque(true);
        jPanel1.add(MotherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 32));

        StdLabel.setBackground(new java.awt.Color(204, 255, 204));
        StdLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        StdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StdLabel.setText("Student Name");
        StdLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        StdLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        StdLabel.setOpaque(true);
        jPanel1.add(StdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 260, 32));

        NatioLabel.setBackground(new java.awt.Color(204, 255, 204));
        NatioLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        NatioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NatioLabel.setText("Nationality :");
        NatioLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        NatioLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        NatioLabel.setOpaque(true);
        jPanel1.add(NatioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 140, 30));

        CastLabel.setBackground(new java.awt.Color(204, 255, 204));
        CastLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        CastLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CastLabel.setText("Social Category :");
        CastLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        CastLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        CastLabel.setOpaque(true);
        jPanel1.add(CastLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 140, 30));

        PNLabel.setBackground(new java.awt.Color(204, 255, 204));
        PNLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        PNLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PNLabel.setText("Phone Number : ");
        PNLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PNLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        PNLabel.setOpaque(true);
        jPanel1.add(PNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 140, 32));

        AddressLabel.setBackground(new java.awt.Color(204, 255, 204));
        AddressLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        AddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddressLabel.setText("Address :");
        AddressLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        AddressLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        AddressLabel.setOpaque(true);
        jPanel1.add(AddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 140, 30));

        CityLabel.setBackground(new java.awt.Color(204, 255, 204));
        CityLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        CityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CityLabel.setText("City :");
        CityLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        CityLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        CityLabel.setOpaque(true);
        jPanel1.add(CityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 140, 32));

        GenderLabel.setBackground(new java.awt.Color(204, 255, 204));
        GenderLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        GenderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenderLabel.setText("Gender :");
        GenderLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        GenderLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        GenderLabel.setOpaque(true);
        jPanel1.add(GenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 30));

        FatherLabel.setBackground(new java.awt.Color(204, 255, 204));
        FatherLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        FatherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FatherLabel.setText(" Father Name");
        FatherLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        FatherLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        FatherLabel.setOpaque(true);
        jPanel1.add(FatherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 250, 30));

        txtFather.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFather.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFather.setText(" ");
        txtFather.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtFather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherActionPerformed(evt);
            }
        });
        jPanel1.add(txtFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 250, 30));

        SurnameLabel.setBackground(new java.awt.Color(204, 255, 204));
        SurnameLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        SurnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SurnameLabel.setText("Surname");
        SurnameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        SurnameLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        SurnameLabel.setOpaque(true);
        jPanel1.add(SurnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 260, 32));

        txtSurname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSurname.setText(" ");
        txtSurname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 260, 30));

        txtAddressArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddressArea.setRows(3);
        jPanel1.add(txtAddressArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 220, 60));

        SubmitBtn.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        SubmitBtn.setText("Add Student");
        SubmitBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 150, 30));

        CancleBtn.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        CancleBtn.setText("Cancle");
        CancleBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        CancleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 150, 30));

        txtStdName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStdName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStdName.setText(" ");
        txtStdName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtStdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtStdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 260, 30));

        txtMother.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMother.setText(" ");
        txtMother.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotherActionPerformed(evt);
            }
        });
        jPanel1.add(txtMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 220, 30));

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhoneNumber.setText(" ");
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 220, 30));

        txtNationality.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNationality.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNationality.setText(" ");
        txtNationality.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        txtNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNationalityActionPerformed(evt);
            }
        });
        jPanel1.add(txtNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 220, 30));

        GenderComBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GenderComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        GenderComBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(GenderComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 220, 30));

        RoomLabel.setBackground(new java.awt.Color(204, 255, 204));
        RoomLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        RoomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomLabel.setText("Room Number");
        RoomLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        RoomLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        RoomLabel.setOpaque(true);
        jPanel1.add(RoomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 140, 30));

        stdCasetComBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stdCasetComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S.C", "S.T", "N.T", "OBC", "OPEN" }));
        stdCasetComBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(stdCasetComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 220, 30));

        stdCityComBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stdCityComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amravati", "Mumbai", "Pune", "Aurangabad", "Nagpur", "Nashik", "Solapur", "Thane", "Latur", "Chandrapur", " ", " " }));
        stdCityComBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(stdCityComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 30));

        RoomNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(RoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 220, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1129, 70));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Information Form");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancleBtnActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
    private void txtStdNameActionPerformed(java.awt.event.ActionEvent evt) { }
    private void txtSurnameActionPerformed(java.awt.event.ActionEvent evt) { }
    private void txtFatherActionPerformed(java.awt.event.ActionEvent evt) { }
    private void txtMotherActionPerformed(java.awt.event.ActionEvent evt) { }
    private void  txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) { }
    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) { }
    private void txtNationalityActionPerformed(java.awt.event.ActionEvent evt) { }
    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) { }
    private void txtroomNmActionPerformed(java.awt.event.ActionEvent evt) { }
    String StdName,FatherN,Surname,MotherN,strPN,City,Nationality,category,Address,Gender,roomNm;
    
    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        if(txtPhoneNumber.getText().trim().length()!=10)
        {
            JOptionPane.showMessageDialog(this, "Length enter : "+txtPhoneNumber.getText().length()+"\n\nPlease Enter Valied Phone Number");    
        }
        else if (txtStdName.getText().equals(" ")||txtFather.getText().equals(" ")||txtSurname.getText().equals(" ")||txtMother.getText().equals(" ")||txtStdName.getText().equals(" "))
        {
            JOptionPane.showMessageDialog(this, "Please Fill All Information Fully");
        }
        else{        
        StdName = txtStdName.getText().toString();
        Surname = txtSurname.getText().toString();
        FatherN = txtFather.getText().toString();
        MotherN = txtMother.getText().toString();
        strPN = txtPhoneNumber.getText();
        Gender = GenderComBox.getSelectedItem().toString();
        roomNm = RoomNumber.getValue().toString();
        City = stdCityComBox.getSelectedItem().toString();
        Nationality = txtNationality.getText().toString();
        category = stdCasetComBox.getSelectedItem().toString();
        Address = txtAddressArea.getText().toString();
        JOptionPane.showMessageDialog(this,"You Successfully added into the hostel!");
        String[] list = {StdName,Surname,FatherN,MotherN,strPN,Gender,roomNm,City,Nationality,category,Address};
        StudentLiving.AddDataTable(list);
        this.dispose();
        }
        
    }//GEN-LAST:event_SubmitBtnActionPerformed
//    public String[] sendInfo(){
//        return list;
//    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JButton CancleBtn;
    private javax.swing.JLabel CastLabel;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JLabel FatherLabel;
    private javax.swing.JComboBox<String> GenderComBox;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel MotherLabel;
    private javax.swing.JLabel NatioLabel;
    private javax.swing.JLabel PNLabel;
    private javax.swing.JLabel RoomLabel;
    private javax.swing.JSpinner RoomNumber;
    private javax.swing.JLabel StdLabel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> stdCasetComBox;
    private javax.swing.JComboBox<String> stdCityComBox;
    private java.awt.TextArea txtAddressArea;
    private javax.swing.JTextField txtFather;
    private javax.swing.JTextField txtMother;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStdName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
