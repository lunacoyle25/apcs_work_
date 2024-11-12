/* 
Luna Coyle 11/11/24
Unit 6 Practice 1 
Based off of HelloProcessing class
*/ 

import processing.core.*;

public class TinySquare extends PApplet
{
    public void settings()
    {
        size(500, 500);
        //always put size function in settings
    }
    public void setup()
    {
        x = 40;
    }
    public void draw()
    {
        background(255, 182, 193);
        square(x, 250, 30);
        x++;
        
        if (x > width)
        {
            x = -30;
        }
    }
    
    private float x; 
    public static void main(String[] args)
    {
        PApplet.main("TinySquare");
    }
}