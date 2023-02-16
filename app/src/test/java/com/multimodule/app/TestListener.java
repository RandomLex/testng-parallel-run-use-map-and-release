package com.multimodule.app;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        String key = Thread.currentThread().getName();
        Service.releaseDto(key);
        System.out.println("Released : " + key);
    }

    @Override
    public void onFinish(ITestContext context) {
        Service.printMap();
    }
}
