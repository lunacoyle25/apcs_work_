/* 
Luna Coyle 12/1/24
Unit 8 Assignment 1 
CountLuckyAL.java (AL: Array List)
*/

import java.util.*;

public class CountLuckyAL
{
    public static int countLuckyAL(ArrayList<Integer> lucky)
    {
        int count = 0; 
        for (int i = 0; i<lucky.size(); i++) 
        {
         if (lucky.get(i)%7 == 0 || lucky.get(i)%10 == 7)
            {
                count+= 1;
            }
        }
        return count;   
    } 
    
    public static void testCountLuckyAL(Integer[] lucky, int expected)
    {
        ArrayList<Integer> luckyList = new ArrayList<>(Arrays.asList(lucky));
        
        int result = countLuckyAL(luckyList);
        for (int value : luckyList)
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
        ArrayList<Integer> lucky = new ArrayList<>();
        
        Integer[] array = {7, 8, 9};
        lucky.addAll(Arrays.asList(array));
        
        Integer[] array1 = {1, 2, 3};
        lucky.addAll(Arrays.asList(array1));
        
        Integer[] array2 = {1, 49, 17, 33, 35};
        lucky.addAll(Arrays.asList(array2));
        
        Integer[] array3 = {84, 27, 70, 91, 7};
        lucky.addAll(Arrays.asList(array3));
        
        testCountLuckyAL(array, 1);
        testCountLuckyAL(array1, 0);
        testCountLuckyAL(array2, 3);
        testCountLuckyAL(array3, 5);
    }
}