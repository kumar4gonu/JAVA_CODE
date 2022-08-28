package com.gonu.basic;

import java.util.Scanner;

public class InputOutExample {
    public static void main(String[] args) {
        int num;
       // System.out.println(num);
        Scanner s = new Scanner(System.in);
        num  = s.nextInt();

        System.out.println("Input number is : " +num);

    }
}
