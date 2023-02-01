package com.gonu.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         list.add(0);
         list.add(14);
         list.add(41);
         list.add(18);
         list.add(5);
        list.forEach(System.out::println);
        System.out.printf("*****************");
      reverse(list,list.size(), 3);

   //     0 14 41 18 30 57 60 30 49 75 23 97 59 34 57 45 33 79 17 15 15 39 98 81 19 61 7 81 84 57 68 64 85 62 29 11 94 81 50 90 34 46 43 24 38 90 96 99 61 21
    }

    private static void reverse(ArrayList<Integer> list, int len, int k){
        int j = k-1;
        for(int i= 0 ;i< k ;i++){
                if(i == j)
                    break;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                j--;

        }

        int s = len -1;

        for (int r = k; r < len-1;r++){
            if(r == s)
                break;
            int temp = list.get(r);
            list.set(r, list.get(s));
            list.set(s,temp);
            s--;
        }


        list.forEach(System.out::println);
    }


//    private static void reverse(ArrayList<Integer> list, int len, int k){
//  int j = n-1;
//      for(int i= 0 ;i< n ;i++){
//           if(i == j)
//               break;
//          int temp = list.get(i);
//           list.set(i, list.get(j));
//            list.set(j, temp);
//            j--;
//
//        }
//        list.forEach(System.out::println);
//    }
}
