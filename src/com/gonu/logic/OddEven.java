package com.gonu.logic;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
      int arr [] ={2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
      List<Integer> list = Arrays.asList(2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66);
      //findOddEven(arr);
        System.out.println("--------");
       //even(list);
        //System.out.println("--------");
       //odd(list);
        oddEvenMap(list);
    }
    public static void findOddEven(int arr[]){
        Arrays.stream(arr).filter(num -> num%2 == 0).forEach(System.out::println);
    }

    public static void even(List<Integer> list){
        List<Integer> evenList = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
             evenList.forEach(System.out::println);

    }

    public static void odd(List<Integer> list){
        List<Integer> oddList = list.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
        oddList.forEach(System.out::println);
    }


   public static void oddEvenMap(List<Integer> list){
       Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
       map.forEach((k,v) -> System.out.println("Key : "+ k + "  Value : "+ v));
   }
}
