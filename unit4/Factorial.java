/* 
Luna Coyle 10/18/24
Assignment 2d Unit 4
Factorial.java
*/

public class Factorial
{
    public static double factorial(int n)
    {
        int sum = 1;
        for (int i = 1; i<=n; i++)
        {
            sum = sum*i;
        }
        return sum;
    }
    
    public static void testFactorial(int n, double expected)
    {
        double result = factorial(n);
        System.out.println("n:" + n + " expected: " + expected + " result: " + result);
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
        testFactorial(0,1);
        testFactorial(2,2);
        testFactorial(8,40320);
        testFactorial(10,3628800);
    }
}