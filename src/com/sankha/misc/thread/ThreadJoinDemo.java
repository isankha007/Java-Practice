package com.sankha.misc.thread;

class ThreadJoin extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Thread outside forloop");

        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadJoinDemo {



    public static void main(String[] args) throws InterruptedException {
        ThreadJoin t1=new ThreadJoin();
        //ThreadJoin t2=new ThreadJoin();
        t1.start();
       // t2.start();
        t1.join();

        for (int i = 0; i <10 ; i++) {
            System.out.println("Some Other Thread");
        }
    }
}
