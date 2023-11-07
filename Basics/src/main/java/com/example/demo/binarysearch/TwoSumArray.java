package com.example.demo.binarysearch;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumArray {

    public static void main(String[] args) {
        int[] num = {2,3,4};
        int target = 6;
        int[] ints = twoSum(num, target);
        System.out.println(ints[0] + " " + ints[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {

        int end = numbers.length-1;
        int[] index = new int[2];
        for(int i = 0; i<=end; i++) {
            for(int j = i+1; j<=end; j++) {
                if(numbers[i] + numbers[j] == target) {
                    index[0] = i+1;
                    index[1] = j+1;
                    return index;
                }
            }
        }
        return index;
    }

    //Binary approach
    public static int[] twoSumBinary(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (nums[l] + nums[r] != target) {
            if (nums[l] + nums[r] < target) l++;
            else r--;
        }

        return new int[] {l+1, r+1};
    }
}
