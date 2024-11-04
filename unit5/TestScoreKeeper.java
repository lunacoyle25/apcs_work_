/* 
Unit 5 Assignment 2 Test
*/

public class TestScoreKeeper
{
    public static void main(String[] args)
    {
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        // Test initial score
        System.out.println("Initial score: " + scoreKeeper.getScore()); // Should print 0

        // Test scoreNormal method
        scoreKeeper.scoreNormal();
        System.out.println("Score after normal scoring: " + scoreKeeper.getScore()); // Should print 100

        // Test scoreBonus method
        scoreKeeper.scoreBonus();
        System.out.println("Score after bonus scoring: " + scoreKeeper.getScore()); // Should print 1100

        // Test scoreNormal again
        scoreKeeper.scoreNormal();
        System.out.println("Score after another normal scoring: " + scoreKeeper.getScore()); // Should print 1200
    }
}