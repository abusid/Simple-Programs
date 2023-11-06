package com.example.demo.binarysearch;

public class FindIndexInfiniteArray {

    public static void main(String[] args) {

        int[] arr = {2,4,5,6,6,7,8,10,12,15,17,18,24};
        int target = 15;
        System.out.println(findRange(arr, target));
    }

    public static int findRange(int[] arr,int target) {
        int start = 0;
        int end = 1;
        // double the searchRange until target is greater than of array of end index
        while(target> arr[end]){
            int newStart = end + 1;
            //double the end
            end = end + (end-start)+1;
            start = newStart;

        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start , int end) {

        while(start<=end){
            //find middle index
            int mid = (start + end)/2;

            if(arr[mid]==target) {
                return mid;
            }
            if(target>arr[mid]){
                start = mid+1;

            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
