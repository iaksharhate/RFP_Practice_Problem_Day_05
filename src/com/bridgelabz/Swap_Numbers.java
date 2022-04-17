package com.bridgelabz;
import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Numbers before swapping "+firstNumber+" and "+secondNumber);

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("Numbers after swap "+firstNumber+" and "+secondNumber);
    }
}
