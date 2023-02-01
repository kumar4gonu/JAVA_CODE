package com.gonu.test;

import java.util.*;
import java.util.stream.Stream;

public class SortArray {
    public static void main(String[] args) {

      String str = "aabccd";


      Map<Character,Integer> map = new HashMap<>();

      for(int i=0;i<str.length();i++){
        if(map.containsKey(str.charAt(i))){
          map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        }else{
          map.put(str.charAt(i), 1);
        }
      }
      System.out.println(map);

//      List<Integer> list = new ArrayList<>();
//      list.add(12);
//      list.add(1);
//      list.add(5);
//      list.add(13);
//      list.add(14);
//      list.add(15);
//      list.add(15);
//      list.add(15);
//
//     // list.stream().sorted(Collections.sort()).skip(2).limit(1).forEach(System.out::println);
//      list.stream().sorted(Collections.reverseOrder())
//              .distinct()
//              .skip(1)
//              .limit(1).forEach(System.out::println);
    }
  }
