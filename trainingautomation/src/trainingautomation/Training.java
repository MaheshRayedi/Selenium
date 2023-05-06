package trainingautomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Training{
	
	public WebDriver driver;
	public Readtetdata read;
	
	
	
	
	public void add() throws IOException
	{
		
		System.setProperty( "webdriver.msedge.driver", "C:/Users/Rayedi Mahesh/Desktop/Selenium drivers/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		read = new Readtetdata();
		
		String Username = read.getcelldata("Sheet1", 1, 0);
		String Password = read.getcelldata1("Sheet1", 1, 1);
		driver.findElement(By.xpath("((//div[@id='email_container'][1])/input[1])[1]")).sendKeys(Username);
		WebElement wb = driver.findElement(By.xpath("//div[@class='_55r1 _1kbt'][1]/input[1]"));
		wb.sendKeys(Password);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      Training t = new Training();
      t.add();
	}

}
