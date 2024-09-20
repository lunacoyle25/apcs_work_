//
//Fibonacci.java
//

public class Fibonacci 
{
    public static void main (String[] args)
    {
        int n = 30; 
        int firstTerm = 1; // a
        int secondTerm = 1; // b
        
        System.out.println("Fibonacci Sequence : " + firstTerm + secondTerm);
        
        for (int i = 3; i<= n; i++) // Less than or equal to
        {
            int nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm); //c
            
            firstTerm = secondTerm; 
            secondTerm = nextTerm; 
        }
    }
}