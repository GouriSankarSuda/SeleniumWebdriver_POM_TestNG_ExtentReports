package main.java.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestCaseRetryAnalyzerOnFail implements IRetryAnalyzer {
    int count = 0;
    int RetryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        while (count < RetryCount) {
            count++;
            return true;
        }
        return false;
    }
}



