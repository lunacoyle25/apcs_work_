/* Luna Coyle 1/14/25
Starter Processing Display 
*/ 

import processing.core.*; 

public class Bounce extends PApplet
{ 
    public void settings()
    {
        size(500, 500);
    }
    public void setup()
    {
        circle = new ArrayList<Circle>();
        circle.add(new Circle(this));
    }
    public void draw()
    {
        background(B27FEE);
        for (Circle x : cirlces)
        {
            x.display(); 
        }
    }
    public void keyPressed()
    {
        for (int i=0; i<10; i++)
        balls.add(new Ball(this)); 
    }
    
    private ArrayList<Circle> circles;
    
    public static void main(String[] args)
    {
        PApplet.main("Bounce");
    }
}