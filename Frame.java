//////////////////////     CLASS FRAME ///////////////////

package TowerDefense;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
public static String title = "Tower Defense Game";
public static Dimension size = new Dimension(900,725);
        
public void init(){
setLayout(new GridLayout(1,1,0,0));  
Map map= new Map(this);
add(map);
setVisible(true);

}
 
public Frame() {
setTitle(title);
setSize(size);
setResizable(false);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

init();

}

public static void main(String args[]) {
Frame frame = new Frame();   
}
}