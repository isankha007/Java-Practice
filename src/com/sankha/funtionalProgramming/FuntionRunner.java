package com.sankha.funtionalProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class FuntionRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture= CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("I will run in separate thread than main");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        completableFuture.get();


        CompletableFuture<String> completableFuture1= CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                return "Asynchronous computation result";
            }
        });
        String result=completableFuture1.get();
        System.out.println(result);


    }
}
