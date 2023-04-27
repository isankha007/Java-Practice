package com.sankha.regex;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\\w");
        Matcher m=p.matcher("a7b @Z#9");
        int count=0;
        while(m.find()){
            count++;
            System.out.println(m.start()+"..." +
                    ""+m.end()+"..."+m.group());
        }
        System.out.println("the number of occurence :"+count);
       // Pattern p1=Pattern.compile("\\.");
        Pattern p1=Pattern.compile("[.]");

        String[] s=p1.split("www.sankhasoft.com");
        for(String st:s){
            System.out.println(st);
        }

        StringTokenizer st=new StringTokenizer("sankha software solution"," ") ;
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        //10 digit mobile number,start with 8 ot 7 or 9
        Pattern p2=Pattern.compile("[7-9][0-9]{9}");
        //11 digit mobile number,start with 8 ot 7 or 9
        Pattern p3=Pattern.compile("0?[7-9][0-9]{9}");

        Matcher m2=p.matcher("9933797103");
    }


}
