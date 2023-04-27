package com.sankha.misc.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LazyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Child Thread");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread2 extends Thread{
    //it will be considered as normal method
    public void start() {

    }
    public void run() {

    }
}

class Mythred3 extends Thread{

    public void run() {
        // TODO Auto-generated method stub
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            for(int i=0;i<10;i++) {
                System.out.println(" Waiting "+i);
            }
        }


    }

}
class Mythred4 implements Runnable{
    Mythred3 myThread3;
    public Mythred4(Mythred3 mythread3) {
        // TODO Auto-generated constructor stub
        this.myThread3=mythread3;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        Lock l=new ReentrantLock();
        l.lock();
        for(int i=0;i<10;i++) {
            System.out.println(" Mythred4 ==== "+i);
        }
        synchronized (myThread3) {
            myThread3.notify();
        }
        l.unlock();

    }

}
public class SleepDemo {
    public static void main(String[] args) {
        //LazyThread th= new LazyThread();
        //th.start();
       // th.interrupt();
        System.out.println("End of main");
        ReentrantLock l=new ReentrantLock();
        if(l.tryLock()) {
            System.out.println("Do something");
            if(l.tryLock()) {
                System.out.println(" Got again ==="+l.getHoldCount());
            }else {
                System.out.println(" Not available");
            }
            l.unlock();
            System.out.println(" Got again ==="+l.getHoldCount());
            l.unlock();
            System.out.println(" Got again ==="+l.getHoldCount());
            //l.unlock();//java.lang.IllegalMonitorStateException
        }
        Mythred3 th3=new Mythred3();
        th3.start();

        Mythred4 th4=new Mythred4(th3);
        Thread thr4= new Thread(th4);
        thr4.start();
    }
}
