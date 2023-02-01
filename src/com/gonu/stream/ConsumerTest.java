package com.gonu.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        //Consumer
        List<String> names = Arrays.asList("kumar","chandan","ram");
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

        Consumer<String> consumer = s -> System.out.println("My Name is " +s);

        consumer.accept("Chandan Kumar");


        BiConsumer<String , String> biConsumer = (fName , lName ) -> System.out.println("First name is "
                +fName +" Last name is " + lName);
        biConsumer.accept("Chandan", "Kumar");
       // biConsumer.andThen();

        //Bi-Consumer
        Map<String, Integer> map = new HashMap<>();

        map.put("Kumar" , 25);
        map.put("Rahul" , 24);
        map.put("Roshan" , 65);
        map.put("Rakesh" , 39);

        map.forEach((name , age) -> System.out.println("Name :" + name + " Age :" +age));

    }
}
