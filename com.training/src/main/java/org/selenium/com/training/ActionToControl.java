package org.selenium.com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionToControl {

	public static void main(String[] args) throws InterruptedException {
		// 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		WebElement signed = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions act= new Actions (driver);
		act.moveToElement(signed).build().perform();
		Thread.sleep(4000);
		
		WebElement Primemembership= driver.findElement(By.xpath("//*[text()='Prime Membership']"));
		act.moveToElement(Primemembership).click().build().perform();
		Thread.sleep(4000);
		
		
		driver.close();

	}

}
