//////////////////////     CLASS BLOCK ///////////////////

package TowerDefense;
import java.awt.*;

public class Block extends Rectangle{
public int ground;

public Block(int x, int y, int width, int height, int groundID){
setBounds(x, y, width, height);   
this.ground =groundID;
}

public void draw(Graphics g){
    g.drawImage(Map.tileset_ground[ground], x, y, width, height, null);   
}
}
