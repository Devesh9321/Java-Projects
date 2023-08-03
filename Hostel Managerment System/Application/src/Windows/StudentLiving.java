package Windows;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentLiving extends javax.swing.JPanel {

    public StudentLiving() {
        initComponents();

    }

    public static void AddDataTable(Object[] row) {

        DefaultTableModel model = (DefaultTableModel) StudentInfoTable.getModel();
        model.addRow(row);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        StudentInfoTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AddStdButton = new javax.swing.JButton();
        DeleteStdButton = new javax.swing.JButton();
        EditStdButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.BorderLayout());

        StudentInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Surname", "Father Name", "Mother Name", "Phone Number", "Gender", "Room No.", "City", "Nationality", "Social Category", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(StudentInfoTable);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(279, 41));
        jPanel1.setPreferredSize(new java.awt.Dimension(1198, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student LIVING IN THE HOSTEL");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(279, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(279, 41));
        jLabel1.setPreferredSize(new java.awt.Dimension(279, 55));
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddStdButton.setText("Add Student");
        AddStdButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        AddStdButton.setPreferredSize(new java.awt.Dimension(60, 15));
        AddStdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStdButtonActionPerformed(evt);
            }
        });
        jPanel3.add(AddStdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 20));

        DeleteStdButton.setText("Delete Student");
        DeleteStdButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        DeleteStdButton.setPreferredSize(new java.awt.Dimension(60, 15));
        DeleteStdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStdButtonActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteStdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 110, 20));

        EditStdButton.setText("Update");
        EditStdButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        EditStdButton.setPreferredSize(new java.awt.Dimension(60, 15));
        EditStdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStdButtonActionPerformed(evt);
            }
        });
        jPanel3.add(EditStdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, 20));

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void AddStdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStdButtonActionPerformed
        AddStudent adst = new AddStudent();
        adst.setVisible(true);
        adst.pack();
        adst.setLocationRelativeTo(null);
        adst.setDefaultCloseOperation(AddStudent.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_AddStdButtonActionPerformed

    private void DeleteStdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStdButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) StudentInfoTable.getModel();
        
        if(StudentInfoTable.getSelectedRowCount()==1){
            JOptionPane.showMessageDialog(null, "Are You Sure You want to Delet this Row!");
            model.removeRow(StudentInfoTable.getSelectedRow());
        }
        else{
            if(
               StudentInfoTable.getRowCount()==0){
               JOptionPane.showMessageDialog(null, "Table is Empty!!!");
            }
            else{
               JOptionPane.showMessageDialog(null, "Please Select the Single Row!!!");
            }
        }

    }//GEN-LAST:event_DeleteStdButtonActionPerformed

    private void EditStdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStdButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) StudentInfoTable.getModel();
        
        if(StudentInfoTable.getSelectedRowCount()==1){
            JOptionPane.showMessageDialog(null, "Sorry Boss!!! there is going work on it you can't use it!");
               
//            model.removeRow(StudentInfoTable.getSelectedRow());
//int n = StudentInfoTable.getColumnCount();
//            String[] temp = {};
            
//            temp[0]= (String) model.getValueAt(StudentInfoTable.getSelectedRow(), 0);
//            JOptionPane.showMessageDialog(null, "data "+temp[0]);
            
//            AddStudent obj = new AddStudent();
//            obj.updateinfo(temp);
//            obj.setVisible(true);
//            obj.pack();
//            obj.setLocationRelativeTo(null);
//            obj.setDefaultCloseOperation(AddStudent.DISPOSE_ON_CLOSE);
            
        }
        else{
            if(
               StudentInfoTable.getRowCount()==0){
               JOptionPane.showMessageDialog(null, "Table is Empty!!!");
            }
            else{
               JOptionPane.showMessageDialog(null, "Please Select the Single Row!!!");
            }
        }
        
    }//GEN-LAST:event_EditStdButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStdButton;
    private javax.swing.JButton DeleteStdButton;
    private javax.swing.JButton EditStdButton;
    private static javax.swing.JTable StudentInfoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
