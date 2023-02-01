//package com.gonu.test;
//
//import javax.imageio.stream.ImageInputStream;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class TestMain{
//
//
//
//
//    int sum = list.stream().reduce(Integer.sum(0,In)).get();
//
//
//    public static void main(String[] args) {
//        functiontest sum = (a ,b)-> {
//            System.out.println(a+b);
//             return a + b;
//        };
//       int x = sum.add(1,2);
//        // System.out.println(sum.add(1,3));
//     }
//
//    public static void solve(){
//        List<List<Integer>>  list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//        list1.add(10);
//       // list.add(list1);
//       Stream<Object> sum  = list.stream().map(x -> x.stream().reduce(Integer::sum));
//
//        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7);
//        List<List<Integer>> intsLists = Arrays.asList(ints, ints, ints);
//
//// get the sum of a single list
//        Integer sumSingleList = ints.stream().mapToInt(Integer::intValue).sum();
//// sum multiple lists within a list, get a result per list
//        List<Integer> sumsMultiList = intsLists.stream().map(e -> e.stream()
//                .mapToInt(Integer::intValue).sum()).collect(Collectors.toList());
//// sum all lists, get a single total
//        Integer sumTotalMultiList = intsLists.stream().map(e -> e.stream()
//                .mapToInt(Integer::intValue).sum()).mapToInt(Integer::intValue).sum();
//
//
//        Map<Integer,Integer> map = new HashMap<>();
//
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//                        (oldValue,newValue) -> oldValue, LinkedHashMap::new));
//
//
//    }
//}
