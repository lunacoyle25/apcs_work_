/* Luna Coyle 2/9/25 
Unit 11 Assignment 2 
Superclass Animal.java */

public class Animal
{
    public Animal(String name, int legCount, boolean furriness)
    {
        this.name = name; 
        this.legCount = legCount; 
        this.furriness = furriness; 
    }
    
    public String getName()
    {
        return name; 
    }
    public int getLegCount()
    {
        return legCount; 
    }
    public boolean getFurriness()
    {
        return furriness; 
    }
    private String name; 
    private int legCount; 
    private boolean furriness; 
}