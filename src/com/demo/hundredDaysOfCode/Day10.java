package com.demo.hundredDaysOfCode;

public class Day10 {
    public static void main(String[] args) {
        /*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
        representing the number of elements in nums1 and nums2 respectively.*/

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(k >= 0 ){
            if( i >= 0 && j >= 0) {
                if (nums1[i] >= nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
            } else if (i < 0 && j != 0) {
                nums1[k] = nums2[j];
                j--;

            }
            System.out.println(nums1[k]);
            k--;

        }

        ////////////////////////////////////**********************
        /*

       // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        */
        /* Copy remaining elements of L[] if any */
        /*
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        */
        /* Copy remaining elements of R[] if any */
        /*while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
         */
        //**********************************
    }
}
