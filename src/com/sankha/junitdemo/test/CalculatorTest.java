package com.sankha.junitdemo.test;

import com.sankha.junitdemo.main.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Calculator _calculator=new Calculator();
    @Test
    public void addTest(){
        int actualResult=_calculator.add(10,20);
        Assert.assertEquals(30,actualResult);
    }
}
