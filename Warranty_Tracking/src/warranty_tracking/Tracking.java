package warranty_tracking;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rashda Khanzada
 */
public class Tracking extends javax.swing.JFrame {

    /**
     * Creates new form Tracking
     */
   Connection conn;
   PreparedStatement param;
   ResultSet rs;
    public Tracking() {
        initComponents();
         conn=ConnectionDB.ConnectDb();
                update();
    }
    public void update(){
      try{
         String sql="select * from warranty_tracking";
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        searchbar_tf = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        warranty_lb = new javax.swing.JLabel();
        name_lb = new javax.swing.JLabel();
        product_lb = new javax.swing.JLabel();
        date_lb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        insert_button = new javax.swing.JButton();
        serial_tf = new javax.swing.JTextField();
        name_tf = new javax.swing.JTextField();
        product_tf = new javax.swing.JTextField();
        sale_tf = new javax.swing.JTextField();
        warranty_tf = new javax.swing.JTextField();
        IMEI_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\"Warranty Tracking\"");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        searchbar_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchbar_tfKeyPressed(evt);
            }
        });
        jPanel1.add(searchbar_tf);
        searchbar_tf.setBounds(30, 20, 269, 42);

        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-icon.png"))); // NOI18N
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(search_button);
        search_button.setBounds(300, 20, 50, 40);

        jLabel2.setText("Customer Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 80, 120, 30);

        jLabel3.setText("Product Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 120, 120, 30);

        jLabel4.setText("Sale Date:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 160, 120, 30);

        jLabel5.setText("Warranty(End Date):");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 200, 120, 30);
        jPanel1.add(warranty_lb);
        warranty_lb.setBounds(200, 200, 150, 30);
        jPanel1.add(name_lb);
        name_lb.setBounds(200, 80, 150, 30);
        jPanel1.add(product_lb);
        product_lb.setBounds(200, 120, 150, 30);
        jPanel1.add(date_lb);
        date_lb.setBounds(200, 160, 150, 30);

        jTabbedPane1.addTab("Display", jPanel1);

        jPanel2.setLayout(null);

        jLabel1.setText("Warranty :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 170, 130, 16);

        jLabel6.setText("Customer Name  :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 50, 130, 16);

        jLabel7.setText("Product Name  :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 90, 130, 16);

        jLabel8.setText("Sale Date :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 130, 130, 16);

        jLabel9.setText("Serial no :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 250, 90, 16);

        jLabel10.setText("IMEI :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 210, 90, 16);

        insert_button.setText("Insert");
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(insert_button);
        insert_button.setBounds(280, 290, 65, 25);
        jPanel2.add(serial_tf);
        serial_tf.setBounds(180, 250, 170, 30);
        jPanel2.add(name_tf);
        name_tf.setBounds(180, 50, 170, 30);
        jPanel2.add(product_tf);
        product_tf.setBounds(180, 90, 170, 30);
        jPanel2.add(sale_tf);
        sale_tf.setBounds(180, 130, 170, 30);
        jPanel2.add(warranty_tf);
        warranty_tf.setBounds(180, 170, 170, 30);
        jPanel2.add(IMEI_tf);
        IMEI_tf.setBounds(180, 210, 170, 30);

        jTabbedPane1.addTab("Insert", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 400, 350);

        setSize(new java.awt.Dimension(418, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //insert info
    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed
       try {
           SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
           
           String a=name_tf.getText();
           String b=product_tf.getText();
           String c=sale_tf.getText();
           java.util.Date sal_date=format.parse(c);
           long ms=sal_date.getTime();
           java.sql.Date sale_date=new java.sql.Date(ms);
           
           String d=warranty_tf.getText();
           java.util.Date war_date=format.parse(d);
           long msi=war_date.getTime();
           java.sql.Date warr_date=new java.sql.Date(msi);
            
           String e=IMEI_tf.getText();
           String f=serial_tf.getText();
           
           String sql="INSERT INTO warranty_tracking VALUES (?,?,?,?,?,?)";
           param=conn.prepareStatement(sql);
           param.setString(1, f);
           param.setString(2, a);
           param.setString(3, b);
           param.setDate(4, sale_date);
           param.setDate(5, warr_date);
           param.setString(6, e);
           int  i=param.executeUpdate();
            if(i>0){
               JOptionPane.showMessageDialog(null,"Data is inserted");
            }
            else
               JOptionPane.showMessageDialog(null,"Data is not inserted");
            
       } catch (SQLException ex) {
           Logger.getLogger(Tracking.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ParseException ex) {
           Logger.getLogger(Tracking.class.getName()).log(Level.SEVERE, null, ex);
       }
           name_tf.setText("");
           product_tf.setText("");
           sale_tf.setText("");
           warranty_tf.setText("");
           IMEI_tf.setText("");
           serial_tf.setText("");
    }//GEN-LAST:event_insert_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
         String a=searchbar_tf.getText();
         if(checkinfo(a)){
            retrievedata();      
         }
         else
            JOptionPane.showMessageDialog(null,"IMEI/Sno not found");
    }//GEN-LAST:event_search_buttonActionPerformed

    private void searchbar_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbar_tfKeyPressed
         String a=searchbar_tf.getText();
         int obj=evt.getKeyCode();
         if(obj==KeyEvent.VK_ENTER){
            if(checkinfo(a)){
                retrievedata();
             }
              else
                JOptionPane.showMessageDialog(null,"IMEI/Sno not found");
              }
    }//GEN-LAST:event_searchbar_tfKeyPressed
    
     public boolean checkinfo(String a){
          boolean user=false;   
          try {
                String sql="Select * from warranty_tracking where IMEI=? OR SERIAL_NO=?";
                param=conn.prepareStatement(sql);
                param.setString(1, a); 
                param.setString(2, a);
                rs=param.executeQuery();
                if(rs.next()){
                   user=true;      
                }
          } 
          catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
          }
          return user;
 
    }
     //retrive information
      private void retrievedata(){
       try {
       
                String sql="Select * from warranty_tracking";
                rs=param.executeQuery();
                if(rs.next()){  
                     //retrieve info
                        String cus_name=rs.getString(2);
                        String pro_name=rs.getString(3);
                        String sal_date=rs.getDate(4).toString();
                        String war_date=rs.getDate(5).toString();
                       
                      //display info
                      name_lb.setText(cus_name);
                      product_lb.setText(pro_name);
                      date_lb.setText(sal_date);
                      warranty_lb.setText(war_date);
                        
                } 
       }
    catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
    }
 
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
            java.util.logging.Logger.getLogger(Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tracking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IMEI_tf;
    private javax.swing.JLabel date_lb;
    private javax.swing.JButton insert_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel name_lb;
    private javax.swing.JTextField name_tf;
    private javax.swing.JLabel product_lb;
    private javax.swing.JTextField product_tf;
    private javax.swing.JTextField sale_tf;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField searchbar_tf;
    private javax.swing.JTextField serial_tf;
    private javax.swing.JLabel warranty_lb;
    private javax.swing.JTextField warranty_tf;
    // End of variables declaration//GEN-END:variables
}
