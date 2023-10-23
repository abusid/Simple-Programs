package com.example.demo;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        final double pi =  3.14;
        double areaOfCircle = pi * radius * radius;
        System.out.println(areaOfCircle);

    }
}
