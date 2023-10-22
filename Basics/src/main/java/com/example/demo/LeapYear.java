package com.example.demo;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputYear = 0;
        while(true) {
            System.out.println("Enter a Year to find out if its a leap year or not : Press -1 to exit");
            inputYear = sc.nextInt();
            if(inputYear == -1) {
                break;
            }
            if (inputYear >= 0 ) {
                if ((inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0) {
                    System.out.println(inputYear + " is a Leap Year!");
                } else {
                    System.out.println(inputYear + " is not a Leap Year!");
                }
            } else {
                throw new IllegalArgumentException("input year must be greater than zero");
            }
        }
    }
}
