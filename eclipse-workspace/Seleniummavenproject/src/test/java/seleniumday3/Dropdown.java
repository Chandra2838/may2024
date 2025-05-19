package seleniumday3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//how to handel dropdown
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select  dropdowncountry=new Select(dropdown);
		Thread.sleep(2000);
		
		List<WebElement> count= dropdowncountry.getOptions();
		System.out.println(count.size());
		
		// print all options 
		
		for (int i=0; i<count.size();i++) {
			System.out.println(count.get(i).getText());
			
		}
		
		
		driver.manage().window().minimize();
	}

}
