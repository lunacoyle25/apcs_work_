/* 
Unit 2 Assignment 2
Luna Coyle 10/1/24
*/

public class isVampire
{
    public static boolean isVampire(float hour, boolean awake)
    {
        if((hour < 6.0 || hour > 22.0) && awake || !awake == true && (hour < 22 && hour > 6))
           {
               return true;
           }
        else 
        {
            return false; 
        }
    }
    public static void testIsVampire(float hour, boolean awake, boolean expected)
    {
        boolean result = isVampire(hour, awake); 
        System.out.println("hour: " + hour + " awake: " + awake +" expected: " + expected + " result: " + result);
        if (result == expected)
        {
            System.out.println("True"); 
        }
        else 
        {
            System.out.println("False");
        }
    }
    public static void main(String[] args)
    {
        testIsVampire(3,false,false);
        testIsVampire(7,true,false);
        testIsVampire(23,false,false);
        testIsVampire(23,true,true);
    }
}