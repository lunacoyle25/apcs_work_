/*
Luna Coyle 10/23/24
Unit 4 Assignment 2b 
CountOccurences.java
*/ 

public class CountOccurences
{
    public static int countOccurences(String s, String str)
    {
        String repeat = "";
        int count = 0;
        for (int i=0; i +str.length()<= s.length(); i++)
        {
            repeat = repeat + str;
            if (str.equals(s.substring(i,i+str.length())))
            {
                count += 1;
            }
        }
        return count;
    }
    
    public static void testCountOccurences(String s, String str, int expected)
    {
        int result = countOccurences(s,str);
        System.out.println("input: " + s + " inside: " + str + " expected: " + expected + " result: " + result);
        if (result == expected)
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
        testCountOccurences("Mississippi", "iss", 2);
        testCountOccurences("banananana", "na", 4);
        testCountOccurences("Apple pie", "pie", 1);
        testCountOccurences("essatessaessa", "essa", 3);
        testCountOccurences("robloxoxoxoxox", "ox", 5);
    }
}