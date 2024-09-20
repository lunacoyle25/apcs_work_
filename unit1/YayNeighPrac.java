//
//YayNeighPrac.java
//

public class YayNeighPrac
{
    public static void main(String[] args)
    {
        for (int i=0; i<31; i++)
        {
            if (i%8 == 0)
            {
                System.out.println("Yay");
            }
            else if (i%2 == 0)
            {
                System.out.println("Neigh");
            }
            else 
            {
                System.out.println(i);
            }
        }
    }
}