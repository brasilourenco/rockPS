package com.lourenco;

import java.util.Scanner;

public class GameLogic {

    Scanner scanner = new Scanner(System.in);
    //UserHand user = new UserHand();
    ComputerHand cpUser = new ComputerHand();

    public void Logic() {

        while (true) {

            System.out.println("Hello, can you win against me?");
            System.out.println("enter 1 to rock; ");
            System.out.println("enter 2 to paper; ");
            System.out.println("enter 3 to scissors. ");
            byte i1 = scanner.nextByte();

            if (i1 == 1) {
                System.out.println("You put rock...");
                if (cpUser.randomNumber.nextInt() == 0) {
                    System.out.println("Draw!");
                } else if (cpUser.randomNumber.nextInt() == 1) {
                    System.out.println("You lose!");
                } else if (cpUser.randomNumber.nextInt() == 2) {
                    System.out.println("You win!");
                }
            } else if (i1 == 2) {
                System.out.println("You put paper...");
                if (cpUser.randomNumber.nextInt() == 0) {
                    System.out.println("You win!");
                } else if (cpUser.randomNumber.nextInt() == 1) {
                    System.out.println("You Draw!");
                } else if (cpUser.randomNumber.nextInt() == 2) {
                    System.out.println("You lose!");
                }
            } else if (i1 == 3) {
                System.out.println("You put scissors...");
                if (cpUser.randomNumber.nextInt() == 0) {
                    System.out.println("You lose!");
                } else if (cpUser.randomNumber.nextInt() == 1) {
                    System.out.println("You win!");
                } else if (cpUser.randomNumber.nextInt() == 2) {
                    System.out.println("Draw!");
                }
            }


            System.out.println("Do you wanna play again?");
            System.out.println("enter 1 to yes; ");
            System.out.println("enter 2 to no; ");
            byte i2 = scanner.nextByte();

            if (i2 == 2) {
                System.out.println("Bye loser :p");
                System.exit(0);
            }
        }
    }
}
