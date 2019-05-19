package org.sample.wd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractice {

	public static void main(String args[]) {
		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().back();
	}
	
	
}
