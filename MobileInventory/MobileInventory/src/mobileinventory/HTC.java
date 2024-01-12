package mobileinventory;

import javax.swing.JOptionPane;

public class HTC extends javax.swing.JFrame {

    /**
     * Creates new form HTC
     */
    public HTC() {
        initComponents();
    }

    String HTCultra[]={"Name:HTC U ULTRA ","Screen size (inches):5.7","Touchscreen:Yes","Resolution:1440 x 2560 pixels",
                     "RAM:4GB","CPU:Quad-core (2x2.15 GHz Kryo & 2x1.6 GHz Kryo)","Price:Rs. 79,000 "};
    String HTC10[]={"Name:HTC 10 ","Screen size (inches):5.2","Touchscreen:Yes","Resolution:1440 x 2560 pixels",
                     "RAM:4GB","CPU:Quad-core (2x2.15 GHz Kryo & 2x1.6 GHz Kryo) ","Price:Rs. 57,000 "};
    String HTConea9[]={"Name:HTC ONE A9 ","Screen size (inches):5.0","Touchscreen:Yes","Resolution:1080 x 1920 pixels ",
                     "RAM:3GB","CPU:Quad-core (2x2.15 GHz Kryo & 2x1.6 GHz Kryo) ","Price:Rs. 51,000 "};
    String HTConex9[]={"Name:HTC ONE X9 ","Screen size (inches):5.5","Touchscreen:Yes","Resolution:1080 x 1920 pixels ",
                     "RAM:3GB","CPU:Octa-core Cortex-A53 ","Price:Rs. 38,000 "};
    String HTC10lifestyle[]={"Name:HTC 10 Lifestyle ","Screen size (inches):5.5","Touchscreen:Yes","Resolution:720 x 1280 pixels ",
                     "RAM:3GB","CPU:Quad-core 1.4 GHz Cortex-A7 ","Price:Rs. 22,500 "};
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        s1 = new javax.swing.JButton();
        s1_bt = new javax.swing.JButton();
        s2 = new javax.swing.JButton();
        s2_bt = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        s3_bt = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        s4_bt = new javax.swing.JButton();
        s5 = new javax.swing.JButton();
        s5_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HTC");
        setResizable(false);
        getContentPane().setLayout(null);

        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/71-v5hbcM6L._SX569_.jpg"))); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1);
        s1.setBounds(40, 40, 250, 350);

        s1_bt.setText("HTC U ULTRA");
        s1_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_btActionPerformed(evt);
            }
        });
        getContentPane().add(s1_bt);
        s1_bt.setBounds(70, 430, 180, 25);

        s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HTC10b.gif"))); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        getContentPane().add(s2);
        s2.setBounds(330, 40, 180, 350);

        s2_bt.setText("HTC 10");
        s2_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_btActionPerformed(evt);
            }
        });
        getContentPane().add(s2_bt);
        s2_bt.setBounds(330, 430, 180, 25);

        s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/item_XL_9468144_10591530.jpg"))); // NOI18N
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        getContentPane().add(s3);
        s3.setBounds(560, 40, 220, 350);

        s3_bt.setText("HTC ONE A9");
        s3_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_btActionPerformed(evt);
            }
        });
        getContentPane().add(s3_bt);
        s3_bt.setBounds(580, 430, 190, 25);

        s4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MP 00412-570x760.jpg"))); // NOI18N
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4);
        s4.setBounds(140, 500, 240, 350);

        s4_bt.setText("HTC ONE x9");
        s4_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4_btActionPerformed(evt);
            }
        });
        getContentPane().add(s4_bt);
        s4_bt.setBounds(160, 890, 210, 30);

        s5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HTC-Desire-10-Lifestyle-257x350.jpg"))); // NOI18N
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        getContentPane().add(s5);
        s5.setBounds(440, 500, 250, 340);

        s5_bt.setText("HTC 10 Lifestyle");
        s5_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5_btActionPerformed(evt);
            }
        });
        getContentPane().add(s5_bt);
        s5_bt.setBounds(460, 890, 210, 30);

        setSize(new java.awt.Dimension(848, 989));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void HTCUltra(){
         String a[] = null;
        for(int i=0;i<HTCultra.length;i++){
         a=HTCultra;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    public void HTCten(){
         String a[] = null;
        for(int i=0;i<HTC10.length;i++){
         a=HTC10;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    public void HTCOneA9(){
         String a[] = null;
        for(int i=0;i<HTConea9.length;i++){
         a=HTConea9;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    public void HTCOnex9(){
         String a[] = null;
        for(int i=0;i<HTConex9.length;i++){
         a=HTConex9;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    public void HTC10Lifestyle(){
         String a[] = null;
        for(int i=0;i<HTC10lifestyle.length;i++){
         a=HTC10lifestyle;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
           HTCUltra();
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        HTCten();
    }//GEN-LAST:event_s2ActionPerformed

    private void s1_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_btActionPerformed
        HTCUltra();
    }//GEN-LAST:event_s1_btActionPerformed

    private void s2_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_btActionPerformed
        HTCten();
    }//GEN-LAST:event_s2_btActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
         HTCOneA9();
    }//GEN-LAST:event_s3ActionPerformed

    private void s3_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_btActionPerformed
         HTCOneA9();
    }//GEN-LAST:event_s3_btActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        HTCOnex9();
    }//GEN-LAST:event_s4ActionPerformed

    private void s4_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4_btActionPerformed
        HTCOnex9();
    }//GEN-LAST:event_s4_btActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        HTC10Lifestyle();
    }//GEN-LAST:event_s5ActionPerformed

    private void s5_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5_btActionPerformed
        HTC10Lifestyle();
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
            java.util.logging.Logger.getLogger(HTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HTC().setVisible(true);
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
