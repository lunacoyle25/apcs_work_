/* Luna Coyle 12/17/24
Unit 9 Assignment 4 
ConstructingASequence.java
*/

import java.util.*; 

public class ConstructingASequence
{
    public static int[] fibonacci(int n)
    {
        if (n<=0)
        {
            return new int[0];
        }
        int[] sequence = new int[n];
        if (n>=1) sequence[0]= 0;
        if (n>=2) sequence[1] = 1;
        for (int i = 2; i < n; i++)
        {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence;
        
        
    }
    public static void main(String[] args)
    {
        int n = 5;
        int[] result = fibonacci(n);
        
        System.out.println(n);
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (i < result.length - 1)
            {
                System.out.print(" ,");
            }
        }
        System.out.println();
    }
}