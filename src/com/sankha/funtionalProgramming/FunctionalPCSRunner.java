package com.sankha.funtionalProgramming;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalPCSRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Predicate<String> pred=s->(s!=null&&s.length()>5);
        System.out.println(pred.test("sankhadeep"));
        Predicate<String> pred2=s->(!s.contains("e"));
        System.out.println(pred.and(pred2).test("sankhadeep"));

        Function<String,Integer> fn=s -> {return s.length();};
        System.out.println(fn.apply("Nemo"));

        Consumer<String> cm=s-> System.out.println(s);
        cm.accept("Consumer ");


        Supplier<Date> sp=()->new Date();
        System.out.println(sp.get());

        Runnable runnable=()->{
            System.out.println("DO execution");
        };
        ExecutorService es= Executors.newCachedThreadPool();
        es.submit(runnable);
       // es.shutdown();

        Callable<String> callable=()->{return "this is callable";};
        Future<String> fut = es.submit(callable);
        String str = fut.get();
        System.out.println(str);

         es.shutdown();

        Map<Integer,String> map=new HashMap<>();
        map.put(5,"k");
        map.put(2,"c");
        map.put(4,"a");
        List<Map.Entry<Integer,String>> list=new ArrayList<>(map.entrySet());

        System.out.println(list);
        list.sort((e1, e2) -> (e1.getValue().compareToIgnoreCase(e2.getValue())));
        System.out.println(list);

        Map<Integer,String> hmTemp=new LinkedHashMap<>();//have to use linked list to maintain insertion order
        for(Map.Entry<Integer,String> el:list){
            hmTemp.put(el.getKey(),el.getValue());
        }

        for(Map.Entry<Integer,String> el:hmTemp.entrySet()){
            System.out.println(el.getKey()+" "+el.getValue());
        }

    }
}
