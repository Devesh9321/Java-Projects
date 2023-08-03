package app;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.io.InputStream;
import javax.swing.JTable;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableModel;


/*
 * @author patil
 */
public class All_Student extends javax.swing.JInternalFrame {

    public All_Student() {
        initComponents();
    }

    public void setVisible(boolean visi, boolean up) {
        super.setVisible(visi);
        if (up) {
            this.SetData();
        }
    }

    public void SetData() {
        SelCourseBox.removeAllItems();
        for (int i = 0; i < bean.DataVar.SizeCourse; i++) {
            SelCourseBox.addItem(bean.DataVar.Course.get(i));
        }
    }

    public void clear_txtbox() {
        this.txtIDCode.setText("");
        this.txtQ1.setText("");
        this.txtQ2.setText("");
        this.txtQ3.setText("");
        this.txtQ4.setText("");
        this.txtQ5.setText("");
        this.txtQ6.setText("");
    }

    public void setValue(JTable table, ResultSet rs) {
        model = (DefaultTableModel) table.getModel();
        int i = 1;
        try {
            while (rs.next()) {
                model.addRow(new Object[]{i, rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11)});
                i++;
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 2);
        }
    }

    private boolean ClearTable(JTable table) {
        model = (DefaultTableModel) table.getModel();
        if (model.getRowCount() != 0) {
            // remove selected row from the model
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        SearchPanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        TitleLable = new javax.swing.JLabel();
        ButtonPanle = new javax.swing.JPanel();
        SearchLab = new javax.swing.JLabel();
        ClearTBtn = new javax.swing.JButton();
        SearchInputBox = new javax.swing.JComboBox<>();
        SearchBtn = new javax.swing.JButton();
        SelOptLab = new javax.swing.JLabel();
        SelOptBox = new javax.swing.JComboBox<>();
        TableScrollPane = new javax.swing.JScrollPane();
        rightRenderer = new DefaultTableCellRenderer();
        SearchResTable = new javax.swing.JTable();
        ModifyPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        IDCLabel = new javax.swing.JLabel();
        SubLabel = new javax.swing.JLabel();
        txtIDCode = new javax.swing.JTextField();
        txtQ6 = new javax.swing.JTextField();
        Q2Label = new javax.swing.JLabel();
        Q1Label = new javax.swing.JLabel();
        Q3Label = new javax.swing.JLabel();
        Q4Label = new javax.swing.JLabel();
        Q5Label = new javax.swing.JLabel();
        Q6Label = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        txtQ1 = new javax.swing.JTextField();
        txtQ4 = new javax.swing.JTextField();
        txtQ2 = new javax.swing.JTextField();
        txtQ5 = new javax.swing.JTextField();
        txtQ3 = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        SelCourseBox = new javax.swing.JComboBox<>();
        DeleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        SearchPanel.setLayout(new java.awt.BorderLayout());

        TitlePanel.setLayout(new java.awt.BorderLayout());

        TitleLable.setBackground(new java.awt.Color(204, 255, 204));
        TitleLable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLable.setText("Dispaly STUDENT MARKS");
        TitleLable.setOpaque(true);
        TitleLable.setPreferredSize(new java.awt.Dimension(37, 46));
        TitlePanel.add(TitleLable, java.awt.BorderLayout.PAGE_START);

        ButtonPanle.setBackground(new java.awt.Color(204, 255, 204));
        ButtonPanle.setPreferredSize(new java.awt.Dimension(400, 100));
        ButtonPanle.setLayout(null);

        SearchLab.setBackground(new java.awt.Color(204, 204, 255));
        SearchLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        SearchLab.setText("  Search By :");
        SearchLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SearchLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SearchLab.setOpaque(true);
        ButtonPanle.add(SearchLab);
        SearchLab.setBounds(30, 10, 180, 30);

        ClearTBtn.setBackground(java.awt.SystemColor.textInactiveText);
        ClearTBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        ClearTBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearTBtn.setText("Clear Table");
        ClearTBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        ClearTBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ClearTBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ClearTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(ClearTBtn);
        ClearTBtn.setBounds(440, 60, 150, 30);

        SearchInputBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SupervisorID", "CourseID", "All Student" }));
        SearchInputBox.setSelectedIndex(2);
        SearchInputBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SearchInputBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchInputBoxActionPerformed(evt);
            }
        });
        ButtonPanle.add(SearchInputBox);
        SearchInputBox.setBounds(230, 10, 190, 30);

        SearchBtn.setBackground(java.awt.SystemColor.textInactiveText);
        SearchBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchBtn.setText("Search");
        SearchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        SearchBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SearchBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(SearchBtn);
        SearchBtn.setBounds(440, 20, 150, 30);

        SelOptLab.setBackground(new java.awt.Color(204, 204, 255));
        SelOptLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        SelOptLab.setText("  Select  :");
        SelOptLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SelOptLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SelOptLab.setOpaque(true);
        ButtonPanle.add(SelOptLab);
        SelOptLab.setBounds(30, 50, 180, 30);

        SelOptBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ButtonPanle.add(SelOptBox);
        SelOptBox.setBounds(230, 50, 190, 30);

        TitlePanel.add(ButtonPanle, java.awt.BorderLayout.CENTER);

        SearchPanel.add(TitlePanel, java.awt.BorderLayout.PAGE_START);

        SearchResTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SearchResTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "ID Code", "Varify By", "Sucject Code", "Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SearchResTable.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        TableScrollPane.setViewportView(SearchResTable);
        if (SearchResTable.getColumnModel().getColumnCount() > 0) {
            SearchResTable.getColumnModel().getColumn(0).setResizable(false);
            SearchResTable.getColumnModel().getColumn(1).setResizable(false);
            SearchResTable.getColumnModel().getColumn(2).setResizable(false);
            SearchResTable.getColumnModel().getColumn(3).setResizable(false);
            SearchResTable.getColumnModel().getColumn(4).setResizable(false);
            SearchResTable.getColumnModel().getColumn(5).setResizable(false);
            SearchResTable.getColumnModel().getColumn(6).setResizable(false);
            SearchResTable.getColumnModel().getColumn(7).setResizable(false);
            SearchResTable.getColumnModel().getColumn(8).setResizable(false);
            SearchResTable.getColumnModel().getColumn(9).setResizable(false);
            SearchResTable.getColumnModel().getColumn(10).setResizable(false);
        }
        rightRenderer.setHorizontalAlignment(0);

        for (int columnIndex = 0; columnIndex < SearchResTable.getColumnCount(); columnIndex++)
        {
            SearchResTable.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }

        SearchPanel.add(TableScrollPane, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Search Student", SearchPanel);

        ModifyPanel.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        IDCLabel.setBackground(new java.awt.Color(204, 204, 255));
        IDCLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        IDCLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDCLabel.setText(" ID Code (Required)");
        IDCLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IDCLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        IDCLabel.setOpaque(true);
        jPanel4.add(IDCLabel);
        IDCLabel.setBounds(50, 40, 150, 30);

        SubLabel.setBackground(new java.awt.Color(204, 204, 255));
        SubLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        SubLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SubLabel.setText(" Subject ( Required)");
        SubLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        SubLabel.setOpaque(true);
        jPanel4.add(SubLabel);
        SubLabel.setBounds(50, 80, 150, 30);

        txtIDCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtIDCode);
        txtIDCode.setBounds(210, 40, 210, 30);

        txtQ6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtQ6);
        txtQ6.setBounds(380, 290, 130, 30);

        Q2Label.setBackground(new java.awt.Color(204, 204, 255));
        Q2Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q2Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q2Label.setText(" Q 2");
        Q2Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q2Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q2Label.setOpaque(true);
        jPanel4.add(Q2Label);
        Q2Label.setBounds(60, 250, 70, 30);

        Q1Label.setBackground(new java.awt.Color(204, 204, 255));
        Q1Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q1Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q1Label.setText(" Q 1");
        Q1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q1Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q1Label.setOpaque(true);
        jPanel4.add(Q1Label);
        Q1Label.setBounds(60, 210, 70, 30);

        Q3Label.setBackground(new java.awt.Color(204, 204, 255));
        Q3Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q3Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q3Label.setText(" Q 3");
        Q3Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q3Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q3Label.setOpaque(true);
        jPanel4.add(Q3Label);
        Q3Label.setBounds(60, 290, 70, 30);

        Q4Label.setBackground(new java.awt.Color(204, 204, 255));
        Q4Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q4Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q4Label.setText(" Q 4");
        Q4Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q4Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q4Label.setOpaque(true);
        jPanel4.add(Q4Label);
        Q4Label.setBounds(300, 210, 70, 30);

        Q5Label.setBackground(new java.awt.Color(204, 204, 255));
        Q5Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q5Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q5Label.setText(" Q 5");
        Q5Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q5Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q5Label.setOpaque(true);
        jPanel4.add(Q5Label);
        Q5Label.setBounds(300, 250, 70, 30);

        Q6Label.setBackground(new java.awt.Color(204, 204, 255));
        Q6Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q6Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q6Label.setText(" Q 6");
        Q6Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q6Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q6Label.setOpaque(true);
        jPanel4.add(Q6Label);
        Q6Label.setBounds(300, 290, 70, 30);

        SearchButton.setBackground(new java.awt.Color(255, 153, 153));
        SearchButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel4.add(SearchButton);
        SearchButton.setBounds(130, 140, 130, 30);

        txtQ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtQ1);
        txtQ1.setBounds(140, 210, 130, 30);

        txtQ4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtQ4);
        txtQ4.setBounds(380, 210, 130, 30);

        txtQ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtQ2);
        txtQ2.setBounds(140, 250, 130, 30);

        txtQ5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtQ5);
        txtQ5.setBounds(380, 250, 130, 30);

        txtQ3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtQ3);
        txtQ3.setBounds(140, 290, 130, 30);

        UpdateBtn.setBackground(new java.awt.Color(255, 153, 153));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel4.add(UpdateBtn);
        UpdateBtn.setBounds(170, 360, 130, 30);

        SelCourseBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(SelCourseBox);
        SelCourseBox.setBounds(210, 80, 210, 30);
        for (int d = 0; d < bean.DataVar.Course.toArray().length; d++) {
            SelOptBox.addItem(bean.DataVar.Course.get(d));
        }

        DeleteBtn.setBackground(new java.awt.Color(255, 153, 153));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel4.add(DeleteBtn);
        DeleteBtn.setBounds(330, 360, 130, 30);

        ModifyPanel.add(jPanel4, java.awt.BorderLayout.CENTER);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Student Marks");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 50));
        ModifyPanel.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Update Details", ModifyPanel);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if (crudopt.data != null) {
            try {
                crudopt.DeleteStd();
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 2);
            }
            this.clear_txtbox();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Cannot Operate without Appropriate Student Information.", "Student Operation", 2);
        }

    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        if (crudopt.data != null) {
            crudopt.data.setQ1(Integer.parseInt(this.txtQ1.getText()));
            crudopt.data.setQ2(Integer.parseInt(this.txtQ2.getText()));
            crudopt.data.setQ3(Integer.parseInt(this.txtQ3.getText()));
            crudopt.data.setQ4(Integer.parseInt(this.txtQ4.getText()));
            crudopt.data.setQ5(Integer.parseInt(this.txtQ5.getText()));
            crudopt.data.setQ6(Integer.parseInt(this.txtQ6.getText()));
            try {
                crudopt.UpdateStd();
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 2);
//                Logger.getLogger(All_Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.clear_txtbox();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Cannot Operate without Appropriate Student Information.", "Student Operation", 0);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String var = txtIDCode.getText();
        if (var.matches("[0-9]{2}[A-Z]{2}[0-9]{3}")) {
            try {
                crudopt.SearchStd(var, SelCourseBox.getSelectedIndex() + 1);
                if (crudopt.data != null) {
                    this.txtQ1.setText("" + crudopt.data.getSubervisorId());
                    this.txtQ1.setText("" + crudopt.data.getQ1());
                    this.txtQ2.setText("" + crudopt.data.getQ2());
                    this.txtQ3.setText("" + crudopt.data.getQ3());
                    this.txtQ4.setText("" + crudopt.data.getQ4());
                    this.txtQ5.setText("" + crudopt.data.getQ5());
                    this.txtQ6.setText("" + crudopt.data.getQ6());
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Data Not Found of Student having id Code : " + var, "Data Not Found", 2);
                }

            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Entered IDCode is incorrect. Please Enter Correct Id Code !", "Invalied Input", 2);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed

        this.ClearTable(SearchResTable);

        try {

            switch (SearchInputBox.getSelectedIndex()) {
                case 0:
                    this.index = bean.DataVar.Supervisor.indexOf(SelOptBox.getSelectedItem());
                    this.setValue(SearchResTable, this.crudopt.getData(SearchInputBox.getSelectedItem().toString(), bean.DataVar.SupervisorID.get(this.index)));
                    break;

                case 1:
                    this.index = bean.DataVar.Course.indexOf(SelOptBox.getSelectedItem());
                    this.setValue(SearchResTable, this.crudopt.getData(SearchInputBox.getSelectedItem().toString(), bean.DataVar.CourseID.get(this.index)));
                    break;

                case 2:
                    SelOptBox.setEditable(false);
                    this.setValue(SearchResTable, this.crudopt.getData("1", 1));
                    SelOptBox.setEditable(true);
                    break;

                default:
                    javax.swing.JOptionPane.showMessageDialog(this, "Cannot Operate without specific Option", "Empty Search", 0);
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
//            Logger.getLogger(CoursePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.index = -1;

    }//GEN-LAST:event_SearchBtnActionPerformed

    private void SearchInputBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchInputBoxActionPerformed
        SelOptBox.removeAllItems();
        switch (SearchInputBox.getSelectedIndex()) {
            case 0:
                SelOptLab.setText("  Select Supervisor : ");
                for (int d = 0; d < bean.DataVar.Supervisor.toArray().length; d++) {
                    SelOptBox.addItem(bean.DataVar.Supervisor.get(d));
                }
                SelOptBox.setSelectedIndex(0);
                break;

            case 1:
                SelOptLab.setText("  Select Course :");
                for (int d = 0; d < bean.DataVar.Course.toArray().length; d++) {
                    SelOptBox.addItem(bean.DataVar.Course.get(d));
                }
                SelOptBox.setSelectedIndex(0);
                break;
            default:
        }
    }//GEN-LAST:event_SearchInputBoxActionPerformed

    private void ClearTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTBtnActionPerformed
        if (this.ClearTable(SearchResTable)) {

            javax.swing.JOptionPane.showMessageDialog(null, "All Row deleted successfully", "Table Operation", 2);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Table is Already Empty !", "Table Operation", 0);
        }
    }//GEN-LAST:event_ClearTBtnActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        SelCourseBox.removeAllItems();

    }//GEN-LAST:event_jPanel4MouseClicked

    private dao.CrucdStdDAO crudopt = new dao.CrucdStdDAO();
    private DefaultTableCellRenderer rightRenderer;
    private InputStream is;
    private JFileChooser fileChooser;
    private FileNameExtensionFilter filter;
    private DefaultTableModel model;
    private ResultSet rs = null;
    private int index = -1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanle;
    private javax.swing.JButton ClearTBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel IDCLabel;
    private javax.swing.JPanel ModifyPanel;
    private javax.swing.JLabel Q1Label;
    private javax.swing.JLabel Q2Label;
    private javax.swing.JLabel Q3Label;
    private javax.swing.JLabel Q4Label;
    private javax.swing.JLabel Q5Label;
    private javax.swing.JLabel Q6Label;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox<String> SearchInputBox;
    private javax.swing.JLabel SearchLab;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JTable SearchResTable;
    private javax.swing.JComboBox<String> SelCourseBox;
    private javax.swing.JComboBox<String> SelOptBox;
    private javax.swing.JLabel SelOptLab;
    private javax.swing.JLabel SubLabel;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel TitleLable;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtIDCode;
    private javax.swing.JTextField txtQ1;
    private javax.swing.JTextField txtQ2;
    private javax.swing.JTextField txtQ3;
    private javax.swing.JTextField txtQ4;
    private javax.swing.JTextField txtQ5;
    private javax.swing.JTextField txtQ6;
    // End of variables declaration//GEN-END:variables
}
