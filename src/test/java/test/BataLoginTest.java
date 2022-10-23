package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.BataLoginpage;
import utility.Extendreport;
import utility.WebElement;

public class BataLoginTest extends WebElement {
	ExtentReports extend;
	ExtentTest test;
@BeforeTest	
public  void createReport() {
extend=Extendreport.getReports();
	
}
@AfterTest
public void flushReport() {
	extend.flush();
}

@BeforeMethod
public void openBrowser() {
	 driver=Browser.openChromeBrowser("https://www.bata.in");
    
}
@AfterMethod
public void captureResult(ITestResult result) {
	if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS, result.getName());
		}
	else if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL, result.getName());
	}
	else {
		test.log(Status.SKIP, result.getName());
	}
}

	
@Test
public void test() {
	test=extend.createTest("test");
	BataLoginpage page=new BataLoginpage(driver);
	page.LoginClick();
	page.SendName("ddpatil1998@gmail.com");
	page.SendPass("Poiuy@0987");
	page.ClickSignin();
	
}
}
