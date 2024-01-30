package TestCase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepo.AlertObjects;

@Test

public class AlertTC extends AlertObjects {

	 {

		String p1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", p1 + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath(or_AlertButton)).click();
		//Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(or_AlertButtonTimer)).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().alert().accept();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='confirmButton']")));
	
		
		driver.findElement(By.xpath(or_AlertButtonConfirm)).click();
		driver.switchTo().alert().dismiss();
				
		driver.findElement(By.xpath(or_AlertEnterText)) .click();
		driver.switchTo().alert().sendKeys("Automation Testing");
		driver.switchTo().alert().accept();

	}

	 
}
