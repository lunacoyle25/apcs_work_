/* 
Luna Coyle 11/7/24
Unit 5 Assignment 4b 
*/ 

public class testRectangle
{
    public static void main(String[] args)
    {
        Rectangle a = new Rectangle(6,6);
        System.out.println("base: " + a.getBase() + " height: " + a.getHeight() + " area: " + a.area() + " perimeter: " + a.perimeter() + " diagonal length: " + a.diagonal()); 
        
        Rectangle b = new Rectangle(3,4);
        System.out.println("base: " + b.getBase() + " height: " + b.getHeight() + " area: " + b.area() + " perimeter: " + b.perimeter() + " diagonal length: " + b.diagonal()); 
        
        Rectangle c = new Rectangle(2,9);
        System.out.println("base: " + c.getBase() + " height: " + c.getHeight() + " area: " + c.area() + " perimeter: " + c.perimeter() + " diagonal length: " + c.diagonal()); 
    }
}