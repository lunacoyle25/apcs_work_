/* Luna Coyle 1/23/25 
Main Class for Sem2 Project 
ScoopMadness.java
*/  
import processing.core.*; 
import java.util.*; 
import gifAnimation.*;

public class ScoopMadness extends PApplet
{ 
    public void setup()
    {    
        scenes = new ArrayList<Scene>(); 
        scenes.add(new SceneStart(this));
        scenes.add(new ScenePlay(this));
        scenes.add(new SceneEnd(this));
        
        current = 0; 
    }
    
    public void settings()
    {    
        fullScreen(); 
        //size(displayWidth, displayHeight);
        //surface.setResizable(true);
        //fixed screen size and the stuff inside
        //frame.setResizable(true);
    }
    
    public void keyPressed()
    {
        if (current == 0)
        {
            scenes.get(current).close();
            current++; 
        }
        else 
        {
            scenes.get(current).keyPressed(); 
            //have to add the keyPressed() to each scene to handle the action
        }
    }
    
    public void draw()
    {
        scenes.get(current).display(); 
        
        if (current == 1) 
        {
            ScenePlay playScene = (ScenePlay) scenes.get(current);
            if (playScene.isGameOver())
            {
                scenes.set(current, new ScenePlay(this)); 
                current = 2;
            }
        }
    }
    
    public static void switchToScene(int index) 
    {
        if (index >= 0 && index < scenes.size()) 
        {
            current = index;
        }
    }
    
    public static void main(String[] args) 
    {
        PApplet.main("ScoopMadness");
    }
    
    PFont airTraveler;
    private static ArrayList<Scene> scenes; 
    private static int current;  
}