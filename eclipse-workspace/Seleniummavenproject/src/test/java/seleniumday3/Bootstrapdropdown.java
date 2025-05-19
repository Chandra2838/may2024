package seleniumday3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.meesho.com/?srsltid=AfmBOoodEeo462VNMJAqyKGcPgcUQ7D9QcwwfFoszATwuGUHxNe79JBc");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.cssSelector("input.sc-eDvSVe gUjMRV sc-cOxWqc gbctfC search-input-elm sc-cOxWqc gbctfC search-input-elm")).sendKeys("shirt");
		
		 // driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		 //driver.findElement(By.xpath("//li[@id='active-dropdown-course']")).click();
		
		//List<WebElement>datasciencebutton=driver.findElements(By.xpath("//button[@class='glow-on-hover glo']"));
		//datasciencebutton.get(0).click();
		  
		  Thread.sleep(4000);
		   driver.manage().window().minimize();

	}

}
