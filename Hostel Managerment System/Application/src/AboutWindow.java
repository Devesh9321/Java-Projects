
public class AboutWindow extends javax.swing.JInternalFrame {


    public AboutWindow() {
        initComponents();
       AboutBox.enableInputMethods(false);
        
    }
    public static void updateAbout(String e){
         AboutBox.setText(e);
         AboutBox.updateUI();
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HostelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BtnEditAboutInfo = new javax.swing.JButton();
        BtnCancle = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AboutBox = new javax.swing.JTextArea();

        HostelTitle.setBackground(new java.awt.Color(255, 102, 255));
        HostelTitle.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        HostelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HostelTitle.setText("Hostel Title");
        HostelTitle.setOpaque(true);
        HostelTitle.setPreferredSize(new java.awt.Dimension(59, 70));
        getContentPane().add(HostelTitle, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 32));

        BtnEditAboutInfo.setText("Update Info");
        BtnEditAboutInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditAboutInfoMouseClicked(evt);
            }
        });

        BtnCancle.setText("Cancle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(770, Short.MAX_VALUE)
                .addComponent(BtnEditAboutInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditAboutInfo)
                    .addComponent(BtnCancle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        AboutBox.setColumns(20);
        AboutBox.setRows(5);
        AboutBox.setText("\t                                      \t\tMICROPROJECT  GROUP NO 8\n\n\n   \t     \tNAME \t\t\t\tID  CODE\n  \t\t\n\t\t1)Prarthana Kamble\t\t\t20CM028\n \t\t2)Mandar Lakhe\t\t\t20CM031\n  \t\t3)Devesh Patil\t\t\t\t20CM041\n  \t\t4)Nikita Suple\t\t\t\t20CM055\n  \t\t5)Madan Vaidya\t\t\t20CM060 \n  \t\t6)Vishakha Tayade\t\t\t20CM061 ");
        jScrollPane1.setViewportView(AboutBox);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditAboutInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditAboutInfoMouseClicked
        // TODO add your handling code here:
        TakeInputAbout obj = new TakeInputAbout();
        obj.setVisible(true);
        
        
    }//GEN-LAST:event_BtnEditAboutInfoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea AboutBox;
    private javax.swing.JButton BtnCancle;
    private javax.swing.JButton BtnEditAboutInfo;
    private javax.swing.JLabel HostelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
