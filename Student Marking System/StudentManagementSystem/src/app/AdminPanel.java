package app;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/***************************
   * @author : Devesh Patil *
     **************************/

public class AdminPanel extends javax.swing.JInternalFrame {

    public AdminPanel() {
        initComponents();
    }

    public AdminPanel(String Username, String pass) {
        initComponents();
        AdminPanel.user = Username;
        AdminPanel.pass = pass;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ButtonPanle = new javax.swing.JPanel();
        UpdateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField(AdminPanel.user);
        txtPass = new javax.swing.JTextField(AdminPanel.pass);

        setBackground(new java.awt.Color(204, 255, 204));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Admin Details");
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 50));
        getContentPane().add(jLabel3, java.awt.BorderLayout.PAGE_START);

        ButtonPanle.setBackground(new java.awt.Color(204, 255, 204));
        ButtonPanle.setPreferredSize(new java.awt.Dimension(400, 90));
        ButtonPanle.setLayout(null);

        UpdateBtn.setBackground(new java.awt.Color(102, 0, 204));
        UpdateBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        UpdateBtn.setPreferredSize(new java.awt.Dimension(150, 38));
        UpdateBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UpdateBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(UpdateBtn);
        UpdateBtn.setBounds(760, 30, 150, 38);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Admin.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel1.setOpaque(true);
        ButtonPanle.add(jLabel1);
        jLabel1.setBounds(60, 30, 120, 160);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel5.setText("  Username :");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ButtonPanle.add(jLabel5);
        jLabel5.setBounds(220, 110, 140, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel6.setText("  Password :");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ButtonPanle.add(jLabel6);
        jLabel6.setBounds(220, 150, 140, 30);

        txtUser.setEditable(false);
        txtUser.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txtUser.setToolTipText("10 character long unick");
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        ButtonPanle.add(txtUser);
        txtUser.setBounds(370, 110, 180, 30);

        txtPass.setEditable(false);
        txtPass.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txtPass.setToolTipText("10 character long unick");
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        ButtonPanle.add(txtPass);
        txtPass.setBounds(370, 150, 180, 30);

        getContentPane().add(ButtonPanle, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed

        switch (UpdateBtn.getText()) {
            case "Update":
                UpdateBtn.setText("Save");
                txtUser.setEditable(true);
                txtPass.setEditable(true);
                break;

            case "Save":
                if (txtUser.getText().trim().equals("") || txtUser.getText().length() < 10 || txtPass.getText().trim().equals("") || txtPass.getText().length() < 8) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Usename & Password Should Be 10 Char long", "invalid credentials", 0);

                } else {
                    try {
                        if (operation.UpdateSuper(txtUser.getText(), txtPass.getText())) {
                            javax.swing.JOptionPane.showMessageDialog(this, "User Details are Updated successfully !", "Admin Operation", 1);
                            AdminPanel.user = txtUser.getText();
                            AdminPanel.pass = txtPass.getText();
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(this, "Fail to Update the User Details !", "Admin Operation", 0);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
                        javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
                    }
                    UpdateBtn.setText("Update");
                    txtUser.setEditable(false);
                    txtPass.setEditable(false);
                }
                break;

            default:
                UpdateBtn.setText("Update");
                txtUser.setEditable(false);
                txtPass.setEditable(false);

        }

    }//GEN-LAST:event_UpdateBtnActionPerformed

    private final dao.LogDAO operation = new dao.LogDAO();
    public static String user = "";
    public static String pass = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanle;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
