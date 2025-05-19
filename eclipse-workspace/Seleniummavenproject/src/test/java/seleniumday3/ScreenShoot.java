package seleniumday3;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Full page scrennshoot 
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File("C:\\Users\\Dell\\eclipse-workspace\\Seleniummavenproject\\screenshotfolder\\fullpage.png");
		
		sourcefile.renameTo(targetfile);// source file to target file 
		
		driver.manage().window().minimize();
		

	}

}
