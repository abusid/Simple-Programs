package com.example.demo;

public class ArrayConcate {

    public static void main(String[] args) {
        getConcatenation(new int[]{1,2,2});
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int j=0;
        for(int i=0; i<(2*nums.length); i++) {

            if(i==nums.length) {
                j=0;
            }
            ans[i] = nums[j];
            j= j+1;
        }
        return ans;
    }
}
