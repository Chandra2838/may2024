package seleniumday3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class how_to_remove_automed_control_heading {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions Options=new ChromeOptions();
		Options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		
		WebDriver driver= new ChromeDriver(Options);
		
		
		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
	}

}
