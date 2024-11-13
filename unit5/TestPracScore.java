/*
Luna Coyle 11/12/24
Unit 5 Practice 1b
*/ 

public class TestPracScore
{
    public static void main(String[] args)
    {
        PracScoreKeeper pracScoreKeeper = new PracScoreKeeper();
        
        System.out.println("initial score: " + pracScoreKeeper.getScore());
        
        pracScoreKeeper.scoreNormal();
        System.out.println("score after normal score: " + pracScoreKeeper.getScore());
        
        pracScoreKeeper.scoreBonus();
        System.out.println("score after bonus score: " + pracScoreKeeper.getScore());
        
        pracScoreKeeper.scoreBonus();
        System.out.println("score after another bonus score: " + pracScoreKeeper.getScore());
    }
}