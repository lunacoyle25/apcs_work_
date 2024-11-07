/*
Luna Coyle 11/5/24
Unit 5 Assignment 3b 
TestMagicEightBall.java
*/

public class TestMagicEightBall
{
    public static void main(String[] args)
    {
        MagicEightBall magic = new MagicEightBall();
        
        System.out.println("Will I make it through Unit 5?");
        System.out.println("result: " + magic.getAnswer("Will i get an A?"));
    }
}