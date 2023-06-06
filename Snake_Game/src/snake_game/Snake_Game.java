/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_game;

/**
 *
 * @author Rashda Khanzada
 */

import objects.Apple;
import objects.Snake;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
public class Snake_Game extends JPanel implements ActionListener {
 
    public static final int SCALE = 32;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    public static final int SPEED = 4;
 
    Apple a = new Apple((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT));
    Snake s = new Snake(10, 10, 9, 10);
    Timer t = new Timer(1000 / SPEED, this);
 
    public Snake_Game() {
        t.start();
        addKeyListener(new Keyboard());
        setFocusable(true);
    }
 
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
 
        //create snake
        for (int d = 0; d < s.length; d++) {
            g.setColor(Color.green);
            g.fillRect(s.snakeX[d] * SCALE + 1, s.snakeY[d] * SCALE + 1, SCALE - 1, SCALE - 1);
         
        }
        //create food
        g.setColor(Color.red);
        g.fillRect(a.posX * SCALE + 1, a.posY * SCALE + 1, 14, 14);
    } 
 
    public void actionPerformed(ActionEvent e) {
        s.move();
        //increase snake length 
        if ((s.snakeX[0] == a.posX) & (s.snakeY[0] == a.posY)) {
            a.setRandomPosition();
            s.length++;
        }
        repaint();
    }
 
    private class Keyboard extends KeyAdapter {
        public void keyPressed(KeyEvent kEve) {
            int key = kEve.getKeyCode();
 
            if ((key == KeyEvent.VK_RIGHT) & s.direction != 2) s.direction = 0;
            if ((key == KeyEvent.VK_DOWN) & s.direction != 3) s.direction = 1;
            if ((key == KeyEvent.VK_LEFT) & s.direction != 0) s.direction = 2;
            if ((key == KeyEvent.VK_UP) & s.direction != 1) s.direction = 3;
        }
    }
    
    
    public static void main(String[] args) {
        JFrame f = new JFrame("SNAKE GAME");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(WIDTH * SCALE + 7, HEIGHT * SCALE + 29);
        f.setLocationRelativeTo(null);
        f.add(new Snake_Game());
        f.setVisible(true);
    }
}
