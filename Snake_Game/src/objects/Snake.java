/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Rashda Khanzada
 */

import javax.swing.JOptionPane;
import snake_game.Snake_Game;


public class Snake {
   
    Snake_Game main;
 
    public int direction = 0;
    public int length = 2;
 
    public int snakeX[] = new int[main.WIDTH * main.HEIGHT];
    public int snakeY[] = new int[main.WIDTH * main.HEIGHT];
 
    public Snake(int x0, int y0, int x1, int y1) {
        snakeX[0] = x0;
        snakeY[0] = y0;
        snakeX[1] = x1;
        snakeY[1] = y1;
    }
 
    @SuppressWarnings("static-access")
    
    public void move() {
        // Moves the joints of the snake 'up the chain'
        // Meaning, the joint of the snake all move up one
        for (int d = length; d > 0; d--) {
            snakeX[d] = snakeX[d - 1];
            snakeY[d] = snakeY[d - 1];
        }
 
        if (direction == 0) snakeX[0]++;//move towards right
        if (direction == 1) snakeY[0]++;//move towards down
        if (direction == 2) snakeX[0]--;//move towards left 
        if (direction == 3) snakeY[0]--;//move towards up
  
        if (snakeX[0] > main.WIDTH) snakeX[0] = 0;
        if (snakeX[0] < 0) snakeX[0] = main.WIDTH - 1;
        if (snakeY[0] > main.HEIGHT - 1) snakeY[0] = 0;
        if (snakeY[0] < 0) snakeY[0] = main.HEIGHT - 1;
   
        
        // Snake cant intersect with itself if it's not larger than 3
         for (int i =length; i > 0; i--) {
             if ((i > 3) && (snakeX[0] == snakeX[i] && (snakeY[0] == snakeY[i]))) {
                 JOptionPane.showMessageDialog(null, "Game Over"); // then the game ends
                  length=2;
        
          
        }
    }
    }
}
