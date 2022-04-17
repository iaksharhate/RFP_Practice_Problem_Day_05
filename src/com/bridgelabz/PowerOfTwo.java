package com.bridgelabz;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for N: ");
        int powerOfTwo = scanner.nextInt();

        Logics logics = new Logics();
        logics.GetPowerOfTwo(powerOfTwo);
    }
}
