
import Windows.*;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame {

    AdminLoginWindow adminwind = new AdminLoginWindow();
    Student Studentobj = new Student();
    Employee Employeeobj = new Employee();
    Home homepage = new Home();
    public static String HostelTitle;
    
    public MainWindow() {
        initComponents();
        DesktopPane.removeAll();
        homepage.setVisible(true);
        homepage.setOpaque(false);
        DesktopPane.add(homepage);

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnHostelTitle = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        CurrentWindow = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        RightMenu = new javax.swing.JPanel();
        LeftMenu = new javax.swing.JPanel();
        AdminLoginButton = new javax.swing.JButton();
        StudentButton = new javax.swing.JButton();
        BtnAbout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        HostelName = new javax.swing.JLabel();
        HostelIcon = new javax.swing.JLabel();
        AdmineName = new javax.swing.JLabel();
        EmployeeInfo = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        DesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(270, 200));
        setPreferredSize(new java.awt.Dimension(1219, 670));

        Header.setBackground(new java.awt.Color(0, 255, 204));
        Header.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        Header.setMaximumSize(new java.awt.Dimension(32767, 32));
        Header.setMinimumSize(new java.awt.Dimension(100, 30));
        Header.setPreferredSize(new java.awt.Dimension(1219, 30));

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 29));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnHostelTitle.setBackground(new java.awt.Color(102, 204, 255));
        btnHostelTitle.setText("HostelName");
        btnHostelTitle.setMaximumSize(new java.awt.Dimension(30, 25));
        btnHostelTitle.setMinimumSize(new java.awt.Dimension(30, 25));
        btnHostelTitle.setPreferredSize(new java.awt.Dimension(30, 25));
        btnHostelTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHostelTitleMouseClicked(evt);
            }
        });
        jPanel1.add(btnHostelTitle);

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setText("SetIcon");
        jButton6.setMargin(new java.awt.Insets(1, 0, 3, 10));
        jButton6.setMaximumSize(new java.awt.Dimension(30, 25));
        jButton6.setMinimumSize(new java.awt.Dimension(30, 25));
        jButton6.setPreferredSize(new java.awt.Dimension(30, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        CurrentWindow.setFont(new java.awt.Font("Vani", 3, 14)); // NOI18N
        CurrentWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentWindow.setText("DashBoard");
        CurrentWindow.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addComponent(CurrentWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CurrentWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Footer.setBackground(new java.awt.Color(0, 153, 153));
        Footer.setMaximumSize(new java.awt.Dimension(32767, 32));
        Footer.setMinimumSize(new java.awt.Dimension(100, 30));
        Footer.setPreferredSize(new java.awt.Dimension(1219, 30));

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1219, Short.MAX_VALUE)
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(Footer, java.awt.BorderLayout.PAGE_END);

        RightMenu.setBackground(new java.awt.Color(51, 102, 255));
        RightMenu.setMaximumSize(new java.awt.Dimension(0, 32767));
        RightMenu.setMinimumSize(new java.awt.Dimension(0, 100));
        RightMenu.setPreferredSize(new java.awt.Dimension(0, 556));

        javax.swing.GroupLayout RightMenuLayout = new javax.swing.GroupLayout(RightMenu);
        RightMenu.setLayout(RightMenuLayout);
        RightMenuLayout.setHorizontalGroup(
            RightMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RightMenuLayout.setVerticalGroup(
            RightMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(RightMenu, java.awt.BorderLayout.LINE_END);

        LeftMenu.setBackground(new java.awt.Color(0, 204, 204));
        LeftMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        LeftMenu.setMaximumSize(new java.awt.Dimension(327, 32767));
        LeftMenu.setMinimumSize(new java.awt.Dimension(270, 100));

        AdminLoginButton.setBackground(new java.awt.Color(0, 255, 102));
        AdminLoginButton.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N
        AdminLoginButton.setText("Admin Login");
        AdminLoginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        AdminLoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminLoginButton.setMaximumSize(new java.awt.Dimension(75, 21));
        AdminLoginButton.setMinimumSize(new java.awt.Dimension(75, 21));
        AdminLoginButton.setPreferredSize(new java.awt.Dimension(75, 21));
        AdminLoginButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        AdminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginButtonActionPerformed(evt);
            }
        });

        StudentButton.setBackground(new java.awt.Color(0, 255, 102));
        StudentButton.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N
        StudentButton.setText("Student Info");
        StudentButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        StudentButton.setPreferredSize(new java.awt.Dimension(75, 21));
        StudentButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        StudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentButtonMouseClicked(evt);
            }
        });
        StudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentButtonActionPerformed(evt);
            }
        });

        BtnAbout.setBackground(new java.awt.Color(0, 255, 102));
        BtnAbout.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N
        BtnAbout.setText("About");
        BtnAbout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        BtnAbout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAboutActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        HostelName.setBackground(new java.awt.Color(255, 255, 153));
        HostelName.setFont(new java.awt.Font("Vani", 1, 15)); // NOI18N
        HostelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HostelName.setText("GPA Hostel Management System");
        HostelName.setOpaque(true);

        HostelIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        HostelIcon.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HostelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdmineName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(HostelName))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HostelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdmineName, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HostelName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EmployeeInfo.setBackground(new java.awt.Color(0, 255, 102));
        EmployeeInfo.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N
        EmployeeInfo.setText("Employee's Info");
        EmployeeInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        EmployeeInfo.setPreferredSize(new java.awt.Dimension(75, 21));
        EmployeeInfo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        EmployeeInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeInfoMouseClicked(evt);
            }
        });

        HomeButton.setBackground(new java.awt.Color(0, 255, 102));
        HomeButton.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N
        HomeButton.setText("DashBoard");
        HomeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        HomeButton.setPreferredSize(new java.awt.Dimension(75, 21));
        HomeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftMenuLayout = new javax.swing.GroupLayout(LeftMenu);
        LeftMenu.setLayout(LeftMenuLayout);
        LeftMenuLayout.setHorizontalGroup(
            LeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftMenuLayout.createSequentialGroup()
                .addGroup(LeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftMenuLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(LeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdminLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(LeftMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftMenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftMenuLayout.createSequentialGroup()
                                .addComponent(EmployeeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftMenuLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        LeftMenuLayout.setVerticalGroup(
            LeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftMenuLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdminLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(LeftMenu, java.awt.BorderLayout.LINE_START);

        DesktopPane.setLayout(new java.awt.BorderLayout());
        getContentPane().add(DesktopPane, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginButtonActionPerformed

//        this.setVisible(VISIABLE_OR_NOT);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                adminwind.setVisible(true);
                adminwind.pack();
                adminwind.setLocationRelativeTo(null);
                adminwind.setDefaultCloseOperation(AddStudent.DISPOSE_ON_CLOSE);
                Home.updateinfo();
            }
        });


    }//GEN-LAST:event_AdminLoginButtonActionPerformed


    private void StudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentButtonActionPerformed

    }//GEN-LAST:event_StudentButtonActionPerformed

    private void BtnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAboutActionPerformed
        // TODO add your handling code here:
        AboutWindow obj = new AboutWindow();
        CurrentWindow.setText("About");
        DesktopPane.removeAll();
        obj.setOpaque(false);
        obj.setVisible(true);
        DesktopPane.add(obj);
        DesktopPane.updateUI();

        
        
        
    }//GEN-LAST:event_BtnAboutActionPerformed

    private void StudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentButtonMouseClicked
        CurrentWindow.setText("Student Information");
        DesktopPane.removeAll();
        Studentobj.setOpaque(false);
        Studentobj.setVisible(true);
        DesktopPane.add(Studentobj);
        DesktopPane.updateUI();

    }//GEN-LAST:event_StudentButtonMouseClicked

    private void EmployeeInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeInfoMouseClicked

        CurrentWindow.setText("Employees Information");
        DesktopPane.removeAll();
        Employeeobj.setOpaque(false);
        Employeeobj.setVisible(true);
        DesktopPane.add(Employeeobj);
        DesktopPane.updateUI();
    }//GEN-LAST:event_EmployeeInfoMouseClicked

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        DesktopPane.removeAll();
        homepage.setVisible(true);
        DesktopPane.add(homepage);
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        HostelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/about_icon.jpg")));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnHostelTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHostelTitleMouseClicked
        
        String temp =JOptionPane.showInputDialog("Enter Name of Your Hostel\n\n");
        if(temp == null){
            MainWindow.HostelTitle = "MY Hostel";
        }
        else{
            MainWindow.HostelTitle = temp;
        }
        Home.TitleLabel.setText(MainWindow.HostelTitle);
    }//GEN-LAST:event_btnHostelTitleMouseClicked

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        CurrentWindow.setText("DashBoard");
    }//GEN-LAST:event_HomeButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLoginButton;
    private javax.swing.JLabel AdmineName;
    private javax.swing.JButton BtnAbout;
    private static javax.swing.JLabel CurrentWindow;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JButton EmployeeInfo;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel HostelIcon;
    private javax.swing.JLabel HostelName;
    private javax.swing.JPanel LeftMenu;
    private javax.swing.JPanel RightMenu;
    private javax.swing.JButton StudentButton;
    private javax.swing.JButton btnHostelTitle;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
