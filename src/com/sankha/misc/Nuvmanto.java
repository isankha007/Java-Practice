package com.sankha.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Nuvmanto {
    public static void main(String[] args) {
        String s = "pr12int345";
        Set<Character> set=new HashSet<>();
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
        set.add('0');
        List<Integer> list=new ArrayList<>();
        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                int val=Integer.valueOf(ch-'0');
                //System.out.println(val+" "+ch);
                maxValue=Math.max(maxValue,val);
                list.add(val);
            }
        }
        for(int el:list){
            if(el<maxValue){
                secondMax=Math.max(secondMax,el);
            }
        }

        System.out.println(secondMax);

    }
}
