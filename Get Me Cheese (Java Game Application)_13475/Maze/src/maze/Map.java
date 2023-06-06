/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class Map {
    private Scanner s;
    String Map[] = new String[17];
    private Image tiles;
    private Image grass;
    private Image cheese ;
    
    
    Map(){
        ImageIcon img = new ImageIcon("tile.png");
        tiles = img.getImage();
        ImageIcon img2 = new ImageIcon("grass.png");
         grass = img2.getImage();
         ImageIcon img3 = new ImageIcon("Cheese.png");
         cheese = img3.getImage();
                
               
        
        openFile();
        ReadFile();
        closeFile();
        
    }
    public Image getCheese(){
        return cheese;
    }
    public Image getTiles(){
        return tiles;
    }
   
    Image getgrass() {
     //To change body of generated methods, choose Tools | Templates.
     return grass;
    }
    public String getMap(int x , int y){
        String index = Map[y].substring(x,x+1);
        return index;
    }
    public void openFile(){
        
        try {
            s = new Scanner(new File ("mazee.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 private void ReadFile() {
        while(s.hasNext()){
            for(int i =0; i<17;i++)
                Map[i] = s.next();
            
        }}
        public void closeFile(){
            s.close();
        }
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    

   
}

