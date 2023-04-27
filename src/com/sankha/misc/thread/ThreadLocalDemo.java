package com.sankha.misc.thread;
class CustomThread extends Thread{

    static Integer custId=0;
    ThreadLocal tl= new ThreadLocal(){
        @Override
        protected Integer initialValue() {
            return ++custId;
        }

    };

    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+tl.get());
    }
}
public class ThreadLocalDemo {
    public static void main(String[] args) throws InterruptedException {
        CustomThread t1=new CustomThread("Thread 1 custom");
        CustomThread t2=new CustomThread("Thread 2 custom");
        CustomThread t3=new CustomThread("Thread 3 custom");

        t1.start();
       // t1.join();
        t2.start();
       // t2.join();
        t3.start();


    }
}
