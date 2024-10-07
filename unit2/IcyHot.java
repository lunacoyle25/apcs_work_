//
//IcyHot.java
//

public class IcyHot{
    public static boolean IcyHot(int temp1, int temp2)
    {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 >100))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
    
    public static void testIcyHot(int temp1, int temp2, boolean expected)
    {
      boolean result = IcyHot(temp1, temp2); 
        System.out.println("temp 1: " + temp1 + "  temp 2: " + temp2 + "  expected: " + expected + "  result: " + result);
        if (result == expected)
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("incorrect");
        }
    }
        
    public static void main(String[] args)
    {
        testIcyHot(-1, 200, true);
        testIcyHot(0,12, false);
        testIcyHot(-9,99, false);
    }
}