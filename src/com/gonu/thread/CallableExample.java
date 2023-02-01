package com.gonu.thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable {

    @Override
    public Object call() throws Exception {
        Random random = new Random();
        Integer value = random.nextInt(5);
        Thread.sleep(value * 100 );


        return value;
    }
}
