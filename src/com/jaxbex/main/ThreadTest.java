package com.jaxbex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadTest implements Runnable {

    private static List<String> data;

    private final int arg1, arg2;

    public ThreadTest(final int arg1, final int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public void run() {

        process();

    }

    private synchronized void process() {
        for (int i = this.arg1; i <= this.arg2; i++) {
            System.out.println(data.get(i) + " " + Thread.currentThread().getName());
        }
    }

    public static void main(final String[] args) {
        data = Collections.synchronizedList(new ArrayList<String>());

        for (int i = 0; i < 10; i++) {
            data.add("Data " + i);
        }

        final ThreadTest test1 = new ThreadTest(0, 4);
        final ThreadTest test2 = new ThreadTest(5, 9);

        final Thread thread1 = new Thread(test1);
        thread1.setName("Thread1");

        final Thread thread2 = new Thread(test2);
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();

    }
}
