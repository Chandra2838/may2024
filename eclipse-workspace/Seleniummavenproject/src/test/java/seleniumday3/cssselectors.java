package seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		
		//tag class
		driver.findElement(By.cssSelector("input.search-box-text ui-autocomplete-input")).sendKeys("shirt");
		
		Thread.sleep(2000);
		driver.manage().window().minimize();

	}

}
