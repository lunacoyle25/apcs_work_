/* 
Unit 5 Assignment 1 test
*/

public class testPerson
{
    public static void main(String[] args)
    {
        Person luna = new Person("Luna", 2);
        luna.greeting();
        
        Person drkessner = new Person("Dr. Kessner", 9);
        drkessner.greeting();
        
        Person tessa = new Person("Tessa", 0);
        tessa.greeting();
    }
}