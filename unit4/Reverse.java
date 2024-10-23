/*
Luna Coyle 10/23/24
Unit 4 Assignment 2c 
Reverse.java
*/ 

public class Reverse
{
    public static String reverse(String str)
    {
        String result = "";
        for (int i=str.length()-1; i>= 0; i--)
        {
            result += str.substring(i, i+1);
        }
        return result;
    }
    
    public static void testReverse(String str, String expected)
    {
        String result = reverse(str);
        System.out.println("str: " + str + " expected: " + expected + " result: " + result);
        if (result.equals(expected))
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }
    }
    
    public static void main(String[] args)
    {
        testReverse("bad", "dab");
        testReverse("tacocat", "tacocat");
        testReverse("XoXo", "oXoX");
        testReverse("1234", "4321");
        testReverse("Supercalifragilistic", "citsiligarfilacrepuS");
    }
}