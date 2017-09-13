package com.tracetidwell;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Trace", 500);
        System.out.println("New score is " + newScore);

        int newScore2 = calculateScore(500);
        System.out.println("New score is " + newScore2);

        calculateScore();

        double a1 = calcFeetAndInchesToCentimeters(5, 9);
        System.out.println(a1);

        double a2 = calcFeetAndInchesToCentimeters(69);
        System.out.println(a2);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        } else {
            return ((feet * 12) + inches) * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        } else {
            return calcFeetAndInchesToCentimeters(inches/12, inches%12);
        }
    }

}
