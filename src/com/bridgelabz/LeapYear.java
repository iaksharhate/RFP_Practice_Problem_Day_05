package com.bridgelabz;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        Logics logics = new Logics();
        logics.LeapYearCheck(year);
    }
}
