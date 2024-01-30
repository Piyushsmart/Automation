package AssesmentProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Assesmentobjects.Assesment1Obj;


public class Assesment1 extends Assesment1Obj {
	@Test
	public void piyush()
	{
		String a1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", a1+ "/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath(or_input)).sendKeys("iphone");
		driver.findElement(By.xpath(or_searchbtn)).click();
		System.out.println("Price : "+driver.findElement(By.xpath(or_price)).getText());
		
		
		
		
		
	}
}
