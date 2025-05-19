package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class withoutpagefactory {
	
	WebDriver driver;
	
	withoutpagefactory(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	By user=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
	By Submt=By.xpath("//button[@type='submit']");
	
	public void setusername(String username)
	{
		driver.findElement(user).sendKeys(username);
	}
	
	public void setpassword(String Passwordset) {
		driver.findElement(password).sendKeys(Passwordset);
	} 
	
	public void clicklogin(){
		driver.findElement(Submt).click();
	}
	

}
