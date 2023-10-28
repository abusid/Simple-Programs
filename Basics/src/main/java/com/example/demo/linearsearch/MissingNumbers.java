package com.example.demo.linearsearch;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/missing-number/
public class MissingNumbers {

    public static void main(String[] args) {
        int arr[] = {0,1};
        System.out.println(missingNumberOptimised(arr));
    }

    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int missing = 0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i=0; i<=nums.length; i++) {
            if(i==nums.length) {
                if(!set.contains(nums.length)){
                    missing = nums.length;
                }
            } else if (!set.contains(i)) {
                missing = i;
            }
        }
        return  missing;
    }

    //optimised
    public static int missingNumberOptimised(int[] nums ){
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i];
        }
        return totalSum - sum;
    }

}
