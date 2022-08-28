package com.gonu.logic;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("0 1 ");
     solve(0,1,100);
    }

    public static void solve(long  x, long y, int n){
        if(n == 0)
          return;
        System.out.print(x + y + " ");
        solve(y, x+y, --n);
    }
}
