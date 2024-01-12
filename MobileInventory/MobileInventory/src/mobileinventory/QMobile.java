package mobileinventory;

import javax.swing.JOptionPane;
public class QMobile extends javax.swing.JFrame {

    /**
     * Creates new form QMobile
     */
    public QMobile() {
        initComponents();
    }
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
        setTitle("QMobile");
        setResizable(false);
        getContentPane().setLayout(null);

        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qmobile-noir-z14-specifications-and-price-in-pakistan1.jpg"))); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1);
        s1.setBounds(40, 40, 220, 350);

        s1_bt.setText("QMOBILE NOIR Z14");
        s1_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_btActionPerformed(evt);
            }
        });
        getContentPane().add(s1_bt);
        s1_bt.setBounds(60, 440, 180, 25);

        s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Z9Plusb.gif"))); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        getContentPane().add(s2);
        s2.setBounds(310, 41, 180, 359);

        s2_bt.setText("QMOBILE Z9 PLUS");
        s2_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_btActionPerformed(evt);
            }
        });
        getContentPane().add(s2_bt);
        s2_bt.setBounds(310, 440, 180, 25);

        s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8c4fece5d1-q-infinity-e-image-01.png"))); // NOI18N
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        getContentPane().add(s3);
        s3.setBounds(540, 40, 220, 350);

        s3_bt.setText("QMOBILE Q INFINITY PRIME");
        s3_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_btActionPerformed(evt);
            }
        });
        getContentPane().add(s3_bt);
        s3_bt.setBounds(550, 440, 200, 25);

        s4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QMobile_M6.jpg"))); // NOI18N
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4);
        s4.setBounds(70, 520, 310, 350);

        s4_bt.setText("QMOBILE NOIR M6");
        s4_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4_btActionPerformed(evt);
            }
        });
        getContentPane().add(s4_bt);
        s4_bt.setBounds(110, 900, 210, 30);

        s5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qmobile-2658-4136245-2-zoom-1-600x600.jpg"))); // NOI18N
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        getContentPane().add(s5);
        s5.setBounds(440, 520, 290, 350);

        s5_bt.setText("QMOBILE NOIR E8");
        s5_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5_btActionPerformed(evt);
            }
        });
        getContentPane().add(s5_bt);
        s5_bt.setBounds(490, 900, 210, 30);

        setSize(new java.awt.Dimension(810, 1001));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String Qnoirz14[]={"Name:QMobile Noir Z14 ","Screen size (inches):5.5","Touchscreen:Yes","Resolution:1080 x 1920 pixels",
                       "Colours:Gold, Silver","Processor:Octa-core 1.8 GHz","Price:Rs. 20,500"};
    String Qz9plus[]={"Name:QMobile Z9 Plus ","Screen size (inches):5.5","Touchscreen:Yes","Camera:5 MP","Colours:Various",
                       "Processor:1.3 GHZ Octa-Core","Price:Rs. 18,300 "};
    String Qinfinity[]={"Name:QMobile QInfinity Prime ","Screen size (inches):5.7","Touchscreen:Yes","Camera:13 MP",
                       "Colours:Black, White","Processor:1.3 Ghz Quad Core","Price:Rs. 18,000 "};
    String Qnoirm6[]={"Name:QMobile Noir M6 ","Screen size (inches):5.5","Touchscreen:Yes","Camera:13 MP",
                       "Colours:Gold, Mocha Gold","Processor:2.0 GHZ Octa-Core ","Price:Rs. 19,300 "};
    String QnoirE8[]={"Name:QMobile Noir E8 ","Screen size (inches):6.0","Touchscreen:Yes","Resolution:1440 x 2560 pixels",
                       "Colours:Gold, Mocha Gold","Processor:Octa-core 2.0 GHz  ","Price:Rs. 24,800 "};
    public void QNoirz14(){
         String a[] = null;
        for(int i=0;i<Qnoirz14.length;i++){
         a=Qnoirz14;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
     public void QZ9plus(){
         String a[] = null;
        for(int i=0;i<Qz9plus.length;i++){
         a=Qz9plus;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
     public void QInfinity(){
         String a[] = null;
         for(int i=0;i<Qinfinity.length;i++){
          a=Qinfinity;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
     public void QNoirm6(){
         String a[] = null;
        for(int i=0;i<Qnoirm6.length;i++){
         a=Qnoirm6;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
     public void QNoirE8(){
         String a[] = null;
        for(int i=0;i<QnoirE8.length;i++){
         a=QnoirE8;
      }      
      JOptionPane.showMessageDialog(null,a);
     }
     
    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
            QNoirz14();
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
            QZ9plus();
    }//GEN-LAST:event_s2ActionPerformed

    private void s1_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_btActionPerformed
            QNoirz14();
    }//GEN-LAST:event_s1_btActionPerformed

    private void s2_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_btActionPerformed
             QZ9plus();
    }//GEN-LAST:event_s2_btActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
            QInfinity();
    }//GEN-LAST:event_s3ActionPerformed

    private void s3_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_btActionPerformed
            QInfinity();
    }//GEN-LAST:event_s3_btActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
            QNoirm6();
    }//GEN-LAST:event_s4ActionPerformed

    private void s4_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4_btActionPerformed
            QNoirm6();
    }//GEN-LAST:event_s4_btActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
           QNoirE8();
    }//GEN-LAST:event_s5ActionPerformed

    private void s5_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5_btActionPerformed
           QNoirE8();
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
            java.util.logging.Logger.getLogger(QMobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QMobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QMobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QMobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QMobile().setVisible(true);
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
