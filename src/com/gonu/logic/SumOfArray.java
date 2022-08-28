package com.gonu.logic;

import java.util.Arrays;
import java.util.List;

public class SumOfArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }
}
