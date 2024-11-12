/* 
Luna Coyle 11/11/24
Unit  6 Assignment 1
*/

import processing.core.*;

public class Circle
{
    public Circle(PApplet p)
    {
        this.p = p; //save reference in our own class
        position = new PVector(250, 250);
        velocity = new PVector(-2, 2);
        radius = 10;
        c = p.color(0, 128, 128);
    }
    public void display()
    {
        p.fill(c);
        p.ellipse(position.x, position.y, radius*2, radius*2);
        //PApplet functions --> need to reference PApplet to call these functions
        
        position.add(velocity);
        
        if (position.x < radius || position.x > p.width - radius)
        {
            velocity.x *= -1; 
        }
        if (position.y < radius || position.y -1 > p.height - radius)
        {
            velocity.y *= -1; 
        }
    }
    private PApplet p; //reference to main PApplet (Bounce class)
    // pass through constructor
    private PVector position;
    private PVector velocity; 
    private float radius; 
    private int c; //color
}
