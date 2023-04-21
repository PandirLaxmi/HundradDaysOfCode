package com.demo.hundredDaysOfCode.lambdaExpressions;

public class ThredadDemo {
    public static void main(String[] args) {
        //First thread: thread  - John

        Runnable thread1 = () -> {
            // this is the body of the thread
            //stuff
            for (int i = 0; i < 9; i++) {
                System.out.println("value of the i is " + i);

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("John");
        t.start();
    }
}
