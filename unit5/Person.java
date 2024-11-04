/* 
Luna Coyle 11/3/24
Unit 5 Assignment 1 
*/

public class Person
{
    private static String name;
    private int numberOfPets;
    
    public Person(String nameIn, int numberOfPets)
    {
        name = nameIn;
        this.numberOfPets = numberOfPets;
    }

    public void setName(String personsName)
    {
        name = personsName;
    }
    
    public String getName(String personsName)
    {
        return name; 
    }
    public void greeting()
    {
        System.out.println("Hello, my name is " + name + " and I have " + numberOfPets + " pets.");
    }
    
    private static final int petCount = 1;
}