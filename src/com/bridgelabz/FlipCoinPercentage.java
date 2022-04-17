package com.bridgelabz;
import java.util.Scanner;

public class FlipCoinPercentage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times coin should be flipped?");
        int totalFlip = scanner.nextInt();

        Logics logics = new Logics();
        logics.FlipCoin(totalFlip);
    }
}
