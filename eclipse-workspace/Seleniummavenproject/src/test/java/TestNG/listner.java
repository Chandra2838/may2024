package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listner implements ITestListener {
	
	
	 public void onTestStart(ITestResult result) {
		 System.out.println("TEst start ");
		  }
	 
	 public  void onTestSuccess(ITestResult result) {
		 System.out.println("TEst sucess ");
		  }
	 
	 public  void onTestFailure(ITestResult result) {
		 System.out.println("TEst fail ");
		  }
	 
	 public  void onTestSkipped(ITestResult result) {
		 System.out.println("TEst Skipped ");
		  }
	 
	 public  void onStart(ITestContext context) {
		 System.out.println("TEst  context started  ");
		  }
	 
	 public  void onFinish(ITestContext context) {
		    System.out.println("TEst finish ");
		  }
	

}
