package seleniumday3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// How to select all check box 
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for(int i=0; i<checkbox.size();i++) {
			checkbox.get(i).click();	
		}
		Thread.sleep(2000);
		// how to check uncheck  box 
		
		for(WebElement i:checkbox) {
			if(i.isSelected()==true) {
				continue;
			}
			else {
				i.click();
			}		
		}
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
			
	
	}
	

}
