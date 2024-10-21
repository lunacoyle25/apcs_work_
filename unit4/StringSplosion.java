/*
Luna Coyle 10/21
Assignment 1a
StringSplosion.java
*/

public class StringSplosion
{
    public static String stringSplosion(String str)
    {
        String result = ""; 
        int n = str.length();
        for (int i = 0; i<n; i++)
        {
            result = result + str.substring(0,i+1);
        }
        return result;
    }
    
    public static void testStringSplosion(String n, String expected)
    {
        String result = stringSplosion(n);
        System.out.println("n: " + n + " expected: " + expected + " result: " + result);
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
        testStringSplosion("Code", "CCoCodCode");
        testStringSplosion("abc", "aababc"); 
        testStringSplosion("Magic", "MMaMagMagiMagic");
    }
}