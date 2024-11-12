/* 
Luna Coyle 11/11/24
Unit 6 Assignment 1b
*/

import processing.core.*;
import java.util.*; //for ArrayList

public class Bounce extends PApplet
{
    public void settings()
    {
        size (500,500);
    }
    public void setup()
    {
       circles = new ArrayList<Circle>();
       circles.add(new Circle(this));
    }
    public void draw()
    {
        background (255, 0, 0);
        for (Circle b : circles)
        {
            b.display();
        }
    }
    private ArrayList<Circle> circles;
    
    public static void main(String[] args)
    {
        PApplet.main("Bounce");
    }
}