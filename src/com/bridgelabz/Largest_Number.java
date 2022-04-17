package com.bridgelabz;
import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number.");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number.");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number.");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)){
            System.out.println("First number is greater: "+firstNumber);
        }else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)){
            System.out.println("Second number is greater: "+secondNumber);
        }else{
            System.out.println("Third number is greater: "+thirdNumber);
        }
    }
}
