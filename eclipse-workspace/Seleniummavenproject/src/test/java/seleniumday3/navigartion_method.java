package seleniumday3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigartion_method {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		
		// How to use navigate().to() method // 1st method 
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		// Second Method 
		  URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.navigate().to(myurl);
		  
		  // IMP interview question how to use my url and navigate.to(url)
				}

}
