//
//Geometric.java
//

public class Geometric
{
    
    public static void main(String[] args)
    {
        int intialTerm =3; //First term
        int commonRatio = 2; // Common ratio
        int numberOfTerms = 10; // Number of terms to print
        
        int term = initialTerm; // Start with intial term
        
        // Print the first terms of the geometric sequence
        for (int i = 0; i < numberOfTerms; i++){
             // Why do I have to captialize the second word but no space? Is that camel case or smth?
        
            System.out.println(term);
            term*= commonRatio; //Update term by multiplying with the common ratio
        }
            
    }
 }