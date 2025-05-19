package seleniumday3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_back {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		//Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.manage().window().minimize();
		
		
	}
}