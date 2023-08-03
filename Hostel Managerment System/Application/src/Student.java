/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author patil
 */
public class Student extends javax.swing.JInternalFrame {

    public Student() {
        initComponents();
        this.setOpaque(false);
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentLiving1 = new Windows.StudentLiving();

        studentLiving1.setMinimumSize(new java.awt.Dimension(279, 55));
        getContentPane().add(studentLiving1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Windows.StudentLiving studentLiving1;
    // End of variables declaration//GEN-END:variables
}
