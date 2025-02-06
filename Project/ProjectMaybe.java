/* 
Luna Coyle 11/17/24
Unit 7 Start drafting project that extends PApplet
ProjectMaybe.java
*/

import processing.core.*;

public class ProjectMaybe extends PApplet
{
//just a copy cat of tinysquare... acc make something later
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
        background(134,221,90);
        square(x, 250, 30);
        x++;
        
        if (x > width)
        {
            x = -30;
            //find a way to add an x component
        }
    }
    
    private float x; 
    public static void main(String[] args)
    {
        PApplet.main("ProjectMaybe");
    }
}