//////////////////////     CLASS SAVE ///////////////////

package TowerDefense;
import java.io.*;
import java.util.*;

public class Save {
    public void loadSave(File loadPath){
       try{ 
        Scanner loadScanner = new Scanner(loadPath);
        
        while(loadScanner.hasNext()) {
         for(int y=0; y<Map.icon.block.length; y++){
            for(int x=0; x<Map.icon.block[0].length; x++){ 
            Map.icon.block[y][x].ground = loadScanner.nextInt();   
            }}}
        
       }catch(Exception e) { }
       }
}
