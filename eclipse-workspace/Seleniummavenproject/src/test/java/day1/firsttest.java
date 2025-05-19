package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://uncodemy.com/");
		
		String act_title=driver.getTitle();
		String exp_title="Uncodemy - India's Best IT Trai Institute in Noida | Delhi";
		
		if (act_title.equals(exp_title)) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fail");
		}

	}

}
