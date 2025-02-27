import java.util.*; 
import processing.core.*; 
import java.awt.Rectangle;

public class ScenePlay implements Scene {
     public ScenePlay(PApplet p) 
     {
        this.p = p;
        this.centerX = p.width / 2;
        this.triangleWidth = 50; 
        this.triangleHeight = 100; 
        this.speed = 3; 
        sky = p.loadImage("Seamless Blue Sky.jpg"); 
        sky.resize(p.width, p.height);
         
        //this.fallingScoops = fallingScoops;
    }

    /*
    public void draw()
    {
        p.background(sky); 
        p.image(sky, 0, 0, p.width, p.height);
    }
    */

    public void display() 
    {
        p.background(sky); 
        //p.fallingScoops; 
        float x1 = centerX;
        float y1 = p.height; //bottom tip touching the ground
        float x2 = centerX - triangleWidth / 2;
        float y2 = p.height - triangleHeight; // top-left corner
        float x3 = centerX + triangleWidth / 2;
        float y3 = p.height - triangleHeight; // top-right corner

        p.fill(196, 164, 132);
        p.triangle(x1, y1, x2, y2, x3, y3);
        centerX += speed;
        
        if (centerX > p.width - triangleWidth / 2 || centerX < triangleWidth / 2) {
            speed *= -1;
        }  
    }
    
    private PApplet p;
    private float centerX; // x position (center of the triangle)
    private float speed; 
    private float triangleWidth; 
    private float triangleHeight; 
    private PImage sky; 
    //private FallingScoops fallingScoops; 
}