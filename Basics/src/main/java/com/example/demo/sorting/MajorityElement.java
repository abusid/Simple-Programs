package com.example.demo.sorting;
//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majorityElement(arr));

    }
    public static int majorityElement(int[] nums) {

        int[] fr = new int[nums.length];

        int visited = -1;
        for(int i=0; i<nums.length; i++){
            int count = 1;
            for(int j = i + 1; j< nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i]!= visited){
                fr[i] = count;
            }
        }
        int majority = 0;
        for(int i=0; i<fr.length; i++){
            if(fr[i]!=visited && fr[i]>(nums.length/2)){
                majority = nums[i];
            }
        }


        return majority;
    }
}
