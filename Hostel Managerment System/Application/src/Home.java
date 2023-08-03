

public class Home extends javax.swing.JInternalFrame {

    public Home() {
        initComponents();

    }

    public static void updateinfo(){
        TitleLabel.setText(AdminLoginWindow.HostelTitle);
        HostelCount.setText("0"+AdminLoginWindow.Building);
        RoomCount.setText("0"+AdminLoginWindow.Rooms);
        BedCount.setText("0"+AdminLoginWindow.Beds);  
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel HostelImage = new javax.swing.JLabel();
        BuildingPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        HostelCount = new javax.swing.JLabel();
        RoomPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        RoomCount = new javax.swing.JLabel();
        BedsPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BedCount = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setMinimumSize(new java.awt.Dimension(1225, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 430));

        HostelImage.setBackground(new java.awt.Color(204, 255, 204));
        HostelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Hostel-Management-System.jpg"))); // NOI18N
        HostelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        HostelImage.setMaximumSize(new java.awt.Dimension(0, 500));
        HostelImage.setMinimumSize(new java.awt.Dimension(0, 300));
        HostelImage.setOpaque(true);
        HostelImage.setPreferredSize(new java.awt.Dimension(1100, 360));
        jPanel2.add(HostelImage);

        BuildingPanel.setBackground(new java.awt.Color(102, 255, 153));
        BuildingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel8.setText("TOTAL Buildings IN HOSTEL");

        HostelCount.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        HostelCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HostelCount.setText("00");
        HostelCount.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout BuildingPanelLayout = new javax.swing.GroupLayout(BuildingPanel);
        BuildingPanel.setLayout(BuildingPanelLayout);
        BuildingPanelLayout.setHorizontalGroup(
            BuildingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HostelCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        BuildingPanelLayout.setVerticalGroup(
            BuildingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildingPanelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(HostelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(BuildingPanel);

        RoomPanel.setBackground(new java.awt.Color(102, 255, 153));
        RoomPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel9.setText("TOTAL Rooms IN HOSTEL");

        RoomCount.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        RoomCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomCount.setText("00");
        RoomCount.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout RoomPanelLayout = new javax.swing.GroupLayout(RoomPanel);
        RoomPanel.setLayout(RoomPanelLayout);
        RoomPanelLayout.setHorizontalGroup(
            RoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(RoomCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        RoomPanelLayout.setVerticalGroup(
            RoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomPanelLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoomCount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(RoomPanel);

        BedsPanel.setBackground(new java.awt.Color(102, 255, 153));
        BedsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel10.setText("TOTAL Beds IN HOSTEL");

        BedCount.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        BedCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BedCount.setText("00");
        BedCount.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout BedsPanelLayout = new javax.swing.GroupLayout(BedsPanel);
        BedsPanel.setLayout(BedsPanelLayout);
        BedsPanelLayout.setHorizontalGroup(
            BedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BedsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(BedCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BedsPanelLayout.setVerticalGroup(
            BedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BedsPanelLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(BedsPanel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        TitleLabel.setBackground(new java.awt.Color(0, 204, 204));
        TitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Hostel title");
        TitleLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TitleLabel.setMaximumSize(new java.awt.Dimension(229, 70));
        TitleLabel.setMinimumSize(new java.awt.Dimension(229, 70));
        TitleLabel.setOpaque(true);
        TitleLabel.setPreferredSize(new java.awt.Dimension(229, 70));
        getContentPane().add(TitleLabel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel BedCount;
    private javax.swing.JPanel BedsPanel;
    private javax.swing.JPanel BuildingPanel;
    private static javax.swing.JLabel HostelCount;
    private static javax.swing.JLabel RoomCount;
    private javax.swing.JPanel RoomPanel;
    public static javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
