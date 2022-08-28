package com.gonu.logic;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Kumar";
        String str2 = "Kumar";
         boolean isAnagram = anagram(str1, str2);
         if(isAnagram)
             System.out.println("Given String is Anagram......");
         else
             System.out.println("Given String is not Anagram.......");
    }

    public static boolean anagram(String str, String ana){
        if(str.length() == ana.length()){
            char strCharArray[] = str.toCharArray();
            char anaCharArray[] = ana.toCharArray();

            return Arrays.equals(strCharArray,anaCharArray);
        }else
            return false;
    }
}
