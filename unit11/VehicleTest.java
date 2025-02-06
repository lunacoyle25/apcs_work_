/* 
Luna Coyle 2/3/25
Unit 11 Assignment 1a
VehicleTest.java
*/
import java.util.*; 

public class VehicleTest
{
    public static void main(String[] args)
    {   
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); 
        vehicles.add(new Motorcycle());
        vehicles.add(new Unicycle());
        vehicles.add(new Car());
        vehicles.add(new Bicycle());
        System.out.println();
        
        for (Vehicle x : vehicles)
        {
            System.out.println("Vehicle: " + x.name() + ", Wheels: " + + x.wheelCount() + ", Human Powered: " + x.isHumanPowered());
                
            System.out.println();     
        }
        
        //Method Tests
        System.out.println("Vehicle Stats");
        System.out.println();
        
        int result1 = VehicleStats.numberOfWheels(vehicles); 
        //Call the method from VehicleStats
        int expected1 = 9; 
        System.out.println("Total Number of Wheels: " + result1);
        System.out.println("expected: " + expected1);
        System.out.println("result: " + result1); 
        
        if (result1 == expected1)
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("incorrect");
        }
        
        System.out.println(); 
        
        ArrayList<String> result2 = VehicleStats.humanPowered(vehicles);
        ArrayList<String> expected2 = new ArrayList<String>(); 
        expected2.add("Unicycle");
        expected2.add("Bicycle");
        
        System.out.println("Human Powered Vehicles: " + result2);
        System.out.println("expected: " + expected2);
        
        if (result2.equals(expected2))
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("incorrect");
        }
        
    }
}