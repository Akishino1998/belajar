import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public tanah_1 tanah = new tanah_1();
    public tanah_1 tanah2 = new tanah_1();
    public tanah_1 tanah3 = new tanah_1();
    public tanah_2 tanahgerak = new tanah_2();
    public chara karakter = new chara();
    public skor_papan papanskor = new skor_papan();
    int bintang = 50;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1, false);
        addObject(tanah, 50, 600);
        addObject(tanah2, 300, 500);
        addObject(tanah3, 100, 300);
        addObject(tanahgerak, 400, 200);
        addObject(karakter, 50, 500);
        addObject(papanskor, 517, 40);
        
        for(int i= 0; i<3; i++){
            addObject(new skor_isi(),417+bintang, 55);
            bintang+=50;
            
        }
        
    }
    public gameover selesai = new gameover();
    public void act(){
        
        if(karakter.getY()>=getHeight()){
            addObject(selesai, getWidth()/2, getHeight()/2);
            Greenfoot.stop();
            
        }
    } 
   
}
