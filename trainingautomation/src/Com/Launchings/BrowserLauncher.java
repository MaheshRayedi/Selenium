package Com.Launchings;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher { 
	 public WebDriver driver;
	 
	 public void selectbrowser()
	 {	
		 //ChromeOptions co = new ChromeOptions();
		 
// WebDriverManager.chromedriver().browserVersion("111.0.5563.65").capabilities(co).create();
		   //driver= new ChromeDriver();
		// WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		// driver.get("https://www.amazon.com");
		 
		 WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			 driver.get("https://www.amazon.com");
		//System.setProperty("Webdriver.gecko.driver","C:/drivers selenium/geckodriver.exe");
			
			//FirefoxDriver driver = new FirefoxDriver();  
	 }
	
	public static void main(String[] args) 
	{
		
	   BrowserLauncher l = new BrowserLauncher();
	   l.selectbrowser();
	   
		
		
     
	
	}

}
