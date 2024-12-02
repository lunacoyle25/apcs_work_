/* 
Luna Coyle 12/1/24
Unit 7 Assignment 3 
TotalZ.java
*/ 

public class TotalZ
{
    public static int totalZ(String[] dune)
    {
        int total = 0;
        
        for (int i = 0; i<dune.length; i++)
        {
            if ((dune[i].substring(0,1).equals("Z")) || (dune[i].substring(0,1).equals("z")))
            {
                total += dune[i].length();
            } 
        }
        return total;
    }
    public static void testTotalZ(String[] dune, int expected)
    {
        int result = totalZ(dune);
        for (String value : dune)
        {
            System.out.println(value + " ");
        }
        System.out.println("expected: " + expected + " result: " + result);
        if (result == expected)
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        String[] dune = {"Dr. Kessner", "Tessa"};
        String[] dune1 = {"Zelda", "Mario", "zuigi", "Yoshi"};
        String[] dune2 = {"ziltch", "zoomies", "Zonkey"};
        String[] dune3 = {"zoologist", "zebra", "zookeeper", "pink panda"};
        
        testTotalZ(dune, 0);
        testTotalZ(dune1, 10);
        testTotalZ(dune2, 19);
        testTotalZ(dune3, 23);
    }
}