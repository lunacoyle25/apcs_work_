import java.util.*; 
import processing.core.*; 

public class FallingScoops 
{
    public FallingScoops()
    {
        this.p = p; 
        mintChip = p.loadImage("mint chip scoop.png"); 
        mintChip.resize(p.width, p.height);
        this.scoop_y = scoop_y; 
        
    }
    
    public void setup()
    {
        scoop_y = 0; 
    }
    
    public void display()
    {
        p.image(mintChip, 50, 50, p.width/2, scoop_y);
        //if (mintChip.height <= )
        //{
            //mintChip.height = 
        //}
    }
    
    public void keyPressed()
    {
        scoop_y += 10; 
    }
    
    private PImage mintChip; 
    private PApplet p; 
    private float scoop_y; 
}