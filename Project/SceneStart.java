import processing.core.*; 
import processing.sound.*;
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
        
        file = new SoundFile(p, "Ice Cream Truck Melody.mp3");
        file.play(); 
        file.loop();  
   }
   
   //from the outside tell the scene to stop the ice cream truck music -- cleans up the scene to move to the next one 
   public void close()
   {
        file.stop(); 
   }
   
   public void display()
   {
        p.background(255, 209, 223);
        
        p.textAlign(p.CENTER, p.CENTER);
        p.textSize(100);
        String s = "Scoop";
        for (int i = 0; i < s.length(); i++)
        {
            if (i%2 == 0) //even
            {
                p.fill(86, 190, 179); //teal 
                p.text(s.substring(i, i+1), (p.width-1020)+43*i, p.height/4);
            }
            else 
            {
                p.fill(255, 255, 255); //white
                p.text(s.substring(i, i+1), (p.width-1020)+43*i, p.height/4);
            }
        }
        
        p.fill(86, 190, 179);
        p.text("M", p.width-745, p.height/4); 
        
        p.textSize(105);
        String a = "adne"; 
        for (int i = 0; i < a.length(); i++)
        {
            if (i%2 == 1) 
            {
                p.fill(86, 190, 179); //teal 
                p.text(a.substring(i, i+1), (p.width-675)+43*i, p.height/4);
            }
            else 
            {
                p.fill(255, 255, 255); //white
                p.text(a.substring(i, i+1), (p.width-675)+43*i, p.height/4);
            }
        }
        p.textSize(107);
        String u = "ss"; 
        //u for the missing u between s&s that would make sus
        for (int i = 0; i < u.length(); i++)
        {
            if (i%2 == 1) 
            {
                p.fill(86, 190, 179); //teal 
                p.text(u.substring(i, i+1), (p.width-514)+35*i, p.height/4);
            }
            else 
            {
                p.fill(255, 255, 255); //white
                p.text(u.substring(i, i+1), (p.width-514)+35*i, p.height/4);
            }
        }
        
        /*p.fill(255, 255, 255);
        //p.fill(199, 25, 0);
        p.textAlign(p.CENTER, p.CENTER);
        p.textSize(90);
        p.text(s, p.width/2, p.height/4); */
        
        
        p.fill(255, 255, 255);
        //p.fill(199, 25, 0);
        p.textSize(50);
        p.text("Try to stack the scoops", p.width-315, 18*p.height/32);
        p.text("as high as you can!", p.width-330, 20*p.height/32);
        
        p.fill(139, 62, 49);
        //p.fill(255, 255, 255);
        p.textSize(40);
        p.text("Press any key to play", p.width/4, 19*p.height/32);
        p.image(icecreamGif, 550, 450, p.width/3, p.height/2);
        
   }
    public void keyPressed()  { }
   
   private PApplet p;
   private PFont airTraveler; 
   private Gif icecreamGif; 
   private SoundFile file; 
}