package com.example.demo.binarysearch;

public class FloorofNumber {
    public static void main(String[] args) {
        int[] arr = {10,22,24,25,33,40};
        System.out.println(findFloor(arr, 21));

    }

    /**find the floor of a number i.e.,
     * target number >= greatest smaller number
     *
     * **/
    public static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        if(target<arr[start]){
            return  -1;
        }
        while(start<=end){
            //find middle index
            int mid = (start + end)/2;

            if(arr[mid]==target) {
                return arr[mid];
            }
            if(target>arr[mid]){
                start = mid+1;

            } else {
                end = mid -1;
            }
        }

        return arr[end];
    }
}
