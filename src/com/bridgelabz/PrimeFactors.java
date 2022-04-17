package com.bridgelabz;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numToFactorize = scanner.nextInt();

        Logics logics = new Logics();
        logics.PrimeFactor(numToFactorize);
    }
}
