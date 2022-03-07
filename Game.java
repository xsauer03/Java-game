//package com.company;


import javax.swing.*;

public class Game {

    public static void main(String[] args) {
        play();
    }
        public static void play() {
            int numberToGuess = (int) (Math.random() * 100 + 1);
            int guessedNumber = 0;
            int count = 0;
            while (numberToGuess != guessedNumber) {
                String message = JOptionPane.showInputDialog(null, "Guess nember between 1 and 100", "Game", 3);
                guessedNumber = Integer.parseInt(message);
                JOptionPane.showMessageDialog(null, "" + guessValue(guessedNumber, numberToGuess, count));
                count++;
            }

            int again = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
            switch (again) {
                case JOptionPane.YES_OPTION:
                    play();
                    break;
                case JOptionPane.NO_OPTION:
                    break;
            }
        }
        public static String guessValue ( int guessedNumber, int numberToGuess, int count) {
            if ( guessedNumber < 1 || guessedNumber > 100) {
                return "Wrong guessed number" + count;
            }
            else if (guessedNumber == numberToGuess) {
                return "CG! " + count;
            }
            else if (guessedNumber > numberToGuess) {
                return "Number is lower " + count;
            }
            else if (guessedNumber < numberToGuess) {
                return "Number is higher " + count;
            }
            else {
                return "Wrong input!" + count;
            }
    }

}
