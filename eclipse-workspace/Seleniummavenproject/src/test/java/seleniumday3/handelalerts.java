package seleniumday3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelalerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		//second method to handel popup / Alert 
		
		 Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("welcome to uncodemy");
		Thread.sleep(2000);
		myalert.accept();
		Thread.sleep(2000);

		driver.manage().window().minimize();
		
		

	}

}
