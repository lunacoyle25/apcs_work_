import processing.core.*; 
import gifAnimation.*;

public class SceneStart implements Scene
{
   public SceneStart(PApplet p)
   {
        this.p = p; 
        //fixed screen size and the stuff inside
        //fullScreen(); 
        //surface.setResizable(true);
        //Processing Font. creating variable 
        airTraveler = p.createFont("Air Traveler.otf", 100);
        //referencing file name in Project > Data folder
        p.textFont(airTraveler);
        icecreamGif = new Gif(p, "Ice Cream Drop.gif");
        icecreamGif.loop();
 
   }
   
   public void setup()
   {
        
   }
   
   public void draw()
   {
        
   }
   public void display()
   {
        p.background(255, 209, 223);
        p.textSize(90);
        p.textAlign(p.CENTER, p.CENTER);
        p.text("Scoop Madness", p.width/2, p.height/2);  
        p.image(icecreamGif, 200, 350, p.width/2, p.height/2);
   }
   
   private PApplet p;
   private PFont airTraveler; 
   private Gif icecreamGif; 
}