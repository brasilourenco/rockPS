package com.lourenco;

import java.util.Random;

public class ComputerHand {

    private Random randomNumber;

    public ComputerHand() {
        randomNumber = new Random();
    }

    public String getComputerHand() {
        int rn = randomNumber.nextInt(3);
        if (rn == 0) {
            System.out.println("Cp choose rock...");
            return "rock";
        } else if (rn == 1) {
            System.out.println("Cp choose paper...");
            return "paper";
        } else {
            System.out.println("Cp choose scissors...");
            return "scissors";
        }
    }
}
