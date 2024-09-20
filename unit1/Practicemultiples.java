//
//Practicemultiples.java
//

public class Practicemultiples
{
    public static void main(String[] args)
    {
        for (int i=3; i<40; i+=2)
        {
          if (i%7 == 0)  
          {
              System.out.println("yay");
          }
            else if (i%3 == 0) 
            {
                System.out.println("neigh");
            }
            else 
            {
                System.out.println(i);
            }
        }
    }
}