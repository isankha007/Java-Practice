package com.sankha.misc;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class DatingWithMyLove {

    public static void test(String s) {
        System.out.println("String called");

    }

    public static void test(Object s) {
        System.out.println("Object called");

    }
    public static void main(String[] args) {
        LocalDate ldt= LocalDate.now();
        System.out.println("==== "+ldt);
        LocalDate ldt1=LocalDate.of(2015,04,10);
        System.out.println("==== "+ldt1);
        LocalDate ldt2=LocalDate.parse("2022-02-19");
        System.out.println("==== "+ldt2+" day of month "+ldt2.getDayOfMonth()+" chronology samjho "+ldt2.getChronology());
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String formattedCurrentDate = ldt2.format(df1);
        System.out.println("Formatted date "+formattedCurrentDate);
        DateTimeFormatter df2=DateTimeFormatter.ofPattern("dd:MM:yyyy hh:mm:ss");
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(" ----  "+localDateTime.format(df2));

        Period gap=Period.between(ldt,ldt1);
        System.out.println("Gap between two date "+gap);
        Period prd1=Period.parse("P22Y11M01D").plus(Period.ofDays(5));
        System.out.println("+++++++    +++++++ "+prd1);
        Period prd2=Period.of(2023,03,11);
        System.out.println("++++++++++++++ "+prd2);
        System.out.println("--------- "+ldt2.minus(1, ChronoUnit.YEARS));

        test(null);
    }

}
