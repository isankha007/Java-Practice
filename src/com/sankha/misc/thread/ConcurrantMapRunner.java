package com.sankha.misc.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrantMapRunner {
    public static void main(String[] args) {
        Map<Character, LongAdder> occurance= new HashMap<>();
        String str="Abcd ABCD Abcd";
        for (char ch:str.toCharArray()) {
            occurance.computeIfAbsent(ch,c->new LongAdder()).increment();
          /*  LongAdder logAdder =occurance.get(ch);
            if(logAdder==null){
                logAdder=new LongAdder();
            }
            logAdder.increment();
            occurance.put(ch,logAdder);*/
        }
        System.out.println(occurance);

        CopyOnWriteArrayList<String> cOW=new CopyOnWriteArrayList<>();
        cOW.add("Abc");
        System.out.println(cOW);

    }
}
