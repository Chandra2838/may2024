package seleniumday3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	public static void main(String args[]) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	
	List<WebElement>table=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	System.out.println(table.get(3).getText());		
}
}

