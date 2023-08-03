
package app;

import java.sql.SQLException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/***************************
   * @author : Devesh Patil *
     **************************/

public class CoursePanel extends javax.swing.JInternalFrame {
    
    public CoursePanel() {
        initComponents();
        model = (DefaultTableModel) CourseTable.getModel();
        this.setValue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        DisplayPanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        TableScrollPane = new javax.swing.JScrollPane();
        rightRenderer = new DefaultTableCellRenderer();
        CourseTable = new javax.swing.JTable();
        TitleLable = new javax.swing.JLabel();
        EnrollPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        IDCLabel1 = new javax.swing.JLabel();
        txtCourseC = new javax.swing.JTextField();
        EtxtQ6 = new javax.swing.JTextField();
        Q2Label1 = new javax.swing.JLabel();
        Q1Label1 = new javax.swing.JLabel();
        Q3Label1 = new javax.swing.JLabel();
        Q4Label1 = new javax.swing.JLabel();
        Q5Label1 = new javax.swing.JLabel();
        Q6Label1 = new javax.swing.JLabel();
        EtxtQ1 = new javax.swing.JTextField();
        EtxtQ4 = new javax.swing.JTextField();
        EtxtQ2 = new javax.swing.JTextField();
        EtxtQ5 = new javax.swing.JTextField();
        EtxtQ3 = new javax.swing.JTextField();
        InsertBtn = new javax.swing.JButton();
        IDCLabel3 = new javax.swing.JLabel();
        txtCourseN = new javax.swing.JTextField();
        MaxmarkLabel = new javax.swing.JLabel();
        txtMaxM = new javax.swing.JTextField();
        ModifyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CourseCodeLabel = new javax.swing.JLabel();
        txtCourseCode = new javax.swing.JTextField();
        txtQ6 = new javax.swing.JTextField();
        Q2Label = new javax.swing.JLabel();
        Q1Label = new javax.swing.JLabel();
        Q3Label = new javax.swing.JLabel();
        Q4Label = new javax.swing.JLabel();
        Q5Label = new javax.swing.JLabel();
        Q6Label = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        txtQ1 = new javax.swing.JTextField();
        txtQ4 = new javax.swing.JTextField();
        txtQ2 = new javax.swing.JTextField();
        txtQ5 = new javax.swing.JTextField();
        txtQ3 = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        CourseNameLabel = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        MaxMarkLabel = new javax.swing.JLabel();
        txtMaxMark = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));
        jTabbedPane1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        DisplayPanel.setLayout(new java.awt.BorderLayout());

        TitlePanel.setLayout(new java.awt.BorderLayout());
        DisplayPanel.add(TitlePanel, java.awt.BorderLayout.PAGE_START);

        TableScrollPane.setBackground(new java.awt.Color(204, 255, 204));

        CourseTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CourseTable.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No", "Course Code", "Course Name", "Maximum Marks", "Q1", "Q2", "Q3", "Q4", "Q5", "Q6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CourseTable.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        TableScrollPane.setViewportView(CourseTable);
        rightRenderer.setHorizontalAlignment(0);

        for (int columnIndex = 0; columnIndex < CourseTable.getColumnCount(); columnIndex++)
        {
            CourseTable.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }

        DisplayPanel.add(TableScrollPane, java.awt.BorderLayout.CENTER);

        TitleLable.setBackground(new java.awt.Color(204, 255, 204));
        TitleLable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLable.setText("Current Course");
        TitleLable.setOpaque(true);
        TitleLable.setPreferredSize(new java.awt.Dimension(37, 46));
        DisplayPanel.add(TitleLable, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("View All Coruses", DisplayPanel);

        EnrollPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add The Course");
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 50));
        EnrollPanel.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(null);

        IDCLabel1.setBackground(new java.awt.Color(204, 204, 255));
        IDCLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        IDCLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDCLabel1.setText("  Course Code");
        IDCLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IDCLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        IDCLabel1.setOpaque(true);
        jPanel6.add(IDCLabel1);
        IDCLabel1.setBounds(30, 20, 150, 30);

        txtCourseC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCourseC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(txtCourseC);
        txtCourseC.setBounds(190, 20, 210, 30);

        EtxtQ6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EtxtQ6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(EtxtQ6);
        EtxtQ6.setBounds(360, 260, 130, 30);

        Q2Label1.setBackground(new java.awt.Color(204, 204, 255));
        Q2Label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q2Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q2Label1.setText(" Q 2");
        Q2Label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q2Label1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q2Label1.setOpaque(true);
        jPanel6.add(Q2Label1);
        Q2Label1.setBounds(40, 220, 70, 30);

        Q1Label1.setBackground(new java.awt.Color(204, 204, 255));
        Q1Label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q1Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q1Label1.setText(" Q 1");
        Q1Label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q1Label1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q1Label1.setOpaque(true);
        jPanel6.add(Q1Label1);
        Q1Label1.setBounds(40, 180, 70, 30);

        Q3Label1.setBackground(new java.awt.Color(204, 204, 255));
        Q3Label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q3Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q3Label1.setText(" Q 3");
        Q3Label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q3Label1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q3Label1.setOpaque(true);
        jPanel6.add(Q3Label1);
        Q3Label1.setBounds(40, 260, 70, 30);

        Q4Label1.setBackground(new java.awt.Color(204, 204, 255));
        Q4Label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q4Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q4Label1.setText(" Q 4");
        Q4Label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q4Label1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q4Label1.setOpaque(true);
        jPanel6.add(Q4Label1);
        Q4Label1.setBounds(280, 180, 70, 30);

        Q5Label1.setBackground(new java.awt.Color(204, 204, 255));
        Q5Label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q5Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q5Label1.setText(" Q 5");
        Q5Label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q5Label1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q5Label1.setOpaque(true);
        jPanel6.add(Q5Label1);
        Q5Label1.setBounds(280, 220, 70, 30);

        Q6Label1.setBackground(new java.awt.Color(204, 204, 255));
        Q6Label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q6Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q6Label1.setText(" Q 6");
        Q6Label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q6Label1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q6Label1.setOpaque(true);
        jPanel6.add(Q6Label1);
        Q6Label1.setBounds(280, 260, 70, 30);

        EtxtQ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EtxtQ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(EtxtQ1);
        EtxtQ1.setBounds(120, 180, 130, 30);

        EtxtQ4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EtxtQ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(EtxtQ4);
        EtxtQ4.setBounds(360, 180, 130, 30);

        EtxtQ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EtxtQ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(EtxtQ2);
        EtxtQ2.setBounds(120, 220, 130, 30);

        EtxtQ5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EtxtQ5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(EtxtQ5);
        EtxtQ5.setBounds(360, 220, 130, 30);

        EtxtQ3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EtxtQ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(EtxtQ3);
        EtxtQ3.setBounds(120, 260, 130, 30);

        InsertBtn.setBackground(new java.awt.Color(255, 153, 153));
        InsertBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        InsertBtn.setText("Insert");
        InsertBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtnActionPerformed(evt);
            }
        });
        jPanel6.add(InsertBtn);
        InsertBtn.setBounds(220, 330, 130, 30);

        IDCLabel3.setBackground(new java.awt.Color(204, 204, 255));
        IDCLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        IDCLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDCLabel3.setText("  Course Name");
        IDCLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IDCLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        IDCLabel3.setOpaque(true);
        jPanel6.add(IDCLabel3);
        IDCLabel3.setBounds(30, 60, 150, 30);

        txtCourseN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCourseN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(txtCourseN);
        txtCourseN.setBounds(190, 60, 210, 30);

        MaxmarkLabel.setBackground(new java.awt.Color(204, 204, 255));
        MaxmarkLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        MaxmarkLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MaxmarkLabel.setText("  Maximum Marks");
        MaxmarkLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MaxmarkLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MaxmarkLabel.setOpaque(true);
        jPanel6.add(MaxmarkLabel);
        MaxmarkLabel.setBounds(30, 100, 150, 30);

        txtMaxM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaxM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(txtMaxM);
        txtMaxM.setBounds(190, 100, 210, 30);

        EnrollPanel.add(jPanel6, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Enroll Course", EnrollPanel);

        ModifyPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modify the Course");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 50));
        ModifyPanel.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        CourseCodeLabel.setBackground(new java.awt.Color(204, 204, 255));
        CourseCodeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CourseCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CourseCodeLabel.setText("  Course Code (Required)");
        CourseCodeLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CourseCodeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        CourseCodeLabel.setOpaque(true);
        jPanel2.add(CourseCodeLabel);
        CourseCodeLabel.setBounds(50, 20, 180, 30);

        txtCourseCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCourseCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtCourseCode);
        txtCourseCode.setBounds(240, 20, 210, 30);

        txtQ6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtQ6);
        txtQ6.setBounds(380, 270, 130, 30);

        Q2Label.setBackground(new java.awt.Color(204, 204, 255));
        Q2Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q2Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q2Label.setText(" Q 2");
        Q2Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q2Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q2Label.setOpaque(true);
        jPanel2.add(Q2Label);
        Q2Label.setBounds(60, 230, 70, 30);

        Q1Label.setBackground(new java.awt.Color(204, 204, 255));
        Q1Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q1Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q1Label.setText(" Q 1");
        Q1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q1Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q1Label.setOpaque(true);
        jPanel2.add(Q1Label);
        Q1Label.setBounds(60, 190, 70, 30);

        Q3Label.setBackground(new java.awt.Color(204, 204, 255));
        Q3Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q3Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q3Label.setText(" Q 3");
        Q3Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q3Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q3Label.setOpaque(true);
        jPanel2.add(Q3Label);
        Q3Label.setBounds(60, 270, 70, 30);

        Q4Label.setBackground(new java.awt.Color(204, 204, 255));
        Q4Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q4Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q4Label.setText(" Q 4");
        Q4Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q4Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q4Label.setOpaque(true);
        jPanel2.add(Q4Label);
        Q4Label.setBounds(300, 190, 70, 30);

        Q5Label.setBackground(new java.awt.Color(204, 204, 255));
        Q5Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q5Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q5Label.setText(" Q 5");
        Q5Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q5Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q5Label.setOpaque(true);
        jPanel2.add(Q5Label);
        Q5Label.setBounds(300, 230, 70, 30);

        Q6Label.setBackground(new java.awt.Color(204, 204, 255));
        Q6Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Q6Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Q6Label.setText(" Q 6");
        Q6Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q6Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Q6Label.setOpaque(true);
        jPanel2.add(Q6Label);
        Q6Label.setBounds(300, 270, 70, 30);

        SearchBtn.setBackground(new java.awt.Color(255, 153, 153));
        SearchBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SearchBtn);
        SearchBtn.setBounds(510, 20, 130, 30);

        txtQ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtQ1);
        txtQ1.setBounds(140, 190, 130, 30);

        txtQ4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtQ4);
        txtQ4.setBounds(380, 190, 130, 30);

        txtQ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtQ2);
        txtQ2.setBounds(140, 230, 130, 30);

        txtQ5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtQ5);
        txtQ5.setBounds(380, 230, 130, 30);

        txtQ3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtQ3);
        txtQ3.setBounds(140, 270, 130, 30);

        UpdateBtn.setBackground(new java.awt.Color(255, 153, 153));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateBtn);
        UpdateBtn.setBounds(130, 340, 130, 30);

        CourseNameLabel.setBackground(new java.awt.Color(204, 204, 255));
        CourseNameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CourseNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CourseNameLabel.setText("  Course Name");
        CourseNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CourseNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        CourseNameLabel.setOpaque(true);
        jPanel2.add(CourseNameLabel);
        CourseNameLabel.setBounds(50, 80, 150, 30);

        txtCourseName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCourseName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtCourseName);
        txtCourseName.setBounds(210, 80, 210, 30);

        MaxMarkLabel.setBackground(new java.awt.Color(204, 204, 255));
        MaxMarkLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        MaxMarkLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MaxMarkLabel.setText("  Total Marks");
        MaxMarkLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MaxMarkLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MaxMarkLabel.setOpaque(true);
        jPanel2.add(MaxMarkLabel);
        MaxMarkLabel.setBounds(50, 120, 150, 30);

        txtMaxMark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaxMark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtMaxMark);
        txtMaxMark.setBounds(210, 120, 210, 30);

        DeleteBtn.setBackground(new java.awt.Color(255, 153, 153));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn);
        DeleteBtn.setBounds(280, 340, 130, 30);

        ModifyPanel.add(jPanel2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Update / Delete", ModifyPanel);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setVisible(boolean visi,boolean up){
        super.setVisible(visi);
        if(up){      this.setValue();     }
    }
    
    public void setValue() {
        this.ClearTable();
        for(int i=0;i<bean.DataVar.SizeCourse;i++)
            this.model.addRow(new Object[]{(i+1), bean.DataVar.CourseCode.get(i), bean.DataVar.Course.get(i), bean.DataVar.totalMark.get(i), bean.DataVar.Q1.get(i), bean.DataVar.Q2.get(i), bean.DataVar.Q3.get(i), bean.DataVar.Q4.get(i), bean.DataVar.Q5.get(i),bean.DataVar.Q6.get(i)});
            
    }

    private boolean ClearTable() {
        if (this.model.getRowCount() != 0) {
            // remove selected row from the model
            for (int i = this.model.getRowCount() - 1; i >= 0; i--) {
                this.model.removeRow(i);
            }
            return true;
        }else{
            return false;
        }
    }
    
    private void ClearText(){
        txtCourseCode.setText("");
        txtCourseName.setText("");
        txtMaxMark.setText("");
        txtQ1.setText("");
        txtQ2.setText("");
        txtQ3.setText("");
        txtQ4.setText("");
        txtQ5.setText("");
        txtQ6.setText("");
    }
    
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
       try {
            if(operation.DeleteCourse()){
                javax.swing.JOptionPane.showMessageDialog(null, "The Course is Deleted Successfuly !", "Course Operation", 1);
                bean.DataVar.upocc = true;
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Failed To Delete Course  !", "Course Operation", 2);
            }       
            
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 2);
//            Logger.getLogger(CoursePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       this.ClearText();  
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        try {
            if(operation.data!=null){
                operation.data.setCourseName(txtCourseName.getText());
                operation.data.setMaximum_Mark(Integer.parseInt(txtMaxMark.getText()));
                operation.data.setQ1(Integer.parseInt(txtQ1.getText()));
                operation.data.setQ2(Integer.parseInt(txtQ2.getText()));
                operation.data.setQ3(Integer.parseInt(txtQ3.getText()));
                operation.data.setQ4(Integer.parseInt(txtQ4.getText()));
                operation.data.setQ5(Integer.parseInt(txtQ5.getText()));
                operation.data.setQ6(Integer.parseInt(txtQ6.getText()));

                if(operation.data.getQ1()+operation.data.getQ2()+operation.data.getQ3()+operation.data.getQ4()+operation.data.getQ5()+operation.data.getQ6()==operation.data.getMaximum_Mark())
                {
                    if(operation.UpdateCourse()){
                        javax.swing.JOptionPane.showMessageDialog(null, "The Course Details are Updated Successfuly !", "Course Operation", 1);
                        bean.DataVar.upocc = true;
                    }
                    else{
                        javax.swing.JOptionPane.showMessageDialog(null, "Failed To Update Course Details !", "Course Operation", 2);
                    }
                    this.ClearText();
                }
                else{
                    javax.swing.JOptionPane.showMessageDialog(null, "Please Varify the Marks and Total Marks of Course", "Incorrect Input", 2);
                }
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Please Search before Update !", "Invalied Operation", 2);
            }
    } catch(NumberFormatException e){
        javax.swing.JOptionPane.showMessageDialog(null, "Number Enter is Invalied! pleas Varify !", "Incorrect Input", 0);
    } catch (SQLException ex) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
    }

    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        String Var = txtCourseCode.getText();
        if(Var.matches("[A-Z]{2}[0-9]{4}")){
            try {
                if(operation.SearchCourse(Var)){
                    txtCourseName.setText(operation.data.getCourseName());
                    txtMaxMark.setText(""+operation.data.getMaximum_Mark());
                    txtQ1.setText(""+operation.data.getQ1());
                    txtQ2.setText(""+operation.data.getQ2());
                    txtQ3.setText(""+operation.data.getQ3());
                    txtQ4.setText(""+operation.data.getQ4());
                    txtQ5.setText(""+operation.data.getQ5());
                    txtQ6.setText(""+operation.data.getQ6());
                }
                
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 2);
//                Logger.getLogger(CoursePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Please Enter Correct ID Code for Searching !","Course Operation", 0);
        }
        
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtnActionPerformed

    try {
        if(!txtCourseC.getText().matches("[A-Z]{2}[0-9]{4}")||txtCourseN.getText().trim().equals("")||txtMaxM.getText().trim().equals("")){
                javax.swing.JOptionPane.showMessageDialog(null, "Please Fill Full Information Before Inserting the Course.\n or You May give Incorrect Input", "Course Operation", 2);  
        }
        else{
            operation.data = new bean.CourseVar();
            
            operation.data.setCourseCode(txtCourseC.getText());
            operation.data.setCourseName(txtCourseN.getText());
            operation.data.setMaximum_Mark(Integer.parseInt(txtMaxM.getText()));
            operation.data.setQ1(Integer.parseInt(EtxtQ1.getText()));
            operation.data.setQ2(Integer.parseInt(EtxtQ2.getText()));
            operation.data.setQ3(Integer.parseInt(EtxtQ3.getText()));
            operation.data.setQ4(Integer.parseInt(EtxtQ4.getText()));
            operation.data.setQ5(Integer.parseInt(EtxtQ5.getText()));
            operation.data.setQ6(Integer.parseInt(EtxtQ6.getText()));

            if(operation.data.getQ1()+operation.data.getQ2()+operation.data.getQ3()+operation.data.getQ4()+operation.data.getQ5()+operation.data.getQ6()==operation.data.getMaximum_Mark())
            {
                if(operation.InsertCourse()){
                   javax.swing.JOptionPane.showMessageDialog(null, "The Course Add Successfuly !", "Course Operation", 1);
                   bean.DataVar.upocc = true;
                }
                else{
                    javax.swing.JOptionPane.showMessageDialog(null, "Failed to Add the Course !", "Course Operation", 2);
                }
                
                this.ClearText();
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Please Varify the Marks and Total Marks of Course", "Incorrect Input", 2);
            }
        }
    } catch(NumberFormatException e){
        javax.swing.JOptionPane.showMessageDialog(null, "Number Enter is Invalied! pleas Varify !", "Incorrect Input", 2);
    
    }
    catch (SQLException ex) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 2);
        //            Logger.getLogger(CoursePanel.class.getName()).log(Level.SEVERE, null, ex);
        
        this.ClearText();
    }
        
    }//GEN-LAST:event_InsertBtnActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        this.ClearTable();
        this.setValue();
    }//GEN-LAST:event_jTabbedPane1FocusGained
    
    private final dao.CourseDAO operation = new dao.CourseDAO();
    private final DefaultTableModel model;
    private DefaultTableCellRenderer rightRenderer;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseCodeLabel;
    private javax.swing.JLabel CourseNameLabel;
    private javax.swing.JTable CourseTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JPanel EnrollPanel;
    private javax.swing.JTextField EtxtQ1;
    private javax.swing.JTextField EtxtQ2;
    private javax.swing.JTextField EtxtQ3;
    private javax.swing.JTextField EtxtQ4;
    private javax.swing.JTextField EtxtQ5;
    private javax.swing.JTextField EtxtQ6;
    private javax.swing.JLabel IDCLabel1;
    private javax.swing.JLabel IDCLabel3;
    private javax.swing.JButton InsertBtn;
    private javax.swing.JLabel MaxMarkLabel;
    private javax.swing.JLabel MaxmarkLabel;
    private javax.swing.JPanel ModifyPanel;
    private javax.swing.JLabel Q1Label;
    private javax.swing.JLabel Q1Label1;
    private javax.swing.JLabel Q2Label;
    private javax.swing.JLabel Q2Label1;
    private javax.swing.JLabel Q3Label;
    private javax.swing.JLabel Q3Label1;
    private javax.swing.JLabel Q4Label;
    private javax.swing.JLabel Q4Label1;
    private javax.swing.JLabel Q5Label;
    private javax.swing.JLabel Q5Label1;
    private javax.swing.JLabel Q6Label;
    private javax.swing.JLabel Q6Label1;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel TitleLable;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCourseC;
    private javax.swing.JTextField txtCourseCode;
    private javax.swing.JTextField txtCourseN;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtMaxM;
    private javax.swing.JTextField txtMaxMark;
    private javax.swing.JTextField txtQ1;
    private javax.swing.JTextField txtQ2;
    private javax.swing.JTextField txtQ3;
    private javax.swing.JTextField txtQ4;
    private javax.swing.JTextField txtQ5;
    private javax.swing.JTextField txtQ6;
    // End of variables declaration//GEN-END:variables
}
