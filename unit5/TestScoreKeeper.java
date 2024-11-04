/* 
Unit 5 Assignment 2 Test
*/

public class TestScoreKeeper
{
    public static void main(String[] args)
    {
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        System.out.println("Initial score: " + scoreKeeper.getScore());

        scoreKeeper.scoreNormal();
        System.out.println("Score after normal scoring: " + scoreKeeper.getScore()); 

        scoreKeeper.scoreBonus();
        System.out.println("Score after bonus scoring: " + scoreKeeper.getScore()); 

        scoreKeeper.scoreNormal();
        System.out.println("Score after another normal scoring: " + scoreKeeper.getScore()); 
    }
}