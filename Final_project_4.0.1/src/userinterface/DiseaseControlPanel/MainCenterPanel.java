/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DiseaseControlPanel;

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
/**
 *
 * @author prospace
 */
public class MainCenterPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainCenterPanel
     */
    JPanel rightPanel;
    DiseaseCenter disease_center;
    Map<String, Integer> CaseCount = new HashMap();
    File directory = new File("");
    String pex=directory.getAbsolutePath()+"/images/";
    public MainCenterPanel(JPanel rightPanel, DiseaseCenter disease_center) {
        initComponents();
        this.rightPanel = rightPanel;
        this.disease_center = disease_center;
        populate();
        
        //UI
        ImageIcon icon=new ImageIcon(pex+"centertitle.png");
        jLabel1.setText("");
        jLabel1.setIcon(icon);
        initBTN();
    }
    //
     public void initBTN(){
         //
         resetButton(BackBtn,
                pex+"back2.png",
                pex+"back1.png");
         resetButton(AnalyzeBtn,
                pex+"anlz1.png",
                pex+"anlz2.png");
        //
         resetButton(addBTN,
                pex+"add1.png",
                pex+"add2.png");
        resetButton(deleteBTN,
                pex+"delete1.png",
                pex+"delete2.png");
        resetButton(searchBTN,
                pex+"search1.png",
                pex+"search2.png");
        resetButton(updateBTN,
                pex+"update1.png",
                pex+"update2.png");
        resetButton(viewBTN,
                pex+"view1.png",
                pex+"view2.png");
        //
         resetButton(addBTN1,
                pex+"add1.png",
                pex+"add2.png");
        resetButton(deleteBTN1,
                pex+"delete1.png",
                pex+"delete2.png");
        resetButton(searchBTN1,
                pex+"search1.png",
                pex+"search2.png");
        resetButton(updateBTN1,
                pex+"update1.png",
                pex+"update2.png");
        resetButton(viewBTN1,
                pex+"view1.png",
                pex+"view2.png");
        
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
    
    public void populate(){
        CaseCount.clear();
        for (Integer s: Datastore.getInstance().getRecords().keySet() ){
            Recode x = Datastore.getInstance().getRecords().get(s);
            if (CaseCount.containsKey(x.getDisName()) == false){
                CaseCount.put(x.getDisName(), 1);
            }else {
                CaseCount.put(x.getDisName(),CaseCount.get(x.getDisName())+1);
            }
        }
        
        DefaultTableModel dtm = (DefaultTableModel)HospitalTable.getModel();
        dtm.setRowCount(0);
        
        for(Hospital a : disease_center.getHospitalList().getHospitalList()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a;
            row[1] = a.getLocation();
            row[2] = a.getDoctorList().getSize();
            row[3] = a.getRecodeList().getSize();
            dtm.addRow(row);
        }
        
        DefaultTableModel dtm1 = (DefaultTableModel)DiseaseTable.getModel();
        dtm1.setRowCount(0);
        
        for(Disease a : disease_center.getDiseaseList().getList()){
            if (a.getInorder() == 0) continue;
            Object[] row = new Object[dtm1.getColumnCount()];
            row[0] = a;
            row[1] = a.getTreatment();
            if (CaseCount.containsKey(a.getName())==false) row[2] = "0";
            else row[2] = CaseCount.get(a.getName());
            dtm1.addRow(row);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DiseaseTable = new javax.swing.JTable();
        updateBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        viewBTN = new javax.swing.JButton();
        addBTN1 = new javax.swing.JButton();
        deleteBTN1 = new javax.swing.JButton();
        searchBTN1 = new javax.swing.JButton();
        updateBTN1 = new javax.swing.JButton();
        viewBTN1 = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        AnalyzeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 590));

        HospitalTable.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        HospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Location", "Doctors", "Record"
            }
        ));
        HospitalTable.setSelectionBackground(new java.awt.Color(0, 51, 153));
        jScrollPane1.setViewportView(HospitalTable);

        DiseaseTable.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        DiseaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Disease Name", "Treatment", "Cases"
            }
        ));
        DiseaseTable.setSelectionBackground(new java.awt.Color(0, 51, 153));
        jScrollPane2.setViewportView(DiseaseTable);

        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        viewBTN.setText("View");
        viewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTNActionPerformed(evt);
            }
        });

        addBTN1.setText("Add");
        addBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTN1ActionPerformed(evt);
            }
        });

        deleteBTN1.setText("Delete");
        deleteBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTN1ActionPerformed(evt);
            }
        });

        searchBTN1.setText("Search");
        searchBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTN1ActionPerformed(evt);
            }
        });

        updateBTN1.setText("Update");
        updateBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTN1ActionPerformed(evt);
            }
        });

        viewBTN1.setText("View");
        viewBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTN1ActionPerformed(evt);
            }
        });

        BackBtn.setText("<<back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        AnalyzeBtn.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        AnalyzeBtn.setText("Ananlyze");
        AnalyzeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("title");

        jLabel3.setFont(new java.awt.Font("Monaco", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText(">>>>>Hospital List");

        jLabel2.setFont(new java.awt.Font("Monaco", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText(">>>>>Disease List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBTN)
                                .addGap(18, 18, 18)
                                .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateBTN)
                                .addGap(32, 32, 32)
                                .addComponent(viewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(AnalyzeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(addBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBTN1)
                                .addGap(18, 18, 18)
                                .addComponent(searchBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateBTN1)
                                .addGap(30, 30, 30)
                                .addComponent(viewBTN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnalyzeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        HospitalAddPanel hPanel = new HospitalAddPanel(rightPanel,disease_center);
        rightPanel.add("hPanel", hPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_addBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        int selectRow = HospitalTable.getSelectedRow();
        if (selectRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }else {
            Hospital hos = (Hospital) HospitalTable.getValueAt(selectRow, 0);
            if (hos.getDoctorList().getSize() != 0) {
                JOptionPane.showMessageDialog(null, "Still Exist Doctors");
                return;
            }
            disease_center.getHospitalList().del(hos);
            Datastore.getInstance().getHospitals().remove(hos.getName());
            populate();
            JOptionPane.showMessageDialog(null, "Delete Successfully!");
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        HospitalSearchPanel hsPanel = new HospitalSearchPanel(rightPanel,disease_center);
        rightPanel.add("hsPanel", hsPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_searchBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        // TODO add your handling code here:
        int selectRow = HospitalTable.getSelectedRow();
        if (selectRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }else {
            Hospital hos = (Hospital) HospitalTable.getValueAt(selectRow, 0);
            HospitalUpdatePanel hosPanel = new HospitalUpdatePanel(rightPanel,hos);
            rightPanel.add("hosPanel", hosPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void viewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTNActionPerformed
        // TODO add your handling code here:
        int selectRow = HospitalTable.getSelectedRow();
        if (selectRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }else {
            Hospital hos = (Hospital) HospitalTable.getValueAt(selectRow, 0);
            HospitalViewPanel hosPanel = new HospitalViewPanel(rightPanel,hos);
            rightPanel.add("hosPanel", hosPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
    }//GEN-LAST:event_viewBTNActionPerformed

    private void addBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTN1ActionPerformed
        // TODO add your handling code here:
        DiseaseAddPanel DisPanel = new DiseaseAddPanel(rightPanel,disease_center);
        rightPanel.add("DisPanel", DisPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_addBTN1ActionPerformed

    private void deleteBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTN1ActionPerformed
        // TODO add your handling code here:
        int selectRow = DiseaseTable.getSelectedRow();
        if (selectRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }else {
            Disease Dis = (Disease) DiseaseTable.getValueAt(selectRow, 0);
            JOptionPane.showMessageDialog(null, "Delete Successfully");
            Dis.setInorder(0);
            populate();
        }
    }//GEN-LAST:event_deleteBTN1ActionPerformed

    private void searchBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTN1ActionPerformed
        // TODO add your handling code here:
        DiseaseSearchPanel dissPanel = new DiseaseSearchPanel(rightPanel,disease_center);
        rightPanel.add("dissPanel", dissPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_searchBTN1ActionPerformed

    private void updateBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTN1ActionPerformed
        // TODO add your handling code here:
        int selectRow = DiseaseTable.getSelectedRow();
        if (selectRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }else {
            Disease Dis = (Disease) DiseaseTable.getValueAt(selectRow, 0);
            DiseaseUpdatePanel disupPanel = new DiseaseUpdatePanel(rightPanel,Dis);
            rightPanel.add("disupPanel", disupPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
    }//GEN-LAST:event_updateBTN1ActionPerformed

    private void viewBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTN1ActionPerformed
        // TODO add your handling code here:
        int selectRow = DiseaseTable.getSelectedRow();
        if (selectRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }else {
            Disease Dis = (Disease) DiseaseTable.getValueAt(selectRow, 0);
            int tmpCases = 0;
            if (CaseCount.containsKey(Dis.getName())==true) tmpCases = CaseCount.get(Dis.getName());
            DiseaseViewPanel disvPanel = new DiseaseViewPanel(rightPanel, Dis, tmpCases);
            rightPanel.add("disvPanel", disvPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
    }//GEN-LAST:event_viewBTN1ActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void AnalyzeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeBtnActionPerformed
        // TODO add your handling code here:
        AnalyzePanel AzPanel = new AnalyzePanel(rightPanel,disease_center.getDiseaseList());
        rightPanel.add("AzPanel",AzPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_AnalyzeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalyzeBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTable DiseaseTable;
    private javax.swing.JTable HospitalTable;
    private javax.swing.JButton addBTN;
    private javax.swing.JButton addBTN1;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton deleteBTN1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton searchBTN1;
    private javax.swing.JButton updateBTN;
    private javax.swing.JButton updateBTN1;
    private javax.swing.JButton viewBTN;
    private javax.swing.JButton viewBTN1;
    // End of variables declaration//GEN-END:variables
}
