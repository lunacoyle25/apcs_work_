import java.util.*; 
import processing.core.*; 
import gifAnimation.*;
import processing.sound.*;

public class SceneEnd implements Scene 
{
     public SceneEnd(PApplet p) 
     {
        this.p = p; 
        airTraveler = p.createFont("Air Traveler.otf", 100);
        p.textFont(airTraveler);
        cryingGif = new Gif(p, "crying cone.gif");
        cryingGif.loop();
     }
     
     public void display()
     {
        //p.background(0); 
        //p.image(cryingGif, 550, 450, p.width/2, p.height/2);
        
        //make transparent 
        //fill(0, 0, 0, 150);
        //rect(0, 0, width, height);
        p.background(255, 209, 223); // First
        cryingGif.play();
        p.image(cryingGif, 550, 450, p.width / 2, p.height / 2); 
        //p.background(255, 209, 223);
        
        p.textAlign(p.CENTER, p.CENTER);
        p.textSize(100);
        p.fill(86, 190, 179);
        p.text("You Lost!", p.width/2, p.height/3);
        p.textSize(70);
        p.text("Press any key to play again", p.width/2, p.height/6); 
    }
        
    public void close()
    {
    }
     
     public void keyPressed()
     {
        if (p.keyPressed) 
        {
            ScoopMadness.switchToScene(0);
        }
     }
     
private PApplet p; 
private PFont airTraveler; 
private Gif cryingGif;
private int current; 
private SoundFile file;  
}