package com.gonu.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int arr[] ={6,4,9,1,4,5};
      arr = bubbleSort(arr, arr.length);
        Arrays.stream(arr).forEach(System.out::println);
     }

    public static int[] bubbleSort(int arr[], int n){

        for(int i=0;i<n-1;i++){
             for(int j=0;j<n-1;j++){
                 if(arr[j]> arr[j+1]) {
                     int temp = arr[j + 1];
                      arr[j + 1] = arr[j];
                      arr[j] = temp;
                 }
             }
         }
        return arr;
    }
}
