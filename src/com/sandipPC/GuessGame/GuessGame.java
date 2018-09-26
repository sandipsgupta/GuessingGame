package com.sandipPC.GuessGame;

public class GuessGame {
    Player P1;
    Player P2;
    Player P3;
    public void startGame() {
        P1 = new Player();
        P2 = new Player();
        P3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while (true) {
            System.out.println("Number to guess is\t" + targetNumber);
            P1.guess();
            P2.guess();
            P3.guess();
            guessp1 = P1.number;
            System.out.println("Player one guessed\t"+guessp1);
            guessp2 = P2.number;
            System.out.println("Player two guessed\t"+guessp2);
            guessp3 = P3.number;
            System.out.println("Player three guessed\t"+guessp3);
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner !");
                System.out.println("Player one got it right ?" + p1isRight);
                System.out.println("Player two got it right ?" + p2isRight);
                System.out.println("Player three got it right ?" + p3isRight);
                System.out.println("Game is over.");
                break; // game over, so break out of the loop
            } else {
// we must keep going because nobody got it right!
                System.out.println("Players will have to try again, as Guess is wrong.");
            } // end if/else

        }
    }
}
