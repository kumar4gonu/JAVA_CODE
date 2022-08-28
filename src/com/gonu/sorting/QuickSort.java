package com.gonu.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] ={6,4,9,1,4,5,2};
        arr = qSort(arr, 0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int  partitions(int arr[], int start, int end){
//       int pivot = arr[end];
//       int i = start-1;
//        for(int j = start; j < end; j++){
//           if(arr[j] < pivot){
//               i++;
//               swap(arr,i,j);
//           }
//       }

        int pivot = arr[start];
        int lb = start;
        int ub = end;

        while (lb < ub){
            while (arr[lb] <= pivot)
                lb++;
            while (arr[ub] > pivot)
                ub--;
            if(lb < ub)
                swap(arr,lb,ub);
        }
        swap(arr,start,ub);
        return ub;
    }

    public static void swap(int arr[], int start, int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
    public static int [] qSort(int arr[], int lb, int ub){
               if(lb <= ub) {
                   int element = partitions(arr, lb, ub);
                   qSort(arr, lb, (element - 1));
                   qSort(arr, (element + 1), ub);
               }
        return arr;
    }
}
