package seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://uncodemy.com/");	
		//driver.manage().window().minimize();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@id='categoriesBtn']"))).build().perform();
		Thread.sleep(3000);
		driver.manage().window().minimize();
	}
}
