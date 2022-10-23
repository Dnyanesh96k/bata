package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends WebElement implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		  System.out.println("Test is Success"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is Failed"+result.getName());
	}
    public void onTestSkipped(ITestResult result) {
    	System.out.println("Test is Skipped"+result.getName());
    }
    public void onTestStart(ITestResult result) {
    	System.out.println("Test is start"+result.getName());
    }
}
