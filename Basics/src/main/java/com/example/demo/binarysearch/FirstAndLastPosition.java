package com.example.demo.binarysearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println( ans[0]+" ," + ans[1]);
    }
    public static  int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
       ans[0] = searchPosition(nums, target, true);
       ans[1] = searchPosition(nums, target, false);
       return ans;
    }

    public static  int searchPosition(int[] nums, int target, boolean isFirstPosition){

        int start = 0;
        int end = nums.length-1;
        int ans = 0;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid -1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(isFirstPosition) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return ans;
    }

}
