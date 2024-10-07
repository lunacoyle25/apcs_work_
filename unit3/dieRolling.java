/*
Assignment 5
Luna Coyle 
10/7/24
*/

public class dieRolling
{
  public static void dieRolling()
    {
        double a = Math.random();
        if (a <= 0.167)
        {
            System.out.println("1");
        }
        if (a > 0.167 && a <= 0.33)
        {
            System.out.println("2");
        }
        if (a > 0.33 && a <= 0.5)
        {
            System.out.println("3");
        }
        if (a > 0.5 && a <= 0.667)
        {
            System.out.println("4");
        }
        if (a > 0.667 && a <=0.833)
        {
            System.out.println("5");
        }
        else
        {
            System.out.println("6");
        }    
    }
    public static void main(String[] args)
    {
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
        dieRolling();
    }  
}