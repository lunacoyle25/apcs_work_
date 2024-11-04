/* 
Luna Coyle 10/31/24
Unit 3 Practice for Reassessment
*/

public class OddHeadEvenTail
{
    public static String oddHeadEvenTail(String str)
    {
        if (str.length() == 0)
        {
            return str;
        }
        if (str.length() %2 == 0)
        {
            return str.substring(0,1);
        }
        if (str.length() %2 == 1)
        {
            return str.substring(str.length()-1, str.length());
        }
        
        return "";
    }
    
    public static void testOddHeadEvenTail(String str, String expected)
    {
        String result = oddHeadEvenTail(str);
        System.out.println("string: " + str + " expected: " + expected + " result: " + result);
        if (result.equals(expected))
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }
    }
    
    public static void main(String[] args)
    {
        testOddHeadEvenTail(" ", " ");
        testOddHeadEvenTail("happy", "y");
        testOddHeadEvenTail("abcd", "a");
    }
}