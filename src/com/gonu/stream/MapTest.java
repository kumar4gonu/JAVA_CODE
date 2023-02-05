package com.gonu.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {

        Student student = new Student("kumar", 30,1);
        List<Student> list = new ArrayList<>();
        list.add(student);

        List<String> listOfStudentName = list.stream().map(stu -> stu.getName())
                .collect(Collectors.toList());

        List<List<Integer> > number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));


        System.out.println("List of list-" + number);

        // using flatmap() to flatten this list
        List<Integer> flatList
                = number.stream()
                .flatMap(lists -> lists.stream())
                .collect(Collectors.toList());

        // printing the list
        System.out.println("List generate by flatMap-"
                + flatList);

        listOfStudentName.forEach(System.out::println);
    }
}
