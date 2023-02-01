package com.gonu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) {
            invoke();
    }

    public static void invoke(){
        ExecutorService  executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() ->{
            Thread.sleep(1000);
            System.out.println("In Future Service");

            return "hello";
        });
    }
}
