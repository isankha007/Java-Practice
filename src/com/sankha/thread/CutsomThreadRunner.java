package com.sankha.thread;

public class CutsomThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        Printer print = new Printer();
        //CustomRunnable tr=new CustomRunnable();
        Thread t1=new Thread(new CustomRunnable(10,print,true),"Odd");
        Thread t2=new Thread(new CustomRunnable(10,print,false),"Even");
        t1.start();;
        t2.start();

       /* t1.start();
        synchronized (tr){
            tr.wait();
            System.out.println("Notified "+Thread.currentThread().getName());
            t2.start();

        }*/
    }
}
