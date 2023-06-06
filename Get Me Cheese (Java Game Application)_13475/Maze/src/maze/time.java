/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class time {
  Toolkit toolkit;

  Timer timer;

  public time(int seconds) {
    toolkit = Toolkit.getDefaultToolkit();
    timer = new Timer();
    timer.schedule(new RemindTask(), seconds * 1000);
  }

  class RemindTask extends TimerTask {
    public void run() {
        
     JOptionPane.showMessageDialog(null, "Times UP!!!!");
      toolkit.beep();
      System.exit(0); 
    }
  }

 
}  
