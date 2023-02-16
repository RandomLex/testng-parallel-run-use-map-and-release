package com.multimodule.app;

public class Calc {
    public int sum(int a, int b) throws InterruptedException {
        Thread.sleep(3000);
        return a * b; // artificial error
    }

    public int sub(int a, int b) throws InterruptedException {
        Thread.sleep(3000);
        return a - b;
    }
}
