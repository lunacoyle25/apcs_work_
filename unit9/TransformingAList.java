/* Luna Coyle 12/16/24
Unit 9 Assignment 3 
TransformingAList.java
*/ 

import java.util.*; 

public class TransformingAList 
{
    public static String reverse(String s)
    {
        String rewrite = "";
        for (int i = s.length()-1; i >= 0; i--)
        {
            rewrite += s.substring(i, i+1); 
        }
        return rewrite;
    }
    
    
   public static void testTransformingAList(String s, String expected)
    {
       String result = reverse(s);
       
       System.out.println("expected: " + expected + " result: " + result);
       
        if (result.equals(expected))
        {
            System.out.println("Yay"); 
        }
   }
    
    public static void main(String[] args)
    {
        testTransformingAList("meow meow", "woem woem");
    }
}