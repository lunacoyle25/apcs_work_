import processing.core.*; 

public class SceneStart implements Scene
{
   public  SceneStart(PApplet p)
   {
        this.p = p; 
   }
   
   public void setup()
   {
   //fixed screen size and the stuff inside
        //fullScreen(); 
        //surface.setResizable(true);
        //Processing Font. creating variable 
        airTraveler = createFont("Air Travelers Personal Use.otf", 64);
        //referencing file name in Project > Data folder
        textFont(airTraveler);
   }
   
   public void display()
   {
   
   }
   public void draw()
    {
        background(0);
        textSize(40);
        text("Scoop Madness", width/2, height/2);  
        
        scenes.get(current).display(); 
    }
   
   private PApplet p; 
}