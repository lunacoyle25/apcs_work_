/* 
Luna Coyle 11/11/24
Unit 6 Practice 1 
Based off of HelloProcessing class
*/ 

import process.core.*;

public class TinySquare extends PApplet
{
    public void settings()
    {
        size(500,500);
        //always put size function in settings
    }
    public void setup()
    {
        //don't add moving component yet until you fix the PApplet error
    }
    public void draw()
    {
        background(0);
        square(100, 50, 120);
    }
    public static void main(String[] args)
    {
        PApplet.main("HelloTinySquare");
    }
}