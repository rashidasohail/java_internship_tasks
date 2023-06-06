/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class Player {
   private  int tilex,tiley;
    private Image mouse;
    Player(){
        ImageIcon img = new ImageIcon("mousee.png");
        mouse = img.getImage();
       
        tilex=1;
        tiley=1;
        
                
    }
    public Image getMouse(){
        return mouse;
    }
    public void move(int px , int py ){
    
   
    tilex+=px;
    tiley += py;
    
    
        
    }
    
    
      public int getTX(){
        return tilex;
      }
       public int getTY(){
        return tiley;
    }
    
    
}
