//////////////////////     CLASS KEYHANDEL ///////////////////

package TowerDefense;
import java.awt.Point;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ButtonsManage implements MouseMotionListener, MouseListener{

    public int m, f, r;
    final static int NAMELENGTH=20;
    final static int Recordsize=NAMELENGTH*2+12;
    static Boolean clear= false;
   
    public void mouseDragged(MouseEvent me) {
     Map.mse = new Point(me.getX(), me.getY());   
    }

   
    public void mouseMoved(MouseEvent me) {
    Map.mse = new Point(me.getX(), me.getY());        
    }

    
   
    public void mousePressed(MouseEvent me){
        
        if((me.getX()>50)&&(me.getX()<130)&&(me.getY()>600)&&(me.getY()<700))
        {if(r==0)    
        {
        if(Map.name==null)
        Map.name=JOptionPane.showInputDialog(null, "Give your username:");
        Map.Level=1;
        Map.start = true;
        r++;}}
        
        if((me.getX()>230)&&(me.getX()<310)&&(me.getY()>600)&&(me.getY()<700))
        {  
        Map.bt.click(me.getButton());
        if(m==0)
        {
        if(Map.gold>=10)
        {Map.icon.block[5][4].ground = Value.BasicTowerID;
        Map.gold=Map.gold-10;
        }else{
        System.out.println("Not enough gold, bro!");
        }}
        
        if(m>=1)
        {
        if(Map.basicB>0)
        {Map.basicB= Map.basicB-1;
        Map.bt.attack();
        System.out.println(Map.basicB + " bullets left");
        }else{
        System.out.println("No melee bullets left");
        }}
        m++;
        if(Map.mobs[0].hp<=Map.mobs[0].hplost){
        Map.mobs[0].inGame=false;
        Map.mobs[0].hplost=0;
        clear=true;
        }}
        
        
        if((me.getX()>400)&&(me.getX()<480)&&(me.getY()>600)&&(me.getY()<700))
        {
        Map.brt.click(me.getButton());
        if(f==0)
        {if(Map.gold>=10)
        {Map.icon.block[5][9].ground = Value.RangedTowerID;
        Map.gold=Map.gold-10;}
        else{
        System.out.println("Not enough gold, bro!");}}
        
        if(f>=1)
        {if(Map.rangeB>0){
        Map.rangeB= Map.rangeB-1;
        Map.brt.attack();
        System.out.println(Map.rangeB + " range bullets left");
        }else{System.out.println("No range bullets left");}}
         f++;
        if(Map.mobs[0].hp<=Map.mobs[0].hplost){
        Map.mobs[0].inGame=false;
        Map.mobs[0].hplost=0;
        clear=true;
        }}
        
    
        
        if((me.getX()>580)&&(me.getX()<660)&&(me.getY()>600)&&(me.getY()<700))
        {
        if(Map.gold>=10)
        {System.out.println("You just bought new bullets!!");
        Map.rangeB = Map.rangeB + 10;
        Map.basicB = Map.basicB + 3;
        System.out.println(Map.rangeB + " range bullets left");
        System.out.println(Map.basicB + " bullets left");
        Map.gold=Map.gold-10;
        }
        else
        {System.out.println("Not enough gold, bro!");}}
        
        
        if((me.getX()>750)&&(me.getX()<830)&&(me.getY()>600)&&(me.getY()<700))
        {          
        new SaveData(); 
        }}


    public void mouseClicked(MouseEvent me) {}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me)  {}
}