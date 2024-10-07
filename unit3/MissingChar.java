/*
Assignment 1b 
Luna Coyle
10/7/24
*/

public class MissingChar
{
    public static String MissingChar(String str, int n)
    {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }
    public static void testMissingChar(String str, int n, String expected)
    {
        String result = MissingChar(str, n);
        System.out.println("str: " + str + " n: " + n + " expected: " + expected + " result: " + result);
        
        if (result.equals(expected))
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
        testMissingChar("kitten", 1, "ktten");
        testMissingChar("kitten", 0, "itten"); 
        testMissingChar("worm", 3, "wor");
        testMissingChar("elephants", 7, "elephans");
    }
}