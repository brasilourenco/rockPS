package com.lourenco;

import java.util.Scanner;

public class UserHand {
    private Scanner scanner;

    public UserHand() {
        scanner = new Scanner(System.in);
    }

    public String getUserHand() {
        System.out.println("Hello, can you win against me?");
        System.out.println("enter 1 for rock; \n" + "enter 2 for paper; \n" + "enter 3 for scissors; \n");
        byte i1 = scanner.nextByte();

        if (i1 == 1) {
            System.out.println("You choose rock...");
            return "rock";
        } else if (i1 == 2) {
            System.out.println("You choose paper...");
            return "paper";
        } else if (i1 == 3) {
            System.out.println("You choose scissors...");
            return "scissors";
        }
        System.err.println("Invalid Input");
        System.exit(0);
        return "";
    }
}
