/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_bill_receipt;

import java.util.ArrayList;

/**
 *
 * @author Rashda Khanzada
 */
public class form extends javax.swing.JFrame {
      ArrayList<UserBean> list=new ArrayList<UserBean>();
    /**
     * Creates new form form
     */
    public form() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        netbill_tf = new javax.swing.JTextField();
        id_tf1 = new javax.swing.JTextField();
        num_of_items_tf = new javax.swing.JTextField();
        total_bill_tf = new javax.swing.JTextField();
        discount_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("net bill");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 230, 160, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 30, 110, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("number of items");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 80, 160, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("total bill");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 130, 160, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("discount");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 180, 160, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 280, 100, 33);

        netbill_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(netbill_tf);
        netbill_tf.setBounds(240, 230, 110, 30);

        id_tf1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(id_tf1);
        id_tf1.setBounds(240, 30, 110, 30);

        num_of_items_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(num_of_items_tf);
        num_of_items_tf.setBounds(240, 80, 110, 30);

        total_bill_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(total_bill_tf);
        total_bill_tf.setBounds(240, 130, 110, 30);

        discount_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(discount_tf);
        discount_tf.setBounds(240, 180, 110, 30);

        setSize(new java.awt.Dimension(418, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id=Integer.parseInt(id_tf1.getText());
        int items=Integer.parseInt(num_of_items_tf.getText());
        double totalbill=Double.parseDouble(total_bill_tf.getText());
        double discount=Double.parseDouble(discount_tf.getText());
        double netbill=Double.parseDouble(netbill_tf.getText());
        list.add(new UserBean(id,items,totalbill,discount,netbill));
        receipt r=new receipt();
        this.hide();
        r.show();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField discount_tf;
    public static javax.swing.JTextField id_tf1;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JTextField netbill_tf;
    public static javax.swing.JTextField num_of_items_tf;
    public static javax.swing.JTextField total_bill_tf;
    // End of variables declaration//GEN-END:variables
}
