/*
Assignment 4
Luna Coyle 
10/7/24
*/

public class coinFlip
{
    public static void coinFlip()
    {
        double a = Math.random();
        if (a >= 0.5)
        {
            System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }    
    }
    public static void main(String[] args)
    {
        coinFlip();
        coinFlip();
        coinFlip();
        coinFlip();
        coinFlip();
        coinFlip();
        coinFlip();
        coinFlip();
        coinFlip();
        coinFlip();
    }
}