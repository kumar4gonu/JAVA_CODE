package com.gonu.logic;

public class TestMain {
    public static void main(String args[]) {
        System.out.println(" Main Method");

        int[] n1 = new int[0];
       // boolean[] n2 = new boolean[-200];
       // double[] n3 = new double[2241423798];
        char[] ch = new char[20];



    }
    public static void main(int[] args){
        System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args){
        System.out.println("Overloaded Character array Main Method");
    }
    public static void main(double[] args){
        System.out.println("Overloaded Double array Main Method");
    }
    public static void main(float args){
        System.out.println("Overloaded float Main Method");
    }
}

