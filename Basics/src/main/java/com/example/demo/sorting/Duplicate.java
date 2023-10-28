package com.example.demo.sorting;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/
public class Duplicate {

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containsDuplicateHashSet(arr));
    }

    //O(log(n))
    public static boolean containsDuplicateBruteForce(int[] nums) {
        int[] fr = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return  true;
                }
            }
        }
        return  false;
    }

    //O(n)
    public static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
