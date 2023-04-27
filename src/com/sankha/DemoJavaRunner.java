package com.sankha;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoJavaRunner {
    public static void main(String[] args) {
        ///predicate
        Predicate<String> predicate= s->s.contains("e");
        System.out.println(predicate.test("Sankhadeep"));

        Function<String,Integer> function=s->{return s.length();};
        System.out.println(function.apply("Sankha"));

        Consumer<String> consumer=(s)->s.length();
        consumer.accept("sankha");

        Supplier<Date> supplier=()->new Date();
        System.out.println(supplier.get());
     // 10, 16, 19, 40, 67, 111 ,16, 67

        int[] nums= new int[]{10, 16, 19, 40, 67, 111 ,16, 67};
        //16,67
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1])continue;
            else
                System.out.println(nums[i]);
        }

        List<Integer> list=Arrays.asList(10, 16, 19, 40, 67, 111 ,16, 67);
        list.stream().filter(e->Collections.frequency(list,e)>1).distinct()
                        .forEach(e-> System.out.println("+ = "+e));
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().filter(m->m.getValue()>1)
                        .map(Map.Entry::getKey)
                                .forEach(e-> System.out.println(" +++ "+e));
//        Collections.addAll(list,nums);
//        Arrays.stream(nums).filter(value -> Collections.frequency(List.of(nums),value)>1)
//                .forEach(value -> System.out.println("=== "+value));
//               ;


        Arrays.stream(nums).distinct().filter(value -> String.valueOf(value).startsWith("1"))
                .forEach(System.out::println);


        int n=12345;
        int sum=0;
        while(n>0 || sum>9){
            if(n==0){
                n=sum;
                sum=0;
            }
            System.out.println("IN === "+sum);
            sum+=n%10;
            n/=10;
        }
        System.out.println("=== "+sum);
        ///we want repeated ones
        ///function
        ///suplier
        //consumer
        List<String> list1=Arrays.asList("AA","BB","AA","CC");
        Map<String, Long> collect = list1.stream().filter(x -> Collections.frequency(list1, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Collect1 " +collect);

        List<Integer> list2=Arrays.asList(11,22,11,33);
        Map<Integer, Long> collect2 = list2.stream().filter(x -> Collections.frequency(list2, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        String s1="abc";
        String s2=s1;
        s1+="d";
        System.out.println(s1+" === "+s2+" === "+(s1==s2));

        StringBuilder sb=new StringBuilder("abc");
        StringBuilder sb1=sb;
        sb.append("d");
        System.out.println(sb+" === "+sb1+" === "+(sb==sb1));


        System.out.println("Collect2 " +collect2);
//        int x=10;
//        Stream.iterate(0,k->k+1*x).limit(10).forEach(System.out::println);
//        x=30;
    }
}
