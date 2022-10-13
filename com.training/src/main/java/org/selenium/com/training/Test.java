package org.selenium.com.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		// Chromedriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\conta\\\\eclipse-workspace\\\\com.training\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.quit();

	}

}
