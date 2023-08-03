
package app;

/* *****************
   * @author patil *
   ***************** */
public class UpdateStd extends javax.swing.JFrame {

    public UpdateStd() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        IDCLabel = new javax.swing.JLabel();
        SubLabel = new javax.swing.JLabel();
        txtIDC = new javax.swing.JTextField();
        txtQ6 = new javax.swing.JTextField();
        Q2Label = new javax.swing.JLabel();
        Q1Label = new javax.swing.JLabel();
        Q3Label = new javax.swing.JLabel();
        Q4Label = new javax.swing.JLabel();
        Q5Label = new javax.swing.JLabel();
        Q6Label = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        txtSub = new javax.swing.JTextField();
        txtQ1 = new javax.swing.JTextField();
        txtQ4 = new javax.swing.JTextField();
        txtQ2 = new javax.swing.JTextField();
        txtQ5 = new javax.swing.JTextField();
        txtQ3 = new javax.swing.JTextField();
        ExamiLabel = new javax.swing.JLabel();
        txtExam = new javax.swing.JTextField();
        AddButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 550));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Student Marks");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 50));
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        IDCLabel.setBackground(new java.awt.Color(204, 204, 255));
        IDCLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        IDCLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDCLabel.setText(" ID Code (Required)");
        IDCLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IDCLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        IDCLabel.setOpaque(true);
        jPanel1.add(IDCLabel);
        IDCLabel.setBounds(50, 40, 150, 30);

        SubLabel.setBackground(new java.awt.Color(204, 204, 255));
        SubLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        SubLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SubLabel.setText(" Subject ( Required)");
        SubLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        SubLabel.setOpaque(true);
        jPanel1.add(SubLabel);
        SubLabel.setBounds(50, 80, 150, 30);

        txtIDC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtIDC);
        txtIDC.setBounds(210, 40, 210, 30);

        txtQ6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtQ6);
        txtQ6.setBounds(380, 300, 130, 30);

        Q2Label.setBackground(new java.awt.Color(204, 204, 255));
        Q2Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q2Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q2Label.setText(" Q 2");
        Q2Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q2Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q2Label.setOpaque(true);
        jPanel1.add(Q2Label);
        Q2Label.setBounds(60, 260, 70, 30);

        Q1Label.setBackground(new java.awt.Color(204, 204, 255));
        Q1Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q1Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q1Label.setText(" Q 1");
        Q1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q1Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q1Label.setOpaque(true);
        jPanel1.add(Q1Label);
        Q1Label.setBounds(60, 220, 70, 30);

        Q3Label.setBackground(new java.awt.Color(204, 204, 255));
        Q3Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q3Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q3Label.setText(" Q 3");
        Q3Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q3Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q3Label.setOpaque(true);
        jPanel1.add(Q3Label);
        Q3Label.setBounds(60, 300, 70, 30);

        Q4Label.setBackground(new java.awt.Color(204, 204, 255));
        Q4Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q4Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q4Label.setText(" Q 4");
        Q4Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q4Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q4Label.setOpaque(true);
        jPanel1.add(Q4Label);
        Q4Label.setBounds(300, 220, 70, 30);

        Q5Label.setBackground(new java.awt.Color(204, 204, 255));
        Q5Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q5Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q5Label.setText(" Q 5");
        Q5Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q5Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q5Label.setOpaque(true);
        jPanel1.add(Q5Label);
        Q5Label.setBounds(300, 260, 70, 30);

        Q6Label.setBackground(new java.awt.Color(204, 204, 255));
        Q6Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q6Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q6Label.setText(" Q 6");
        Q6Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q6Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q6Label.setOpaque(true);
        jPanel1.add(Q6Label);
        Q6Label.setBounds(300, 300, 70, 30);

        AddButton.setBackground(new java.awt.Color(255, 153, 153));
        AddButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        AddButton.setText("Search");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton);
        AddButton.setBounds(150, 400, 130, 30);

        txtSub.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSub);
        txtSub.setBounds(210, 80, 210, 30);

        txtQ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtQ1);
        txtQ1.setBounds(140, 220, 130, 30);

        txtQ4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtQ4);
        txtQ4.setBounds(380, 220, 130, 30);

        txtQ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtQ2);
        txtQ2.setBounds(140, 260, 130, 30);

        txtQ5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtQ5);
        txtQ5.setBounds(380, 260, 130, 30);

        txtQ3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtQ3);
        txtQ3.setBounds(140, 300, 130, 30);

        ExamiLabel.setBackground(new java.awt.Color(204, 204, 255));
        ExamiLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        ExamiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ExamiLabel.setText("  Examined By");
        ExamiLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExamiLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ExamiLabel.setOpaque(true);
        jPanel1.add(ExamiLabel);
        ExamiLabel.setBounds(50, 140, 150, 30);

        txtExam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtExam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtExam);
        txtExam.setBounds(210, 140, 210, 30);

        AddButton1.setBackground(new java.awt.Color(255, 153, 153));
        AddButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        AddButton1.setText("Update");
        AddButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        AddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton1);
        AddButton1.setBounds(290, 400, 130, 30);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        /*
        if(txtIDC.getText().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all information !");
        }
        else{
            try{
                this.data.setName(txtIDC.getText());
                this.data.setPhone(Integer.parseInt(txtQ6.getText()));
                this.data.setDOB(selyear.getSelectedItem()+"-0"+(selmonth.getSelectedIndex()+1)+"-"+selday.getSelectedItem());
                this.data.setAddress(txtAddr.getText());

                if(genM.isSelected()){  this.data.setGender("Male");    }

                else if(genF.isSelected()){   this.data.setGender("Female");    }

                else {  this.data.setGender("Other");    }

                oprt = new com.dao.UpdateCustdao();

                boolean result = oprt.updateCustomer(this.data);
                //

                if(result){
                    javax.swing.JOptionPane.showMessageDialog(this, "Customer details Updation Successfully !");
                    this.dispose();
                }
                else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Customer details Updation Fail !");
                    this.dispose();
                }
            }
            catch(NumberFormatException e){      javax.swing.JOptionPane.showMessageDialog(this, "Please enter Valied Number !");     }
            catch (Exception e){ e.printStackTrace();}

        }
        */
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton1ActionPerformed
        
        
        
    }//GEN-LAST:event_AddButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddButton1;
    private javax.swing.JLabel ExamiLabel;
    private javax.swing.JLabel IDCLabel;
    private javax.swing.JLabel Q1Label;
    private javax.swing.JLabel Q2Label;
    private javax.swing.JLabel Q3Label;
    private javax.swing.JLabel Q4Label;
    private javax.swing.JLabel Q5Label;
    private javax.swing.JLabel Q6Label;
    private javax.swing.JLabel SubLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtExam;
    private javax.swing.JTextField txtIDC;
    private javax.swing.JTextField txtQ1;
    private javax.swing.JTextField txtQ2;
    private javax.swing.JTextField txtQ3;
    private javax.swing.JTextField txtQ4;
    private javax.swing.JTextField txtQ5;
    private javax.swing.JTextField txtQ6;
    private javax.swing.JTextField txtSub;
    // End of variables declaration//GEN-END:variables
}
