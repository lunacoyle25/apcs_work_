/* 
Unit 2 Assignment 3
Luna Coyle 10/1/24
*/

public class goodDeal 
{
    public static boolean goodDeal(double originalPrice, double salePrice)
    {
      if (salePrice < .75*originalPrice)
          {
              return true;
          }
          else
          {
              return false; 
          }
    }
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected)
    {
        boolean result = goodDeal(originalPrice, salePrice);
        System.out.println("Original Price: " + originalPrice + " Sale Price: " + salePrice + " Expected: " + expected + " Result: " + result);
        if (result == expected)
        {
            System.out.println("True"); 
        }
        else 
        {
            System.out.println("False");
        }
    }
    public static void main(String[] args)
    {
        testGoodDeal(6,4,true);
        testGoodDeal(20,14,true);
        testGoodDeal(20,17,false);
    }
}