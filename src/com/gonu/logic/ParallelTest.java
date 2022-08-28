package com.gonu.logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelTest {
    public static void main(String[] args) {
        IntStream rang = IntStream.range(1,10);
      //  rang.forEach(System.out::println);
        System.out.println("---------------------");
        IntStream rang2 = IntStream.range(1,10);
       // rang2.parallel().forEach(System.out::println);


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream().parallel().forEach(System.out::println);
    }
}
