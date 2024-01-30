package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepo.FrameObjects;


@Test(priority='0')

public class FrameTC  extends FrameObjects {
	{

	String j1 = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", j1 + "/Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/frames");
	
	// switch to frame by id
	driver.switchTo().frame("frame1");
	
	WebElement frame1 =driver.findElement(By.xpath(or_frame1));
	System.out.println("Text in frame1: " +frame1.getText());
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("frame2");
	WebElement frame2 =driver.findElement(By.xpath(or_frame2));
	System.out.println("Text in Frame2: " +frame2.getText());


	}
	
	
	@Test(priority='1')

	public class NestedFrameTC {
		{
			String j1 = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", j1 + "/Drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/frames");
			
			
		}
		
		
	}
	
	
}
