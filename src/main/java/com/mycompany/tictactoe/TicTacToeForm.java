/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe;

import java.awt.Color;
import static java.lang.String.valueOf;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class TicTacToeForm extends javax.swing.JFrame {

    private String startgame = "X";
    
    private int xCount = 0 ;
    
    private int oCount = 0 ;
  
    
    public TicTacToeForm() {
        initComponents();
    }

    private void score(){
       
    txtName1.setText(String.valueOf(xCount));
    txtName2.setText(String.valueOf(oCount)); 
        
    }
    private void Cplayer (){
           if (startgame.equalsIgnoreCase("X")){
            startgame = "O";
        }
        else {
            startgame = "X";
        }
    }
    private void winning(){
        
        String bt1 = jButton1.getText();
        String bt2 = jButton2.getText();
        String bt3 = jButton3.getText();
        String bt4 = jButton4.getText();
        String bt5 = jButton5.getText();
        String bt6 = jButton6.getText();
        String bt7 = jButton7.getText();
        String bt8 = jButton8.getText();
        String bt9 = jButton9.getText();
        
        if (bt1 == "X" && bt2 == "X" && bt3 =="X"){
           
            xCount++;
            score();
            jButton1.setBackground(Color.pink);
            jButton3.setBackground(Color.pink);
            jButton2.setBackground(Color.pink);
         JOptionPane.showMessageDialog(this, "X win the game");
        
        empty();
        }
        
        if (bt4 == "X" && bt5 == "X" && bt6 =="X"){
            
            xCount++;
            score();
            jButton4.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton6.setBackground(Color.pink); 
        JOptionPane.showMessageDialog(this, "X win the game");
        empty();
        }
        if (bt7 == "X" && bt8 == "X" && bt9 =="X"){
            
            xCount++;
            score();
            jButton7.setBackground(Color.pink);
            jButton8.setBackground(Color.pink);
            jButton9.setBackground(Color.pink);
        JOptionPane.showMessageDialog(this, "X win the game");
        empty();
        }
        
        if (bt1 == "X" && bt5 == "X" && bt9 =="X"){
            
            xCount++;
            score();
            jButton1.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton9.setBackground(Color.pink); 
        JOptionPane.showMessageDialog(this, "X win the game");
        empty();}
        
        if (bt3 == "X" && bt5 == "X" && bt7 =="X"){
            
            xCount++;
            score();
            jButton3.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton7.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this, "X win the game"); 
            empty();
        }
        
        if (bt1 == "X" && bt4 == "X" && bt7 =="X"){
            
            xCount++;
            score();
            jButton1.setBackground(Color.pink);
            jButton4.setBackground(Color.pink);
            jButton7.setBackground(Color.pink); 
        JOptionPane.showMessageDialog(this, "X win the game");
        empty();}
        
        if (bt2 == "X" && bt5 == "X" && bt8 =="X"){
           
            xCount++;
            score();
            jButton2.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton8.setBackground(Color.pink); 
         JOptionPane.showMessageDialog(this, "X win the game");
         empty();
        }
        
        if (bt3 == "X" && bt6 == "X" && bt9 =="X"){
           
            xCount++;
            score();
            jButton3.setBackground(Color.pink);
            jButton6.setBackground(Color.pink);
            jButton9.setBackground(Color.pink); 
         JOptionPane.showMessageDialog(this, "X win the game");
        empty();
        }
        
       
            if (bt1 == "O" && bt2 == "O" && bt3 =="O"){
            
            oCount++;
            score();
            jButton1.setBackground(Color.pink);
            jButton3.setBackground(Color.pink);
            jButton2.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this, "O win the game");
            empty();
            }
        
        if (bt4 == "O" && bt5 == "O" && bt6 =="O"){
            
            oCount++;
            score();
            jButton4.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton6.setBackground(Color.pink); 
        JOptionPane.showMessageDialog(this, "O win the game");
        empty();
        }
        
        if (bt7 == "O" && bt8 == "O" && bt9 =="O"){
            
            oCount++;
            score();
            jButton7.setBackground(Color.pink);
            jButton8.setBackground(Color.pink);
            jButton9.setBackground(Color.pink); 
        JOptionPane.showMessageDialog(this, "O win the game");
        empty();
        }
        
        if (bt1 == "O" && bt5 == "O" && bt9 =="O"){
            
            oCount++;
            score();
            jButton1.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton9.setBackground(Color.pink); 
        JOptionPane.showMessageDialog(this, "O win the game");
      empty();
        }
        
        if (bt3 == "O" && bt5 == "O" && bt7 =="O"){
            
            oCount++;
            score();
            jButton3.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton7.setBackground(Color.pink); 
        JOptionPane.showMessageDialog(this, "O win the game");
        empty();
        }
        
        if (bt1 == "O" && bt4 == "O" && bt7 =="O"){
            
            oCount++;
            score();
            jButton1.setBackground(Color.pink);
            jButton4.setBackground(Color.pink);
            jButton7.setBackground(Color.pink); 
        JOptionPane.showMessageDialog(this, "O win the game");
        empty();
        }
        
        if (bt2 == "O" && bt5 == "O" && bt8 =="O"){
           
            oCount++;
            score();
            jButton2.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton8.setBackground(Color.pink); 
            JOptionPane.showMessageDialog(this, "O win the game");
        empty();
        }
        
        if (bt3 == "O" && bt6 == "O" && bt9 =="O"){
            JOptionPane.showMessageDialog(this, "O win the game");
            oCount++;
            score();
            jButton3.setBackground(Color.pink);
            jButton6.setBackground(Color.pink);
            jButton9.setBackground(Color.pink);  
            JOptionPane.showMessageDialog(this, "O win the game");
           empty();
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName1 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btLogOut = new javax.swing.JButton();
        btPlayAgain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName1.setForeground(new java.awt.Color(0, 0, 0));
        txtName1.setText("Name1");

        txtName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName2.setForeground(new java.awt.Color(0, 0, 0));
        txtName2.setText("Name2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tic Tac Toe");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btLogOut.setBackground(new java.awt.Color(204, 204, 204));
        btLogOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLogOut.setForeground(new java.awt.Color(0, 0, 0));
        btLogOut.setText("Log out");
        btLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogOutActionPerformed(evt);
            }
        });

        btPlayAgain.setBackground(new java.awt.Color(204, 204, 204));
        btPlayAgain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btPlayAgain.setForeground(new java.awt.Color(0, 0, 0));
        btPlayAgain.setText("Reset");
        btPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlayAgainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName1)
                            .addComponent(txtName2))
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton2.setForeground(Color.RED);
        }
        else {
            jButton2.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogOutActionPerformed
       StartForm r = new StartForm();
       r.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btLogOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton1.setForeground(Color.RED);
        }
        else {
            jButton1.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jButton3.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton3.setForeground(Color.RED);
        }
        else {
            jButton3.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton4.setForeground(Color.RED);
        }
        else {
            jButton4.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         jButton5.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton5.setForeground(Color.RED);
        }
        else {
            jButton5.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton6.setForeground(Color.RED);
        }
        else {
            jButton6.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton7.setForeground(Color.RED);
        }
        else {
            jButton7.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton8.setForeground(Color.RED);
        }
        else {
            jButton8.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      jButton9.setText (startgame);
        if (startgame.equalsIgnoreCase("X")){
           jButton9.setForeground(Color.RED);
        }
        else {
            jButton9.setForeground(Color.BLUE);
        }
        Cplayer();winning();
    }//GEN-LAST:event_jButton9ActionPerformed
private void empty (){
    jButton1.setText (" ");
         jButton2.setText (" ");
          jButton3.setText (" ");
           jButton5.setText (" ");
            jButton4.setText (" ");
             jButton6.setText (" ");
              jButton7.setText (" ");
               jButton8.setText (" ");
                jButton9.setText (" ");
                jButton1.setBackground(Color.WHITE);
         jButton2.setBackground(Color.WHITE);
          jButton3.setBackground(Color.WHITE);
           jButton5.setBackground(Color.WHITE);
            jButton4.setBackground(Color.WHITE);
             jButton6.setBackground(Color.WHITE);
              jButton7.setBackground(Color.WHITE);
               jButton8.setBackground(Color.WHITE);
                jButton9.setBackground(Color.WHITE);
}
    private void btPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlayAgainActionPerformed
        
        empty ();
        
    }//GEN-LAST:event_btPlayAgainActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogOut;
    private javax.swing.JButton btPlayAgain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtName1;
    private javax.swing.JLabel txtName2;
    // End of variables declaration//GEN-END:variables
}
