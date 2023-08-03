import javax.swing.JOptionPane;
public class LogineForm extends javax.swing.JFrame {

    MainWindow hostelApplication = new MainWindow();
    public LogineForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        UsernameBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCancle = new javax.swing.JButton();
        btnLogni = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPasswordField();
        PasswordView = new javax.swing.JCheckBox();
        LogoLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(6, 70));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 16));
        getContentPane().add(jLabel2, java.awt.BorderLayout.WEST);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(6, 70));
        getContentPane().add(jLabel3, java.awt.BorderLayout.PAGE_END);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 16));
        getContentPane().add(jLabel4, java.awt.BorderLayout.LINE_END);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsernameBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(UsernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel7.setText("User Name : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 120, 40));

        btnCancle.setBackground(new java.awt.Color(113, 94, 203));
        btnCancle.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        btnCancle.setText("Cancle");
        btnCancle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(0, 51, 153), new java.awt.Color(153, 255, 204), new java.awt.Color(0, 51, 153)));
        btnCancle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 120, 30));

        btnLogni.setBackground(new java.awt.Color(113, 94, 203));
        btnLogni.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        btnLogni.setText("Login");
        btnLogni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(0, 51, 153), new java.awt.Color(153, 255, 204), new java.awt.Color(0, 51, 153)));
        btnLogni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogni.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnLogni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogniActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 120, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel8.setText("Password :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 120, 40));

        jLabel5.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel5.setText("Well Come to Hostel Management System"); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 440, 80));

        PasswordBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(PasswordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 200, 30));

        PasswordView.setText("Visiable Password");
        PasswordView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordViewActionPerformed(evt);
            }
        });
        jPanel2.add(PasswordView, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 160, 30));

        jPanel1.add(jPanel2);

        LogoLable.setBackground(new java.awt.Color(204, 255, 204));
        LogoLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hostel.png"))); // NOI18N
        LogoLable.setOpaque(true);
        jPanel1.add(LogoLable);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordViewActionPerformed
        if(PasswordView.isSelected()){
        PasswordBox.setEchoChar((char)0);
        }
        else{
                PasswordBox.setEchoChar('\u25cf');
            }
    }//GEN-LAST:event_PasswordViewActionPerformed

    private void btnLogniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogniActionPerformed
        if (UsernameBox.getText().equals(AdminLoginWindow.UserName)&&PasswordBox.getText().equals(AdminLoginWindow.Password )){
        
        JOptionPane.showMessageDialog(null, "Login Successfully ");
        setDefaultCloseOperation(LogineForm.DISPOSE_ON_CLOSE);
        this.dispose();
        hostelApplication.setVisible(true);
        }else{
        
        JOptionPane.showMessageDialog(null, "Please enter Correct UserName and Password");
            
        }
    }//GEN-LAST:event_btnLogniActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnCancleActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogineForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoLable;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JCheckBox PasswordView;
    private javax.swing.JTextField UsernameBox;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnLogni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
