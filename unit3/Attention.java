/* 
Assignment 3
Luna Coyle 
10/7/24
*/ 

public class Attention
{
    public static boolean attention(String input)
    {
        String str = "Hey you!";
        if (input.length() < 8)
        {
           return false;
        }
        if (input.substring(0,8).equals(str))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void testAttention(String input, boolean expected)
    {
        boolean result = attention(input);
        System.out.println("input: " + input + "  expected: " + expected + "  result: " + result);
        
        if (result == expected)
        {
            System.out.println("correct"); 
        }
        else 
        {
            System.out.println("incorrect");
        }
    }
    public static void main(String[] args)
    {
        testAttention("Hey", false);
        testAttention("Sup, pretty lady", false);
        testAttention("My name is Jane", false);
        testAttention("Hey you! Give me your money", true);
        testAttention("Hey you!", true);
    }
}