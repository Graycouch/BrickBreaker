package brickbreaker;

import javax.swing.JFrame;

public class BrickBreaker 
{
    public static void main(String[] args) 
    {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10 , 10 , 700 , 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.add(gameplay);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
