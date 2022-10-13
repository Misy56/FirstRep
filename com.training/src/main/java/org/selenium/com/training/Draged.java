package org.selenium.com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draged {

	public static void main(String[] args) throws InterruptedException {
		// Drag and drop 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		driver.switchTo().frame(0);
		WebElement dragedit= driver.findElement(By.id("draggable"));
		WebElement dropedit= driver.findElement(By.id("droppable"));
		Actions act= new Actions (driver);
		act.dragAndDrop(dragedit, dropedit).build().perform();
		
		driver.switchTo().parentFrame();
		WebElement Resizable = driver.findElement(By.linkText("Resizable"));
		Resizable.click();

	}

}
