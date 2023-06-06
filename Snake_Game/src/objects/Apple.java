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
import snake_game.Snake_Game;
 
public class Apple {
 
    Snake_Game main;
 
    public int posX;// Stores X pos of food
    public int posY; // Stores Y pos of food
    
 
    public Apple(int startX, int startY) {
        posX = startX;
        posY = startY;
 
    }
 
    @SuppressWarnings("static-access")
    // Set  food's x & y position to a random position
    public void setRandomPosition() {
        posX = (int) (Math.random() * main.WIDTH);
        posY = (int) (Math.random() * main.HEIGHT);
    }
}
