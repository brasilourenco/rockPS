package com.lourenco;

import java.util.Random;

public class ComputerHand {

    Random randomNumber = new Random();

    public int getComputerHand() {
        int rn = randomNumber.nextInt(3);
        return rn;
    }

    /*Random randomNumber = new Random();

    public void getComputerHand() {
        int rn = randomNumber.nextInt(3);
        if (rn == 0) {
            System.out.println("rock");
        } else if (rn == 1) {
            System.out.println("paper");
        } else if (rn == 2) {
            System.out.println("scissors");
        }
    }*/
}
