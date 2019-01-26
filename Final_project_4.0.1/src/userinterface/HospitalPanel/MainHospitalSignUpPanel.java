/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalPanel;

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

public class MainHospitalSignUpPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainHospitalSignUpPanel
    */
    JPanel rightPanel;
    Hospital hospital;
    File directory = new File("");
    String pex=directory.getAbsolutePath()+"/images/";
    public MainHospitalSignUpPanel(JPanel rightPanel, Hospital hospital) {
        initComponents();
        this.rightPanel = rightPanel;
        this.hospital = hospital;
        populate();
        //UI
        ImageIcon icon=new ImageIcon(pex+"signuptitle.png");
        logintitle.setText("");
        logintitle.setIcon(icon);
        //
        ImageIcon icon1=new ImageIcon(pex+"id.png");
        namelable.setText("");
        namelable.setIcon(icon1);
        //
        ImageIcon icon2=new ImageIcon(pex+"password.png");
        passwdlable.setText("");
        passwdlable.setIcon(icon2);
        passwdlable1.setText("");
        passwdlable1.setIcon(icon2);
        //
        ImageIcon icon3=new ImageIcon(pex+"department.png");
        dplable.setText("");
        dplable.setIcon(icon3);
        initBTN();
    }
    
    public void initBTN(){
        resetButton(SignUpBtn,
                pex+"signup1.png",
                pex+"signup2.png");
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

        UsernameText = new javax.swing.JTextField();
        PWText = new javax.swing.JTextField();
        DPText = new javax.swing.JTextField();
        DepartmentCbx = new javax.swing.JComboBox();
        SignUpBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        logintitle = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namelable = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        passwdlable = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dplable = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        passwdlable1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        SignUpBtn.setText("Sign Up");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        logintitle.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText(">>>>>Please Complete the information below >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

        namelable.setText("jLabel5");

        jLabel11.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 102));
        jLabel11.setText("User name:");

        passwdlable.setText("jLabel5");

        jLabel12.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 102));
        jLabel12.setText("Password:");

        dplable.setText("jLabel5");

        jLabel13.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 102));
        jLabel13.setText("Department:");

        passwdlable1.setText("jLabel5");

        jLabel14.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 102));
        jLabel14.setText("Re-Password:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText(">>>>>Please Complete the information below >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(logintitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(namelable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(passwdlable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12)
                                                .addGap(10, 10, 10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(passwdlable1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(dplable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel13))
                                                    .addComponent(jLabel14))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PWText)
                                    .addComponent(DPText)
                                    .addComponent(DepartmentCbx, 0, 218, Short.MAX_VALUE)))
                            .addComponent(jLabel10))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logintitle)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwdlable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PWText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DPText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwdlable1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dplable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartmentCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populate(){
        DepartmentCbx.removeAllItems();
        DepartmentCbx.addItem("Manage");
        DepartmentCbx.addItem("Lab");
        DepartmentCbx.addItem("Record");
    }
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        // TODO add your handling code here:
        String s1 = UsernameText.getText();
        String s2 = PWText.getText();
        String s3 = DPText.getText();
        String s4 = (String)DepartmentCbx.getSelectedItem();
        if (s1.equals("")==true||s2.equals("")==true||s3.equals("")==true||s4.equals("")==true){
            JOptionPane.showMessageDialog(null, "Information is not filled");
            return;
        }
        if (s2.equals(s3) == false){
            JOptionPane.showMessageDialog(null, "Passwords not same!!!");
            return;
        }
        
        for (HospitalAdmin x : hospital.getAdminList().getList()){
            if (s1.equals(x.getUsername())==true&&s4.equals(x.getDepartment())==true){
                JOptionPane.showMessageDialog(null, "existed username!");
                return;
            }
        }
        
        HospitalAdmin tmp = new HospitalAdmin(s1,s2,hospital.getName(),s4);
        Datastore.getInstance().getHospitalAdmins().put(hospital.getName()+" "+ s4 + " "+tmp.getUsername(), tmp);
        hospital.getAdminList().add(tmp);
        
        JOptionPane.showMessageDialog(null, "Sign Up Successfully!");
        
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
        
    }//GEN-LAST:event_SignUpBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DPText;
    private javax.swing.JComboBox DepartmentCbx;
    private javax.swing.JTextField PWText;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel dplable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logintitle;
    private javax.swing.JLabel namelable;
    private javax.swing.JLabel passwdlable;
    private javax.swing.JLabel passwdlable1;
    // End of variables declaration//GEN-END:variables
}