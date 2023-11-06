package com.example.demo.binarysearch;

//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {

    public static void main(String[] args) {
        int arr[] = {0,2,3,7,8,10,9,8,4};
        int peakIndex = peakIndexInMountainArray(arr);
        int target = 8;
        System.out.println(binarySearch(arr, target, 0, peakIndex, true));
        System.out.println(binarySearch(arr, target, peakIndex, arr.length - 1, false));

    }



    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start!=end) {
            int mid = start + (end -start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr, int target, int start , int end, boolean ascending) {

        while(start<=end){
            //find middle index
            int mid = (start + end)/2;

            if(arr[mid]==target) {
                return mid;
            }
            if(ascending) {
                if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1 ;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
