/* 
Luna Coyle 12/1/24
Unit 7 Assignment 2
SumOfSquares.java
*/

public class SumOfSquares
{
    public static double sumOfSquares(double[] nums)
    {
        double sum = 0;
        for (int i = 0; i<nums.length; i++)
        {
            sum += nums[i]*nums[i];
        }
        return sum; 
    }
    
    public static void testSumOfSquares(double[] nums, double expected)
    {
        double result = sumOfSquares(nums);
        for (double value : nums)
        {
            System.out.println("nums: " + value);
        }
        System.out.println("expected: " + expected + " result: " + result);
        if (Math.abs(result-expected) < 1e-6)
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
        double[] nums = {0};
        double[] nums1 = {1.0, 2.0, 4.0};
        double[] nums2 = {5.0, 6.0, 7.0}; 
        double[] nums3 = {1.5, 2.6, 3.7};
        
        testSumOfSquares(nums, 0);
        testSumOfSquares(nums1, 21.0);
        testSumOfSquares(nums2, 110);
        testSumOfSquares(nums3, 22.7);
    }
}