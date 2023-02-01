package com.gonu.binary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class FindNubmer {
    public static void main(String[] args) {
     int    N =7, K = 2;
       int  A[] = {1, 7, 4, 3, 4, 8, 7};
       int value = firstElementKTime(A,N,K);
        System.out.println(value);
    }

    public static int firstElementKTime(int[] arr, int n, int k) {

       // Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i]) == k)
                    return arr[i];
                if(map.get(arr[i]) > k)
                    return arr[i];
            }
        }

        return -1 ;
    }
}
