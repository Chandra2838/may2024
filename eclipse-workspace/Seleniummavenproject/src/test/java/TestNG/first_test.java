package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class first_test {
	@BeforeTest
	void Beforetest() {
		System.out.println("Beforetest");
	}
	@AfterTest
	void Aftertest(){
		System.out.println("Aftertest");	
	}
	@BeforeClass
	void beforeclass() {
		System.out.println("Beforeclass");
	}
	@AfterClass
	void Afterclass() {
		System.out.println("Afterclass");
	}
	@AfterSuite
	void Aftersuit() {
		System.out.println("Afte suit");
	}
	@BeforeSuite
	void BeforeSuit() {
		System.out.println("Befor suit ");
	}
	@Test(priority=1)
	void Before() {
		System.out.println("test ");
	}
	
	
	
	
	
}
