package com.example.demo;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b)
            System.out.println("numbers are equal");
        if(a>b)
            System.out.println("a greater " + a);
        if(b>a)
            System.out.println("b greater " + b);
    }
}
