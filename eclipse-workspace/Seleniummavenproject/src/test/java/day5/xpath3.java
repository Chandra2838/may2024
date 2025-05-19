package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath3 {
	public static void main(String[] args) {		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.medimention.com/");
		// Xpath with start with 
		List<WebElement> listle=driver.findElements(By.xpath("//input[starts-with(@name,'na')]"));
		listle.get(0).sendKeys("chandra");
		listle.get(1).sendKeys("shekhar");
		
}
}