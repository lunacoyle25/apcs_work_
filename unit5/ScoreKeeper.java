/* 
Luna Coyle 11/3/24
Unit 5 Assignment 2 
*/

public class ScoreKeeper
{
    public ScoreKeeper()
    {
        score = 0;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void scoreNormal()
    {
        score += 100;
    }
    
    public void scoreBonus()
    {
        score += 1000;
    }
    
    private int score;
    //private static final int scoreCount = 0;
}