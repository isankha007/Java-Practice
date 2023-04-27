package com.sankha.misc.thread;

public class ThreadRunnable implements Runnable{

    private String name;

    public ThreadRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Child thread "+i+" "+name);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
