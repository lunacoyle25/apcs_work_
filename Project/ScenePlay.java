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
    }

    public void setup() 
    {
        
    }

    public void display() 
    {
        p.background(197, 234, 250); 
        
        float x1 = centerX;
        float y1 = p.height; // Bottom tip touching the ground
        float x2 = centerX - triangleWidth / 2;
        float y2 = p.height - triangleHeight; // Top-left corner
        float x3 = centerX + triangleWidth / 2;
        float y3 = p.height - triangleHeight; // Top-right corner

        p.fill(196, 164, 132);
        p.triangle(x1, y1, x2, y2, x3, y3);
        centerX += speed;
        
        if (centerX > p.width - triangleWidth / 2 || centerX < triangleWidth / 2) {
            speed *= -1;
        }
    }
    
    private PApplet p;
    private float centerX; // X position (center of the triangle)
    private float speed; 
    private float triangleWidth; 
    private float triangleHeight; 
}