/*
Luna Coyle 10/21
Assignment 1b
FrontTimes.java
*/

public class FrontTimes
{
    public static String frontTimes(String str, int n) 
    {
        int frontLen = 3;
        if (frontLen > str.length()) 
        {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);
        String result = "";
        for (int i=0; i<n; i++) 
        {
            result = result + front;
        }
        return result;
    }
    
    public static void testFrontTimes(String input, String expected, int n)
    {
        String result = frontTimes(input, n);
        System.out.println("input: " + input + " n:" + n + " expected: " + expected + " result: " + result);
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
        testFrontTimes("Chocolate", "ChoCho", 2);
        testFrontTimes("Chocolate", "ChoChoCho", 3);
        testFrontTimes("Abc", "AbcAbcAbc", 3);
        testFrontTimes("A", "A", 1);
    }
}