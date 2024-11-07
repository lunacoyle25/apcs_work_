/* 
Luna Coyle 11/7/24
Unit 5 Assignment 4a 
*/

public class Rectangle
{
    public Rectangle(double baseIn, double heightIn) 
    {
        base = baseIn;
        height = heightIn; 
    }
    public double getBase()
    {
        return base;
    }
    public double getHeight()
    {
        return height;
    }
    public double area()
    {
        return base*height;
    }
    public double perimeter()
    {
        return 2*base + 2*height;
    }
    public double diagonal()
    {
        double answer = base*base + height*height;
        return Math.sqrt(answer);
    }
    private double base; 
    //these are not functions, they are variables, so they DO NOT need parenthesis at the end. 
    private double height; 
} 