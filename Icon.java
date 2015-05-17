//////////////////////     CLASS ICON ///////////////////

package TowerDefense;
import java.awt.*;

public class Icon {
public int MapWidth = 12;
public int MapHeight = 8;    
public int blockSize = 72;    
    
public Block[][] block;    
       
public void define(){    
block = new Block[MapHeight][MapWidth];

for(int y=0; y<block.length;y++){
    for(int x=0; x<block[0].length;x++){
        block[y][x]= new Block((Map.myWidth/2)-((MapWidth*blockSize)/2)+x*blockSize, y*blockSize, blockSize, blockSize, Value.groundGrass);
    }
}




}
    public Icon(){
     define();
 }   
  
 public void draw(Graphics g){
     for (int y=0; y<block.length;y++){
    for(int x=0; x<block[0].length;x++){
        block[y][x].draw(g);
    }
}}}
