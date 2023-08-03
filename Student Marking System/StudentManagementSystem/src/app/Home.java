package app;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/***************************
   * @author : Devesh Patil *
     **************************/

public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
        this.initData();
        logo = new ImageIcon("src/icons/logo.png");
        this.setIconImage(logo.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_MW = new javax.swing.JPanel();
        Floater_MW = new javax.swing.JPanel();
        LeftMenu_MW = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JButton();
        InsertBtn = new javax.swing.JButton();
        StudentSecBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SupervisorSectBtn = new javax.swing.JButton();
        CourseSecBtn = new javax.swing.JButton();
        RightMenu_MW = new javax.swing.JPanel();
        MultiWindow_MW = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System Main");
        setIconImage(Toolkit.getDefaultToolkit().getImage("/icons/logoM.png"));
        setMinimumSize(new java.awt.Dimension(1100, 750));
        setName("Home_window"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setSize(new java.awt.Dimension(1200, 750));

        Header_MW.setBackground(new java.awt.Color(181, 230, 29));
        Header_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Header_MW.setPreferredSize(new java.awt.Dimension(120, 37));

        javax.swing.GroupLayout Header_MWLayout = new javax.swing.GroupLayout(Header_MW);
        Header_MW.setLayout(Header_MWLayout);
        Header_MWLayout.setHorizontalGroup(
            Header_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        Header_MWLayout.setVerticalGroup(
            Header_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(Header_MW, java.awt.BorderLayout.PAGE_START);

        Floater_MW.setBackground(new java.awt.Color(181, 230, 29));
        Floater_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Floater_MW.setPreferredSize(new java.awt.Dimension(120, 37));

        javax.swing.GroupLayout Floater_MWLayout = new javax.swing.GroupLayout(Floater_MW);
        Floater_MW.setLayout(Floater_MWLayout);
        Floater_MWLayout.setHorizontalGroup(
            Floater_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        Floater_MWLayout.setVerticalGroup(
            Floater_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(Floater_MW, java.awt.BorderLayout.PAGE_END);

        LeftMenu_MW.setBackground(new java.awt.Color(239, 250, 212));
        LeftMenu_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LeftMenu_MW.setPreferredSize(new java.awt.Dimension(260, 70));
        LeftMenu_MW.setLayout(null);

        HomeBtn.setText("Home Screen");
        HomeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(HomeBtn);
        HomeBtn.setBounds(10, 160, 240, 40);

        InsertBtn.setText("Insert Student");
        InsertBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(InsertBtn);
        InsertBtn.setBounds(10, 210, 240, 40);

        StudentSecBtn.setText("Student Section");
        StudentSecBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        StudentSecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentSecBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(StudentSecBtn);
        StudentSecBtn.setBounds(10, 260, 240, 40);

        LogOutBtn.setText("Log Out");
        LogOutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(LogOutBtn);
        LogOutBtn.setBounds(10, 410, 240, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Panel_img.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(99, 51, 0), 3, true));
        jLabel1.setPreferredSize(new java.awt.Dimension(508, 500));
        LeftMenu_MW.add(jLabel1);
        jLabel1.setBounds(10, 10, 240, 140);

        SupervisorSectBtn.setText("Supervisor Section");
        SupervisorSectBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SupervisorSectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorSectBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(SupervisorSectBtn);
        SupervisorSectBtn.setBounds(10, 360, 240, 40);

        CourseSecBtn.setText("Course Section");
        CourseSecBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CourseSecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseSecBtnActionPerformed(evt);
            }
        });
        LeftMenu_MW.add(CourseSecBtn);
        CourseSecBtn.setBounds(10, 310, 240, 40);

        getContentPane().add(LeftMenu_MW, java.awt.BorderLayout.WEST);

        RightMenu_MW.setBackground(new java.awt.Color(239, 239, 159));
        RightMenu_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RightMenu_MW.setPreferredSize(new java.awt.Dimension(0, 70));

        javax.swing.GroupLayout RightMenu_MWLayout = new javax.swing.GroupLayout(RightMenu_MW);
        RightMenu_MW.setLayout(RightMenu_MWLayout);
        RightMenu_MWLayout.setHorizontalGroup(
            RightMenu_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RightMenu_MWLayout.setVerticalGroup(
            RightMenu_MWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        getContentPane().add(RightMenu_MW, java.awt.BorderLayout.EAST);

        MultiWindow_MW.setBackground(new java.awt.Color(239, 250, 212));
        MultiWindow_MW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MultiWindow_MW.setLayout(new java.awt.BorderLayout());
        getContentPane().add(MultiWindow_MW, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initData() {
        this.operation = new dao.InitDAO();
        int i = 0;
//        Initialize the Course and Course Marks
        try{
            rs = operation.course();

            while(rs.next()){
                bean.DataVar.CourseID.add(rs.getInt(1));
                bean.DataVar.CourseCode.add(rs.getString(2));
                bean.DataVar.Course.add(rs.getString(3));
                bean.DataVar.totalMark.add(rs.getInt(4));
                bean.DataVar.Q1.add(rs.getInt(5));
                bean.DataVar.Q2.add(rs.getInt(6));
                bean.DataVar.Q3.add(rs.getInt(7));
                bean.DataVar.Q4.add(rs.getInt(8));
                bean.DataVar.Q5.add(rs.getInt(9));
                bean.DataVar.Q6.add(rs.getInt(10));
                i++;
            }
            bean.DataVar.SizeCourse = i;
            i = 0;
//        Initialize the Course and Supervisor
            rs = operation.supervisor();
            
            while(rs.next()){
                bean.DataVar.SupervisorID.add(rs.getInt(1));
                bean.DataVar.Supervisor.add(rs.getString(2));
                bean.DataVar.SupervisorHyear.add(rs.getString(3).substring(0, 4));
                i++;
            }
            
            bean.DataVar.SizeSuper = i;
            i = 0;
            
        }catch(SQLException e){     javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 2);   }
        
        StdMarks.setVisible(true,bean.DataVar.upocc);
        StdPanel.setVisible(true,bean.DataVar.upocc);
        SuperPanel.setVisible(true,bean.DataVar.upocc);
        CouPanel.setVisible(true,bean.DataVar.upocc);
        AdmPanel.setVisible(true);
        
        bean.DataVar.upocc = false;
        this.operation = null;
        this.rs = null;
    }
    
    private void InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtnActionPerformed
        if(bean.DataVar.upocc) this.initData();
        MultiWindow_MW.removeAll();
        MultiWindow_MW.add(StdMarks);
        MultiWindow_MW.updateUI();
    }//GEN-LAST:event_InsertBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        try {
            this.dispose();
            new MainWindow().setVisible(true);
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void StudentSecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentSecBtnActionPerformed
        if(bean.DataVar.upocc) this.initData();
        MultiWindow_MW.removeAll();
        MultiWindow_MW.add(StdPanel);
        MultiWindow_MW.updateUI();
    }//GEN-LAST:event_StudentSecBtnActionPerformed

    private void SupervisorSectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorSectBtnActionPerformed
        if(bean.DataVar.upocc) this.initData();
        MultiWindow_MW.removeAll();
        MultiWindow_MW.add(SuperPanel);
        MultiWindow_MW.updateUI();
    }//GEN-LAST:event_SupervisorSectBtnActionPerformed

    private void CourseSecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseSecBtnActionPerformed
        if(bean.DataVar.upocc) this.initData();
        MultiWindow_MW.removeAll();
        MultiWindow_MW.add(CouPanel);
        MultiWindow_MW.updateUI();
    }//GEN-LAST:event_CourseSecBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        if(bean.DataVar.upocc) this.initData();
        MultiWindow_MW.removeAll();
        MultiWindow_MW.add(AdmPanel);
        MultiWindow_MW.updateUI();        
        
    }//GEN-LAST:event_HomeBtnActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(() -> {
//            new Home().setVisible(true);
//        });
//    }
    
    private ImageIcon logo = null;
    private final MarkCapter StdMarks = new MarkCapter();
    private final All_Student StdPanel = new All_Student();;
    private final CoursePanel CouPanel = new CoursePanel();
    private final AdminPanel AdmPanel = new AdminPanel();
    private final SupervisorPanel SuperPanel = new SupervisorPanel();
    private dao.InitDAO operation = null;
    private ResultSet rs = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CourseSecBtn;
    private javax.swing.JPanel Floater_MW;
    private javax.swing.JPanel Header_MW;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton InsertBtn;
    private javax.swing.JPanel LeftMenu_MW;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JDesktopPane MultiWindow_MW;
    private javax.swing.JPanel RightMenu_MW;
    private javax.swing.JButton StudentSecBtn;
    private javax.swing.JButton SupervisorSectBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
