/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficcrimemanagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashda Khanzada
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
   Connection conn;
   PreparedStatement param;
   ResultSet rs;
    public Registration() {
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
         catch(Exception e){}
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RadioButton2 = new javax.swing.JRadioButton();
        RadioButton1 = new javax.swing.JRadioButton();
        phone_tf = new javax.swing.JTextField();
        name_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        password_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        image_lb = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\"Registration\"");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gender");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 290, 130, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 50, 130, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 110, 130, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 170, 130, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 230, 130, 40);

        buttonGroup1.add(RadioButton2);
        RadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RadioButton2.setText("Female");
        RadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButton2);
        RadioButton2.setBounds(180, 340, 107, 25);

        buttonGroup1.add(RadioButton1);
        RadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RadioButton1.setText("Male");
        RadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButton1);
        RadioButton1.setBounds(180, 300, 71, 33);

        phone_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(phone_tf);
        phone_tf.setBounds(210, 240, 210, 40);

        name_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(name_tf);
        name_tf.setBounds(210, 60, 210, 40);

        email_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(email_tf);
        email_tf.setBounds(210, 120, 210, 40);

        password_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(password_tf);
        password_tf.setBounds(210, 180, 210, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 590, 147, 40);
        getContentPane().add(image_lb);
        image_lb.setBounds(250, 380, 180, 180);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Insert Picture");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 380, 147, 40);

        setSize(new java.awt.Dimension(504, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String a=name_tf.getText();
          String b=email_tf.getText();
          String c=password_tf.getText();
          String d=phone_tf.getText(); 

          FileInputStream fin = null;
          try {
           fin = new FileInputStream(f); //selected file
          } catch (FileNotFoundException ex) {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          int ln=(int) f.length();
          //check whether the email pattern is valid  
          if(emailvalidation(b)){
             
          try{
          String sql="INSERT INTO trafficpolice VALUES (?,?,?,?,?,?)";

           param=conn.prepareStatement(sql);
          // param.setString(1,a);
           param.setString(1,a);
           param.setString(2,b);
           param.setString(3,c);
           param.setString(4,d);
           param.setString(5,gender);
           param.setBinaryStream(6, fin, ln);//set the image first the image is converted into bytes then stored in BLOB
 
           int  i=param.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null,"Data is inserted");
            }
           else
               JOptionPane.showMessageDialog(null,"Data is not inserted");
 
      }
      catch(Exception e){
           System.out.println(e);
       }
        //back to the login page
        login log=new login();
        this.hide();
        log.show();  
        }
           else{
            JOptionPane.showMessageDialog(null, "invalid pattern");
          }
          
    }//GEN-LAST:event_jButton1ActionPerformed
    String gender;
    private void RadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton1ActionPerformed
      gender="Male";
    }//GEN-LAST:event_RadioButton1ActionPerformed

    private void RadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton2ActionPerformed
       gender="Female";
    }//GEN-LAST:event_RadioButton2ActionPerformed
    File f; 
    //Select the image
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
             JFileChooser choose=new JFileChooser();
             choose.showOpenDialog(null);
             f=choose.getSelectedFile();
             String filename=f.getAbsolutePath();
     
             ImageIcon icon=new ImageIcon(filename);
             image_lb.setIcon(icon);
          }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    //check email validation
    public boolean emailvalidation(String mail){
           String regex = "^(.+)@(.+)$";
           Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(mail);
           return matcher.find();
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel image_lb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField password_tf;
    private javax.swing.JTextField phone_tf;
    // End of variables declaration//GEN-END:variables
}
