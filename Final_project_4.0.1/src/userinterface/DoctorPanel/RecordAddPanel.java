/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorPanel;

/**
 *
 * @author prospace
 */

import javax.swing.*;
import Business.*;
import Business.Admin.*;
import Business.DB4OUtil.*;
import Business.Disease.*;
import Business.Doctor.*;
import Business.Enterprise.*;
import Business.Network.*;
import Business.Patient.*;
import Business.Recode.*;
import java.awt.*;
import java.io.File;

import javax.swing.table.DefaultTableModel;
import java.util.*;

public class RecordAddPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecordAddPanel
     */
    
    JPanel rightPanel;
    Doctor doctor;
    File directory = new File("");
    String pex=directory.getAbsolutePath()+"/images/";
    public RecordAddPanel(JPanel rightPanel, Doctor doctor) {
        initComponents();
        this.rightPanel = rightPanel;
        this.doctor = doctor;
        //
         //UI
        ImageIcon icon=new ImageIcon(pex+"doctortitle.png");
        title.setText("");
        title.setIcon(icon);
        initBTN();
    }
    
    //
    public void initBTN(){
        resetButton(AddBtn,
                pex+"add1.png",
                pex+"add2.png");
        resetButton(BackBtn,
                pex+"back1.png",
                pex+"back2.png");
    }
    
     public void resetButton(JButton btn,String path1,String path2){
       ImageIcon img1 = new ImageIcon(path1);
       ImageIcon img2 = new ImageIcon(path2);
      // ImageIcon img3 = new ImageIcon("/Users/cestdrama/Desktop/swg1207/display_pressed.jpg");        
          btn.setText("");
          btn.setSize(img2.getIconWidth(),img2.getIconHeight());
          btn.setContentAreaFilled(false);
          //BTN1.setBorderPainted(false);
          btn.setIcon(img1);
          btn.setPressedIcon(img2); 
          btn.setRolloverIcon(img2);
          //btn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PIDText = new javax.swing.JTextField();
        DisNameText = new javax.swing.JTextField();
        DateText = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        TMText = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        AddBtn.setText("Create");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        title.setText("jLabel4");

        jLabel6.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 102));
        jLabel6.setText(">>>>>Please input the diognosis>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

        jLabel11.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("Treatment:");

        jLabel12.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Patient Id:");

        jLabel13.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Disease name:");

        jLabel14.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setText("Date:");

        jLabel7.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 102));
        jLabel7.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(AddBtn)
                        .addGap(97, 97, 97)
                        .addComponent(BackBtn))
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(PIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(DisNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateText)
                            .addComponent(TMText, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TMText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        String s1 = PIDText.getText();
        String s2 = DisNameText.getText();
        String s3 = DateText.getText();
        String s4 =TMText.getText();
        
        if (s1.equals("")==true||s2.equals("")==true||s3.equals("")==true){
            JOptionPane.showMessageDialog(null, "Information Not Filled");
            return;
        }
        if (Datastore.getInstance().getPatients().containsKey(s1) == false){
            JOptionPane.showMessageDialog(null, "Not This Patient");
            return;
        }
        
        if (Datastore.getInstance().getDiseases().containsKey(s2) == false){
            JOptionPane.showMessageDialog(null, "Unexisted Disease, Have Reported To Lab");
            Disease tmpdis = new Disease(s2,s4,0,0);
            Datastore.getInstance().getDiseases().put(s2, tmpdis);
        }else{
            Disease dis = Datastore.getInstance().getDiseases().get(s2);
            if (dis.getTreatment().contains(s4) != true){
                dis.setTreatment(dis.getTreatment() + " " + s4);
                JOptionPane.showMessageDialog(null, "New TreatMent Have Been Reported To Lab");
            }
        }
        
        Recode tmp = new Recode(s1,doctor.getId(),doctor.getHospital(),s2,s3,Datastore.getInstance().getRecords().size() + 1);
        Hospital tmphos = Datastore.getInstance().getHospitals().get(doctor.getHospital());
        
        System.out.println("~~~~~~~~~~~~~~~~" + tmphos.getRecodeList().getSize() + "~~~~~~~~~~~");
        
        doctor.getRecordHistory().add(tmp);
        tmphos.getRecodeList().add(tmp);
        
        System.out.println("~~~~~~~~~~~~~~~~" + tmphos.getRecodeList().getSize() + "~~~~~~~~~~~");
        
        Datastore.getInstance().getRecords().put(tmp.getID(), tmp);
        JOptionPane.showMessageDialog(null, "Add Successfully");
        
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
        
        Component[] components = rightPanel.getComponents();
        for (Component c : components){
            if (c instanceof DoctorShowPanel){
                DoctorShowPanel panel = (DoctorShowPanel) c;
                panel.populate();
            }
        }
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DateText;
    private javax.swing.JTextField DisNameText;
    private javax.swing.JTextField PIDText;
    private javax.swing.JTextField TMText;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
