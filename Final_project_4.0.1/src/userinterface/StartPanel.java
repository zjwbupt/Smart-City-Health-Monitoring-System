/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author cestdrama
 */
public class StartPanel extends javax.swing.JPanel {

    /**
     * Creates new form StartPanel
     */
    private Image img;
    public StartPanel(String imgPath) {
        initComponents();
        img=new ImageIcon(imgPath).getImage();
    }
    
     @Override
    protected void paintComponent(Graphics g) {
        //g.drawImage(img,0,0,null);
        super.paintComponent(g);
        g.drawImage(img,0,0,780,590,this);
        //System.out.println("in right side paintComponent");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
