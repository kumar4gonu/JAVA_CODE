package com.gonu.stream;

import java.util.Locale;
import java.util.Optional;

public class OptionExample {
    public static void main(String[] args) {
        String str[] = new String[10];

        //it will throw null pointer exception
        //so we can use option to avoid the null pointer exception
       // String value = str[5].toLowerCase();

        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){
            String value = str[5].toLowerCase(Locale.ROOT);
            System.out.println(value);
        }else{
            System.out.println("Value not present......");
        }

        Optional<String> checkOptional = Optional.ofNullable(str[5]);

        Optional<String> isEmpty = Optional.empty();
        System.out.println(isEmpty);

    }
}
