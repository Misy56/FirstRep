package common;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;



public class Utilities {
	
public WebDriver driver;
@Parameters({"browser","website"})
@BeforeClass
  
private  void Ibrowsers(String NameOfBrowsers, String wb) {
	String jk=System.getProperty("user.dir");
	System.out.println(jk);
	if(NameOfBrowsers.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", jk+"\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(wb);
		driver.manage().window().maximize();
		
	} else if(NameOfBrowsers.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(wb);
		driver.manage().window().maximize();
	}
}

@AfterClass
  
  public void afterClass() throws IOException{
		  
		  Screenshots();
  }
	  public void Screenshots() throws IOException {
			
			Date ob= new Date();
			System.out.println(ob);
			String files=ob.toString().replace(" ", "_").replace(":", "_");
			System.out.println(files);
			String jk=System.getProperty("user.dir");
			File Homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(Homepage, new File(jk+"\\pictures\\"+files+"home.jpg")); 
			
			
		
		} 
		
}

