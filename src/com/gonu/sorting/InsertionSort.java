package com.gonu.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={6,4,9,1,4,5,2};
        arr = insertionSort(arr, arr.length);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int [] insertionSort(int arr[], int n){
          for(int i = 1; i < n ; i++){
              int j = i -1;
              int temp = arr[i];
              while(j >= 0 && arr[j] > temp){
                  arr[j+1] = arr[j];
                  j--;
                  arr[j+1] = temp;
              }

          }
        return arr;
    }
}
