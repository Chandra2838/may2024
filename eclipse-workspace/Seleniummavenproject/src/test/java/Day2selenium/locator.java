package Day2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		// To maximize the window 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//name on place of display we using the send key becuase it is a text box 
		 WebElement email_var= driver.findElement(By.name("ejjmail")) ; //.sendKeys("chandra@gamil.com");
		 email_var.sendKeys("chadra@gmail.com");
		 Thread.sleep(3000);
		 email_var.clear();
		Thread.sleep(3000);
		 email_var.sendKeys("shekhar@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("uyaaefuyyu");
		// minimize the window 
		Thread.sleep(3000);
		driver.manage().window().minimize();		
		// Web driver is to fast that's why we using thread here.
	}
}
