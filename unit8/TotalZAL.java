/* 
Luna Coyle 12/2/24
Unit 8 Assignment 3 
TotalZAL.java
*/

import java.util.*; 

public class TotalZAL
{
    public static int totalZ(ArrayList<String> values)
    {
        int total = 0;
        
        for (int i = 0; i<values.size(); i++)
        {
            if ((values.get(i).substring(0,1).equals("Z")) || (values.get(i).substring(0,1).equals("z")))
            {
                total += values.get(i).length();
            } 
        }
        return total;
    }
    public static void testTotalZ(ArrayList<String> values, int expected)
    {
        int result = totalZ(values);
        
        for (String value : values)
        {
            System.out.println(value + " ");
        }
        System.out.print("expected: " + expected + " result: " + result);
        if (result == expected)
        {
            System.out.print(" Yay");
        }
        else 
        {
            System.out.print(" Neigh");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        ArrayList<String> dune = new ArrayList<>(); 
        dune.add("Zorro");
        dune.add("zebra");
        dune.add("Yak");
        dune.add("zoology");
        dune.add("lemon");
        
        testTotalZ(dune, 17);
    }
}