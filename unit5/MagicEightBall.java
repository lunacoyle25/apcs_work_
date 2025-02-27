/* 
Luna Coyle 11/4/24
Unit 5 Assignment 3
MagicEightBall.java
*/

public class MagicEightBall
{
    public String getAnswer(String fortuneIn)
    {
        double random = Math.random();
        
        if (random >= .90)
        {
            return "Very unlikely";
        }
        if (random < .90 && random >= .80)
        {
            return "It is certain";
        }
        if (random < .80 && random >= .70)
        {
            return "Outlook not so good";
        }
        if (random < .70 && random >= .60)
        {
            return "As I see it, yes";
        }
        if (random < .60 && random >= .50)
        {
            return "Without a doubt";
        }
        if (random < .50 && random >= .40)
        {
            return "Concentrate and ask again";
        }
        if (random < .40 && random >= .30)
        {
            return "Definitely not, girl";
        }
        if (random < .30 && random >= .20)
        {   
            return "Don’t count on it";
        }
        if (random < .20 && random >= .10)
        {
            return "Most likely";
        }
        else
        {
            return "Signs point to yes";
        }    
    }
    
}