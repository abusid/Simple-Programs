package com.example.demo;

import java.util.Scanner;

//https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPerfectSquare(number));
    }

    public static boolean isPerfectSquare(int x) {
        if(x<=0 || x==1){
            return true;
        }
        double temp;
        double sqrt = x/2;

        do{
            temp = sqrt;
            sqrt = (temp + x/temp)/2;

        }while(temp-sqrt!=0);

        if (sqrt % 1 != 0)
        {
            return false;
        }
        else
        {
            return  true;
        }
    }
}
