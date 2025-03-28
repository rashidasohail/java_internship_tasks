/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinghub;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Rashda Khanzada
 */
public class mobiles extends javax.swing.JFrame {

    /**
     * Creates new form mobiles
     */
   Connection conn;
   PreparedStatement param;
   ResultSet rs;
    public mobiles() {
        initComponents();
         conn=ConnectionDB.ConnectDb();
                update();
    }
     String sql;
    public void update(){
      try{
            sql="select * from mobiles order by  product_no asc";
            param=conn.prepareStatement(sql);
            rs=param.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));    
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        location_tf = new javax.swing.JTextField();
        price_tf = new javax.swing.JTextField();
        image_lb = new javax.swing.JLabel();
        image_button = new javax.swing.JButton();
        image_button1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\"Mobiles\"");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Location");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 100, 100, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Price");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 40, 70, 30);

        location_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(location_tf);
        location_tf.setBounds(150, 100, 340, 40);

        price_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(price_tf);
        price_tf.setBounds(150, 40, 80, 40);
        getContentPane().add(image_lb);
        image_lb.setBounds(90, 170, 180, 200);

        image_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        image_button.setText("Submit");
        image_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(image_button);
        image_button.setBounds(280, 440, 130, 30);

        image_button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        image_button1.setText("Mobile Image");
        image_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image_button1ActionPerformed(evt);
            }
        });
        getContentPane().add(image_button1);
        image_button1.setBounds(90, 390, 180, 30);

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_no", "Price", "Location", "Picture"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 50, 452, 360);

        setSize(new java.awt.Dimension(1023, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     File f; 
    ImageIcon icon;
  
    private void image_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image_button1ActionPerformed
       BufferedImage image = null;
        try{
            JFileChooser choose=new JFileChooser();
            choose.showOpenDialog(null);
            f=choose.getSelectedFile();
            String filename=f.getAbsolutePath();   
            image = ImageIO.read(new File(filename));
            icon=new ImageIcon(fitimage(image,image_lb.getWidth(),image_lb.getHeight()));
            image_lb.setIcon(icon);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_image_button1ActionPerformed

    private void image_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image_buttonActionPerformed
         int price=Integer.parseInt(price_tf.getText());
         String location=location_tf.getText();
         FileInputStream fin = null;
          try {
              fin = new FileInputStream(f); //selected file
          }
          catch (FileNotFoundException ex) {
              Logger.getLogger(electronics_items.class.getName()).log(Level.SEVERE, null, ex);
          }
          int ln=(int) f.length();
          try{
              String sql="INSERT INTO mobiles VALUES (?,?,?,?)";
              param=conn.prepareStatement(sql);
              param.setInt(1,0);
              param.setInt(2,price);
              param.setString(3,location);
              param.setBinaryStream(4, fin, ln);//set the image first the image is converted into bytes then stored in BLOB
 
              int  i=param.executeUpdate();
              if(i>0){
                   JOptionPane.showMessageDialog(null,"Data is inserted");
                   price_tf.setText("");
                   location_tf.setText("");
                   image_lb.setIcon(null);
                   try{
                      sql="select * from mobiles order by  product_no asc";
                      param=conn.prepareStatement(sql);
                      rs=param.executeQuery();
                      table.setModel(DbUtils.resultSetToTableModel(rs));
        
                   }
                   catch(Exception e){
                       JOptionPane.showMessageDialog(null, e.getMessage());
                   }
             }
            else
               JOptionPane.showMessageDialog(null,"Data is not inserted");
         }
         catch(Exception e){
             System.out.println(e);
        }
    }//GEN-LAST:event_image_buttonActionPerformed

      //resize the image according to the label
    private Image fitimage(Image img , int w , int h){
         BufferedImage resizedimage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
         Graphics2D g2 = resizedimage.createGraphics();
         g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
         g2.drawImage(img, 0, 0,w,h,null);
         g2.dispose();
         return resizedimage;
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
            java.util.logging.Logger.getLogger(mobiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mobiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mobiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mobiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mobiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton image_button;
    private javax.swing.JButton image_button1;
    private javax.swing.JLabel image_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location_tf;
    private javax.swing.JTextField price_tf;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
