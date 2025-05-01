import java.util.*; 
import processing.core.*; 

public class FallingScoops 
{
    public FallingScoops(PApplet p, Cone cone, PImage mintChip)
    {
        this.p = p; 
        this.x = x; 
        this.y = 0;
        this.falling = false; 
        this.attached = false;
        this.cone = cone;  
        this.mintChip = mintChip;
    }
    
    public void fall()
    {
        falling = true;
    }
    
    public void update() 
    {
        //System.out.println("attached " + attached);
        if (falling)
        {
            y += 10; 
        }
        if (attached) 
        {
            x = cone.getX();
        }
    }

    public void attachTo(Cone cone)
    {
        attached = true;
        x = cone.getX(); 
        y = cone.getY() - cone.getHeight() / 2;
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
        
        System.out.println("SB: " + scoopBottom + " SL: " + scoopLeft + " SR: " + scoopRight + "  CT: " + coneTop + " CL: " + coneLeft + " CR: " + coneRight + "          " + p.width + " " + p.height);
        
        if (scoopBottom >= coneTop && scoopLeft <= coneRight && scoopRight >= coneLeft)   // CHANGED DIST TO COMPARING BOUNDARY BOX
        {
            isTouching = true;
            System.out.println("istouching");
        }
        else
        {
            isTouching = false;
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
    }*/
    
    public void display() 
    {
        p.image(mintChip, p.width/2 - mintChip.width/8, y);                 //DELETED WIDTH RESIZE
    }
    
    private PApplet p; 
    private float scoopY; 
    private boolean falling; 
    private float x; 
    private float y;
    private Cone cone;
    private PImage mintChip; 
    private boolean attached; 
    public float getScoopY() { return y; }
    public float getScoopX() { return x; }
}