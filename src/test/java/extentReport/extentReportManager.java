package extentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	
	public void onStart(ITestContext context) {
		// Set report location and Title details
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/report/Demohomepage.html");
		sparkReporter.config().setDocumentTitle("Orange HRM Demo Home Page");
		sparkReporter.config().setReportName("Home page Demo");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		// set user info
		extent.setSystemInfo("Device", "Laptop");
		extent.setSystemInfo("Window", "windos 10");
		extent.setSystemInfo("Enviroment", "Staging");
		extent.setSystemInfo("QA", "Sachin M");

	  }

	public void onTestStart(ITestResult result) 
	  {
		

	  }
	
	public void onTestSuccess(ITestResult result) 
	  {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test Case is Passsed: "+result.getName());
	  }
	
	 public void onTestFailure(ITestResult result) 
	 	  {
		 	test=extent.createTest(result.getName());
		    test.log(Status.FAIL, "Test case is Failed: "+result.getName());
		    test.log(Status.FAIL, "Test case is failed due to:"+result.getThrowable());
		  }
	 public void onTestSkipped(ITestResult result) 
	 	  {
		 	test=extent.createTest(result.getName());
		 	test.log(Status.SKIP, "Test case is skiped: "+result.getName());
		  }
	 public void onFinish(ITestContext context) 
	 	  {
		    extent.flush();
		  }
	
}
