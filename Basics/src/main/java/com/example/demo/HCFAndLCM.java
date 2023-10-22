package com.example.demo;

import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find HCF and LCM of it");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2, hcf );
        System.out.println("HCF of two numbers " +hcf);
        System.out.println("LCM of two numbers " +lcm);
    }

    private static int findLCM(int num1, int num2, int hcf) {
        return (num1*num2)/hcf;
    }

    private static int findHCF(int num1, int num2) {
        int temp;
        if(num1>num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while (num2 > 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;

    }
}
