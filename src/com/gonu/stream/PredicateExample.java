package com.gonu.stream;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> pre = value -> value < 10;

        System.out.println(pre.test(15));
    }






}
