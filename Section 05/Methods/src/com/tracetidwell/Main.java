package com.tracetidwell;

public class Main {

    public static void main(String[] args) {

        int x1 = calculateScore(true, 800, 5, 100);
        int x2 = calculateScore(true, 10000, 8, 200);

        String[] names = {"Trace", "Jared", "Jake", "Dude"};
        int[] scores = {1500, 900, 400, 50};
        int[] positions = new int[4];

        for(int i=0; i<names.length; i++) {
            positions[i] = calculateHighScorePosition(scores[i]);
            displayHighScore(names[i], positions[i]);
        }

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScore(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500) && (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score <500)) {
            return 3;
        } else {
            return 4;
        }
    }
}
