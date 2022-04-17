package com.bridgelabz;

import java.sql.SQLOutput;

public class Logics {

    //Flip coin
    public void FlipCoin(int totalFlip){

        int count = 0;
        int headCount = 0;
        int tailCount = 0;

        for (int i = 0; i < totalFlip; i++) {
            count++;
            double flip = Math.random();
            if(flip < 0.5){
                System.out.println("Tails");
                tailCount++;
            }else{
                System.out.println("Heads");
                headCount++;
            }
        }
        System.out.println("Number time head won: "+headCount);
        System.out.println("Number time tail won: "+tailCount);
        int percentHead = (headCount*100/totalFlip);
        int percentTail = (tailCount*100/totalFlip);

        System.out.println("Head win percentage: "+percentHead);
        System.out.println("Tail win percentage: "+percentTail);
    }

    // Leap year
    public void LeapYearCheck(int year){

        boolean leapValue = false;

        if(((year%4 == 0)&&(year%100 != 0) || (year%400 == 0))){
            leapValue = true;}

        if(leapValue)
            System.out.println(year+" is leap year");
        else
            System.out.println(year+" is leap not year");
    }

    //Power of 2
    public void GetPowerOfTwo(int powerOfTwo){
        if (powerOfTwo <= 0 || powerOfTwo <31){
            System.out.println("Power of 2's is: ");
            for (int i = 0; i <= powerOfTwo; i++) {
                int powerOfValue = ((int) Math.pow(2,i));
                System.out.println("Value of 2^ "+i+" is " +powerOfValue);
            }
        }else{
            System.out.println("Value overflows int value!");
        }
    }

    //Factors
    public void PrimeFactor(int numToFactorize){
        System.out.println("Prime factors of "+numToFactorize+" are :");

        for (int i = 2; i < numToFactorize; i++) {

            while(numToFactorize % i == 0){
                System.out.println(i + " ");
                numToFactorize = numToFactorize / 1;
            }
        }
        if (numToFactorize > 2){
            System.out.println(numToFactorize);
        }
    }
}
