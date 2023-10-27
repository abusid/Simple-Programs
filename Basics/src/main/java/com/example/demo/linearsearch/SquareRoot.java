package com.example.demo.linearsearch;

import java.util.Scanner;

//https://leetcode.com/problems/sqrtx/description/
/**Linear approach**/
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sqrt(number));
    }

    public static int sqrt(int x) {
        if(x<=0 || x==1){
            return x;
        }
        double temp;
        double sqrt = x/2;

        do{
            temp = sqrt;
            sqrt = (temp + x/temp)/2;

        }while(temp-sqrt!=0);

        return (int) sqrt;
    }
}
