//////////////////////     CLASS MINION ///////////////////

package TowerDefense;
import java.awt.*;
import javax.swing.*;

public class Minion extends Rectangle{
    public int minions = 72; 
    public int hp=100;
    public static int hplost;
    public int MinionID = Value.MinionID;
    public boolean inGame = false;
    public int healthSpace = 3, healthHeight = 10; 
    public double d, dx, dy;
    
    public double calculate(int tx, int ty){
    dx = Math.abs(tx - x);
    dy = Math.abs(ty - y);
    d=Math.floor(Math.sqrt(dx+dy));   
    return d;   
    }
    
    public void spawnMinion(int MinionID) {
        for(int y=0; y<Map.icon.block.length; y++){
            if(Map.icon.block[y][0].ground == Value.groundDirt){
                setBounds(Map.icon.block[y][0].x, Map.icon.block[y][0].y, minions, minions);
           }}
        this.MinionID = MinionID;
        inGame = true; 
     }
    
    public static int walkFrame = 0, walkSpeed = 5, walk=1;
    public void movement() {
        
        if(x==15)
        {
        if(ButtonsManage.clear)
        {
        Map.mobs[0].hp=Map.mobs[0].hp+(7*(Map.Level-1));
        Map.gold = Map.gold+15;
        Map.Level=Map.Level+1;
        Map.Score=Map.Score+50;
        ButtonsManage.clear=false;
        }}
        if(walkFrame >= walkSpeed)
        {
        if(x<90) {
        x=x+1;
        }
        if(x==90) {
        y=y+1;
        }
        if((x<375)&&(y==400)) {
        x=x+1;     
        }
        if((x==375)) {
        y=y-1;
        }
        if((y==50)) {
        x=x+1;
        }
        walkFrame=0;
        }
        else{
        walkFrame= walkFrame +walk;}
        
    if(x>725){
    inGame=false;
    
    if(Map.mobs[0].hp>Map.mobs[0].hplost){
            System.out.println("You just lost 1 life");
            Map.lives=Map.lives-1;
            System.out.println("You only have: " + Map.lives + " lives left!");
            
            if(Map.lives<=0)
            {JOptionPane.showMessageDialog(null, "YOU HAVE LOST!"
            + "\n" + "Mr. " +  Map.name + " your Score was: " + Map.Score);
              
            Map.start = false;
            new SaveData();}
    }}}
    
    
    public void draw(Graphics g){
        if(inGame){
            g.drawImage(Map.tileset_mob[MinionID], x, y, width, height, null);
        }
        g.setColor(new Color(100, 100, 0));
        g.fillRect(x, y - (healthSpace + healthHeight), hp, healthHeight);
        g.setColor(new Color(255, 180, 255));
        g.fillRect(x, y - (healthSpace + healthHeight), hp - hplost , healthHeight);
        }}