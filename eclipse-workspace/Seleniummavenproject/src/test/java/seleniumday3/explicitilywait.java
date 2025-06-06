package seleniumday3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitilywait {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 
	 WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(9));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	driver.manage().window().maximize();
	WebElement user=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	user.sendKeys("Admin");
	WebElement userpass=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	userpass.sendKeys("admin123");
	WebElement button=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));	
	
	button.click();
	}

}
