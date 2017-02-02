package com.duncan;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your high score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your high score was " + highScore);

        displayHighScorePosition("Joe", calculateHighScorePosition(1000));
        displayHighScorePosition("Mary", calculateHighScorePosition(500));
        displayHighScorePosition("Bob", calculateHighScorePosition(100));
        displayHighScorePosition("Max", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int highScorePostion){
        System.out.println(playerName + " managed to get into position " + highScorePostion
                + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500 && score < 1000){
            return 2;
        } else if (score >= 100 && score < 500){
            return 3;
        } else return 4;
    }

}
