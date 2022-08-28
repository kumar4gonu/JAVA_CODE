package com.gonu.logic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestSorting {
    public static void main(String[] args) {

        List<Developer> listDevlopers = getDeveloper();
        for (Developer dev : listDevlopers){
            System.out.println(dev.getAge() );
        }
    }


    public static List<Developer> getDeveloper(){
        List<Developer> list = new ArrayList<Developer>();

        list.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        list.add(new Developer("alvin", new BigDecimal("80000"), 20));
        list.add(new Developer("jason", new BigDecimal("100000"), 10));
        list.add(new Developer("iris", new BigDecimal("170000"), 55));

        return list;

    }
}
