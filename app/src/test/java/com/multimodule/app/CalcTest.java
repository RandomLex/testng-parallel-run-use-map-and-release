package com.multimodule.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    private int  x= 1;
    private final Calc calc = new Calc();

    @Test(groups = "myGroup")
    public void testSum() throws InterruptedException {
        System.out.println(Service.getDto());
        int result = calc.sum(2, 3);
        Assert.assertEquals(result, 5, "Sum of 2 and 3 should be 5");
    }

    @Test(groups = "myGroup")
    public void testSub() throws InterruptedException {
        System.out.println(Service.getDto());
        int result = calc.sub(5, 2);
        Assert.assertEquals(result, 3, "Subtraction of 2 from 5 should be 3");
    }
}
