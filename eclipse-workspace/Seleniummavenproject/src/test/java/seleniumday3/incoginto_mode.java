package seleniumday3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incoginto_mode {

	public static void main(String[] args) {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://uncodemy.com/");
		
		String Title= driver.getTitle();
		
		System.out.println(Title);

	}

}
