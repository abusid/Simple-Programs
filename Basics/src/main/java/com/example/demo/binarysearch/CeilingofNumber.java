package com.example.demo.binarysearch;

public class CeilingofNumber {

    public static void main(String[] args) {
        int[] arr = {10,22,24,25,33,40};
        System.out.println(findCeiling(arr, 50));

    }

    /**find the ceiling of a number i.e.,
     * target number <= smallest greater number
     *
     * **/
    public static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        if(target> arr[arr.length-1]) {
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
        if(start>=arr.length){
            return -1;
        }
        return arr[start];
    }
}
