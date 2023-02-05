package com.gonu.basic;

import java.util.Scanner;

public class StringCheck {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        Integer[] intArray = {1,4,7,6,9,10,8,5};

        sortArray(intArray,true);
        
        
        

        if(s1 == s2)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }

    static void sortArray(Integer[] intArray, Boolean order) {

//        for(int i =0; i<intArray.length; i++) {
//            for(int j=i+1; j<intArray.length; j++) {
//                int temp = 0;
//                char ch = true ? '>' : '<';
//                if(intArray[i] ch intArray[j]){
//                    temp = intArray[i];
//                    intArray[i] = intArray[j];
//                    intArray[j] = temp;
//
//                }
//
//            }
//            System.out.println(intArray[i]);
//        }
        
    }


}
