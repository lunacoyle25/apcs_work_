/* 
Luna Coyle 10/28/24
Extra Practice 4
sumPowers.java
*/

public class SumPowers
{
    public static double sumPowers(int n)
    {
        double sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum =  sum + Math.pow(2, i);
        }
        return sum; 
    }
    
    public static void testSumPowers(int n, double expected)
    {
        double result = sumPowers(n);
        System.out.println("n: " + n + " expected: " + expected + " result: " + result);
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
        testSumPowers(0, 0);
        testSumPowers(1, 1); 
        testSumPowers(2, 3);
        testSumPowers(3, 7);
        testSumPowers(5, 33); 
    }
}