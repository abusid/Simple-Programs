package com.example.demo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sbr = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            sbr.append(str.charAt(i));
        }
        if(str.equals(sbr.toString())){
            System.out.println("palindrome");
        }else
            System.out.println("not palindrome");
    }
}
