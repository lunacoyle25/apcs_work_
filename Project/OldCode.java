/*public class ScenePlay implements Scene 
{
     public ScenePlay(PApplet p) 
     {
        this.p = p;
        this.centerX = p.width / 2;
        this.speed = 4; 
        this.cone = p.loadImage("cone.png");
        sky = p.loadImage("Seamless Blue Sky.jpg"); 
        sky.resize(p.width, p.height);
         
         //need to do something like this...ask Jasmine? 
         //fallingScoops = ArrayList<FallingScoops>(); 
         //fallingScoops.add(new fallingScoop())
         
        //this.fallingScoops = fallingScoops;
        scoop = new FallingScoops(p);
        //cone = new Cone(p.width / 2, p.height - 50, 100, 20);
        scoops = new ArrayList<>();
        scoops.add(new FallingScoops(p.width / 2, 0, 20));
     }
    
    public void display() 
    {
        p.background(sky); 
        p.image(sky, 0, 0, p.width, p.height);
    
        float coneHeight = cone.height / 3;
        float coneWidth = cone.width / 3;
        float coneY = p.height - coneHeight;
        float coneX = centerX;

        p.image(cone, coneX - coneWidth / 2, coneY, coneWidth, coneHeight);
    
        centerX += speed;
        if (centerX > p.width - coneWidth / 4 || centerX < coneWidth / 4) 
        {
            speed *= -1;
        }

        scoop.update(coneX, coneY, coneWidth);
        if (scoop.update(coneX, coneY, coneWidth)) 
        {
            gameOver = true;
        }
        scoop.display(); //display and update in ScenePlay
        
        p.background(255);

        cone.update();
        cone.display();

        for (Scoop scoop : scoops) 
        {
            if (!scoop.isAttached())
            {
                scoop.update();
            }
            if (scoop.touches(cone)) 
            {
                scoop.attachTo(cone);
            } 
            else
            {
                scoop.follow(cone);
            }
            scoop.display();
        }
    }

    public void close()
    {      
    }
    
    public boolean isGameOver()
    {
        return gameOver;
    }
    
    public void keyPressed()
    {
        if (p.key == ' ') 
        {
            scoop.fall();
        }
    }
   
    private Cone cone;
    private ArrayList<FallingScoops> scoops;
    private PApplet p;
    private float centerX; // x position (center of the cone)
    private float speed; 
    private PImage cone;
    private PImage sky; 
    FallingScoops scoop;
    //private FallingScoops fallingScoops; 
    private boolean gameOver = false;
}

/* MORE RECENT SCENEPLAY
import java.util.*; 
import processing.core.*; 
import java.awt.Rectangle;

public class ScenePlay implements Scene {

    public ScenePlay(PApplet p) 
    {
        this.p = p;
        this.centerX = p.width / 2;
        this.speed = 4;
        this.cone = new Cone(p.width / 2, p.height - 50, 100, 20); //cone constructor
        this.sky = p.loadImage("Seamless Blue Sky.jpg");
        sky.resize(p.width, p.height);
        
        this.scoops = new ArrayList<>();
        scoops.add(new FallingScoops(p)); 
        
        this.coneImage = p.loadImage("cone.png");
        this.mintChip = p.loadImage("mint chip scoop.png"); 
        //mintChip.resize(p.width, p.height);
    }

    public void display() 
    {
        p.background(sky);
        p.image(sky, 0, 0, p.width, p.height);

        float coneHeight = coneImage.height / 3;
        float coneWidth = coneImage.width / 3;
        float coneY = p.height - coneHeight;
        float coneX = centerX;

        p.image(coneImage, coneX - coneWidth / 2, coneY, coneWidth, coneHeight);

        centerX += speed;
        if (centerX > p.width - coneWidth / 4 || centerX < coneWidth / 4) 
        {
            speed *= -1;
        }

        /*for (Scoop s : scoops)
        {
            s.update(coneX, coneY, coneWidth);
            if (s.update(coneX, coneY, coneWidth)) 
            {
                gameOver = true;
            }
            s.display(); 
        } 

        for (FallingScoops scoop : scoops) 
        {
            scoop.update();
            if (scoop.touches(cone)) 
            {
                System.out.println("is touching");
                scoop.attachTo(cone);
            }
            scoop.display();
        }
    }

    public void close() 
    {
    }

    public boolean isGameOver() 
    {
        return gameOver;
    }

    public void keyPressed() 
    {
        if (p.key == ' ') 
        {
            for (FallingScoops s : scoops)
            {
               s.fall(); 
            }
        }
    }
    
    private Cone cone;
    private ArrayList<FallingScoops> scoops;
    private PApplet p;
    private float centerX;
    private float speed;
    private PImage coneImage;
    private PImage sky;
    private boolean gameOver = false;
}*/

/* FALLING SCOOPS
import java.util.*; 
import processing.core.*; 

public class FallingScoops 
{
    public FallingScoops(PApplet p, PImage mintChip, PImage cone)
    {
        this.p = p; 
        this.x = x; 
        this.y = 0;
        this.falling = false; 
        boolean attached = false;
        this.cone = cone;  
        this.mintChip = mintChip; 
    }
    
    public void fall()
    {
        falling = true;
    }
    
    public void update() 
    {
        if (falling)
        {
            y += 6; 
        }
        
        System.out.println(y);
    }

    public void attachTo(Cone cone)
    {
        x = cone.getX(); 
        y = cone.getY();  
        System.out.println("hi"); 
    }

    boolean touches(Cone cone) 
    {
        float scoopBottom = y + mintChip.height;
        float scoopLeft = x;
        float scoopRight = x + mintChip.width;
        float coneTop = cone.getY();
        float coneLeft = cone.getX();
        float coneRight = cone.getX() + cone.getWidth();
        
        boolean isTouching = false; 
        
        if (p.dist(scoopBottom, scoopRight/2, coneTop, coneRight/2) <= 40)   
        {
            isTouching = true; 
            System.out.println(isTouching);
        }
        else
        {
            isTouching = false; 
            System.out.println(isTouching);
        }
            //dist(x, y, )
        
        //System.out.println(p.width + " " + p.height + "\n" + scoopBottom + " " + scoopLeft + " " + scoopRight);
        //System.out.println(coneTop + " " + coneLeft + " " + coneRight);
        
        return isTouching;
    }
    
    /*public boolean drop(float coneX, float coneY, float coneWidth) 
    {
        if (falling) 
        {
            scoopY += 7; //Adjust speed when others change
            
        }

            //check collision w cone
            if (scoopY >= coneY) 
            {
                float scoopX = p.width / 2;
                if (scoopX > coneX - coneWidth / 2 && scoopX < coneX + coneWidth / 2) 
                {
                    falling = false; //stop on cone
                } 
                else 
                {
                    System.out.println("Game Over");
                    return true; 
                    //p.noLoop()//Stop the game if missed
                }
            }
        return false; 
    }
    
    public void display() 
    {
        p.image(mintChip, p.width/2 - mintChip.width/8, y, mintChip.width/8, mintChip.height/8);
    }
    
    private PApplet p; 
    private float scoopY; 
    private boolean falling; 
    private float x; 
    private float y;
    private Cone cone;
    private PImage mintChip; 
}*/

/* CONE
import processing.core.*; 

class Cone 
{
    Cone(float x, float y, float width, float height) 
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.p = p; 
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
        return height; 
    }
    
    public float getWidth()
    {
        return width;
    }

    public void update() 
    {
        if (p.keyPressed) 
        {
            if (p.keyCode == p.LEFT) //for LEFT can also do PApplet.LEFT bc it is static
            {
                x -= 3;
            } 
            else if (p.keyCode == p.RIGHT) 
            {
                x += 3;
            }
        }
    }

    public void display() 
    {
        p.rectMode(p.CENTER);
        p.rect(x, y, width, height);
    }
    
    //public void keyPressed() {} 
    
    private float x;
    private float y;
    private float width;
    private float height; 
    private PApplet p; 
}*/
