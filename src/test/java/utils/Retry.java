package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {


    /**
     *
     * @param result -> of the test
     * @return true if the test method has to be retried, otherwise false
     */

    int counter = 0;
    int retryLimit = 2; //best practice

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < retryLimit){
            counter++;
            return true;
        }
        return false;
    }
}
