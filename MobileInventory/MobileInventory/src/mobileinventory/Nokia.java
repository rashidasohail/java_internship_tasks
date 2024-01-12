package mobileinventory;

import javax.swing.JOptionPane;

public class Nokia extends javax.swing.JFrame {

    /**
     * Creates new form Nokia
     */
    public Nokia() {
        initComponents();
    }
    String Nokia9[]={"Name:Nokia 9 ","Screen size (inches):5.9","Touchscreen:Yes","Resolution:1440 x 2960 pixels",
                     "RAM:4GB","Processor:Octa-core 4x2.8 GHz ","Price:Rs. 108,000 "};
    String Nokia8sirocco[]={"Name:Nokia 8 Sirocco ","Screen size (inches):5.5","Touchscreen:Yes","Resolution:1440 x 2560 pixels",
                       "Processor:Octa-core (4x2.5 GHz Kryo & 4x1.8 GHz Kryo) ","Price:Rs. 94,000 "};
    String Nokia8point[]={"Name:Nokia 8.1 ","Screen size (inches):6.18","Touchscreen:Yes","Resolution:1080 x 2280 pixels",
                       "CPU:Octa-core (2x2.2 GHz 360 Gold & 6x1.7 GHz Kryo 360 Silver)","Price:Rs. 69,900 "};
    String Nokia8[]={"Name:Nokia 8 ","Screen size (inches):5.3","Touchscreen:Yes","Resolution:1440 x 2560 pixels",
                       "CPU:Octa-core (4x2.5 GHz Kryo & 4x1.8 GHz Kryo)","Price:Rs. 34,500 "};
    String Nokiax6[]={"Name:Nokia x6 ","Screen size (inches):5.8","Touchscreen:Yes","Resolution:1080 x 2280 pixels",
                       "CPU:Octa-core 1.8 GHz Kryo 260","Price:Rs. 34,000 "};
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
        setTitle("NOKIA");
        setResizable(false);
        getContentPane().setLayout(null);

        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nokia_9-en_int-Recommended.jpg"))); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1);
        s1.setBounds(30, 40, 240, 350);

        s1_bt.setText("NOKIA 9");
        s1_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_btActionPerformed(evt);
            }
        });
        getContentPane().add(s1_bt);
        s1_bt.setBounds(60, 440, 180, 25);

        s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpg"))); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        getContentPane().add(s2);
        s2.setBounds(310, 40, 190, 350);

        s2_bt.setText("NOKIA 8 SIROCCO");
        s2_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_btActionPerformed(evt);
            }
        });
        getContentPane().add(s2_bt);
        s2_bt.setBounds(320, 440, 180, 25);

        s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nokia_8_1-Recommended-Pie.jpg"))); // NOI18N
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        getContentPane().add(s3);
        s3.setBounds(540, 40, 270, 350);

        s3_bt.setText("NOKIA 8.1");
        s3_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_btActionPerformed(evt);
            }
        });
        getContentPane().add(s3_bt);
        s3_bt.setBounds(580, 440, 190, 25);

        s4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65de6638-89ba-4696-be5f-fb2358e89fb1 (1).jpg"))); // NOI18N
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4);
        s4.setBounds(120, 520, 290, 350);

        s4_bt.setText("NOKIA 8");
        s4_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4_btActionPerformed(evt);
            }
        });
        getContentPane().add(s4_bt);
        s4_bt.setBounds(150, 900, 210, 30);

        s5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nokia-X6-2018-1st-425x425.jpg"))); // NOI18N
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        getContentPane().add(s5);
        s5.setBounds(470, 520, 260, 350);

        s5_bt.setText("NOKIA x6");
        s5_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5_btActionPerformed(evt);
            }
        });
        getContentPane().add(s5_bt);
        s5_bt.setBounds(510, 900, 210, 30);

        setSize(new java.awt.Dimension(862, 1001));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void Nokianine(){
         String a[] = null;
        for(int i=0;i<Nokia9.length;i++){
         a=Nokia9;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    public void Nokia8Sirocco(){
         String a[] = null;
        for(int i=0;i<Nokia8sirocco.length;i++){
         a=Nokia8sirocco;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    public void Nokia8Point(){
         String a[] = null;
        for(int i=0;i<Nokia8point.length;i++){
         a=Nokia8point;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    public void Nokiaeight(){
         String a[] = null;
        for(int i=0;i<Nokia8.length;i++){
         a=Nokia8;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    public void NokiaX6(){
         String a[] = null;
        for(int i=0;i<Nokiax6.length;i++){
         a=Nokiax6;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
         Nokianine();
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        Nokia8Sirocco();
    }//GEN-LAST:event_s2ActionPerformed

    private void s1_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_btActionPerformed
         Nokianine();
    }//GEN-LAST:event_s1_btActionPerformed

    private void s2_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_btActionPerformed
        Nokia8Sirocco();
    }//GEN-LAST:event_s2_btActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        Nokia8Point();
    }//GEN-LAST:event_s3ActionPerformed

    private void s3_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_btActionPerformed
        Nokia8Point();
    }//GEN-LAST:event_s3_btActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        Nokiaeight();
    }//GEN-LAST:event_s4ActionPerformed

    private void s4_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4_btActionPerformed
        Nokiaeight();
    }//GEN-LAST:event_s4_btActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        NokiaX6();
    }//GEN-LAST:event_s5ActionPerformed

    private void s5_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5_btActionPerformed
       NokiaX6();
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
            java.util.logging.Logger.getLogger(Nokia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nokia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nokia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nokia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nokia().setVisible(true);
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
