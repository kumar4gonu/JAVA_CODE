package com.gonu.test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestFunction {
    public static void main(String[] args) {
//       FunctionInterFactTEST ft = (a, b) ->{
//            return  (a + b);
//       };
//        String sum = String.valueOf(ft.display("10","20"));
//        System.out.println(sum);

          String str = "my name is devendar, you name is chandan";

          String newStr[] = str.split(" ");

         Map<String , Long> collect = Arrays.stream(newStr)
                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
