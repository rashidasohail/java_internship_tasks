/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficcrimemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashda Khanzada
 */
public class login extends javax.swing.JFrame {
   Connection conn;
   PreparedStatement param;
   ResultSet rs;
   public login() {
        initComponents();
        conn=ConnectionDB.ConnectDb();
        update();
                
    }
    public void update(){
         try{
              String sql="select * from trafficpolice";
              param=conn.prepareStatement(sql);
              rs=param.executeQuery();
    
         }
         catch(Exception e){     
              JOptionPane.showMessageDialog(null, e.getMessage());
         }
         finally{
             try{
                rs.close();
                param.close();    
             }
             catch(Exception e){}}
     }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();
        login_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\"Login\"");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 110, 127, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 40, 127, 48);

        password_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(password_tf);
        password_tf.setBounds(180, 120, 240, 40);

        email_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(email_tf);
        email_tf.setBounds(180, 50, 240, 40);

        register_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        register_button.setText("Register");
        getContentPane().add(register_button);
        register_button.setBounds(170, 280, 120, 40);

        login_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button);
        login_button.setBounds(170, 210, 120, 40);

        setSize(new java.awt.Dimension(484, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        String a=email_tf.getText();
        String b=password_tf.getText();
    
       if(checkuser(a,b)){
           carowner c=new carowner();
           this.hide();
           c.show();
       }
        else{
            JOptionPane.showMessageDialog(null,"register first");
        }
    }//GEN-LAST:event_login_buttonActionPerformed
    //check the existence of user
    public boolean checkuser(String useremail,String userpassword){
        boolean user=false;   
        try{ 
            String sql="Select * from trafficpolice where email=? and password=?";
            param=conn.prepareStatement(sql);
            param.setString(1, useremail);
            param.setString(2, userpassword);
            rs=param.executeQuery();
            if(rs.next()){
               user=true;      
            }
        }
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
           return user;
     
     }
    
     
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField password_tf;
    private javax.swing.JButton register_button;
    // End of variables declaration//GEN-END:variables
}