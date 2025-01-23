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
    
    public static float averagePrice(ArrayList<Items> items)
    {
        float average = 0;
        for (Items x : items)
        {
            average += x.getPrice(); 
        }
        return average / items.size();
    }
    
    public static String pricey(ArrayList<Items> items)
    { 
        Items pricey = items.get(0);
        for (Items x : items)
        { 
            if (x.getPrice() > pricey.getPrice())
            {
                pricey = x;
            }
        }
        return pricey.getName();  
    }
    
    public static void main(String[] args)
    {
        ArrayList<Items> items = new ArrayList<Items>(); 
        
        items.add(new Items("Milk", 4.99f));
        items.add(new Items("Coleslaw", 3.99f));
        items.add(new Items("Strawberries", 6.99f));
         
        printItems(items); 
        System.out.println();
        System.out.println("average price: " + averagePrice(items));
        System.out.println("most expensive item: " + pricey(items));
        
    }
}