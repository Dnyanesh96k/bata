package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendreport {

	public static ExtentReports getReports() {
	   ExtentSparkReporter sparkReporter= new ExtentSparkReporter("MyReport.html");
       ExtentReports report=new ExtentReports();
       report.attachReporter(sparkReporter);
       report.setSystemInfo("Reported By","Dnyaneshwar Patil");
       report.setSystemInfo("TestType", "Regression");
	return report;
      
	}

}
