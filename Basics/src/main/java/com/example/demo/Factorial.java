package com.example.demo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact=num;

        while(num>=2){
            fact = fact * (num-1);
            num = num-1;
        }

        System.out.println(fact);
    }
}
