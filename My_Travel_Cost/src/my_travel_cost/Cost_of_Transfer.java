/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_travel_cost;

/**
 *
 * @author Rashda Khanzada
 */
public class Cost_of_Transfer extends javax.swing.JFrame {

    /**
     * Creates new form Cost_of_Transfer
     */
    public Cost_of_Transfer() {
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

        dvrcharges_lb = new javax.swing.JLabel();
        combobox2 = new javax.swing.JComboBox<>();
        no_of_trks = new javax.swing.JLabel();
        combobox1 = new javax.swing.JComboBox<>();
        item_lb = new javax.swing.JLabel();
        petrolcost_lb = new javax.swing.JLabel();
        distance_lb = new javax.swing.JLabel();
        drivercharges_tf = new javax.swing.JTextField();
        petrolcost_tf = new javax.swing.JTextField();
        totaldistance_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        dvrcharges_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dvrcharges_lb.setText("Driver Charges");
        getContentPane().add(dvrcharges_lb);
        dvrcharges_lb.setBounds(40, 250, 170, 25);

        combobox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(combobox2);
        combobox2.setBounds(230, 100, 170, 30);

        no_of_trks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        no_of_trks.setText("No of Trucks");
        getContentPane().add(no_of_trks);
        no_of_trks.setBounds(43, 48, 120, 25);

        combobox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(combobox1);
        combobox1.setBounds(230, 42, 170, 30);

        item_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        item_lb.setText("Items");
        getContentPane().add(item_lb);
        item_lb.setBounds(40, 100, 120, 25);

        petrolcost_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        petrolcost_lb.setText("Petrol Cost /km");
        getContentPane().add(petrolcost_lb);
        petrolcost_lb.setBounds(40, 150, 140, 25);

        distance_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        distance_lb.setText("Total Distance(km)");
        getContentPane().add(distance_lb);
        distance_lb.setBounds(40, 200, 170, 30);

        drivercharges_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(drivercharges_tf);
        drivercharges_tf.setBounds(230, 250, 170, 30);

        petrolcost_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(petrolcost_tf);
        petrolcost_tf.setBounds(230, 150, 170, 30);

        totaldistance_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(totaldistance_tf);
        totaldistance_tf.setBounds(230, 200, 170, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Total Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 315, 120, 30);

        setSize(new java.awt.Dimension(480, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        total_bill t=new total_bill();
        this.hide();
        t.show();
    }//GEN-LAST:event_jButton1ActionPerformed
    //add num of tracks in combo1
    public void combo1(){
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
    String str[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            str[i]=String.valueOf(arr[i]);
            combobox1.addItem(str[i]);
  
         }
    }
    //add items in combo2
     public void combo2(){
    String arr[]={"Electronics items","Grocery items","woods","computer"};
        for(int i=0;i<arr.length;i++){
            combobox2.addItem(arr[i]);
  
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
            java.util.logging.Logger.getLogger(Cost_of_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cost_of_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cost_of_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cost_of_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cost_of_Transfer c =new Cost_of_Transfer();
                c.setVisible(true);
                c.combo1();
                c.combo2();
                
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> combobox1;
    public static javax.swing.JComboBox<String> combobox2;
    public static javax.swing.JLabel distance_lb;
    public static javax.swing.JTextField drivercharges_tf;
    public static javax.swing.JLabel dvrcharges_lb;
    public static javax.swing.JLabel item_lb;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel no_of_trks;
    public static javax.swing.JLabel petrolcost_lb;
    public static javax.swing.JTextField petrolcost_tf;
    public static javax.swing.JTextField totaldistance_tf;
    // End of variables declaration//GEN-END:variables
}