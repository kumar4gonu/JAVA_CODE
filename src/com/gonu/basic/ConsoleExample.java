package com.gonu.basic;

public class ConsoleExample {
    public static void main(String[] args) {
        //it will not work on ide.
        String name = System.console().readLine();
        System.out.println(name);
    }
}
