package com.example.demo;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();

        for(int i = begin; i<=end; i++){
            int number = i;
            int sum=0;
            if(isArmastrong(number, sum) == i){
                System.out.println(i +" is Armastrom number");
            }
        }
    }

    private static int isArmastrong(int number, int sum) {
        while(number >0) {
            int rem = number %10;
            number = number /10;
            sum = sum + rem * rem *rem;
        }
        return sum;
    }
}
