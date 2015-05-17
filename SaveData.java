//////////////////////     CLASS SAVEDATA ///////////////////

package TowerDefense;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SaveData extends javax.swing.JFrame {
    node  head, current;
    item Head, Tail;
    int count=0, pointer=0;
    final static int NAMELENGTH=20;
    final static int Recordsize=NAMELENGTH*7;
    RandomAccessFile ranfile; 
    public static String newline = System.getProperty("line.separator");
    
 public SaveData() {
        Map.mobs[0].walk=0;
        initComponents();
        setVisible(true);
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Save Your Game\nSave Your HighScore\n\nAccess Your HighScores\n");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Save Current Progress");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setText("Save HighScore");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View HighScores");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Load Saved Game");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        jButton6.setText("Upgrade Basic");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Upgrade Ranged");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
    load();
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
    try {
            RandomAccessFile ranfile = new RandomAccessFile
                    ("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSave.TD", "rw");
            try {
                create(ranfile);
            } catch (IOException ex) {
                Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ButtonsManage.class.getName()).log(Level.SEVERE, null, ex);

        }   
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        try {
RandomAccessFile ranfile0 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD0", "rw");          
RandomAccessFile ranfile1 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD1", "rw");
RandomAccessFile ranfile2 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD2", "rw");
RandomAccessFile ranfile3 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD3", "rw");
RandomAccessFile ranfile4 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD4", "rw");
RandomAccessFile ranfile5 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD5", "rw");
RandomAccessFile ranfile6 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD6", "rw");
RandomAccessFile ranfile7 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD7", "rw");
RandomAccessFile ranfile8 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD8", "rw");
RandomAccessFile ranfile9 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD9", "rw");
             
            
createLinkedList();           
item x = new item();
String b= Map.name;
if(b==null){
    b="-";
}
x.setName(b);
x.setScore(Map.Score);
x.life=Map.lives;
x.level=Map.Level;
x.Gold=Map.gold;
x.Bbullets=Map.basicB;
x.Rbullets=Map.rangeB;
Tail.Next=x;
Tail=x;
Sort();

item tempo= new item();
tempo=Head;
tempo.save(ranfile0);
tempo=tempo.Next;
tempo.save(ranfile1);
tempo=tempo.Next;
tempo.save(ranfile2);
tempo=tempo.Next;
tempo.save(ranfile3);
tempo=tempo.Next;
tempo.save(ranfile4);
tempo=tempo.Next;
tempo.save(ranfile5);
tempo=tempo.Next;
tempo.save(ranfile6);
tempo=tempo.Next;
tempo.save(ranfile7);
tempo=tempo.Next;
tempo.save(ranfile8);
tempo=tempo.Next;
tempo.save(ranfile9);
tempo=tempo.Next;

} catch (FileNotFoundException ex) {
            Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
      try {
RandomAccessFile ranfile0 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD0", "rw");          
RandomAccessFile ranfile1 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD1", "rw");
RandomAccessFile ranfile2 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD2", "rw");
RandomAccessFile ranfile3 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD3", "rw");
RandomAccessFile ranfile4 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD4", "rw");
RandomAccessFile ranfile5 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD5", "rw");
RandomAccessFile ranfile6 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD6", "rw");
RandomAccessFile ranfile7 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD7", "rw");
RandomAccessFile ranfile8 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD8", "rw");
RandomAccessFile ranfile9 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD9", "rw");
            
            createLinkedList();
            String display="";
            item temp1 = new item();
            temp1 = Head;
            
for (int k=0; k<10; k++){
String a =  temp1.getName();
int b = temp1.getScore();
display = display + "\n" + "Place:" + (k+1) + "     " +  " Name: " + a + "     " +  " Score: " + b;
temp1 = temp1.Next;
}
JOptionPane.showMessageDialog(null, display);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
        }
      

    }//GEN-LAST:event_jButton3MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        this.setVisible(false);
        Map.mobs[0].walk=1;
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Upgrade basic's tower attack damage by 20, for the cost of 20 gold.
        if(Map.gold>=10)
        {
        Map.gold=Map.gold-10;
        Map.bt.damage=Map.bt.damage+70;
        JOptionPane.showMessageDialog(null, "Upgrade Successful!");
        }
        else{
        JOptionPane.showMessageDialog(null, "You need more gold!");    
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Upgrade ranged's tower attack damage by 7, for the cost of 30 gold.
        if(Map.gold>=10)
        {
        Map.gold=Map.gold-10;
        Map.bt.damage=Map.bt.damage+20;
        JOptionPane.showMessageDialog(null, "Upgrade Successful!");
        }
        else{
        JOptionPane.showMessageDialog(null, "You need more gold!");    
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

        public void flip() {
        item tempo = Head;
        Head = null;
        while (tempo != null) {
            item temp = tempo;
            tempo = tempo.Next;
            temp.Next = Head;
            Head = temp;
        }
    }
        
    public void createLinkedList() throws FileNotFoundException, IOException {
RandomAccessFile ranfile0 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD0", "rw");          
RandomAccessFile ranfile1 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD1", "rw");
RandomAccessFile ranfile2 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD2", "rw");
RandomAccessFile ranfile3 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD3", "rw");
RandomAccessFile ranfile4 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD4", "rw");
RandomAccessFile ranfile5 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD5", "rw");
RandomAccessFile ranfile6 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD6", "rw");
RandomAccessFile ranfile7 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD7", "rw");
RandomAccessFile ranfile8 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD8", "rw");
RandomAccessFile ranfile9 = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSaveHS.TD9", "rw");
        
            checkIfEmpty(ranfile0);
            item temp0= new item();
            temp0.load(ranfile0);
            Head=temp0;
            
            item temp= new item();
            checkIfEmpty(ranfile1);
            temp.load(ranfile1);
            Head.Next=temp;
            
            item temp1= new item();
            checkIfEmpty(ranfile2);
            temp1.load(ranfile2);
            temp.Next=temp1;
            
            item temp2= new item();
            checkIfEmpty(ranfile3);
            temp2.load(ranfile3);
            temp1.Next=temp2;
            
            item temp3= new item();
            checkIfEmpty(ranfile4);
            temp3.load(ranfile4);
            temp2.Next=temp3;
            
            item temp4= new item();
            checkIfEmpty(ranfile5);
            temp4.load(ranfile5);
            temp3.Next=temp4;
            
            item temp5= new item();
            checkIfEmpty(ranfile6);
            temp5.load(ranfile6);
            temp4.Next=temp5;
            
            item temp6= new item();
            checkIfEmpty(ranfile7);
            temp6.load(ranfile7);
            temp5.Next=temp6;
            
            item temp7= new item();
            checkIfEmpty(ranfile8);
            temp7.load(ranfile8);
            temp6.Next=temp7;
            
            item temp8= new item();
            checkIfEmpty(ranfile9);
            temp8.load(ranfile9);
            temp7.Next=temp8;
            Tail=temp8;
    }
    public void checkIfEmpty(RandomAccessFile ranfile) throws FileNotFoundException, IOException{
    if(ranfile.length()==0)   
    {
    ranfile.seek(Recordsize);
    ranfile.writeUTF("Nobody Yet");
    ranfile.writeInt(0);
    ranfile.writeInt(0);
    ranfile.writeInt(0);
    ranfile.writeInt(0);
    ranfile.writeInt(0);
    ranfile.writeInt(0);
    }
    }
   
    public void load(node temp, RandomAccessFile ranfile) throws FileNotFoundException, IOException{
    ranfile.seek(0);
    String a = ranfile.readUTF();
    if(a!=null)
    temp.setName(a);  
    else
    temp.setName("-");
    temp.setScore(ranfile.readInt());
    if(temp.next!=null)
    {
    temp=temp.next;
    load(temp, ranfile);
    }}
    
   public void save(item thisRec) throws FileNotFoundException, IOException{
    RandomAccessFile ranfile = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSave.TD", "rw");
    {
            try{
                
                String a=thisRec.getName();
                if(a==null) {
                    a=("-");
                }
                ranfile.seek(Recordsize);
                ranfile.writeUTF(a);
                ranfile.writeInt(thisRec.getScore());
                ranfile.writeInt(thisRec.Gold);
                ranfile.writeInt(thisRec.Bbullets);
                ranfile.writeInt(thisRec.Rbullets);
                ranfile.writeInt(thisRec.life);
                ranfile.writeInt(thisRec.level);
            }
            catch (IOException exc)
            { System.out.println(exc.toString());}
        }
   }

    public void display(node temp){
    //load LinkedList from RAF file
    String Display;    
    if(Head==null)
    {
    JOptionPane.showMessageDialog(null, "THE LIST IS EMPTY!");
    }else{
    count++;
    JOptionPane.showMessageDialog(null, "In the " + count + " place: " + "\n" + "Name: " + temp.getName() + "\n" + "Score: " + temp.getScore());
    if((count<10)&&(temp.next!=null))
    {
    temp=temp.next;    
    display(temp);   
    }}}
    
    public class node{
    private int score;    
    private String Username;   
    node next;
    
    public void setScore(int SCORE)
    {score= SCORE;}  
    
    public void setName(String USER)
    {Username=USER;}
    
    
    public int getScore()
    {return score;}
    
    public String getName()
    {return Username;}
    }
    
    public void Sort(){
        item current= new item();
        item spot = new item();
        
    for(int k=0; k<10; k++){
          spot= Head;
          for(int l=0; l<10; l++){
          if(spot.getScore()<spot.Next.getScore()) 
          {
          String a= spot.getName();
          int b= spot.getScore();
          spot.setScore(spot.Next.getScore());
          spot.setName(spot.Next.getName());  
          spot.Next.setScore(b);
          spot.Next.setName(a);
          } 
          else
          {
          spot=spot.Next;   
          }}}}
    
    
    
    public class item extends node{
        
        int Gold, life, level;
        int Bbullets, Rbullets;
        item Next;
        
        
              public void load(RandomAccessFile ranfile){
           try{ ranfile.seek(Recordsize);
                setName(ranfile.readUTF());
                setScore(ranfile.readInt());
                Gold=ranfile.readInt();
                Bbullets=ranfile.readInt();
                Rbullets=ranfile.readInt();
                life=ranfile.readInt();
                level=ranfile.readInt();
             }
            catch (IOException exc)
            { System.out.println(exc.toString());}
           }
               
        
        public void save(RandomAccessFile ranfile){
            try{
                
                String a=getName();
                if(a==null) {
                    a=("-");
                }
                ranfile.seek(Recordsize);
                ranfile.writeUTF(a);
                ranfile.writeInt(getScore());
                ranfile.writeInt(Gold);
                ranfile.writeInt(Bbullets);
                ranfile.writeInt(Rbullets);
                ranfile.writeInt(life);
                ranfile.writeInt(level);
            }
            catch (IOException exc)
            { System.out.println(exc.toString());}
        }
        }


    
        public void create(RandomAccessFile ranfile) throws FileNotFoundException, IOException {
            item thisRec=new item();
            thisRec.setName(Map.name);
            thisRec.Gold=Map.gold;
            thisRec.Bbullets=Map.basicB;
            thisRec.Rbullets=Map.rangeB;
            thisRec.life=Map.lives;
            thisRec.setScore(Map.Score);
            thisRec.level=Map.Level;
            save(thisRec);
        }

public void load(){
            
            try {
            RandomAccessFile ranfile = new RandomAccessFile("C:/Users/George/Documents/NetBeansProjects/TowerDefense/src/TowerDefense/TowerDefenseSave.TD", "rw");
            item thisRec=new item();
            thisRec.load(ranfile);
            Map.Score=thisRec.getScore();
            Map.gold= thisRec.Gold;
            Map.name=thisRec.getName();
            Map.basicB= thisRec.Bbullets;
            Map.rangeB= thisRec.Rbullets;
            Map.lives= thisRec.life;
            Map.Level= thisRec.level;
            JOptionPane.showMessageDialog(null, "Your loaded data is the following:" 
                    + "\n" + "Name: " + Map.name + "\n" + "Gold: " + Map.gold + "\n" + "Lives: " + Map.lives
                    + "\n" + "Score: " + Map.Score + "\n" + "Ranged Bullets: " + Map.rangeB + "\n" + "Basic Bullets: " + Map.basicB
                    + "\n" + "Level: " + Map.Level);
           Map.mobs[0].hp=100;
           Map.mobs[0].hp=Map.mobs[0].hp+(20*(Map.Level-1));
            } catch (FileNotFoundException ex) {
            Logger.getLogger(ButtonsManage.class.getName()).log(Level.SEVERE, null, ex);
        }}


 
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaveData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveData().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
