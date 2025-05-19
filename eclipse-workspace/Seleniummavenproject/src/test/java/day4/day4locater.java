package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4locater {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		//and operator
		driver.findElement(By.xpath("//input[@id='banner-email' and @class='form-control' ]")).sendKeys("chandrashekhar@gmail.com");
		// or operator
		driver.findElement(By.xpath("//input[@id='banner-name' and @class='form-control' ]")).sendKeys("chandrashekhar");
	}

}
