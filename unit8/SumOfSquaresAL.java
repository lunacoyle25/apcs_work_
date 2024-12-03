/* 
Luna Coyle 12/2/24
Unit 8 Assignment 2 
SumOfSquaresAL.java
*/

import java.util.*; 

public class SumOfSquaresAL
{
    public static double sumOfSquares(ArrayList<Double> values)
    {
        double sum = 0;
        for (int i = 0; i<values.size(); i++)
        {
            sum += values.get(i)*values.get(i);
        }
        return sum; 
    }
    public static void testSumOfSquares(ArrayList<Double> values, double expected)
    {
        double result = sumOfSquares(values);
        for (double value : values)
        {
            System.out.println(value + " ");
        }
        System.out.println("expected: " + expected + " result: " + result);
        if (result == expected)
        {
            System.out.println("Yay");
        }
        else 
        {
            System.out.println("Neigh");
        }
        System.out.println();
        
    }
    public static void main(String[] args)
    {
        ArrayList<Double> values = new ArrayList<Double>(); 
        values.add(8.5);
        values.add(2.0);
        values.add(4.9);
        
        testSumOfSquares(values, 100.26);
    }
}