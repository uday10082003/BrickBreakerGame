
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brickbreakergame1;

/**
 *
 * @author Desk
 */
import javax.swing.JFrame;
public class BrickBreakerGame1 {

    public static void main(String[] args) {
         JFrame obj = new JFrame();
	        GamePlay gameplay = new GamePlay();
	        obj.setBounds(10,10,700,600);
	        obj.setTitle("BrickBreaker");
	        obj.setResizable(false);
	        obj.setVisible(true);
	        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        obj.add(gameplay);
    }
}
