/*
Luna Coyle 12/16/24
Unit 9 Assignment 2 
FilteringAList.java
*/

import java.util.*; 

public class FilteringAList
{
    public static ArrayList<Integer> filteringAList(ArrayList<Integer> scores)
    {
        ArrayList<Integer> total = new ArrayList<Integer>();
        for (int value : scores)
        {
            if (value >= 90)
            {
                total.add(value);
            }
        }
        return total;
        //would have to make a new list if I did this
        //  for (int i = scores.size(-1); i < scores.size(); i--) {
          //  if (scores.get(i) <= 90)   {
              //  scores.remove(i);
           // }
      //  }
        
    }
    public static void testFilteringAList(ArrayList<Integer> scores, ArrayList<Integer> expected)
    {
        ArrayList<Integer> result = filteringAList(scores);
        
        for (double score : scores)
        {
            System.out.println(score + " ");
        }
        System.out.println("expected: " + expected + " result: " + result);
        
        if (result.equals(expected))
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
        Integer[] array = {51, 67, 93, 100};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
         
        ArrayList<Integer> aL = new ArrayList<Integer>();
        aL.add(93);
        aL.add(100);
        
        testFilteringAList(arrayList, aL);
    }
}