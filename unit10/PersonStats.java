/* Luna Coyle 1/23/25 
Unit 10 Assignment 2b 
External Class PersonStats.java for Person.java */ 

import java.util.*; 

public class PersonStats
{
    public static void printPeople(ArrayList<Person> person)
    {
        for (Person x : person)
        {
            if (x.getPets() != 1)
            {
                System.out.println(x.getName() + " has " + x.getPets() + " pets.");
            }
            else 
            {
                System.out.println(x.getName() + " has " + x.getPets() + " pet.");
            }
        }
    }
    
    public static double averagePets(ArrayList<Person> person)
    {
        int average = 0; 
        for (Person x : person)
        {
            average += x.getPets(); 
        }
        return average/person.size(); 
    }
    
    public static String mostPets(ArrayList<Person> person)
    {
        Person most = person.get(0);
        for (Person x : person)
        {
            if (x.getPets() > most.getPets())
            {
                most = x; 
            }
        }
        return most.getName(); 
    }
    
    public static ArrayList<String> petPeople(ArrayList<Person> person)
    {
        ArrayList<String> petPeople = new ArrayList<String>();
        //always supposed to match the type
        //basic types: int, double, float (predetermined type in java)
        //reference types: a reference to something you've written
        for (Person x : person)
        {
            if (x.getPets() >= 2)
            {
                petPeople.add(x.getName());
            }
        }
        return petPeople; 
    }
    
    public static void main(String[] args)
    {
        ArrayList<Person> person = new ArrayList<Person>(); 
        person.add(new Person("Malia", 4));
        person.add(new Person("Gaby", 1)); 
        person.add(new Person("Cara", 2)); 
        person.add(new Person("Coach", 9)); 
        person.add(new Person("Aileen", 0));
        
        printPeople(person); 
        System.out.println(); 
        System.out.println("average number of pets: " + averagePets(person)) ;
        System.out.println("person with most pets: " + mostPets(person)); 
        System.out.println("people with atleast 2 pets: " + petPeople(person));
    }
}













