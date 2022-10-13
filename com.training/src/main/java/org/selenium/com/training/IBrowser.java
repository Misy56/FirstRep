package org.selenium.com.training;

import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowser {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.manage().window().minimize();
		
		driver.navigate().forward();
		driver.getWindowHandle();// Session ID 
		String windows= driver.getWindowHandle();
		System.out.println(windows);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
