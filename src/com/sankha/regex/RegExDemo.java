package com.sankha.regex;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) throws IOException {
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
        //11 digit mobile number,start with 0
        Pattern p3=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        //12 digit mobile number,start with 91

        Matcher m2=p2.matcher("9933797103");


        if(m2.matches()){
            System.out.println("Valid mobile number");
        }else {
            System.out.println("Not a valid mobile number");
        }


        // email
        Pattern p4=Pattern.compile("[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-z0-9]+([.][a-zA-z0-9]+)+");
        Matcher m4=p4.matcher("sankhadeep@gmail.co.in");
        if(m4.matches()){
            System.out.println("Valid Email ");
        }else {
            System.out.println("Not a valid email");
        }

        PrintWriter out=new PrintWriter("src/com/sankha/regex/output.txt");
        Pattern ph=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        BufferedReader br=new BufferedReader((new FileReader("src/com/sankha/regex/input.txt")));
        String line=br.readLine();
        while(line!=null){
            Matcher mph=ph.matcher(line);
           // System.out.println(line);
            while(mph.find()){
                out.println(mph.group());
            }
            line=br.readLine();
        }
        out.flush();
    }


}
