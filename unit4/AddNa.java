/* 
Luna Coyle 10/21
Extra Practice 
3) addna.java
*/

public class AddNa
{
    public static String addNa(int n)
    {
        String back = "na";
        String result = "ba";
        for (int i=0; i<n; i++)
        {
          result = result + back;  
        }
        return result;
    }
    public static void testAddNa(int n, String expected)
    {
        String result = addNa(n);
        System.out.println("n: " + n + " expected: " + expected + " result: " + result);
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
        testAddNa(1, "bana");
        testAddNa(3, "bananana");
        testAddNa(5, "bananananana");
    }
}