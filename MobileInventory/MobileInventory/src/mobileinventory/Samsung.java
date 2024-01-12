package mobileinventory;

import javax.swing.JOptionPane;
public class Samsung extends javax.swing.JFrame {

    /**
     * Creates new form Samsung
     */
    public Samsung() {
        initComponents();
    }
    String samsungA20e[]={"Name:Samsung Galaxy A20e","Release date:April 2019","Screen size (inches):5.80","Touchscreen:Yes",
                          "Resolution:720x1560 pixels","Colours:White,Black","Processor:1.35GHz octa-core","Price:29,999"};
    String samsungA10[]={"Name:Samsung Galaxy A10","Release date:February 2019","Screen size (inches):6.20","Touchscreen:Yes",
                          "Resolution:720x1580 pixels","Colours:Red, Blue Black","Processor:octa-core","Price:21,500"};
    String samsungj6[]={"Name:Samsung Galaxy j6+","Release date:September 2018","Screen size (inches):6.00","Touchscreen:Yes",
                          "Resolution:720x1480 pixels","Colours:Black, Grey, Red","Processor:1.4GHz quad-core","Price:30,999"};
    String samsungs9[]={"Name:Samsung Galaxy s9","Release date:March 2018","Screen size (inches):5.80","Touchscreen:Yes",
                          "Resolution:1440x2960 pixels","Colours:Lilac Purple, Midnight Black, Coral Blue",
                          "Processor:octa-core (4x2.7GHz + 4x1.7GHz)","Price:91,000"};
    String samsungNote9[]={"Name:Samsung Galaxy Note 9","Release date:August 2018","Screen size (inches):6.40","Touchscreen:Yes",
                          "Resolution:1440x2960 pixels","Colours:Midnight Black, Metallic Copper, Ocean Blue, Lavender Purple",
                          "Processor:1.7GHz octa-core","Price:139,999"};
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        s2 = new javax.swing.JButton();
        s2_bt = new javax.swing.JButton();
        s1 = new javax.swing.JButton();
        s1_bt = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        s3_bt = new javax.swing.JButton();
        s5 = new javax.swing.JButton();
        s5_bt = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        s4_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAMSUNG");
        setResizable(false);
        getContentPane().setLayout(null);

        s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dede8e34-70b4-40f7-8d69-3d583e3598e7aaaaaaa.jpg"))); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        getContentPane().add(s2);
        s2.setBounds(300, 40, 190, 360);

        s2_bt.setText("SAMSUNG GALAXY A10");
        s2_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_btActionPerformed(evt);
            }
        });
        getContentPane().add(s2_bt);
        s2_bt.setBounds(300, 440, 180, 25);

        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3830b4c1b1f37827ade2c8dd661f2da67dce87be.jpg"))); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1);
        s1.setBounds(40, 40, 220, 350);

        s1_bt.setText("SAMSUNG GALAXY A20e");
        s1_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_btActionPerformed(evt);
            }
        });
        getContentPane().add(s1_bt);
        s1_bt.setBounds(50, 440, 180, 25);

        s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samsung-galaxy-j6-plus-2018-gris-dual-sim-j610f-88016435133201.jpg"))); // NOI18N
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        getContentPane().add(s3);
        s3.setBounds(540, 40, 220, 360);

        s3_bt.setText("Samsung Galaxy j6+");
        s3_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_btActionPerformed(evt);
            }
        });
        getContentPane().add(s3_bt);
        s3_bt.setBounds(560, 440, 190, 25);

        s5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samsung-galaxy-note-9-1024x768.jpg"))); // NOI18N
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        getContentPane().add(s5);
        s5.setBounds(430, 520, 250, 350);

        s5_bt.setText("SAMSUNG GALAXY NOTE 9");
        s5_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5_btActionPerformed(evt);
            }
        });
        getContentPane().add(s5_bt);
        s5_bt.setBounds(450, 900, 210, 30);

        s4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/81x6p5AUMrL._SX522_1.jpg"))); // NOI18N
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4);
        s4.setBounds(110, 520, 260, 350);

        s4_bt.setText("SAMSUNG GALAXY S9");
        s4_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4_btActionPerformed(evt);
            }
        });
        getContentPane().add(s4_bt);
        s4_bt.setBounds(130, 900, 210, 30);

        setSize(new java.awt.Dimension(817, 1006));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void SamsungA20e(){
         String a[] = null;
        for(int i=0;i<samsungA20e.length;i++){
         a=samsungA20e;
      }
      JOptionPane.showMessageDialog(null,a);
     }
     public void SamsungA10(){
         String a[] = null;
        for(int i=0;i<samsungA10.length;i++){
         a=samsungA10;
      }
      JOptionPane.showMessageDialog(null,a);
     }
     public void Samsungj6(){
         String a[] = null;
        for(int i=0;i<samsungj6.length;i++){
         a=samsungj6;
      }
      JOptionPane.showMessageDialog(null,a);
     }
      public void Samsungs9(){
         String a[] = null;
        for(int i=0;i<samsungs9.length;i++){
         a=samsungs9;
      }
      JOptionPane.showMessageDialog(null,a);
     }
       public void SamsungNote9(){
         String a[] = null;
        for(int i=0;i<samsungNote9.length;i++){
         a=samsungNote9;
      }
      JOptionPane.showMessageDialog(null,a);
     }
    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
         SamsungA20e();
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
         SamsungA10();
    }//GEN-LAST:event_s2ActionPerformed

    private void s1_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_btActionPerformed
          SamsungA20e();
    }//GEN-LAST:event_s1_btActionPerformed

    private void s2_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_btActionPerformed
          SamsungA10();
    }//GEN-LAST:event_s2_btActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        Samsungj6();
    }//GEN-LAST:event_s3ActionPerformed

    private void s3_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_btActionPerformed
        Samsungj6();
    }//GEN-LAST:event_s3_btActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        Samsungs9();
    }//GEN-LAST:event_s4ActionPerformed

    private void s4_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4_btActionPerformed
        Samsungs9();
    }//GEN-LAST:event_s4_btActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        SamsungNote9();
    }//GEN-LAST:event_s5ActionPerformed

    private void s5_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5_btActionPerformed
        SamsungNote9();
    }//GEN-LAST:event_s5_btActionPerformed

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
            java.util.logging.Logger.getLogger(Samsung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Samsung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Samsung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Samsung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Samsung().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton s1;
    private javax.swing.JButton s1_bt;
    private javax.swing.JButton s2;
    private javax.swing.JButton s2_bt;
    private javax.swing.JButton s3;
    private javax.swing.JButton s3_bt;
    private javax.swing.JButton s4;
    private javax.swing.JButton s4_bt;
    private javax.swing.JButton s5;
    private javax.swing.JButton s5_bt;
    // End of variables declaration//GEN-END:variables
}
