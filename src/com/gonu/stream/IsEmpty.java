package com.gonu.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class IsEmpty {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("kumar");
       streamOf(list).forEach(s -> System.out.println(s));

       // Empty Stream
       Stream<String> streaEmpty = Stream.empty();

       // Stream of Collection

        Collection<String> collection = Arrays.asList("asd","dfsd","asdfsd","sdfsdf","werewrew","ghfgfh",
                "eryyyy","gfghgh","rtretret","tretert","ghjghj","ghjghj");

       //stream type
        Stream<String> streamCollection = collection.stream();
        //streamCollection.forEach(System.out::println);
        //collection.stream().forEach(System.out::println);

        //Stream of Array
        Stream<String> array = Stream.of("asd","dfsd","asdfsd","sdfsdf","werewrew","ghfgfh",
                "eryyyy","gfghgh","rtretret","tretert","ghjghj","ghjghj");

        //array.forEach(s -> System.out.println(s));
         String [] strArray = new String[]{"asd","dfsd","asdfsd","sdfsdf","werewrew","ghfgfh",
                "eryyyy","gfghgh","rtretret","tretert","ghjghj","ghjghj"};
         //String [] strArrays = new String[20];
          Stream<String> arrayStream = Arrays.stream(strArray);
          Stream<String> streamOfArrayPart = Arrays.stream(strArray,3 ,7);

       // arrayStream.forEach(System.out::println);
       // streamOfArrayPart.forEach(System.out::println);

        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);

      //  streamGenerated.forEach(System.out::println);

        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();

        streamBuilder.forEach(System.out::println);

    }

    public static Stream<String> streamOf(List<String> list){
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
