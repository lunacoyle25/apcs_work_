/*
Unit 2 Assignment 1.b 
Luna Coyle 
9/29/24
*/

public class Diff21 
{
    public static void main(String[] args)
    {
        System.out.println(testDiff21(3,18)); 
        System.out.println(testDiff21(22,2));
        System.out.println(testDiff21(-5,26));
    }
    public static int diff21(int n)
    {
        if (n < 21)
        {
            return 21 - n;
        }
        else 
        {
            return (n -21)*2;
        }
    } 
    public static String testDiff21(int n, int expected)
    {
      int result = diff21(n);
        if (result == expected)
        {
            return("True");
        }
        else 
        {
            return("False");
        }
    }
}