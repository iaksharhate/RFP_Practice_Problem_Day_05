package com.bridgelabz;
import java.util.Scanner;

public class Quotient_and_Remainder {
    public static void main(String[] args) {
        int dividend,divisor,quotient,remainder;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dividend: ");
        dividend = scanner.nextInt();
        System.out.println("Enter divisor: ");
        divisor = scanner.nextInt();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient is: "+quotient);
        System.out.println("Remainder is: "+remainder);
    }
}
