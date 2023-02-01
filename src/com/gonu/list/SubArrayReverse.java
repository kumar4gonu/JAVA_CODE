package com.gonu.list;

public class SubArrayReverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 10;
          reverse(arr, k);
    }

    public static void reverse(int [] arr, int k){
        int len = arr.length;
        for(int i = 0 ; i < len; i = i+k){
            int start = i;
            int end = Math.min(i+k-1 , len-1);

            while(start <= end){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start ++;
                end --;
            }
        }
        for(int i=0;i < len;i++)
        System.out.println(arr[i]);
    }
}
