package com.lourenco;

import java.util.Scanner;

public class GameLogic {

    private Scanner scanner;
    private UserHand user;
    private ComputerHand cpUser;

    public GameLogic() {
        scanner = new Scanner(System.in);
        user = new UserHand();
        cpUser = new ComputerHand();
    }

    public void play() {

        while (true) {
            // == só para primitivos; .equals para objetos
            String userHand = user.getUserHand();
            String cpHand = cpUser.getComputerHand();

            if (userHand.equals(cpHand)) {
                System.out.println("DRAW!");
            } else if (userHand.equals("rock") && cpHand.equals("paper")) {
                System.err.println("YOU LOSE!");
            } else if (userHand.equals("scissors") && cpHand.equals("rock")) {
                System.err.println("YOU LOSE!");
            } else if (userHand.equals("paper") && cpHand.equals("scissors")) {
                System.err.println("YOU LOSE!");
            } else if (userHand.equals("paper") && cpHand.equals("rock")) {
                System.out.println("YOU WIN!");
            } else if (userHand.equals("scissors") && cpHand.equals("paper")) {
                System.out.println("YOU WIN!");
            } else if (userHand.equals("rock") && cpHand.equals("scissors")) {
                System.out.println("YOU WIN!");
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

