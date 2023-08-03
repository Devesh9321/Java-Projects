
import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class AdminLoginWindow extends javax.swing.JFrame {

    Scanner input = new Scanner(System.in);
    String AdmineName="MyAdmine";
    public static String UserName = "GPA";
    public static String Password = "GPA";
    public static String HostelTitle = "GPA Hostel";
    static int Building=0;
    static int Rooms;
    static int Beds=0;
   
    public AdminLoginWindow() {
        initComponents();
        ViewUsNLabel.setText(AdminLoginWindow.UserName);
        ViewpassLabel.setText(AdminLoginWindow.Password);
        ViewAbmin.setText(AdmineName);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdmineHeader = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PassLabel = new javax.swing.JLabel();
        ViewpassLabel = new javax.swing.JLabel();
        btnAddBeds = new javax.swing.JButton();
        UsrNLabel = new javax.swing.JLabel();
        ViewUsNLabel = new javax.swing.JLabel();
        BtnChangeUser = new javax.swing.JButton();
        btnAddBuilding = new javax.swing.JButton();
        BtnChangeAdmin = new javax.swing.JButton();
        btnAddRoom = new javax.swing.JButton();
        LogoPanel = new javax.swing.JPanel();
        imagepanel = new javax.swing.JLabel();
        RoomsPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        RoomCount = new javax.swing.JLabel();
        BuildingPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BuilbingCount = new javax.swing.JLabel();
        BedsPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BedsCount = new javax.swing.JLabel();
        btnCancle = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        ViewAbmin = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        BtnChangePass = new javax.swing.JButton();
        AdmineFlooter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setMinimumSize(new java.awt.Dimension(1200, 540));
        setPreferredSize(new java.awt.Dimension(1050, 700));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 70));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(1207, 70));
        jPanel1.setLayout(new java.awt.BorderLayout());

        AdmineHeader.setBackground(new java.awt.Color(204, 255, 204));
        AdmineHeader.setFont(new java.awt.Font("Vani", 3, 36)); // NOI18N
        AdmineHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdmineHeader.setText("ADMINE INFORMATION");
        AdmineHeader.setToolTipText("");
        AdmineHeader.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        AdmineHeader.setMaximumSize(new java.awt.Dimension(32474, 41));
        AdmineHeader.setMinimumSize(new java.awt.Dimension(32474, 41));
        AdmineHeader.setOpaque(true);
        AdmineHeader.setPreferredSize(new java.awt.Dimension(32747, 41));
        jPanel1.add(AdmineHeader, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PassLabel.setBackground(new java.awt.Color(0, 255, 153));
        PassLabel.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        PassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassLabel.setText("Password :");
        PassLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PassLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PassLabel.setOpaque(true);
        jPanel3.add(PassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 160, 30));

        ViewpassLabel.setBackground(new java.awt.Color(0, 255, 153));
        ViewpassLabel.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        ViewpassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewpassLabel.setText("Password");
        ViewpassLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ViewpassLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ViewpassLabel.setOpaque(true);
        jPanel3.add(ViewpassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 170, 30));

        btnAddBeds.setText("Add Beds");
        btnAddBeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBedsActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddBeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, -1, 30));

        UsrNLabel.setBackground(new java.awt.Color(0, 255, 153));
        UsrNLabel.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        UsrNLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsrNLabel.setText("Username :");
        UsrNLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UsrNLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        UsrNLabel.setOpaque(true);
        jPanel3.add(UsrNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 160, 30));

        ViewUsNLabel.setBackground(new java.awt.Color(0, 255, 153));
        ViewUsNLabel.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        ViewUsNLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewUsNLabel.setText("username");
        ViewUsNLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ViewUsNLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ViewUsNLabel.setOpaque(true);
        jPanel3.add(ViewUsNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 170, 30));

        BtnChangeUser.setText("Change Username");
        BtnChangeUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(102, 0, 51)));
        BtnChangeUser.setPreferredSize(new java.awt.Dimension(21, 0));
        BtnChangeUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnChangeUserMouseClicked(evt);
            }
        });
        jPanel3.add(BtnChangeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 150, 30));

        btnAddBuilding.setText("Add Building");
        btnAddBuilding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBuildingActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddBuilding, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, 30));

        BtnChangeAdmin.setText("Change Name");
        BtnChangeAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(102, 0, 51)));
        BtnChangeAdmin.setPreferredSize(new java.awt.Dimension(21, 0));
        BtnChangeAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnChangeAdminMouseClicked(evt);
            }
        });
        BtnChangeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChangeAdminActionPerformed(evt);
            }
        });
        jPanel3.add(BtnChangeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 150, 30));

        btnAddRoom.setText("Add Room's");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, 30));

        LogoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        LogoPanel.setLayout(new java.awt.BorderLayout());

        imagepanel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        imagepanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagepanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/about_icon.jpg"))); // NOI18N
        imagepanel.setOpaque(true);
        LogoPanel.add(imagepanel, java.awt.BorderLayout.CENTER);

        jPanel3.add(LogoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 240));

        RoomsPanel.setBackground(new java.awt.Color(102, 255, 153));
        RoomsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel8.setText("TOTAL ROOMS IN HOSTEL");

        RoomCount.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        RoomCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomCount.setText("00");
        RoomCount.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout RoomsPanelLayout = new javax.swing.GroupLayout(RoomsPanel);
        RoomsPanel.setLayout(RoomsPanelLayout);
        RoomsPanelLayout.setHorizontalGroup(
            RoomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RoomCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        RoomsPanelLayout.setVerticalGroup(
            RoomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsPanelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoomCount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(RoomsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 220, 100));

        BuildingPanel.setBackground(new java.awt.Color(255, 102, 153));
        BuildingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TOTAL BUILDINGS IN HOSTEL");

        BuilbingCount.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        BuilbingCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuilbingCount.setText("00");
        BuilbingCount.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BuilbingCount.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout BuildingPanelLayout = new javax.swing.GroupLayout(BuildingPanel);
        BuildingPanel.setLayout(BuildingPanelLayout);
        BuildingPanelLayout.setHorizontalGroup(
            BuildingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuilbingCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BuildingPanelLayout.setVerticalGroup(
            BuildingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildingPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuilbingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(BuildingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 220, 100));

        BedsPanel.setBackground(new java.awt.Color(102, 153, 255));
        BedsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TOTAL BEDS IN HOSTEL");

        BedsCount.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        BedsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BedsCount.setText("00");
        BedsCount.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout BedsPanelLayout = new javax.swing.GroupLayout(BedsPanel);
        BedsPanel.setLayout(BedsPanelLayout);
        BedsPanelLayout.setHorizontalGroup(
            BedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BedsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(BedsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BedsPanelLayout.setVerticalGroup(
            BedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BedsPanelLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BedsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(BedsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 210, 100));

        btnCancle.setBackground(new java.awt.Color(255, 255, 102));
        btnCancle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCancle.setText("Cancle");
        btnCancle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCancle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancleMouseClicked(evt);
            }
        });
        jPanel3.add(btnCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 190, 40));

        btnSave.setBackground(new java.awt.Color(255, 255, 102));
        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSave.setText("Save Info");
        btnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 190, 40));

        ViewAbmin.setBackground(new java.awt.Color(0, 255, 153));
        ViewAbmin.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        ViewAbmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAbmin.setText("username");
        ViewAbmin.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ViewAbmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ViewAbmin.setOpaque(true);
        jPanel3.add(ViewAbmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 170, 30));

        AdminLabel.setBackground(new java.awt.Color(0, 255, 153));
        AdminLabel.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        AdminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminLabel.setText(" Admine Name :");
        AdminLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AdminLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AdminLabel.setOpaque(true);
        jPanel3.add(AdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 160, 30));

        BtnChangePass.setText("Change Password");
        BtnChangePass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(102, 0, 51)));
        BtnChangePass.setPreferredSize(new java.awt.Dimension(21, 0));
        BtnChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnChangePassMouseClicked(evt);
            }
        });
        jPanel3.add(BtnChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 150, 30));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        AdmineFlooter.setBackground(new java.awt.Color(153, 255, 204));
        AdmineFlooter.setMaximumSize(new java.awt.Dimension(32767, 32));
        AdmineFlooter.setMinimumSize(new java.awt.Dimension(0, 30));
        AdmineFlooter.setPreferredSize(new java.awt.Dimension(1207, 30));

        javax.swing.GroupLayout AdmineFlooterLayout = new javax.swing.GroupLayout(AdmineFlooter);
        AdmineFlooter.setLayout(AdmineFlooterLayout);
        AdmineFlooterLayout.setHorizontalGroup(
            AdmineFlooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        AdmineFlooterLayout.setVerticalGroup(
            AdmineFlooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(AdmineFlooter, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBuildingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBuildingActionPerformed
        try{
        AdminLoginWindow.Building = Integer.parseInt(JOptionPane.showInputDialog("Enter Total Numbers of buildings In your Hostel !!!\n\n"));
        JOptionPane.showMessageDialog(null,"Yoy are Sure You want to add "+AdminLoginWindow.Building+" Buildings");
        BuilbingCount.setText("0"+AdminLoginWindow.Building);
        }catch (Exception e){}
       finally{
        BuilbingCount.setText("0"+AdminLoginWindow.Building);
           
       }
    }//GEN-LAST:event_btnAddBuildingActionPerformed

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
       try{
            AdminLoginWindow.Rooms = AdminLoginWindow.Building*Integer.parseInt(JOptionPane.showInputDialog("Enter Total Numbers of Rooms in your Single Building !!!\n\n"));
            int total=(AdminLoginWindow.Rooms);
            JOptionPane.showMessageDialog(null,"You are Sure You want to add "+total+" Roomes");
//            
       }catch (Exception e){}
       finally{
        RoomCount.setText("0"+AdminLoginWindow.Rooms);
           
       }
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void btnAddBedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBedsActionPerformed
        try{
        AdminLoginWindow.Beds = Integer.parseInt(JOptionPane.showInputDialog("Enter Total Numbers of Beds !!!\n\n"));
        JOptionPane.showMessageDialog(null,"You are Sure You want to add "+AdminLoginWindow.Beds+" Beds in the Hostel !!!");
        BedsCount.setText("0"+AdminLoginWindow.Beds);
        }catch (Exception e){}
       finally{
        BedsCount.setText("0"+AdminLoginWindow.Beds);
           
       }
    }//GEN-LAST:event_btnAddBedsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        Home.updateinfo();
        JOptionPane.showMessageDialog(null,"Your information is add successfully.");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancleMouseClicked
        
        this.dispose();
    }//GEN-LAST:event_btnCancleMouseClicked

    private void BtnChangeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChangeAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnChangeAdminActionPerformed

    private void BtnChangeUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnChangeUserMouseClicked
        AdminLoginWindow.UserName = ""+JOptionPane.showInputDialog("Enter The UserName \n\n");
        ViewUsNLabel.setText(AdminLoginWindow.UserName);
    }//GEN-LAST:event_BtnChangeUserMouseClicked

    private void BtnChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnChangePassMouseClicked
        // TODO add your handling code here:
        AdminLoginWindow.Password = ""+JOptionPane.showInputDialog("Enter The Password \n\n");
        ViewpassLabel.setText(AdminLoginWindow.Password);
    }//GEN-LAST:event_BtnChangePassMouseClicked

    private void BtnChangeAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnChangeAdminMouseClicked
        // TODO add your handling code here:
        AdmineName = ""+JOptionPane.showInputDialog("Enter The Admine's Name \n\n");
        ViewAbmin.setText(AdmineName);
    }//GEN-LAST:event_BtnChangeAdminMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JPanel AdmineFlooter;
    private javax.swing.JLabel AdmineHeader;
    private javax.swing.JLabel BedsCount;
    private javax.swing.JPanel BedsPanel;
    private javax.swing.JButton BtnChangeAdmin;
    private javax.swing.JButton BtnChangePass;
    private javax.swing.JButton BtnChangeUser;
    private javax.swing.JLabel BuilbingCount;
    private javax.swing.JPanel BuildingPanel;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel RoomCount;
    private javax.swing.JPanel RoomsPanel;
    private javax.swing.JLabel UsrNLabel;
    private javax.swing.JLabel ViewAbmin;
    private javax.swing.JLabel ViewUsNLabel;
    private javax.swing.JLabel ViewpassLabel;
    private javax.swing.JButton btnAddBeds;
    private javax.swing.JButton btnAddBuilding;
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel imagepanel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void setVisiable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
