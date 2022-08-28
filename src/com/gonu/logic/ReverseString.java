package com.gonu.logic;

public class ReverseString {
    public static void main(String[] args) {
          String str = "Chandan Kumar";
          String res = reverse(str);
        System.out.println(res);
    }

    public static String reverse(String str){
        if(str == null || str.isEmpty())
            return str;
        return str.charAt(str.length() -1) + reverse(str.substring(0,str.length()-1));
    }
}
