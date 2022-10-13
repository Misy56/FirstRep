package org.selenium.com.training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();// switch the control to the alert msg 
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		
		Alert simplealert= driver.switchTo().alert();
		System.out.println(simplealert.getText());
		Thread.sleep(6000);
		String text= "write";
		//driver.switchTo().alert().sendKeys(text);
		
		simplealert.sendKeys(text);
		simplealert.dismiss();
		
		
		driver.close();
	}

}
