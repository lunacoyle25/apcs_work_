import java.util.*; 
import processing.core.*; 
//import java.awt.Rectangle;

public class ScenePlay implements Scene {

    private Cone cone;
    private ArrayList<FallingScoops> scoops;
    private PApplet p;
    private float centerX;
    private float speed;
    private PImage coneImage;
    private PImage sky;
    private boolean gameOver = false;
    private PImage mintChipImg;                  // MADE MINT CHIP IMG

    public ScenePlay(PApplet p) 
    {        
        this.p = p;
        this.centerX = p.width / 2;
        this.speed = 4;
        
        this.sky = p.loadImage("Seamless Blue Sky.jpg");
        sky.resize(p.width, p.height);
        this.scoops = new ArrayList<>();
        
        mintChipImg = p.loadImage("mint chip scoop.png");                         // INITIALIZE MINT CHIP IMG
        mintChipImg.resize(200, 0);                         //
        
        coneImage = p.loadImage("cone.png");     // CROPPED CONE IMG FILE
        
        float coneHeight = coneImage.height / 3;       // MOVED HERE
        float coneWidth = coneImage.width / 3;
        float coneX = p.width / 2;
        float coneY = p.height-170;
        
        coneImage.resize((int) coneWidth, (int) coneHeight); // RESIZE HERE INSTEAD OF IN P.IMAGE
        
        this.cone = new Cone(p, coneX, coneY, coneImage); //cone constructor          // MOVED DOWN
        
        scoops.add(new FallingScoops(p, cone, mintChipImg));   
    }

    public void display() 
    {
        /*float coneHeight = coneImage.height / 3;
        float coneWidth = coneImage.width / 3;
        float coneY = p.height - coneHeight;
        float coneX = centerX;*/                                            // MOVED TO CONSTRUCTOR
        
        p.background(sky);
        p.image(sky, 0, 0, p.width, p.height);
        cone.display();   // DISPLAY CONE

        //p.image(coneImage, coneX - coneWidth / 2, coneY, coneWidth, coneHeight);          // TRANSFERRED TO CONE.JAVA

        /*centerX += speed;
        if (centerX > p.width - coneWidth / 4 || centerX < coneWidth / 4) 
        {
            speed *= -1;
        }*/

        /*for (Scoop s : scoops)
        {
            s.update(coneX, coneY, coneWidth);
            if (s.update(coneX, coneY, coneWidth)) 
            {
                gameOver = true;
            }
            s.display(); 
        }*/
        
        cone.update();        // UPDATE CONE

        for (FallingScoops scoop : scoops) 
        {
            scoop.update();
            if (scoop.touches(cone)) 
            {
                scoop.attachTo(cone);
            }
            scoop.display();
        }
        /*p.textAlign(p.CENTER, p.CENTER);
        p.textSize(100);
        p.fill(86, 190, 179);
        p.text(scoops., p.width/2, p.height/3);
        p.textSize(70); */
        
    }

    public void close() 
    {
        //file.stop(); 
    }

    public boolean isGameOver() 
    {
        for (FallingScoops scoop : scoops) 
        {
            if (scoop.getScoopY() > p.height) 
            {
                return true;
            }
        }
        return false;
    }

    public void keyPressed() 
    {
        if (p.key == ' ') 
        {
            for (FallingScoops s : scoops)
            {
               s.fall(); 
            }
        }
    }
}