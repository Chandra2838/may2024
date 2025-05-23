package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcase {
	
	WebDriver driver;
	@BeforeClass
	void setup() {
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	void testlogin() {
		 withoutpagefactory page=new withoutpagefactory(driver);
		page.setusername("Admin");
		page.setpassword("admin123");
		page.clicklogin();
		//driver.findElement(By.xpath("\"//input[@name='username']\"")).sendKeys("//input[@name='username']");
		
		boolean dash=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertTrue(dash);
	}
	@AfterClass
	void close() {
		driver.quit();
	}
	
	
	

}
