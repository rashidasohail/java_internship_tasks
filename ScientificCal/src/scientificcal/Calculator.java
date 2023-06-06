package scientificcal;

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
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        equalto = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        square = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        add = new javax.swing.JButton();
        sqrroot = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        pow = new javax.swing.JButton();
        pie = new javax.swing.JButton();
        cbr = new javax.swing.JButton();
        div = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        taninv = new javax.swing.JButton();
        sininv = new javax.swing.JButton();
        cosinv = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        log = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCIENTIFIC CALCULATOR");
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 20, 550, 40);

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton2.setText("3");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 270, 60, 50);

        tan.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });
        getContentPane().add(tan);
        tan.setBounds(440, 270, 130, 50);

        clearbutton.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        clearbutton.setText("C");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(clearbutton);
        clearbutton.setBounds(90, 80, 60, 50);

        sin.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });
        getContentPane().add(sin);
        sin.setBounds(440, 150, 130, 50);

        Back.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        Back.setText("←");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(20, 80, 60, 50);

        jButton8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton8.setText("7");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(20, 150, 60, 50);

        jButton9.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton9.setText("8");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(90, 150, 60, 50);

        jButton11.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton11.setText("4");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(20, 210, 60, 50);

        jButton12.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton12.setText("5");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(90, 210, 60, 50);

        jButton13.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton13.setText("6");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(160, 210, 60, 50);

        equalto.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        equalto.setText("=");
        equalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equaltoActionPerformed(evt);
            }
        });
        getContentPane().add(equalto);
        equalto.setBounds(160, 330, 60, 50);

        jButton15.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton15.setText("2");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(90, 270, 60, 50);

        jButton16.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton16.setText("1");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(20, 270, 60, 50);

        jButton17.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton17.setText("0");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(90, 330, 60, 50);

        dot.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        getContentPane().add(dot);
        dot.setBounds(20, 330, 60, 50);

        cos.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });
        getContentPane().add(cos);
        cos.setBounds(440, 210, 130, 50);

        jButton23.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton23.setText("9");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(160, 150, 60, 50);

        square.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        square.setText("x^2");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });
        getContentPane().add(square);
        square.setBounds(380, 80, 90, 50);

        sub.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        getContentPane().add(sub);
        sub.setBounds(230, 210, 50, 50);

        mul.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });
        getContentPane().add(mul);
        mul.setBounds(230, 270, 50, 50);

        add.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(230, 150, 50, 50);

        sqrroot.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        sqrroot.setText("√ ");
        sqrroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrrootActionPerformed(evt);
            }
        });
        getContentPane().add(sqrroot);
        sqrroot.setBounds(160, 80, 60, 50);

        ln.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        ln.setText("ln");
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        getContentPane().add(ln);
        ln.setBounds(350, 330, 55, 50);

        pow.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        pow.setText("x^y");
        pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powActionPerformed(evt);
            }
        });
        getContentPane().add(pow);
        pow.setBounds(290, 80, 80, 50);

        pie.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        pie.setText("π");
        pie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieActionPerformed(evt);
            }
        });
        getContentPane().add(pie);
        pie.setBounds(230, 80, 51, 50);

        cbr.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        cbr.setText("3√");
        cbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrActionPerformed(evt);
            }
        });
        getContentPane().add(cbr);
        cbr.setBounds(480, 80, 90, 50);

        div.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        getContentPane().add(div);
        div.setBounds(230, 330, 50, 50);

        factorial.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        factorial.setText("!");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });
        getContentPane().add(factorial);
        factorial.setBounds(290, 330, 50, 50);

        taninv.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        taninv.setText("tan^-1");
        taninv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taninvActionPerformed(evt);
            }
        });
        getContentPane().add(taninv);
        taninv.setBounds(300, 270, 120, 50);

        sininv.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        sininv.setText("sin^-1");
        sininv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sininvActionPerformed(evt);
            }
        });
        getContentPane().add(sininv);
        sininv.setBounds(300, 150, 120, 50);

        cosinv.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        cosinv.setText("cos^-1");
        cosinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinvActionPerformed(evt);
            }
        });
        getContentPane().add(cosinv);
        cosinv.setBounds(300, 210, 120, 50);

        exp.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        exp.setText("e^x");
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });
        getContentPane().add(exp);
        exp.setBounds(490, 330, 80, 50);

        log.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log);
        log.setBounds(413, 330, 67, 50);

        setSize(new java.awt.Dimension(606, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       String num=jTextField1.getText()+jButton8.getText();
       jTextField1.setText(num);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String num=jTextField1.getText()+jButton11.getText();
       jTextField1.setText(num);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
         String num=jTextField1.getText()+jButton16.getText();
         jTextField1.setText(num);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String num=jTextField1.getText()+jButton9.getText();
       jTextField1.setText(num);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         String num=jTextField1.getText()+jButton12.getText();
       jTextField1.setText(num);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String num=jTextField1.getText()+jButton15.getText();
       jTextField1.setText(num);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         String num=jTextField1.getText()+jButton17.getText();
        jTextField1.setText(num);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
         String num=jTextField1.getText()+jButton23.getText();
       jTextField1.setText(num);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         String num=jTextField1.getText()+jButton13.getText();
       jTextField1.setText(num);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String num=jTextField1.getText()+jButton2.getText();
       jTextField1.setText(num);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       String bckspace=null;
        if(jTextField1.getText().length()>0){
          StringBuilder s=new StringBuilder(jTextField1.getText());
          s.deleteCharAt(jTextField1.getText().length()-1);
          bckspace=s.toString();
          jTextField1.setText(bckspace);
          
        }
            
    }//GEN-LAST:event_BackActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        if(!jTextField1.getText().contains(".")){
           jTextField1.setText(jTextField1.getText()+dot.getText());
        }
    }//GEN-LAST:event_dotActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
     try{
       double o=Double.parseDouble(String.valueOf(jTextField1.getText())); 
       jTextField1.setText(String.valueOf(Math.sin(o)));
     }
     catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
      try{
       double o=Double.parseDouble(String.valueOf(jTextField1.getText()));      
       jTextField1.setText(String.valueOf(Math.cos(o)));
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
      try{
         double o=Double.parseDouble(String.valueOf(jTextField1.getText()));      
         jTextField1.setText(String.valueOf(Math.tan(o)));
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_tanActionPerformed
     
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
     try{
       firstno=Double.parseDouble(jTextField1.getText());
       jTextField1.setText(null);
       operation="+";     
     }
     catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
      try{
       firstno=Double.parseDouble(jTextField1.getText());
       jTextField1.setText(null);
       operation="-";
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
      
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
      try{
       firstno=Double.parseDouble(jTextField1.getText());
       jTextField1.setText(null);
       operation="*";
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_mulActionPerformed

    private void pieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieActionPerformed
        double pi=3.141592654;
        jTextField1.setText(String.valueOf(pi));
        
    }//GEN-LAST:event_pieActionPerformed

    private void sqrrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrrootActionPerformed
      try{
       double o=Double.parseDouble(String.valueOf(jTextField1.getText()));
       jTextField1.setText(String.valueOf(Math.sqrt(o)));
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_sqrrootActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
      try{
       double o=Double.parseDouble(String.valueOf(jTextField1.getText()));
       jTextField1.setText(String.valueOf(Math.log(o)));
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_lnActionPerformed

    private void powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powActionPerformed
       try{
        firstno=Double.parseDouble(String.valueOf(jTextField1.getText()));
        jTextField1.setText(null);
        operation="x^y";
       }
       catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }    
    }//GEN-LAST:event_powActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
      try{
        double o=Double.parseDouble(String.valueOf(jTextField1.getText()));
        jTextField1.setText(String.valueOf(o*o));
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_squareActionPerformed
       String operation;
       double firstno,secondno,result;
    private void equaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equaltoActionPerformed
      try{
        String answer;      
         secondno=Double.parseDouble(jTextField1.getText());
         if(operation=="+"){
            result=firstno+secondno;
            answer=String.format("%.2f", result);
            jTextField1.setText(answer);
         }
         else if(operation=="-"){
            result=firstno-secondno;
            answer=String.format("%.2f", result);
            jTextField1.setText(answer);
         }
         else  if(operation=="*"){
            result=firstno*secondno;
            answer=String.format("%.2f", result);
            jTextField1.setText(answer);
         }
         else if(operation=="/"){
            result=firstno/secondno;
            answer=String.format("%.2f", result);
            jTextField1.setText(answer);
         }
         else if(operation=="x^y"){
            jTextField1.setText(String.valueOf(Math.pow(firstno,secondno)));
         }
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
       
    }//GEN-LAST:event_equaltoActionPerformed

    private void cbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrActionPerformed
      try{
        double o=Double.parseDouble(String.valueOf(jTextField1.getText()));
        jTextField1.setText(String.valueOf(Math.cbrt(o)));
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_cbrActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
     try{
       firstno=Double.parseDouble(jTextField1.getText());
       jTextField1.setText(null);
       operation="/";
     }
     catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_divActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
      try{
        double r = 1;
        double o=Double.parseDouble(String.valueOf(jTextField1.getText()));      
             for(int i=1;i<=o;i++){
              r=r*i;              
             }
             jTextField1.setText(String.valueOf(r));
      }
      catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_factorialActionPerformed

    private void sininvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sininvActionPerformed
        try{
        double o=Double.parseDouble(String.valueOf(jTextField1.getText())); 
        jTextField1.setText(String.valueOf(Math.asin(o)));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sininvActionPerformed

    private void cosinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinvActionPerformed
       try{
        double o=Double.parseDouble(String.valueOf(jTextField1.getText())); 
        jTextField1.setText(String.valueOf(Math.acos(o)));
       }
       catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_cosinvActionPerformed

    private void taninvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taninvActionPerformed
       try{
        double o=Double.parseDouble(String.valueOf(jTextField1.getText())); 
       jTextField1.setText(String.valueOf(Math.atan(o)));
       }
       catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_taninvActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
       try{
        double o=Double.parseDouble(String.valueOf(jTextField1.getText())); 
       jTextField1.setText(String.valueOf(Math.exp(o)));
       }
       catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_expActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        try{
        double o=Double.parseDouble(String.valueOf(jTextField1.getText())); 
       jTextField1.setText(String.valueOf(Math.log(o)));
       }
       catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_logActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton add;
    private javax.swing.JButton cbr;
    private javax.swing.JButton clearbutton;
    private javax.swing.JButton cos;
    private javax.swing.JButton cosinv;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton equalto;
    private javax.swing.JButton exp;
    private javax.swing.JButton factorial;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JButton mul;
    private javax.swing.JButton pie;
    private javax.swing.JButton pow;
    private javax.swing.JButton sin;
    private javax.swing.JButton sininv;
    private javax.swing.JButton sqrroot;
    private javax.swing.JButton square;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    private javax.swing.JButton taninv;
    // End of variables declaration//GEN-END:variables
}
