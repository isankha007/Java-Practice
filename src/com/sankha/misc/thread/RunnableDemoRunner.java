package com.sankha.misc.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemoRunner {
    public static void main(String[] args) {
        ThreadRunnable[] arr={new ThreadRunnable("Abc"),new ThreadRunnable("xyz"),
                new ThreadRunnable("pqr")};

        ExecutorService es= Executors.newCachedThreadPool();
        for (ThreadRunnable t:arr) {
            es.submit(t);
        }
        es.shutdown();
    }
}
