/* 
Luna Coyle 10/21
Assignment 2
SumofSquares.java
*/

public class SumOfSquares
{
    public static int sumOfSquares(int n)
    {
        int q=0;
        for (int i=1; i<=n; i++)
        {
            q += i*i;
        }
        return q;
    }
    
    public static void testSumOfSquares(int input, int expected)
    {
        int result = sumOfSquares(input);
        System.out.println("input: " + input + " expected: " + expected + " result: " + result);
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
        testSumOfSquares(1, 1);
        testSumOfSquares(3, 14);
        testSumOfSquares(4, 30);
    }
}