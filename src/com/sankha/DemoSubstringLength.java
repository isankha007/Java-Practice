package com.sankha;

import java.util.HashSet;
import java.util.Set;

public class DemoSubstringLength {

    public static void main(String[] args) {
        Set<Character> hs=new HashSet<>();
        int maxLength=Integer.MIN_VALUE;
        int i=0,j=0;
        String s= "pwwkew";
        int n=s.length();
        while(j<n){
            Character ch=s.charAt(j);
            if(!hs.contains(ch)){
                hs.add(ch);
                j++;
            }else{
                maxLength=Math.max(maxLength,hs.size());
                hs.remove(s.charAt(i));
                i++;
            }

        }
        System.out.println("Max length ="+maxLength);
    }
}
