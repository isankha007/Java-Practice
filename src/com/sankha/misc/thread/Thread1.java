package com.sankha.misc.thread;

class ThreadBC extends Thread{
    int total=0;
    @Override
    public void run() {
        synchronized (this){
        for(int i=0;i<10;i++){
            total+=i;
            System.out.println(total);
        }
        this.notify();
        }
    }
}
public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadBC threadBC=new ThreadBC();
        threadBC.start();
        //Thread.sleep(1000);
        //b.join();
        synchronized (threadBC){
            System.out.println("Main thread will try to call wait");
            threadBC.wait();
            System.out.println(threadBC.total);
        }




    }
}
