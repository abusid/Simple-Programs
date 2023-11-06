package com.example.demo.binarysearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//https://leetcode.com/problems/find-peak-element/description/
public class FindPeakInMountain {

    public static void main(String[] args) {
        int arr[] = {0,3,5,12,2}; //output should be 10
        System.out.println(peakIndexInMountainArray(arr));

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
}
