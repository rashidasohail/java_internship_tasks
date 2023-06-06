/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toe;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashda Khanzada
 */
public class game extends javax.swing.JFrame {
    private String startgame="X";
    private int X_count=0;
    private int o_count=0;
    /**
     * Creates new form game
     */
    public game() {
        initComponents();
       
    }
    
     
    private void score(){
      PlayerX.setText(String.valueOf(X_count));
      Player0.setText(String.valueOf(o_count));
    }
    //choose a player
    private void player(){
       if(startgame.equalsIgnoreCase("X")){
          startgame="0";
       }
       else
          startgame="X";
    }
    //conditions to win
    private void winner(){
       String b2=jButton2.getText();
       String b3=jButton3.getText();
       String b4=jButton4.getText();
       String b7=jButton7.getText();
       String b8=jButton8.getText();
       String b9=jButton9.getText();
       String b12=jButton12.getText();
       String b13=jButton13.getText();
       String b14=jButton14.getText();
       
       if(b2=="X" && b3=="X" && b4=="X"){
           JOptionPane.showMessageDialog(this,"Player X wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           X_count++;
           score();
           jButton2.setBackground(Color.gray);
           jButton3.setBackground(Color.gray);
           jButton4.setBackground(Color.gray);
       }
       if(b2=="0" && b3=="0" && b4=="0"){
           JOptionPane.showMessageDialog(this,"Player 0 wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           o_count++;
           score();
           jButton2.setBackground(Color.gray);
           jButton3.setBackground(Color.gray);
           jButton4.setBackground(Color.gray);
       }
       
       if(b7=="X" && b8=="X" && b9=="X"){
           JOptionPane.showMessageDialog(this,"Player X wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           X_count++;
           score();
           jButton7.setBackground(Color.gray);
           jButton8.setBackground(Color.gray);
           jButton9.setBackground(Color.gray);
       }
       if(b7=="0" && b8=="0" && b9=="0"){
           JOptionPane.showMessageDialog(this,"Player 0 wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           o_count++;
           score();
           jButton7.setBackground(Color.gray);
           jButton8.setBackground(Color.gray);
           jButton9.setBackground(Color.gray);
       }
       
        if(b12=="X" && b13=="X" && b14=="X"){
           JOptionPane.showMessageDialog(this,"Player X wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           X_count++;
           score();
           jButton12.setBackground(Color.gray);
           jButton13.setBackground(Color.gray);
           jButton14.setBackground(Color.gray);
       }
        if(b12=="0" && b13=="0" && b14=="0"){
           JOptionPane.showMessageDialog(this,"Player 0 wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           o_count++;
           score();
           jButton12.setBackground(Color.gray);
           jButton13.setBackground(Color.gray);
           jButton14.setBackground(Color.gray);
       }
        
        if(b2=="X" && b7=="X" && b12=="X"){
           JOptionPane.showMessageDialog(this,"Player X wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           X_count++;
           score();
           jButton2.setBackground(Color.gray);
           jButton7.setBackground(Color.gray);
           jButton12.setBackground(Color.gray);
       }
        if(b2=="0" && b7=="0" && b12=="0"){
           JOptionPane.showMessageDialog(this,"Player 0 wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           o_count++;
           score();
           jButton2.setBackground(Color.gray);
           jButton7.setBackground(Color.gray);
           jButton12.setBackground(Color.gray);
       }
        
        if(b2=="X" && b8=="X" && b14=="X"){
           JOptionPane.showMessageDialog(this,"Player X wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           X_count++;
           score();
           jButton2.setBackground(Color.gray);
           jButton8.setBackground(Color.gray);
           jButton14.setBackground(Color.gray);
       }
        if(b2=="0" && b8=="0" && b14=="0"){
           JOptionPane.showMessageDialog(this,"Player 0 wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           o_count++;
           score();
           jButton2.setBackground(Color.gray);
           jButton8.setBackground(Color.gray);
           jButton14.setBackground(Color.gray);
       }
        
        if(b3=="X" && b8=="X" && b13=="X"){
           JOptionPane.showMessageDialog(this,"Player X wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           X_count++;
           score();
           jButton3.setBackground(Color.gray);
           jButton8.setBackground(Color.gray);
           jButton13.setBackground(Color.gray);
       }
        if(b3=="0" && b8=="0" && b13=="0"){
           JOptionPane.showMessageDialog(this,"Player 0 wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           o_count++;
           score();
           jButton3.setBackground(Color.gray);
           jButton8.setBackground(Color.gray);
           jButton13.setBackground(Color.gray);
       }
        
        if(b4=="X" && b9=="X" && b14=="X"){
           JOptionPane.showMessageDialog(this,"Player X wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           X_count++;
           score();
           jButton4.setBackground(Color.gray);
           jButton9.setBackground(Color.gray);
           jButton14.setBackground(Color.gray);
       }
        if(b4=="0" && b9=="0" && b14=="0"){
           JOptionPane.showMessageDialog(this,"Player 0 wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           o_count++;
           score();
           jButton4.setBackground(Color.gray);
           jButton9.setBackground(Color.gray);
           jButton14.setBackground(Color.gray);
       }
        
         if(b4=="X" && b8=="X" && b12=="X"){
           JOptionPane.showMessageDialog(this,"Player X wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           X_count++;
           score();
           jButton4.setBackground(Color.gray);
           jButton8.setBackground(Color.gray);
           jButton12.setBackground(Color.gray);
       }
        if(b4=="0" && b8=="0" && b12=="0"){
           JOptionPane.showMessageDialog(this,"Player 0 wins","Tick Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           o_count++;
           score();
           jButton4.setBackground(Color.gray);
           jButton8.setBackground(Color.gray);
           jButton12.setBackground(Color.gray);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        PlayerX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Player0 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        reset_button = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        exit_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Player X");
        jPanel7.add(jLabel17, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        PlayerX.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(PlayerX, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Player 0");
        jPanel12.add(jLabel18, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        Player0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Player0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Player0, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton14, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        reset_button.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        reset_button.setText("RESET");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });
        jPanel17.add(reset_button, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        exit_button.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        exit_button.setText("EXIT");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        jPanel18.add(exit_button, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 80, 670, 400);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(51, 0, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("              TIC TAC TOE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 0, 670, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 510);

        setSize(new java.awt.Dimension(722, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
       jButton2.setText("");
       jButton3.setText("");
       jButton4.setText("");
       jButton7.setText("");
       jButton8.setText("");
       jButton9.setText("");
       jButton12.setText("");
       jButton13.setText("");
       jButton14.setText("");
       
       jButton2.setBackground(Color.lightGray);
       jButton3.setBackground(Color.lightGray);
       jButton4.setBackground(Color.lightGray);
       jButton7.setBackground(Color.lightGray);  
       jButton8.setBackground(Color.lightGray);
       jButton9.setBackground(Color.lightGray);
       jButton12.setBackground(Color.lightGray);
       jButton13.setBackground(Color.lightGray);
       jButton14.setBackground(Color.lightGray);
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "DO YOU WANT TO EXIT?","tic tac toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
              {System.exit(0);}
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jButton2.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton2.setForeground(Color.BLACK);
       }
           
       else
           jButton2.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jButton3.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton3.setForeground(Color.BLACK);
       }
           
       else
           jButton3.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton4.setForeground(Color.BLACK);
       }
           
       else
           jButton4.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton7.setForeground(Color.BLACK);
       }
           
       else
           jButton7.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton8.setForeground(Color.BLACK);
       }
           
       else
           jButton8.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton9.setForeground(Color.BLACK);
       }
           
       else
           jButton9.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton12.setForeground(Color.BLACK);
       }
           
       else
           jButton12.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton13.setForeground(Color.BLACK);
       }
           
       else
           jButton13.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       jButton14.setText(startgame);
       if(startgame.equalsIgnoreCase("X")){
           jButton14.setForeground(Color.BLACK);
       }
           
       else
           jButton14.setForeground(Color.blue);
        player();
        winner();
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Player0;
    private javax.swing.JLabel PlayerX;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton reset_button;
    // End of variables declaration//GEN-END:variables

    
}
