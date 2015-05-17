//////////////////////     CLASS MAP ///////////////////

package TowerDefense;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

class Map extends JPanel implements Runnable {
    
    public Thread thread = new Thread(this);
    
    public static Image[] tileset_ground = new Image[15];
    public static Image[] tileset_mob = new Image[15];
    
    public static int myWidth, myHeight;
    
    public static Icon icon;
    public static Save save;
    public static Start begin; 
    public static BuildTower bt;
    public static BuildRangeTower brt;
    public static Bullets bullets;
    public static SaveGame saveGAME;
    public static int lives=3, gold=20, basicB=5, rangeB=15, Score=0, Level=0;



    public static Minion[] mobs = new Minion[1];
    
    public static boolean isFirst = true;
    public static boolean start = false;
    public static boolean t = false;
    public static boolean r = false;
    public static String name;
    
    public static Point mse = new Point (0, 0);
    
    public Map(Frame frame){
    frame.addMouseListener(new ButtonsManage());
    frame.addMouseMotionListener(new ButtonsManage());
    thread.start();
    }
    
    
    public void paintComponent(Graphics g){
      if(isFirst){
      myWidth = getWidth();  
      
      myHeight = getHeight();   
      
      define();
      isFirst=false;    
      }
      
      g.setColor(new Color(70,70,70));
      g.fillRect(0, 0, getWidth(), getHeight());
      g.setColor(new Color(0,0,0));
      
     icon.draw(g);  
     begin.draw(g);
     bt.draw(g);
     brt.draw(g);
     saveGAME.draw(g);
     bullets.draw(g);
     
     for(int i=0; i<mobs.length; i++){
     if(mobs[i].inGame){
         mobs[i].draw(g);
     }
     }
     }
    
    public void define(){
        icon = new Icon();
        save = new Save(); 
        begin = new Start();
        bt = new BuildTower();
        brt = new BuildRangeTower();
        bullets= new Bullets();
        saveGAME = new SaveGame();
        
        for(int i=0; i<tileset_ground.length;i++){
        tileset_ground[i]= new ImageIcon("Res/tileset_ground.jpg").getImage();    
        tileset_ground[i]= createImage(new FilteredImageSource((tileset_ground[i].getSource()), new CropImageFilter(0,26*i,26,26)));    
        }   

        save.loadSave(new File("save/mission1.kp"));
        for(int i=0; i<mobs.length; i++){
        tileset_mob[0] = new ImageIcon("res/tileset_mob.png").getImage();
        }
        
        for(int i=0; i<mobs.length; i++){
        mobs[i] = new Minion();
        }
    }
   
    public int spawnTime = 2000, spawnFrame=1500;
    public void mobSpawner(){
        
        if(spawnFrame >= spawnTime){
          for(int i=0; i<mobs.length; i++){
          if(!mobs[i].inGame){
              mobs[i].spawnMinion(0);
              break;
          }}  
          spawnFrame=0;
        }else{
            spawnFrame +=1;
        }}
    

    public void run(){ 
    while(true){
    if(!isFirst) {
    if(Map.start==true)
    {mobSpawner();
    for(int i=0; i<mobs.length; i++){
        if(mobs[i].inGame){
            mobs[i].movement();           
        }}}}

    repaint();
    try{
      Thread.sleep(1);  
    }catch(Exception e) {}
    
    }}}
    