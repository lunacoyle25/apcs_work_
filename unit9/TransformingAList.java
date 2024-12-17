/* Luna Coyle 12/16/24
Unit 9 Assignment 3 
TransformingAList.java
*/ 

import java.util.*; 

public class TransformingAList 
{
    public static ArrayList<String> reverse(ArrayList<String> s)
    {
        
        ArrayList<String> rewrite = new ArrayList<String>();
        for (String value : s)
        {
            String reversedString = "";
           for (int i = value.length()-1; i >= 0; i--)
            {
                reversedString += value.substring(i, i+1); 
            } 
            rewrite.add(reversedString);
        }
        return rewrite;   
    }
    
    
   public static void testTransformingAList(ArrayList<String> s, ArrayList<String> expected)
    {
       ArrayList<String> result = reverse(s);
       
        System.out.println("expected: " + expected + " result: " + result);
       
        if (result.equals(expected))
        {
            System.out.println("Yay"); 
        }
       else 
       {
           System.out.println("Neigh");
       }
   }
    
    public static void main(String[] args)
    {
        String[] values = {"meow meow", "california"};
        ArrayList<String> valueList = new ArrayList<>(Arrays.asList(values));
        
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("woem woem");
        expected.add("ainrofilac");
        
        testTransformingAList(valueList, expected);
    }
}