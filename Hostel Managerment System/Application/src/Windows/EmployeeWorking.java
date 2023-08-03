
package Windows;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeWorking extends javax.swing.JPanel {

    public EmployeeWorking() {
        initComponents();
    }

    public static void AddEmpDataTable(String[] row){
        DefaultTableModel model= (DefaultTableModel)EmpTable.getModel();
        model.addRow(row);
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AddEmpButton = new javax.swing.JButton();
        DeleteEmpButton = new javax.swing.JButton();
        EditEmpButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Surname", "Salary", "Works", "PhoneNumber", "Gender", "City", "Cast", "Nationality", "Addresss"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmpTable);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(1198, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee IN THE HOSTEL");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(279, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(279, 41));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(279, 55));
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddEmpButton.setText("Add Employee");
        AddEmpButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        AddEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpButtonActionPerformed(evt);
            }
        });
        jPanel3.add(AddEmpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 20));

        DeleteEmpButton.setText("Delete Employee");
        DeleteEmpButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        DeleteEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmpButtonActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteEmpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 20));

        EditEmpButton.setText("Update");
        EditEmpButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        EditEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmpButtonActionPerformed(evt);
            }
        });
        jPanel3.add(EditEmpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 100, 20));

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void AddEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpButtonActionPerformed
        EmployeeStatus addEmp = new EmployeeStatus();
        addEmp.setVisible(true);
        addEmp.pack();
        addEmp.setLocationRelativeTo(null);
        addEmp.setDefaultCloseOperation(AddStudent.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_AddEmpButtonActionPerformed

    private void EditEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmpButtonActionPerformed

        JOptionPane.showMessageDialog(null, "Sorry Boss!!! there is going work on it you can't use it!");
        
    }//GEN-LAST:event_EditEmpButtonActionPerformed

    private void DeleteEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmpButtonActionPerformed

        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) EmpTable.getModel();
        
        if(EmpTable.getSelectedRowCount()==1){
            JOptionPane.showMessageDialog(null, "Are You sure You want to Delet this Employee!");
            model.removeRow(EmpTable.getSelectedRow());
        }
        else{
            if(
               EmpTable.getRowCount()==0){
               JOptionPane.showMessageDialog(null, "Table is Empty!!!");
            }
            else{
               JOptionPane.showMessageDialog(null, "Please Select the Single Row!!!");
            }
        }
    }//GEN-LAST:event_DeleteEmpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmpButton;
    private javax.swing.JButton DeleteEmpButton;
    private javax.swing.JButton EditEmpButton;
    private static javax.swing.JTable EmpTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
