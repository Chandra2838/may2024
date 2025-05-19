package seleniumday3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandel {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		// get windows handel ()-- returns ID's of multiple browser window 
		driver.findElement(By.xpath("//a[text()='Official Documentation']")).click();
		
		Set<String>windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
		
	}

}
