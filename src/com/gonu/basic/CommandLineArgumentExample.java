package com.gonu.basic;

public class CommandLineArgumentExample {
    public static void main(String[] args) {
        if(args.length > 0){
            for(String val : args){
                System.out.println(val);
            }
        }else{
            System.out.println("No argument pass.");
        }
    }
}
