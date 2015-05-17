//////////////////////     CLASS BUILDRANGETOWER ///////////////////

package TowerDefense;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


import java.awt.*;
import javax.swing.JOptionPane;
public class BuildRangeTower {
    
    public static int buttonSize = 80; 
    public static int damage= 10;
    
    public Rectangle[] button = new Rectangle[1];
    
    public BuildRangeTower(){
    define();
    
    
}
    
    public void click(int mouseButton){
        if(mouseButton==0)
        {
        }
        }
    
    public void attack() {
                
             if((Map.mobs[0].x>2)&&(Map.mobs[0].x<900)){
             Map.mobs[0].hplost = Map.mobs[0].hplost + Map.brt.damage ;
             Map.Score = Map.Score + 3; 
             try{Thread.sleep(50);
             }catch(InterruptedException e)
             {e.printStackTrace();} 
             }

}

    
public void define(){
    for(int i=0; i<button.length; i++){
        button[i] = new Rectangle(((Map.myWidth/2) - ((buttonSize+8))/2 + ((buttonSize+8)*i) ) +350   , 600 , buttonSize, buttonSize );
    }
    }

public void draw(Graphics g){
    
    for(int i=0; i<button.length; i++) {
        
        if(button[i].contains(Map.mse))
        {
            g.setColor(new Color(255,255,255,200));
            g.fillRect(button[i].x , button[i].y , button[i].width, button[i].height);
        }
}

g.setColor(new Color(50,25,25,200));
     g.fillRect(button[0].x, button[0].y, button[0].width, button[0].height);
}
}

