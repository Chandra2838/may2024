package seleniumday3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Options {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://uncodemy.com/");
		
		String title=driver.getTitle();
		
		if(title.equals("uncodemy")) {
			System.out.println("Testpass");
		}
		else {
			System.out.println("Test fail ");
		}
	}

}
