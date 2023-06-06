/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class board extends JPanel implements ActionListener {
    private Timer timer;
    private Map m;
    private Player p;
    private time t;
    
    public board(){
        t= new time(30);
        m = new Map();
        p=new Player();
        
        addKeyListener(new listen());
        setFocusable(true);
        timer = new Timer(25,this);
        timer.start();
    }
    public void actionPerformed(ActionEvent e){
        if(m.getMap(p.getTX(), p.getTY()).equals("c")){
      JOptionPane.showMessageDialog(null,"YOU WIN"); 
      System.exit(0);
        }
        repaint();
        
    }
    public void paint (Graphics g){
        super.paint(g);
       for(int y=0; y<17 ; y++){
           for(int x=0;x<17;x++){
               if(m.getMap(x, y).equals("t")){
                   g.drawImage(m.getTiles(), x*32, y*32, null);
               }
               if(m.getMap(x, y).equals("g")){
                   g.drawImage(m.getgrass(), x*32, y*32, null);
               }
              
               if(m.getMap(x, y).equals("c")){
                   g.drawImage(m.getCheese(), x*32, y*32, null);
               }
           }
                   
       }
       g.drawImage(p.getMouse(),p.getTX()*32,p.getTY()*32,null);
               
    }
    
    public class listen extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            int keycode = e.getKeyCode();
            if(keycode == KeyEvent.VK_LEFT){
                if(!m.getMap(p.getTX()-1, p.getTY()).equals("t"))
                p.move(-1,0);
            }
            if(keycode == KeyEvent.VK_RIGHT){
                if(!m.getMap(p.getTX()+1, p.getTY()).equals("t"))
                p.move(1, 0);
            }
            if(keycode == KeyEvent.VK_UP){
                if(!m.getMap(p.getTX(), p.getTY()-1).equals("t"))
                p.move(0,-1);
            }
            if(keycode == KeyEvent.VK_DOWN){
                if(!m.getMap(p.getTX(), p.getTY()+1).equals("t"))
                p.move(0,1);
            }
             if(keycode == KeyEvent.VK_ENTER){
                 
                timer.stop();
                JOptionPane.showMessageDialog(null, "GAME PAUSED PRESS SPACE BAR TO RESUME");
            }
             if(keycode == KeyEvent.VK_SPACE){
                 
                timer.start();
                
            }
            
        }
        public void keyReleased(KeyEvent e){
            
            
        }
        public void keyTyped(KeyEvent e){
            
            
        } 
    }
}
