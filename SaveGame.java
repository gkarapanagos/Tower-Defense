//////////////////////     CLASS SAVEGAME ///////////////////


package TowerDefense;

import java.awt.*;
public class SaveGame {
    
    public static int buttonSize = 80; 
    
    public Rectangle[] button = new Rectangle[1];
    
    public SaveGame(){
    define();
    
    
}
    
    public void click(int mouseButton){
        if(mouseButton==0)
        {
            
        }
        
        
    }
    
public void define(){
    for(int i=0; i<button.length; i++){
        button[i] = new Rectangle(((Map.myWidth/2) - ((buttonSize+8))/2 + ((buttonSize+8)*i) ) +175 , 600 , buttonSize, buttonSize );
    }
    
   
}

public void draw(Graphics g){
    
    for(int i=0; i<button.length; i++) {
        if(button[i].contains(Map.mse))
        {
          g.setColor(new Color(0,0,0,200));
            g.fillRect(button[i].x, button[i].y, button[i].width, button[i].height);
        }
}


     g.setColor(new Color(125,50,50,200));
     g.fillRect(button[0].x, button[0].y, button[0].width, button[0].height);

}
}
