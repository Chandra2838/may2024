package seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		 
		driver.manage().window().maximize();
		// How to use isdisplayed
		 WebElement logo= driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']"));
		 System.out.println(logo.isDisplayed());
		 
		 // How to use is Enabled
		boolean firstname= driver.findElement(By.xpath("//input[@name='firstname']")).isEnabled();
		 System.out.println(firstname);
		 
		 WebElement Gender=driver.findElement(By.xpath("//input[@value='1']"));
		 System.out.println(Gender.isSelected());
		 Gender.click();
		 System.out.println(Gender.isSelected());
		 
		 // How to use close method 
		 //How to use quit 
		 driver.findElement(By.xpath("//a[@role='link']")).click();
		 //driver.quit();
		 driver.close();
		 
		 driver.manage().window().minimize();
		 

	}

}
