
package app;

import java.sql.SQLException;
import java.util.Date;
import javax.swing.ImageIcon;

/***************************
   * @author : Devesh Patil *
     **************************/

public class SupervisorForm extends javax.swing.JFrame {
    
    public SupervisorForm() {
        initComponents();
        logo = new ImageIcon("src/icons/logo.png");
        this.setIconImage(logo.getImage());
    }
    
    public SupervisorForm( String opt) {
        this.Opt = opt;
        initComponents();
        logo = new ImageIcon("src/icons/logo.png");
        this.setIconImage(logo.getImage());
    }
    
    public SupervisorForm( String opt,String fnam,int hyear,int varify) {
        this.Opt = opt;
        this.hyear = hyear;
        this.fname = fnam;
        this.varify = varify;
        initComponents();    
        logo = new ImageIcon("src/icons/logo.png");
        this.setIconImage(logo.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        FnameLabel = new javax.swing.JLabel();
        DeptLabel = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField(this.fname);
        HireyLabel = new javax.swing.JLabel();
        OperationBtn = new javax.swing.JButton();
        hireyearBox = new javax.swing.JComboBox<>();
        CancleBtn = new javax.swing.JButton();
        DepartmentBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supervisor Details");
        setPreferredSize(new java.awt.Dimension(435, 452));
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(null);

        FnameLabel.setBackground(new java.awt.Color(204, 204, 255));
        FnameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        FnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FnameLabel.setText("  Full Name");
        FnameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FnameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        FnameLabel.setOpaque(true);
        jPanel6.add(FnameLabel);
        FnameLabel.setBounds(60, 110, 100, 30);

        DeptLabel.setBackground(new java.awt.Color(204, 204, 255));
        DeptLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        DeptLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DeptLabel.setText("  Department");
        DeptLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeptLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DeptLabel.setOpaque(true);
        jPanel6.add(DeptLabel);
        DeptLabel.setBounds(60, 150, 100, 30);

        txtFullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFullName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(txtFullName);
        txtFullName.setBounds(180, 110, 170, 30);

        HireyLabel.setBackground(new java.awt.Color(204, 204, 255));
        HireyLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        HireyLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HireyLabel.setText("  Hireyear");
        HireyLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HireyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        HireyLabel.setOpaque(true);
        jPanel6.add(HireyLabel);
        HireyLabel.setBounds(60, 190, 100, 30);

        OperationBtn.setBackground(new java.awt.Color(255, 153, 153));
        OperationBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        OperationBtn.setText(this.Opt);
        OperationBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        OperationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationBtnActionPerformed(evt);
            }
        });
        jPanel6.add(OperationBtn);
        OperationBtn.setBounds(80, 280, 130, 30);

        hireyearBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        hireyearBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel6.add(hireyearBox);
        hireyearBox.setBounds(180, 190, 170, 30);
        int y = Integer.parseInt(new Date().toString().substring(24));
        for(int i = 2000; i<=y;i++){
            hireyearBox.addItem(""+i);
            if(i==this.hyear){
                this.index = i-2000;
            }
        }

        hireyearBox.setSelectedIndex(this.index);

        CancleBtn.setBackground(new java.awt.Color(255, 153, 153));
        CancleBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CancleBtn.setText("Cancle");
        CancleBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        CancleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleBtnActionPerformed(evt);
            }
        });
        jPanel6.add(CancleBtn);
        CancleBtn.setBounds(240, 280, 130, 30);

        DepartmentBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CM" }));
        DepartmentBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel6.add(DepartmentBox);
        DepartmentBox.setBounds(180, 150, 170, 30);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperationBtnActionPerformed
        if(!txtFullName.getText().trim().equals("")){
            try {
                switch(this.Opt){
                    case "Add Supervisor" -> {
                        if( operation.InsertSuper(txtFullName.getText(), DepartmentBox.getSelectedItem().toString(), hireyearBox.getSelectedItem().toString())){
                            bean.DataVar.upocc = true;
                            javax.swing.JOptionPane.showMessageDialog(this, "New Supervisor is Added Successfuly !", "Supervisor Operation", 1);
                        }
                        else{
                            javax.swing.JOptionPane.showMessageDialog(this, "Failed To Added New Supervisor !", "Supervisor Operation", 2);
                        }
                    }

                    case "Update" -> {
                        if( operation.UpdateSuper(txtFullName.getText(), hireyearBox.getSelectedItem().toString(), this.varify)){                              
                            bean.DataVar.upocc = true;
                            javax.swing.JOptionPane.showMessageDialog(this, "Supervisor Details are Updated Successfuly !", "Supervisor Operation", 1);
                        }
                        else{
                            javax.swing.JOptionPane.showMessageDialog(this, "Failed To Update Supervisor Details !", "Supervisor Operation", 2);
                        }
                    }    

                    default -> {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalied Attempt to Do certain Operation.", "Invalied Operation", 2);
                    }
                }
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
//                Logger.getLogger(CoursePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.dispose();
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Cannot Operate without Appropriate Information.", "Supervisor Operation", 0);
        }
    }//GEN-LAST:event_OperationBtnActionPerformed

    private void CancleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancleBtnActionPerformed

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SupervisorForm().setVisible(true);
//            }
//        });
//    }

    private ImageIcon logo=null;
    private dao.SupervisorDAO operation = new dao.SupervisorDAO();
    private String Opt="operation";
    private String fname ="";
    private int hyear=2005;
    private int varify = -1;
    private int index = 0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancleBtn;
    private javax.swing.JComboBox<String> DepartmentBox;
    private javax.swing.JLabel DeptLabel;
    private javax.swing.JLabel FnameLabel;
    private javax.swing.JLabel HireyLabel;
    private javax.swing.JButton OperationBtn;
    private javax.swing.JComboBox<String> hireyearBox;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtFullName;
    // End of variables declaration//GEN-END:variables
}
