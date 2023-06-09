/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_library;

import static digital_library.Assign_to.copies_left;
import static digital_library.Assign_to.issue_date;
import static digital_library.Search_book.available_copies;
import static digital_library.Search_book.date_of_issue;
import static digital_library.Search_book.searchbook;

/**
 *
 * @author Rashda Khanzada
 */
public class Student_Profile extends javax.swing.JFrame {

    /**
     * Creates new form Student_Profile
     */
    public Student_Profile() {
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
        phone_lb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_lb = new javax.swing.JLabel();
        roll_no_lb = new javax.swing.JLabel();
        dept_lb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\"Student Profile\"");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Roll no");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 130, 100, 30);

        phone_lb.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(phone_lb);
        phone_lb.setBounds(240, 250, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setText("Phone num");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 250, 110, 30);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setText("Department");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 190, 110, 30);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 70, 110, 30);

        name_lb.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(name_lb);
        name_lb.setBounds(240, 70, 210, 30);

        roll_no_lb.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(roll_no_lb);
        roll_no_lb.setBounds(240, 130, 210, 30);

        dept_lb.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(dept_lb);
        dept_lb.setBounds(240, 190, 210, 30);

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 320, 130, 41);

        setSize(new java.awt.Dimension(524, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Search_book s=new Search_book();
        this.hide();
        s.show();
        String a=issue_date.getText();
        date_of_issue.setText(a);
         //available copies 
        available_copies.setText(String.valueOf(copies_left));
        searchbook();
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
            java.util.logging.Logger.getLogger(Student_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel dept_lb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel name_lb;
    public static javax.swing.JLabel phone_lb;
    public static javax.swing.JLabel roll_no_lb;
    // End of variables declaration//GEN-END:variables
}
