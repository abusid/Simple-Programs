package com.example.demo;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        int n1 = 0;
        int n2 = 1;
        int sum;
        while(i<=n) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            ++i;
            System.out.print(n1 + " ");
        }
    }
}
