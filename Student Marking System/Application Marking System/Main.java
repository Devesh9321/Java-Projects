
//import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


/*
 * @author patil
 */
 public class Main{
    public static void main(String[] args){
        new CustomerLists().setVisible(true);;
    }
 }
 class CustomerLists extends javax.swing.JFrame {

    // private com.bean.AddCourseVar data;
    private DefaultTableModel model;
    
    
    public CustomerLists() {
        initComponents();
        setDatatoTable();
       
    }
                       
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLable = new javax.swing.JLabel();
        ButtonPanle = new javax.swing.JPanel();
        txtNOS = new javax.swing.JTextField();
        NOSLab = new javax.swing.JLabel();
        txtCCode = new javax.swing.JTextField();
        CCodeLab1 = new javax.swing.JLabel();
        txtBranch = new javax.swing.JTextField();
        CBranchLab = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        CYearLab = new javax.swing.JLabel();
        TptaBtn = new javax.swing.JButton();
        LoadcsvBtn = new javax.swing.JButton();
        GeneratBtn = new javax.swing.JButton();
        TableScrollPane = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();

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
        txtNOS.setBounds(210, 50, 220, 30);

        NOSLab.setBackground(new java.awt.Color(204, 204, 255));
        NOSLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        NOSLab.setText("  Number Of Student");
        NOSLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NOSLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NOSLab.setOpaque(true);
        ButtonPanle.add(NOSLab);
        NOSLab.setBounds(40, 50, 160, 30);

        txtCCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ButtonPanle.add(txtCCode);
        txtCCode.setBounds(210, 10, 220, 30);

        CCodeLab1.setBackground(new java.awt.Color(204, 204, 255));
        CCodeLab1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CCodeLab1.setText("  Course Code");
        CCodeLab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CCodeLab1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CCodeLab1.setOpaque(true);
        ButtonPanle.add(CCodeLab1);
        CCodeLab1.setBounds(40, 10, 160, 30);

        txtBranch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBranch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ButtonPanle.add(txtBranch);
        txtBranch.setBounds(210, 90, 220, 30);

        CBranchLab.setBackground(new java.awt.Color(204, 204, 255));
        CBranchLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CBranchLab.setText("  Branch");
        CBranchLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CBranchLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CBranchLab.setOpaque(true);
        ButtonPanle.add(CBranchLab);
        CBranchLab.setBounds(40, 90, 160, 30);

        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ButtonPanle.add(txtYear);
        txtYear.setBounds(210, 130, 220, 30);

        CYearLab.setBackground(new java.awt.Color(204, 204, 255));
        CYearLab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        CYearLab.setText("  Year");
        CYearLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CYearLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CYearLab.setOpaque(true);
        ButtonPanle.add(CYearLab);
        CYearLab.setBounds(40, 130, 160, 30);

        TptaBtn.setBackground(new java.awt.Color(255, 212, 198));
        TptaBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        TptaBtn.setForeground(new java.awt.Color(0, 51, 255));
        TptaBtn.setText("Total");
        TptaBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        ButtonPanle.add(TptaBtn);
        TptaBtn.setBounds(690, 120, 130, 40);

        LoadcsvBtn.setBackground(new java.awt.Color(255, 212, 198));
        LoadcsvBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        LoadcsvBtn.setForeground(new java.awt.Color(0, 0, 255));
        LoadcsvBtn.setText("Load from CSV");
        LoadcsvBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        LoadcsvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadcsvBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(LoadcsvBtn);
        LoadcsvBtn.setBounds(550, 60, 180, 40);

        GeneratBtn.setBackground(new java.awt.Color(255, 212, 198));
        GeneratBtn.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        GeneratBtn.setForeground(new java.awt.Color(0, 0, 255));
        GeneratBtn.setText("Generate List");
        GeneratBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        GeneratBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneratBtnActionPerformed(evt);
            }
        });
        ButtonPanle.add(GeneratBtn);
        GeneratBtn.setBounds(550, 120, 130, 40);

        TitlePanel.add(ButtonPanle, java.awt.BorderLayout.CENTER);

        getContentPane().add(TitlePanel, java.awt.BorderLayout.PAGE_START);

        CustTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CustTable.setModel(new javax.swing.table.DefaultTableModel(
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
        CustTable.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        TableScrollPane.setViewportView(CustTable);
        if (CustTable.getColumnModel().getColumnCount() > 0) {
            CustTable.getColumnModel().getColumn(0).setResizable(false);
            CustTable.getColumnModel().getColumn(1).setResizable(false);
            CustTable.getColumnModel().getColumn(2).setResizable(false);
            CustTable.getColumnModel().getColumn(3).setResizable(false);
            CustTable.getColumnModel().getColumn(4).setResizable(false);
            CustTable.getColumnModel().getColumn(5).setResizable(false);
            CustTable.getColumnModel().getColumn(6).setResizable(false);
            CustTable.getColumnModel().getColumn(7).setResizable(false);
            CustTable.getColumnModel().getColumn(8).setResizable(false);
            CustTable.getColumnModel().getColumn(9).setResizable(false);
            CustTable.getColumnModel().getColumn(10).setResizable(false);
        }

        getContentPane().add(TableScrollPane, java.awt.BorderLayout.CENTER);

        pack();
    }                   

    void insertData(InputStream is) {
        model = (DefaultTableModel)CustTable.getModel();
        Scanner scan = new Scanner(is);
        String[] array;
        String line1 = scan.nextLine();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if(line.indexOf(",")>-1)
                array = line.split(",");
            else
                array = line.split("\t");
            Object[] data = new Object[array.length];
            for (int i = 0; i < array.length; i++)
                data[i] = array[i];

            model.addRow(data);
        }
    }
    
    
    private void LoadcsvBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        JFileChooser fc=new JFileChooser();  
         File f=null;
        int i=fc.showOpenDialog(this);  
          
        if(i==JFileChooser.APPROVE_OPTION){  
       f=fc.getSelectedFile();  
        String filepath=f.getPath(); 
        javax.swing.JOptionPane.showMessageDialog(null, filepath);
         }
        InputStream is;
        try {
            model = (DefaultTableModel)CustTable.getModel();
//            Scanner sc = new Scanner(new File("C:\\Users\\patil\\Downloads\\std_marks.csv"));

            is = new FileInputStream(f);
            insertData(is);
            
//            sc.close();
        } catch (FileNotFoundException ex) {    ex.printStackTrace();   }
      
    }                                          

    private void GeneratBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
        javax.swing.JOptionPane.showMessageDialog(null, "fuck you !");
    }                                          

    private void setDatatoTable(){
//        Connection con = com.connector.Connetro.getConnectro();
//
//        PreparedStatement ps = con.prepareStatement("SELECT * FROM customer_recorde");           
//        ResultSet rs = ps.executeQuery();
//
//        ps.close();
//        con.close();
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JPanel ButtonPanle;
    private javax.swing.JLabel CBranchLab;
    private javax.swing.JLabel CCodeLab1;
    private javax.swing.JLabel CYearLab;
    private javax.swing.JTable CustTable;
    private javax.swing.JButton GeneratBtn;
    private javax.swing.JButton LoadcsvBtn;
    private javax.swing.JLabel NOSLab;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel TitleLable;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton TptaBtn;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtCCode;
    private javax.swing.JTextField txtNOS;
    private javax.swing.JTextField txtYear;
    // End of variables declaration                   
}
