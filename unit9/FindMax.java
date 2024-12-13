/* 
Luna Coyle 12/6/24
Unit 9 Assignment 1 
FindMax.java
*/ 

import java.util.*; 

public class FindMax 
{
    public static double findMax(ArrayList<Double> values)
    {
        double og = values.get(0);
        
        for (double value : values)
        {
            if (value > og)
            {
                og = value; 
            }
        }
        return og;
    }
    
    public static void testFindMax(ArrayList<Double> values, double expected)
    {        
        double result = findMax(values);
        
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
        Double[] array = {1.0, 2.1, 5.3};
        ArrayList<Double> arrayList = new ArrayList<>(Arrays.asList(array));
        
        testFindMax(arrayList, 5.3);
        
        Double[] array1 = {-1.5, -3.0, -1.55};
        ArrayList<Double> arrayList1 = new ArrayList<>(Arrays.asList(array1));
        
        testFindMax(arrayList1, -1.5);
    }
}
