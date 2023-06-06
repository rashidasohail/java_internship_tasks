/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_project;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Rashda Khanzada
 */
public class Online_Exam extends javax.swing.JFrame {

    /**
     * Creates new form Online_Exam
     */
    
     JRadioButton r1=new JRadioButton(" ");    
     // **********************timer****************************//
     int sec=0;
     Timer timer=new Timer();  
     TimerTask task=new TimerTask(){
      public void run(){
         sec++;
         lb.setText("CountDown "+sec);
         //after 5 minutes times up(5 minutes=300 seconds)
         if(sec==300){
            timer.cancel();
            JOptionPane.showMessageDialog(null, "times up");
            setVisible(false);
         }
      }
    };
    
    public void start(){
        timer.scheduleAtFixedRate(task, 1000, 1000);
     //  timer.schedule(new RemindTask(), sec*1000);
    }
    int count=0,current=0; 
    
    
    public Online_Exam() {
        initComponents();
        set() ;
    }
    
    //*******************SET QUESTIONS******************************//
    
    void set()  
    {  
       
        if(current==0)  
        {  
            question_label.setText("Q1: Which one among these is not a primitive datatype?");  
            jRadioButton1.setText("int");
            jRadioButton2.setText("boolean");
            jRadioButton3.setText("Float");
            jRadioButton4.setText("char");
                   
        }  
        if(current==1)  
        {  
            question_label.setText("Q2: Which class is available to all the class automatically?");  
            jRadioButton1.setText("Object");
            jRadioButton2.setText("ActionEvent");
            jRadioButton3.setText("Applet");
            jRadioButton4.setText("Swing");
             
        }
        if(current==2)  
        {  
            question_label.setText("Q3: All exception types are subclasses of the built-in class:");  
            jRadioButton1.setText("Exception");
            jRadioButton2.setText("Throwable");
            jRadioButton3.setText("RuntimeException");
            jRadioButton4.setText("None of the above"); 
                     
        }
        if(current==3)  
        {  
            question_label.setText("Q4: In java, objects are passed as:");  
            jRadioButton1.setText("Copy of that object");
            jRadioButton2.setText("Method called call by value");
            jRadioButton3.setText("Memory address");
            jRadioButton4.setText("Constructor"); 
                     
        }
        if(current==4)  
        {  
            question_label.setText("Q5: In object-oriented programming, the process by which one object acquires the properties of another object is called:");  
            jRadioButton1.setText("Encapsulation");
            jRadioButton2.setText("Polymorphism");
            jRadioButton3.setText("Overloading");
            jRadioButton4.setText("Inheritance "); 
                     
        }
        if(current==5)  
        {  
            question_label.setText("Q6: The java run time system automatically calls this method while garbage collection:");  
            jRadioButton1.setText("finalizer()");
            jRadioButton2.setText("finalize()");
            jRadioButton3.setText("finally()");
            jRadioButton4.setText("None of the above"); 
                     
        }
        if(current==6)  
        {  
            question_label.setText("Q7: Which is a valid keyword in java?");  
            jRadioButton1.setText("interface");
            jRadioButton2.setText("string");
            jRadioButton3.setText("float");
            jRadioButton4.setText("unsigned"); 
                     
        }
        if(current==7)  
        {  
            question_label.setText("Q8: What is the prototype of the default constructor?");  
            jRadioButton1.setText("Test()");
            jRadioButton2.setText("Test(void)");
            jRadioButton3.setText("public Test()");
            jRadioButton4.setText("public Test(void)"); 
                     
        }
        if(current==8)  
        {  
            question_label.setText("Q9: Java programs are:");  
            jRadioButton1.setText("Platform dependent");
            jRadioButton2.setText("Platform independent");
            jRadioButton3.setText("Interpreter dependent");
            jRadioButton4.setText("Interpreter independent"); 
                     
        }
        if(current==9)  
        {  
            question_label.setText("Q10: The order of the three top level elements of java source file are:");  
            jRadioButton1.setText("Import,Package,Class");
            jRadioButton2.setText("Class,Import,Package");
            jRadioButton3.setText("Package,Import,Class");
            jRadioButton4.setText("Random Order"); 
                     
        }
        
    
       
    }
    
    //*************************SET CORRECT ANSWERS******************************//
    
    boolean check()  
    {  
        if(current==0)  
            return( jRadioButton3.isSelected());  
        if(current==1)          
            return( jRadioButton1.isSelected());  
        if(current==2)  
            return( jRadioButton2.isSelected()); 
        if(current==3)  
            return( jRadioButton3.isSelected());  
        if(current==4)  
            return( jRadioButton4.isSelected());
        if(current==5)  
            return( jRadioButton2.isSelected());
        if(current==6)  
            return( jRadioButton1.isSelected());
        if(current==7)  
            return( jRadioButton3.isSelected()); 
        if(current==8)  
            return( jRadioButton2.isSelected()); 
        if(current==9)  
            return( jRadioButton3.isSelected()); 
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        question_label = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        prev_button = new javax.swing.JButton();
        next_Button = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\"Online Test\"");
        setResizable(false);
        getContentPane().setLayout(null);

        question_label.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(question_label);
        question_label.setBounds(20, 40, 870, 50);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jRadioButton4.setText("jRadioButton1");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(500, 180, 420, 40);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(100, 120, 400, 40);

        prev_button.setText("Previous");
        prev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prev_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(prev_button);
        prev_button.setBounds(660, 320, 110, 40);

        next_Button.setText("Next");
        next_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(next_Button);
        next_Button.setBounds(770, 320, 110, 40);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jRadioButton2.setText("jRadioButton1");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(100, 180, 400, 40);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jRadioButton3.setText("jRadioButton1");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(500, 120, 420, 40);

        lb.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        getContentPane().add(lb);
        lb.setBounds(30, 330, 170, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 400);

        setSize(new java.awt.Dimension(935, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //**********move towards next question************//
    
    private void next_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_ButtonActionPerformed
         if(check())  
                count=count+1;   
             current++;
             buttonGroup1.add(r1);
             r1.setSelected(true); 
             set();         
            
            if(current==9){  
                prev_button.setEnabled(false);  
                next_Button.setText("Result");  
            }
            
          if(evt.getActionCommand().equals("Result")){  
              if(check())  
                count=count+1;  
              current++;  
              float per=(count*100)/10;
              String a;
              if(per>=70){
                   a="pass";
               }
              else
                   a="fail";
              JOptionPane.showMessageDialog(this,"correct ans="+count+"\n percentage ="+per+"\n"+a);  
              System.exit(0);  
        }  
    }//GEN-LAST:event_next_ButtonActionPerformed

    //**********move towards previous question************//
    
    private void prev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prev_buttonActionPerformed
          if(check())  
                count=count+1;  
            current--;  
            
          //  System.out.println(buttonGroup1.getSelection().setSelected(true));
        //    buttonGroup1.getSelection().setSelected(true);
            set();    
    }//GEN-LAST:event_prev_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Online_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Online_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Online_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Online_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Online_Exam o= new Online_Exam();
                o.setVisible(true);
                o.start();//timer start
              
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel lb;
    private javax.swing.JButton next_Button;
    private javax.swing.JButton prev_button;
    private javax.swing.JLabel question_label;
    // End of variables declaration//GEN-END:variables
}
