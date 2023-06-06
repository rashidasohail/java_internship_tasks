/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_information_system;

import static city_information_system.City_information.combobox1;
import static city_information_system.City_information.combobox2;
import static city_information_system.City_information.combobox3;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashda Khanzada
 */
public class info extends javax.swing.JFrame {

    /**
     * Creates new form info
     */
    Connection conn;
    PreparedStatement param;
    ResultSet rs;
    public info() {
        initComponents();
         conn=ConnectionDB.ConnectDb();    
                update();
                retrievedata();
    }
    public void update(){
        try{
           String sql="select * from city_information ";
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

      
    private void retrievedata() {
        String city=(String) combobox2.getSelectedItem();
        String country=(String) combobox1.getSelectedItem();
        String selected=(String) combobox3.getSelectedItem();
        //**************if HOTELS************//
        if(selected.equals("Hotels")){
            try {
                String sql="Select * from city_information where cityname=? and countryname=?";
                param=conn.prepareStatement(sql);
                param.setString(1,city);
                param.setString(2,country);
                rs=param.executeQuery();
                if(rs.next()){ 
                    
                 //hotel1
                 
                 String hotel_name1=rs.getString(3);
                 label2.setText(hotel_name1);
                //set hotel img
                 byte[] hotel_1img=rs.getBytes("HOTEL_IMG1");
                 ImageIcon hotel_1image=new ImageIcon(hotel_1img);
                 Image hotel_1im=hotel_1image.getImage();
                 Image hotel1_img=hotel_1im.getScaledInstance(image2.getWidth(),image2.getHeight(),Image.SCALE_SMOOTH);
                 ImageIcon hotel1_newimage=new ImageIcon(hotel1_img);
                 image2.setIcon(hotel1_newimage);
                                 
                 
                 //hotel2
              
                String hotel_name2=rs.getString(13);
                label1.setText(hotel_name2);
                //set hotel img
                byte[] hotel_2img=rs.getBytes("HOTEL_IMG2");
                ImageIcon hotel_2image=new ImageIcon(hotel_2img);
                Image hotel_2im=hotel_2image.getImage();
                Image hotel2_img=hotel_2im.getScaledInstance(image1.getWidth(),image1.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon hotel2_newimage=new ImageIcon(hotel2_img);
                image1.setIcon(hotel2_newimage);
              
                }     
                
            } catch (SQLException ex) {
                Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
         //**************if Hospitals************//
        if(selected.equals("Hospitals")){
            try {
                String sql="Select * from city_information where cityname=? and countryname=?";
                param=conn.prepareStatement(sql);
                param.setString(1,city);
                param.setString(2,country);
                rs=param.executeQuery();
                if(rs.next()){ 
                    
                 
              //hospital1
              
              String hospital_name1=rs.getString(9);
              label1.setText(hospital_name1);
              
              byte[] hospital_1img=rs.getBytes("HOSPITAL_IMG1");
              ImageIcon hospital_1image=new ImageIcon(hospital_1img);
              Image hospital_1im=hospital_1image.getImage();
              Image hospital1_img=hospital_1im.getScaledInstance(image1.getWidth(),image1.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon hospital1_newimage=new ImageIcon(hospital1_img);
              image1.setIcon(hospital1_newimage);
              
              //hospital2
              
              String hospital_name2=rs.getString(17);
              label2.setText(hospital_name2);
              
              byte[] hospital_2img=rs.getBytes("HOSPITAL_IMG2");
              ImageIcon hospital_2image=new ImageIcon(hospital_2img);
              Image hospital_2im=hospital_2image.getImage();
              Image hospital2_img=hospital_2im.getScaledInstance(image2.getWidth(),image2.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon hospital2_newimage=new ImageIcon(hospital2_img);
              image2.setIcon(hospital2_newimage);
              
                }     
                
            
                
            } catch (SQLException ex) {
                Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
              //**************if Shopping Malls************//
        if(selected.equals("Shopping Malls")){
            try {
                String sql="Select * from city_information where cityname=? and countryname=?";
                param=conn.prepareStatement(sql);
                param.setString(1,city);
                param.setString(2,country);
                rs=param.executeQuery();
                if(rs.next()){ 
                    
                 
                 //mall1
              String mall_name1=rs.getString(5);
              label1.setText(mall_name1);
              
              byte[] mall_1img=rs.getBytes("SHOPPING_IMG1");
              ImageIcon mall_1image=new ImageIcon(mall_1img);
              Image mall_1im=mall_1image.getImage();
              Image mall1_img=mall_1im.getScaledInstance(image1.getWidth(),image1.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon mall1_newimage=new ImageIcon(mall1_img);
              image1.setIcon(mall1_newimage);
              
              //mall2
              String mall_name2=rs.getString(15);
              label2.setText(mall_name2);
              
              byte[] mall_2img=rs.getBytes("SHOPPING_IMG2");
              ImageIcon mall_2image=new ImageIcon(mall_2img);
              Image mall_2im=mall_2image.getImage();
              Image mall2_img=mall_2im.getScaledInstance(image2.getWidth(),image2.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon mall2_newimage=new ImageIcon(mall2_img);
              image2.setIcon(mall2_newimage);
              
                }     
                
            
                
            } catch (SQLException ex) {
                Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
              //**************if Parks************//
        if(selected.equals("Parks")){
            try {
                String sql="Select * from city_information where cityname=? and countryname=?";
                param=conn.prepareStatement(sql);
                param.setString(1,city);
                param.setString(2,country);
                rs=param.executeQuery();
                if(rs.next()){ 
                    
                 
                 //park 1
              
              String park_name1=rs.getString(11);
              label1.setText(park_name1);
              
              byte[] park_1img=rs.getBytes("PARK_IMG1");
              ImageIcon park_1image=new ImageIcon(park_1img);
              Image park_1im=park_1image.getImage();
              Image park1_img=park_1im.getScaledInstance(image1.getWidth(),image1.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon park1_newimage=new ImageIcon(park1_img);
              image1.setIcon(park1_newimage);
              
               //park 2
              
              String park_name2=rs.getString(19);
              label2.setText(park_name2);
              
              byte[] park_2img=rs.getBytes("PARK_IMG2");
              ImageIcon park_2image=new ImageIcon(park_2img);
              Image park_2im=park_2image.getImage();
              Image park2_img=park_2im.getScaledInstance(image2.getWidth(),image2.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon park2_newimage=new ImageIcon(park2_img);
              image2.setIcon(park2_newimage);
              
                }     
                
            
                
            } catch (SQLException ex) {
                Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
        
              //**************if Airport************//
        if(selected.equals("Airports")){
            try {
                String sql="Select * from city_information where cityname=? and countryname=?";
                param=conn.prepareStatement(sql);
                param.setString(1,city);
                param.setString(2,country);
                rs=param.executeQuery();
                if(rs.next()){ 
                  //airport 
              
              String airport_name1=rs.getString(7);
              label1.setText(airport_name1);
              
              byte[] airport_1img=rs.getBytes("AIRPORT_IMG1");
              ImageIcon airport_1image=new ImageIcon(airport_1img);
              Image airport_1im=airport_1image.getImage();
              Image airport1_img=airport_1im.getScaledInstance(image1.getWidth(),image1.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon airport1_newimage=new ImageIcon(airport1_img);
              image1.setIcon(airport1_newimage);      
              
                }     
                
            
                
            } catch (SQLException ex) {
                Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        image2 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(image2);
        image2.setBounds(470, 50, 200, 220);

        label2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(label2);
        label2.setBounds(450, 320, 250, 30);
        getContentPane().add(image1);
        image1.setBounds(70, 50, 200, 220);

        label1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(label1);
        label1.setBounds(50, 320, 240, 30);

        setSize(new java.awt.Dimension(778, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    // End of variables declaration//GEN-END:variables

}
