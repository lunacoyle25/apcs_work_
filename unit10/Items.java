/* Luna Coyle 1/21/25
Unit 10 Assignment 1
*/ 

public class Items 
{
    public Items(String name, float price) 
    {
        this.name = name; 
        this.price = price;
    }
    
    public String getName()
    {
        return name; 
    }
    
    public float getPrice()
    {
        return price; 
    }
    
    private String name; 
    private float price; 

}