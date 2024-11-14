/* 
Luna Coyle 11/14/24 
Unit 5 Practice Assignment 1
Person0.java
*/

public class Person0
{
    public Person0(String name, int numOfPets)
    {
        this.name = name;
        this.numOfPets = numOfPets;
    }
    public String getName()
    {
        return name;
    }
    public int getNumOfPets()
    {
        return numOfPets;
    }
    public void greeting()
    {
        System.out.println("Hello, my name is " + name + ", and I have " + numOfPets + " pets.");
    }
    private String name;
    private int numOfPets; 
}
