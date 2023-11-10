package com.example.demo.binarysearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] nums = {3,1};
//        int[] nums = {6,7,0,2,3,4,5};
        System.out.println(findTarget(nums, 1));
    }

    static  int findTarget(int[] nums, int target){
        int pivot = findPivot(nums);
        System.out.println(pivot);
        if(pivot==-1) {
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if(target==nums[pivot]) {
            return pivot;
        }

        int firstHalf = binarySearch(nums, target, 0, pivot);
        if(firstHalf == -1) {
            return binarySearch(nums, target, pivot+1, nums.length-1);
        } else {
           return firstHalf;
        }
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int findPivot(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start<=end) {

            int mid = start + (end - start)/2;
            if(mid<end && nums[mid]>nums[mid + 1]) {
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }


        return -1;
    }
}
