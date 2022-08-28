package com.gonu.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumber {
    public static void main(String[] args) {
        long arr[] = new long[] {5, 11, 1 ,6, 6, 8, 11, 5 ,12, 11, 6 ,1 ,7};

//        Arrays.stream(arr).filter(num -> num < 30)
//                .skip(1)
//                .limit(2);



//        List<Long> val = Collections.singletonList(Arrays.stream(arr).filter(num -> num < 100)
//                .findFirst()
//                    //    .skip(1)
//                .orElse(-1));
//
//        val.forEach(System.out::println);


       // List<Long> slist = Arrays.stream(arr).filter(num -> num < 30).collect(Collectors.toList())



            Arrays.sort(arr);
            long svalue[] = {-1,-1};
            int j =0;
            for(int i=0;i<arr.length;i++){
                if(j < 2 && arr[i] < 13 && svalue[0] != arr[i]){
                    svalue[j] = arr[i];
                    j++;
                }
            }
        Arrays.stream(svalue).forEach(System.out::println);

    }
}
