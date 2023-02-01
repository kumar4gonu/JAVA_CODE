package com.gonu.stream;

public class Calculate {
    public static void main(String[] args) {
        Suqare square = ( x) -> x * x;

        int ans = square.calculate(10);

        System.out.println(ans);
    }
}
