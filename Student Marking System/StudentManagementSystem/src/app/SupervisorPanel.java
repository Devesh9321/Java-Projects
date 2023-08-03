package app;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * *************************
 * @author : Devesh Patil * ************************
 */
public class SupervisorPanel extends javax.swing.JInternalFrame {

    public SupervisorPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLable = new javax.swing.JLabel();
        ButtonPanle = new javax.swing.JPanel();
        CommitBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DelRowBtn = new javax.swing.JButton();
        TableScrollPane = new javax.swing.JScrollPane();
        rightRenderer = new DefaultTableCellRenderer();
        SupervisorTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TitlePanel.setLayout(new java.awt.BorderLayout());

        TitleLable.setBackground(new java.awt.Color(204, 255, 204));
        TitleLable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLable.setText("Supervisor Details");
        TitleLable.setOpaque(true);
        TitleLable.setPreferredSize(new java.awt.Dimension(37, 46));
        TitlePanel.add(TitleLable, java.awt.BorderLayout.PAGE_START);

        ButtonPanle.setBackground(new java.awt.Color(204, 255, 204));
        ButtonPanle.setPreferredSize(new java.awt.Dimension(400, 90));

        CommitBtn.setBackground(java.awt.SystemColor.textInactiveText);
        CommitBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        CommitBtn.setForeground(new java.awt.Color(255, 255, 255));
        CommitBtn.setText("Add One");
        CommitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        CommitBtn.setPreferredSize(new java.awt.Dimension(130, 38));
        CommitBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CommitBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CommitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommitBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(CommitBtn);

        UpdateBtn.setBackground(java.awt.SystemColor.textInactiveText);
        UpdateBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update Details");
        UpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        UpdateBtn.setPreferredSize(new java.awt.Dimension(150, 38));
        UpdateBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UpdateBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(UpdateBtn);

        DelRowBtn.setBackground(java.awt.SystemColor.textInactiveText);
        DelRowBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        DelRowBtn.setForeground(new java.awt.Color(255, 255, 255));
        DelRowBtn.setText("Delete One");
        DelRowBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        DelRowBtn.setPreferredSize(new java.awt.Dimension(130, 38));
        DelRowBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DelRowBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DelRowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelRowBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(DelRowBtn);

        TitlePanel.add(ButtonPanle, java.awt.BorderLayout.CENTER);

        getContentPane().add(TitlePanel, java.awt.BorderLayout.PAGE_START);

        SupervisorTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SupervisorTable.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        SupervisorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "Full Name", "Department", "Hire-Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupervisorTable.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        TableScrollPane.setViewportView(SupervisorTable);
        rightRenderer.setHorizontalAlignment(0);

        for (int columnIndex = 0; columnIndex < SupervisorTable.getColumnCount(); columnIndex++)
        {
            SupervisorTable.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }

        getContentPane().add(TableScrollPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setVisible(boolean visi, boolean up) {
        super.setVisible(visi);
        if (up) {
            this.SetData();
        }
    }

    private void SetData() {
        this.model = (DefaultTableModel) SupervisorTable.getModel();
        
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < bean.DataVar.SizeSuper; i++) {
            this.model.addRow(new Object[]{i + 1, bean.DataVar.Supervisor.get(i), "CM", bean.DataVar.SupervisorHyear.get(i)});
        }
    }

    private void DelRowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelRowBtnActionPerformed

        this.Selecrow = SupervisorTable.getSelectedRow();
        if (this.Selecrow != -1) {
            try {
                this.operation = new dao.SupervisorDAO();
                this.index = bean.DataVar.Supervisor.indexOf(SupervisorTable.getValueAt(this.Selecrow, 1).toString()) + 1;

                if (operation.DeleteSuper(SupervisorTable.getValueAt(this.Selecrow, 1).toString(), bean.DataVar.SupervisorID.get(this.index))) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Supervisor Details are Deleted Successfuly !", "Supervisor Operation", 1);
                    bean.DataVar.upocc = true;
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Failed To Deleted Supervisor Details !", "Supervisor Operation", 2);
                }
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Please Selete The Row First !", "Table Operation", 0);
        }

        this.operation = null;
        this.Selecrow = -1;
        this.index = -1;
    }//GEN-LAST:event_DelRowBtnActionPerformed

    private void CommitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommitBtnActionPerformed
        this.modal = new SupervisorForm("Add Supervisor");
        this.modal.setVisible(true);
    }//GEN-LAST:event_CommitBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        this.Selecrow = SupervisorTable.getSelectedRow();
        if (this.Selecrow != -1) {
            this.index = bean.DataVar.Supervisor.indexOf(SupervisorTable.getValueAt(this.Selecrow, 1).toString()) + 1;
            this.modal = new SupervisorForm("Update", SupervisorTable.getValueAt(this.Selecrow, 1).toString(), Integer.parseInt(SupervisorTable.getValueAt(this.Selecrow, 3).toString().substring(0, 4)), this.index);
            this.modal.setVisible(true);
            this.Selecrow = -1;
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Please Selete The Row First !", "Table Operation", 0);
        }
        this.index = -1;
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private dao.SupervisorDAO operation = null;
    private SupervisorForm modal;
    private DefaultTableModel model;
    private int Selecrow = -1, index = -1;
    private DefaultTableCellRenderer rightRenderer;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanle;
    private javax.swing.JButton CommitBtn;
    private javax.swing.JButton DelRowBtn;
    private javax.swing.JTable SupervisorTable;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel TitleLable;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton UpdateBtn;
    // End of variables declaration//GEN-END:variables
}
