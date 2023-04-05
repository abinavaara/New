package org.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("URL AND TITLE FOR FLIPCART");
		
		String u = driver.getCurrentUrl();
		System.out.println(u);
		
		
		String t = driver.getTitle();
	System.out.println(driver.getTitle());
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(90));
	
	
	}

}
