/* Luna Coyle 1/23/25 
Unit 10 Assignment 2 
Main Class Person.java */ 

public class Person 
{
    public Person(String name, int numOfPets) 
    {
        this.name = name; 
        this.numOfPets = numOfPets; 
    }
    
    public String getName()
    {
        return name; 
    }
    
    public int getPets()
    {
        return numOfPets; 
    }
    
    private String name; 
    private int numOfPets; 
}