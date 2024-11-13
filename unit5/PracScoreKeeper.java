/* 
Luna Coyle 11/12/24
Unit 5 Practice 1 
Inspo from ScoreKeeper Assignment 1
*/ 

public class PracScoreKeeper
{
    public PracScoreKeeper()
    {
        int score = 0;
        //constructer function--has to have the same name as the class
    }
    public int getScore()
    {
        return score;
    }
    public void scoreNormal()
    {
        score += 500;
    }
    public void scoreBonus()
    {
        score += 2000;
    }
    private int score; 
}