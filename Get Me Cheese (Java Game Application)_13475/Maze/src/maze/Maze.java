/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class Maze {
    Maze(){
        JFrame f = new JFrame();
        f.setSize(561,610);
       
        
       
        
        JOptionPane.showConfirmDialog(f, "u have 30 seconds for completing the maze, You can Pause the Game by Pressing Enter KEY");
        JOptionPane.showConfirmDialog(f,  " LETS PLAY ?");
        
        f.add(new board());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
         
        //f.add(new board());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Maze();
    }
    
}
