package com.gonu.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={6,4,9,1,4,5};
        arr = selectionSort(arr, arr.length);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int [] selectionSort(int arr[], int n){
        int min;
        for(int i=0;i<n-1;i++){
            min = i;
            for(int j= i + 1; j < n; j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
}
