package com.example.demo.binarysearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'x', 'x', 'y' ,'y'};
        System.out.println(nextGreatestLetter(arr, 'z'));
    }

    public  static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < letters[mid]){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        if(start == letters.length){
            return letters[0];
        }
        return letters[start];
    }
}
