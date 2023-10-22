package com.example.demo;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = "";
        int sum = 0;

        while(true) {
            number = sc.next();
            if(number.equals("x")){
                break;
            }
            try {
                sum += Integer.parseInt(number);
            }catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid number");
            }

        }
        System.out.println("sum of all numbers = " + sum);
    }
}
