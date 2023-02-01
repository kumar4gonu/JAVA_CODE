package com.gonu.binary;

public class BinarySearchExample {
    public static void main(String[] args) {
      int arr[] = {1 ,2, 3, 4, 5};
     int value = bsearch(arr,arr.length,4);
        System.out.println(value);
    }


    public static int bsearch(int arr[],int n, int k){
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mind = (start + end)/2;

            if(arr[mind] == k)
                return mind;
            else if(arr[mind] < k)
                start = mind + 1;
            else if(arr[mind] > k)
                end = mind -1;
        }
        return -1;
    }
}
