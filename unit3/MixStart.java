/* 
Unit 3 Assignment 1a 
Luna Coyle 
10/7/24
*/ 

public class MixStart
{
    public static boolean MixStart(String str) 
    {
        if (str.length() < 3)
        {
            return false;
        }
        String mix = str.substring(1,3); 
        if (mix.equals("ix"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void testMixStart(String str, boolean expected)
    {
        boolean result = MixStart(str);
        System.out.println("str: " + str + " expected: " + expected + " result: " + result);
        
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
        testMixStart("mix snacks", true);
        testMixStart("fix me", true);
        testMixStart("pizza", false);
        testMixStart("pi", false);
    }
}