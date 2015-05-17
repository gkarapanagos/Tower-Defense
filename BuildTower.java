//////////////////////     CLASS BUILDTOWER ///////////////////


package TowerDefense;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


import java.awt.*;
import javax.swing.JOptionPane;
public class BuildTower {
  
    public static int buttonSize = 80; 
    public static int damage = 30;
    
    public Rectangle[] button = new Rectangle[1];
    
    public BuildTower(){
    define();
    
    
}
    
    public void click(int mouseButton){
        if(mouseButton==0)
        {
        }
        
        
    }
    
public void define(){
    for(int i=0; i<button.length; i++){
        button[i] = new Rectangle(((Map.myWidth/2) - ((buttonSize+8))/2 + ((buttonSize+8)*i) ) - 350  , 600 , buttonSize, buttonSize );
    }
    
   
}

public void draw(Graphics g){
    
    for(int i=0; i<button.length; i++) {
        if(button[i].contains(Map.mse))
        {
            g.setColor(new Color(255,255,255,200));
            g.fillRect(button[i].x, button[i].y, button[i].width, button[i].height);
        }
}

g.setColor(new Color(0,75,75,200));
g.fillRect(button[0].x, button[0].y, button[0].width, button[0].height);
     
}

  
    public void attack() {
             
             if((Map.mobs[0].x>2)&&(Map.mobs[0].x<900)){             
             if(Map.mobs[0].calculate(300,375)<=10){       
             Map.mobs[0].hplost = Map.mobs[0].hplost + Map.bt.damage ;
             Map.Score = Map.Score + 15;
             try{Thread.sleep(50);
             }catch(InterruptedException e)
             {e.printStackTrace();} 
}}}}
