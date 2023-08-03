package app;

import java.io.File;
import java.util.Scanner;
import java.io.InputStream;
import javax.swing.JFileChooser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.util.ArrayList;

/**
 * *************************
 * @author : Devesh Patil *
     *************************
 */
public class MarkCapter extends javax.swing.JInternalFrame {

    public MarkCapter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLable = new javax.swing.JLabel();
        ButtonPanle = new javax.swing.JPanel();
        txtNOS = new javax.swing.JTextField();
        NOSLab = new javax.swing.JLabel();
        CCodeLab1 = new javax.swing.JLabel();
        CBranchLab = new javax.swing.JLabel();
        CYearLab = new javax.swing.JLabel();
        DelAllRowBtn = new javax.swing.JButton();
        LoadcsvBtn = new javax.swing.JButton();
        GeneratBtn = new javax.swing.JButton();
        YearBox = new javax.swing.JComboBox<>();
        CourseBox = new javax.swing.JComboBox<>();
        TotalBtn = new javax.swing.JButton();
        BranchBox = new javax.swing.JComboBox<>();
        supervLab = new javax.swing.JLabel();
        supervBox = new javax.swing.JComboBox<>();
        DelRowBtn = new javax.swing.JButton();
        CommitBtn = new javax.swing.JButton();
        RangeGenBtn = new javax.swing.JButton();
        TableScrollPane = new javax.swing.JScrollPane();
        rightRenderer = new DefaultTableCellRenderer();
        StuTable = new javax.swing.JTable();

        TitlePanel.setLayout(new java.awt.BorderLayout());

        TitleLable.setBackground(new java.awt.Color(204, 255, 204));
        TitleLable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLable.setText("INSERT STUDENT MARKS");
        TitleLable.setOpaque(true);
        TitleLable.setPreferredSize(new java.awt.Dimension(37, 46));
        TitlePanel.add(TitleLable, java.awt.BorderLayout.PAGE_START);

        ButtonPanle.setBackground(new java.awt.Color(204, 255, 204));
        ButtonPanle.setPreferredSize(new java.awt.Dimension(400, 200));
        ButtonPanle.setLayout(null);

        txtNOS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ButtonPanle.add(txtNOS);
        txtNOS.setBounds(610, 10, 150, 30);

        NOSLab.setBackground(new java.awt.Color(204, 204, 255));
        NOSLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        NOSLab.setText("  Number Of Student");
        NOSLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NOSLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NOSLab.setOpaque(true);
        ButtonPanle.add(NOSLab);
        NOSLab.setBounds(450, 10, 150, 30);

        CCodeLab1.setBackground(new java.awt.Color(204, 204, 255));
        CCodeLab1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CCodeLab1.setText("  Course Code");
        CCodeLab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CCodeLab1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CCodeLab1.setOpaque(true);
        ButtonPanle.add(CCodeLab1);
        CCodeLab1.setBounds(40, 10, 120, 30);

        CBranchLab.setBackground(new java.awt.Color(204, 204, 255));
        CBranchLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CBranchLab.setText("  Branch");
        CBranchLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CBranchLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CBranchLab.setOpaque(true);
        ButtonPanle.add(CBranchLab);
        CBranchLab.setBounds(40, 90, 120, 30);

        CYearLab.setBackground(new java.awt.Color(204, 204, 255));
        CYearLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CYearLab.setText("  Year");
        CYearLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CYearLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CYearLab.setOpaque(true);
        ButtonPanle.add(CYearLab);
        CYearLab.setBounds(40, 130, 120, 30);

        DelAllRowBtn.setBackground(java.awt.SystemColor.textInactiveText);
        DelAllRowBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        DelAllRowBtn.setForeground(new java.awt.Color(255, 255, 255));
        DelAllRowBtn.setText("Delete All Row");
        DelAllRowBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        DelAllRowBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DelAllRowBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DelAllRowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelAllRowBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(DelAllRowBtn);
        DelAllRowBtn.setBounds(740, 140, 150, 30);

        LoadcsvBtn.setBackground(java.awt.SystemColor.textInactiveText);
        LoadcsvBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        LoadcsvBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoadcsvBtn.setText("Load External File");
        LoadcsvBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        LoadcsvBtn.setPreferredSize(new java.awt.Dimension(70, 40));
        LoadcsvBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LoadcsvBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LoadcsvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadcsvBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(LoadcsvBtn);
        LoadcsvBtn.setBounds(610, 90, 170, 30);

        GeneratBtn.setBackground(java.awt.SystemColor.textInactiveText);
        GeneratBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        GeneratBtn.setForeground(new java.awt.Color(255, 255, 255));
        GeneratBtn.setText("Generate List");
        GeneratBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        GeneratBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        GeneratBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GeneratBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneratBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(GeneratBtn);
        GeneratBtn.setBounds(450, 50, 150, 30);

        YearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023" }));
        YearBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ButtonPanle.add(YearBox);
        YearBox.setBounds(170, 130, 220, 30);

        CourseBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ButtonPanle.add(CourseBox);
        CourseBox.setBounds(170, 10, 220, 30);

        TotalBtn.setBackground(java.awt.SystemColor.textInactiveText);
        TotalBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        TotalBtn.setForeground(new java.awt.Color(255, 255, 255));
        TotalBtn.setText("Total");
        TotalBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        TotalBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        TotalBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(TotalBtn);
        TotalBtn.setBounds(450, 90, 150, 30);

        BranchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CM" }));
        BranchBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ButtonPanle.add(BranchBox);
        BranchBox.setBounds(170, 90, 220, 30);

        supervLab.setBackground(new java.awt.Color(204, 204, 255));
        supervLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        supervLab.setText("  Supervisor");
        supervLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        supervLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supervLab.setOpaque(true);
        ButtonPanle.add(supervLab);
        supervLab.setBounds(40, 50, 120, 30);

        supervBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ButtonPanle.add(supervBox);
        supervBox.setBounds(170, 50, 220, 30);

        DelRowBtn.setBackground(java.awt.SystemColor.textInactiveText);
        DelRowBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        DelRowBtn.setForeground(new java.awt.Color(255, 255, 255));
        DelRowBtn.setText("Delete Row");
        DelRowBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        DelRowBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DelRowBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DelRowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelRowBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(DelRowBtn);
        DelRowBtn.setBounds(580, 140, 150, 30);

        CommitBtn.setBackground(java.awt.SystemColor.textInactiveText);
        CommitBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        CommitBtn.setForeground(new java.awt.Color(255, 255, 255));
        CommitBtn.setText("Commit All");
        CommitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        CommitBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CommitBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CommitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommitBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(CommitBtn);
        CommitBtn.setBounds(410, 140, 130, 30);

        RangeGenBtn.setBackground(java.awt.SystemColor.textInactiveText);
        RangeGenBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        RangeGenBtn.setForeground(new java.awt.Color(255, 255, 255));
        RangeGenBtn.setText("Range Generate");
        RangeGenBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        RangeGenBtn.setPreferredSize(new java.awt.Dimension(125, 38));
        RangeGenBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        RangeGenBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RangeGenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangeGenBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(RangeGenBtn);
        RangeGenBtn.setBounds(610, 50, 170, 30);

        TitlePanel.add(ButtonPanle, java.awt.BorderLayout.CENTER);

        getContentPane().add(TitlePanel, java.awt.BorderLayout.PAGE_START);

        StuTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        StuTable.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        StuTable.setModel(new javax.swing.table.DefaultTableModel(
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
        StuTable.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        TableScrollPane.setViewportView(StuTable);
        if (StuTable.getColumnModel().getColumnCount() > 0) {
            StuTable.getColumnModel().getColumn(0).setResizable(false);
            StuTable.getColumnModel().getColumn(1).setResizable(false);
            StuTable.getColumnModel().getColumn(2).setResizable(false);
            StuTable.getColumnModel().getColumn(3).setResizable(false);
            StuTable.getColumnModel().getColumn(4).setResizable(false);
            StuTable.getColumnModel().getColumn(5).setResizable(false);
            StuTable.getColumnModel().getColumn(6).setResizable(false);
            StuTable.getColumnModel().getColumn(7).setResizable(false);
            StuTable.getColumnModel().getColumn(8).setResizable(false);
            StuTable.getColumnModel().getColumn(9).setResizable(false);
            StuTable.getColumnModel().getColumn(10).setResizable(false);
        }
        rightRenderer.setHorizontalAlignment(0);

        for (int columnIndex = 0; columnIndex < StuTable.getColumnCount(); columnIndex++)
        {
            StuTable.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
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

    public void SetData() {
        CourseBox.removeAllItems();
        for (int i = 0; i < bean.DataVar.SizeCourse; i++) {
            CourseBox.addItem(bean.DataVar.Course.get(i));
        }

        supervBox.removeAllItems();
        for (int i = 0; i < bean.DataVar.SizeSuper; i++) {
            supervBox.addItem(bean.DataVar.Supervisor.get(i));
        }

    }

    public void insertData(InputStream is) {
        model = (DefaultTableModel) StuTable.getModel();
        Scanner scan = new Scanner(is);
        String[] array;
        String line1 = scan.nextLine();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.indexOf(",") > -1) {
                array = line.split(",");
            } else {
                array = line.split("\t");
            }
            Object[] data = new Object[array.length];
            for (int i = 1; i <= array.length; i++) {
                data[i] = array[i];
            }

            model.addRow(data);
        }
    }

    private void update_column_table() {
        StuTable.getColumnModel().getColumn(4).setHeaderValue("Q1 ( " + bean.DataVar.Q1.get(this.index) + " )");
        StuTable.getColumnModel().getColumn(5).setHeaderValue("Q2 ( " + bean.DataVar.Q2.get(this.index) + " )");
        StuTable.getColumnModel().getColumn(6).setHeaderValue("Q3 ( " + bean.DataVar.Q3.get(this.index) + " )");
        StuTable.getColumnModel().getColumn(7).setHeaderValue("Q4 ( " + bean.DataVar.Q4.get(this.index) + " )");
        StuTable.getColumnModel().getColumn(8).setHeaderValue("Q5 ( " + bean.DataVar.Q5.get(this.index) + " )");
        StuTable.getColumnModel().getColumn(9).setHeaderValue("Q6 ( " + bean.DataVar.Q6.get(this.index) + " )");
        StuTable.getColumnModel().getColumn(10).setHeaderValue("Total Marks ( " + bean.DataVar.totalMark.get(this.index) + " )");

    }

    private void setDatatoTable() {
        try {
            if (CourseBox.getSelectedIndex() != -1 && supervBox.getSelectedIndex() != -1) {

                this.update_column_table();
                this.index = bean.DataVar.Course.indexOf(CourseBox.getSelectedItem());
                this.suind = bean.DataVar.Supervisor.indexOf(supervBox.getSelectedItem());
//                this.suind = supervBox.getSelectedIndex() + 1;
                int nos = Integer.parseInt(txtNOS.getText());
                String br = (String) BranchBox.getSelectedItem();
                String year = YearBox.getSelectedItem().toString().replaceFirst("20", "");
                model = (DefaultTableModel) StuTable.getModel();
                for (int i = 1; i <= nos; i++) {
                    if (i / 10 == 0) {
                        model.addRow(new Object[]{i, ((String) year + br + "00" + i), bean.DataVar.SupervisorID.get(this.suind), bean.DataVar.CourseID.get(this.index), 0, 0, 0, 0, 0, 0, 0});
                    } else if (i / 100 == 0) {
                        model.addRow(new Object[]{i, ((String) year + br + "0" + i), bean.DataVar.SupervisorID.get(this.suind), bean.DataVar.CourseID.get(this.index), 0, 0, 0, 0, 0, 0, 0});
                    } else {
                        model.addRow(new Object[]{i, ((String) year + br + "0" + i), bean.DataVar.SupervisorID.get(this.suind), bean.DataVar.CourseID.get(this.index), 0, 0, 0, 0, 0, 0, 0});
                    }
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No Course or Supervisor Selected ! ", "Invalied Input", 0);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pleas Fill Full Information ", "Invalied Input", 0);
        }
    }

    private void LoadcsvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadcsvBtnActionPerformed

        fileChooser = new JFileChooser();
        filter = new FileNameExtensionFilter("Only CSV file are Allow", "csv");
        fileChooser.addChoosableFileFilter(filter);

        try {
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                this.file = fileChooser.getSelectedFile();
//                String filepath = f.getPath(); 
                is = new FileInputStream(this.file);
                insertData(is);
            }
        } catch (FileNotFoundException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Your Selected File Will Not Found ! Please Try Anoter location ", "File Not Found", 0); //ex.printStackTrace();   
        }
        this.file = null;

    }//GEN-LAST:event_LoadcsvBtnActionPerformed

    private void GeneratBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneratBtnActionPerformed
        this.setDatatoTable();
        txtNOS.setText("");

    }//GEN-LAST:event_GeneratBtnActionPerformed

    private void DelAllRowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelAllRowBtnActionPerformed
        if (StuTable.getRowCount() != 0) {
            // remove selected row from the model
            for (int i = StuTable.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            javax.swing.JOptionPane.showMessageDialog(null, "All Row Deleted Successfully", "Table Operation", 1);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Table is Already Empty !", "Table Operation", 0);
        }
    }//GEN-LAST:event_DelAllRowBtnActionPerformed

    private void TotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBtnActionPerformed

        ArrayList<Integer> warn = new ArrayList<>();
        if (StuTable.getRowCount() != 0) {
            for (int i = 0; i < StuTable.getRowCount(); i++) {
                int total = 0;
                for (int j = 4; j < 10; j++) {
                    int amount = Integer.parseInt(StuTable.getValueAt(i, j).toString());
                    total += amount;
                }
                if (total <= bean.DataVar.totalMark.get(this.index)) {
                    StuTable.setValueAt(total, i, 10);
                } else {
                    warn.add(1 + i);
                }
            }
            if (!warn.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Check the Marks of Row Numbers : \n" + warn, "Invalied Marks", 1);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Table is Already Empty !", "Table Operation", 0);

        }
    }//GEN-LAST:event_TotalBtnActionPerformed

    private void DelRowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelRowBtnActionPerformed
        if (StuTable.getSelectedRow() != -1) {
            // remove selected row from the model
            this.model.removeRow(StuTable.getSelectedRow());
            javax.swing.JOptionPane.showMessageDialog(null, "Selected row deleted successfully", "Table Operation", 1);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Please Selete The Row First !", "Table Operation", 0);
        }
    }//GEN-LAST:event_DelRowBtnActionPerformed

    private void CommitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommitBtnActionPerformed
        if (StuTable.getRowCount() != 0) {
            this.model = (DefaultTableModel) StuTable.getModel();
            int rows = this.model.getRowCount();
            int cols = this.model.getColumnCount();

            Object[][] data = new Object[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    data[i][j] = this.model.getValueAt(i, j);
                }
            }
            try {
                dao.StoreData.sendData(data, rows);
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Table is Already Empty Cannot Commit !", "Commit Failed", 0);
        }
    }//GEN-LAST:event_CommitBtnActionPerformed

    private void RangeGenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangeGenBtnActionPerformed
        try {
            String pattern = javax.swing.JOptionPane.showInputDialog(this, "Please Select the Pattern and Generating IDCode \n for example (21CM201-21CM206)", "Generate In Range", 3);
            if (pattern.matches("[0-9]{2}[A-Z]{2}[0-9]{3}-[0-9]{2}[A-Z]{2}[0-9]{3}")) {
                model = (DefaultTableModel) StuTable.getModel();
                int n1 = Integer.parseInt(pattern.substring(4, 7));
                int n2 = Integer.parseInt(pattern.substring(12, 15));
                for (int i = n1; i <= n2; i++) {
                    if (i / 10 == 0) {
                        model.addRow(new Object[]{i, pattern.substring(0, 4) + i, this.suind, this.index, 0, 0, 0, 0, 0, 0, 0});
                    } else if (i / 100 == 0) {
                        model.addRow(new Object[]{i, pattern.substring(0, 4) + i, this.suind, this.index, 0, 0, 0, 0, 0, 0, 0});
                    } else {
                        model.addRow(new Object[]{i, pattern.substring(0, 4) + i, this.suind, this.index, 0, 0, 0, 0, 0, 0, 0});
                    }
                }
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pleas Fill Full Information ", "Invalied Input", 0);
        }

    }//GEN-LAST:event_RangeGenBtnActionPerformed

    private DefaultTableModel model;
    private int index = 0, suind = 0;
    private InputStream is;
    private JFileChooser fileChooser;
    private FileNameExtensionFilter filter;
    private DefaultTableCellRenderer rightRenderer;
    private File file;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BranchBox;
    private javax.swing.JPanel ButtonPanle;
    private javax.swing.JLabel CBranchLab;
    private javax.swing.JLabel CCodeLab1;
    private javax.swing.JLabel CYearLab;
    private javax.swing.JButton CommitBtn;
    private javax.swing.JComboBox<String> CourseBox;
    private javax.swing.JButton DelAllRowBtn;
    private javax.swing.JButton DelRowBtn;
    private javax.swing.JButton GeneratBtn;
    private javax.swing.JButton LoadcsvBtn;
    private javax.swing.JLabel NOSLab;
    private javax.swing.JButton RangeGenBtn;
    private javax.swing.JTable StuTable;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel TitleLable;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton TotalBtn;
    private javax.swing.JComboBox<String> YearBox;
    private javax.swing.JComboBox<String> supervBox;
    private javax.swing.JLabel supervLab;
    private javax.swing.JTextField txtNOS;
    // End of variables declaration//GEN-END:variables

}
