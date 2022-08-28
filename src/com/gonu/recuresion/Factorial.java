package com.gonu.recuresion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(nFactorial(4));
    }

    private static int nFactorial(int n){
        if(n == 1)
            return 1;
        return n * nFactorial(n - 1);
    }
}
