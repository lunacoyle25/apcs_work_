import java.util.*; 

public class AnimalTest
{
    public static void main(String[] args)
    {
        Human myHuman = new Human();
        Cat myCat = new Cat();
        Sponge mySponge = new Sponge(); 
        Centipede myCentipede = new Centipede(); 
        
        ArrayList<Animal> animals = new ArrayList<Animal>(); 
        
        animals.add(myCat);
        animals.add(mySponge);
        animals.add(myCentipede);
        animals.add(myHuman);
        
        for (Animal a : animals)
        {
            System.out.println("Type: " + a.getName());
            System.out.println("Number of Legs: " + a.getLegCount());
            if (a.getFurriness() == true)
            {
                System.out.println("Furry");
            }
            else
            {
                System.out.println("Not furry");
            }
            System.out.println(); 
        }
        
        //Method Tests
        
        double result1 = AnimalCalculator.avgLegCount(animals); 
        
        double expected1 = 26.5; 
        System.out.println("Average Leg Count: " + result1);
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
        
        String result2 = AnimalCalculator.fewestLegs(animals); 
        
        String expected2 = "Sponge"; 
        System.out.println("Animal with Fewest Legs: " + result2);
        System.out.println("expected: " + expected2);
        System.out.println("result: " + result2); 
        
        if (result2.equals(expected2))
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("incorrect");
        }
        
        System.out.println(); 
    }
}

