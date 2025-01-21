/* Luna Coyle 1/21/25 
Unit 10 Assignment 1 External Class 
*/ 

import java.util.*; 
public class ItemCalculator 
{
   public static void printItems(ArrayList<Items> items)
    {
        for (Items x : items)
        {
            System.out.println(x.getName() + " costs " + x.getPrice());
        }
    }
    
    public static float averagePrice(ArrayList<Item> items)
    {
        float average = 0;
        for (Items x : items)
        {
            double average += x.getPrice(); 
        }
        return average / items.size();
    }
    
    public static String costly(ArrayList<Item> items)
    { 
        pricey = items.get(0);
        for (Items x : items)
        { 
            if (i.getPrice() > pricey.getprice())
            {
                pricey = items.get(i);
            }
        }
        return pricey.getName();  
    }
}