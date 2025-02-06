import java.util.*; 

public class VehicleStats
{
    public static int numberOfWheels(ArrayList<Vehicle> vehicles)
    {
        int total = 0;
        for (Vehicle x : vehicles)
        {
           total += x.wheelCount();  
        }
        return total; 
    }
    
    public static ArrayList<String> humanPowered(ArrayList<Vehicle> vehicles)
    {
        ArrayList<String> humanPowered = new ArrayList<String>(); 
        
        for (Vehicle x : vehicles)
        {
            if (x.isHumanPowered() == true)
            {
                humanPowered.add(x.name());
            }
        }
        return humanPowered; 
    }
}
    