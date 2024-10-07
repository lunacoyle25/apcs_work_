/*
Assignment 2
Luna Coyle 
10/7/24
*/

public class Greetings
{
    public static String greetings(String name)
    {
        String str = "What's up, , how are you?";
        String front = str.substring(0, 11);
        String back = str.substring(11);
        return front + name + back;
    } 
    public static void testGreetings(String name, String expected)
    {
        String result = greetings(name);
        System.out.println("name: " + name);
        System.out.println("expected: " + expected);
        System.out.println("result: " + result); 
        
        if (result.equals(expected))
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
        testGreetings("Ms. Mary Mack", "What's up, Ms. Mary Mack, how are you?");
        testGreetings("Louise", "What's up, Louise, how are you?");
        testGreetings("Baby Yoda", "What's up, Baby Yoda, how are you?");
    }
}