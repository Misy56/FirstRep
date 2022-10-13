package org.selenium.com.training;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;


public class EdgeBrowser {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
	
		Ibrowsers("Chrome");
		String titles=driver.findElement(By.xpath("//*[contains(text(),'Connect with friends')]")).getText();
		System.out.println(titles);
		Screenshots();
		Thread.sleep(5000);
		//Screenshots();

		
	}
	private static void Ibrowsers(String NameOfBrowsers) {
		
		if(NameOfBrowsers.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
		} else if(NameOfBrowsers.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		}
	}
	
	
	public static void Screenshots() throws IOException, InterruptedException {
		
		Date ob= new Date();
		System.out.println(ob);
		String files=ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(files);
		
		File Homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(Homepage, new File("C:\\Users\\conta\\eclipse-workspace\\com.training\\pictures\\home.png"));  // coping z screen shots
		FileHandler.copy(Homepage, new File("C:\\Users\\conta\\eclipse-workspace\\com.training\\pictures\\"+files+"home.png")); 
		Thread.sleep(5000);
		
		driver.close();
	}
}

	
	

	

