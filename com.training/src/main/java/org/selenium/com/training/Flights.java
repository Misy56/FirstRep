package org.selenium.com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.expedia.com/Flights");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("d1-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@aria-label='Oct 6, 2022']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[data-stid='apply-date-picker']")).click();
		 /*
		 * <button type="button" class="uitk-date-picker-day selected edge" data-day="26" aria-label="Oct 26, 2022 selected, current check in date."></button>
		 
		driver.close();*/
		
		//driver.findElement(By.xpath("//button[@type='button'")).click();
		
		driver.close();
	}

}
