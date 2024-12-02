/* 
Luna Coyle 12/1/24
Unit 7 Assignment 1a 
CountLucky.java
*/

public class CountLucky
{
    public static int countLucky(int[] nums)
    {
        int count = 0;
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i]%7 == 0 || nums[i]%10 == 7)
            {
                count+= 1;
            }
        }
        return count; 
    }
    
    public static void testCountLucky(int[] nums, int expected)
    {
        int result = countLucky(nums);
        
        for (int value : nums)
        {
            System.out.println("nums: " + value);
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
        int[] nums = {7, 8, 9};
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 49, 17, 33, 35};
        int[] nums3 = {84, 27, 70, 91, 7};
        
        testCountLucky(nums, 1);
        testCountLucky(nums1, 0);
        testCountLucky(nums2, 3);
        testCountLucky(nums3, 5);
    }
}