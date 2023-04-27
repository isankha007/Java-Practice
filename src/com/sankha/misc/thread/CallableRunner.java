package com.sankha.misc.thread;

import java.util.concurrent.*;

class CallableTask implements Callable<Integer>{

    Integer num;
    public CallableTask(int num) {
        this.num=num;
        // TODO Auto-generated constructor stub
    }
    @Override
    public Integer call() throws Exception {
        int sum=0;
        // TODO Auto-generated method stub
        for (int i=0;i<num;i++) {
            sum+=i+1;
        }
        return sum;
    }

}
public class CallableRunner {

    public static void main(String[] args) {
        CallableTask[] jobs= {
                new CallableTask(10),
                new CallableTask(12),
                new CallableTask(15),
                new CallableTask(20)
        };
        // ExecutorService executor=Executors.newFixedThreadPool(3);
        ExecutorService executor= Executors.newCachedThreadPool();

        for(CallableTask job:jobs) {
            Future<Integer> f=executor.submit(job);
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        executor.shutdown();

        ThreadRunnable mr=new ThreadRunnable("Sankha");
        Thread rt=new Thread(mr,"NAME thread");
        rt.start();
    }
}
