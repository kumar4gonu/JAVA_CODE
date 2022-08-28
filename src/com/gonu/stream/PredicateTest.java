package com.gonu.stream;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        preTest(30 , i -> i > 20);
    }

    public static void preTest(Integer number, Predicate<Integer> predicate){
       if(predicate.test(number)){
           System.out.println(number);
       }
    }
}
