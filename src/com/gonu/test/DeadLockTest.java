package com.gonu.test;

import javax.swing.plaf.TableHeaderUI;

public class DeadLockTest {
    public static void main(String[] args) {
        String lastName = "kumar";
        String firstName = "Chandan";

        Thread th = new Thread(()->{
           synchronized (lastName){
               try {
                   Thread.sleep(1000);
                   System.out.println("Thread 1 is blocked....... Last Name");
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

               synchronized (firstName){
                   System.out.println("Thread 1 is blocked for first name");
               }
           }
        });


        Thread th1 = new Thread(()->{
            synchronized (lastName){
                System.out.println("Thread 2 is blocked... for last name");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
              synchronized (firstName){
                  System.out.println("Thread 2 is blocked for First Name");
              }
            }
        });

        th.start();
        th1.start();
    }
}
