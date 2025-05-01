import processing.core.*; 

class Cone 
{
    Cone(PApplet p, float x, float y, PImage coneImg) // ADDED CONEIMG & P PARAMETER, REMOVED WIDTH HEIGHT PARAM
    {
        this.x = x;
        this.y = y;
        this.p = p; 
        this.coneImg = coneImg;      
        this.vx = 3; 
    }
    
    public float getX()
    {
        return x;
    }
    
    public float getY()
    {
        return y; 
    }
    
    public float getHeight()
    {
        return coneImg.height; 
    }
    
    public float getWidth()
    {
        return coneImg.width;
    }

    public void update() 
    {
        x += vx; 
        if (getX() + getWidth() > p.width || getX() < 0) 
        {
            vx *= -1;
        }
        //crop cone img
    }

    public void display() 
    {
        /*p.rectMode(p.CENTER);
        p.rect(x, y, width, height);*/  //REMOVED
        
        p.image(coneImg, x, y);
    }
    
    //public void keyPressed() {} 
    
    private float x;
    private float y;
    private PApplet p; 
    private PImage coneImg; 
    private float vx; 
}