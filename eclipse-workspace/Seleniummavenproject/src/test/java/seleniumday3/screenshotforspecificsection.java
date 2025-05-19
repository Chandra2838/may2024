package seleniumday3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotforspecificsection {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://uncodemy.com/");
		
	WebElement screenshot=driver.findElement(By.xpath("//img[@class='companies-container companies-container1']"));
	 File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
	 
	File Targetfile=new File("C:\\Users\\Dell\\eclipse-workspace\\Seleniummavenproject\\screenshotfolder\\screenshot.png");
	sourcefile.renameTo(Targetfile);
	 
		
	}

}
