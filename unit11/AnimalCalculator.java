import java.util.*; 

public class AnimalCalculator
{
    public static double avgLegCount(ArrayList<Animal> animals)
    {
        double avgLegCount = 0; 
        for (Animal a : animals)
        {
            avgLegCount += a.getLegCount(); 
        }
        
        return avgLegCount/animals.size(); 
    }
    
    public static String fewestLegs(ArrayList<Animal> animals)
    {
        Animal fewest = animals.get(0); 
        String fewestName = fewest.getName(); 
        int fewestLegs = fewest.getLegCount(); 
        for (Animal a : animals)
        {
            if (a.getLegCount() <= fewestLegs)
            {
                fewestLegs = a.getLegCount(); 
                fewestName = a.getName();
            }
        }
        return fewestName; 
    }
}