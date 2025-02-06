/* Luna Coyle 1/23/25 
Main Class for Sem2 Project 
ScoopMadness.java
*/ 
 
import processing.core.*; 
import java.util.*; 
import gifAnimation.*;

public class ScoopMadness extends PApplet
{

PFont airTraveler; 
    public void setup()
    {    
        scenes = new ArrayList<Scene>(); 
        scenes.add(new SceneStart(this));
        scenes.add(new ScenePlay(this));
        current = 0; 
    }
    
    public void settings()
    {
        size(600, 600);
    }
    
    public void keyPressed()
    {
        current++; 
        if (current >= scenes.size())
        {
            current = 0; 
        }
    }
    
    private ArrayList<Scene> scenes; 
    private int current;  
    
    public void draw()
    {
        scenes.get(current).display(); 
    }
    
    public static void main(String[] args) 
    {
        PApplet.main("ScoopMadness");
    }
       
}