package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepo.DemoAT_Objects;

@Test

public class DemoAutomationTesting extends DemoAT_Objects {
	{

		String P1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", P1 + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath(or_firstname)).sendKeys("PIYUSH");
		driver.findElement(By.xpath(or_lastname)).sendKeys("JAMBHULKAR");
		driver.findElement(By.xpath(or_address)).sendKeys("Civil Lines, Nagpur");
		driver.findElement(By.xpath(or_email)).sendKeys("piyush@mailme.com");
		driver.findElement(By.xpath(or_telephone)).sendKeys("9874563210");
		driver.findElement(By.xpath(or_gender)).click();
		driver.findElement(By.xpath(or_hobbies1)).click();
		driver.findElement(By.xpath(or_hobbies2)).click();

//		driver.findElement(By.id("msdd"));
		driver.findElement(By.xpath(or_langClick)).click();
		driver.findElement(By.xpath(or_langSelect)).click();
		WebElement lang = driver.findElement(By.xpath("/html/body"));
		lang.click();

		WebElement skills = driver.findElement(By.xpath(or_skill));
		skills.click();
		Select drop = new Select(skills);
		drop.selectByIndex(27);

		driver.findElement(By.xpath(or_countryClick)).click();
		driver.findElement(By.xpath(or_countrySelect)).click();
//		driver.findElement(By.xpath("/html/body")) .click();

		driver.findElement(By.xpath(or_yearClick)).click();
		driver.findElement(By.xpath(or_yearSelect)).click();

		driver.findElement(By.xpath(or_monthClick)).click();
		driver.findElement(By.xpath(or_monthSelect)).click();

		driver.findElement(By.xpath(or_dayClick)).click();
		driver.findElement(By.xpath(or_daySelect)).click();
//		driver.findElement(By.xpath("/html/body")) .click();

		driver.findElement(By.xpath(or_firstpassword)).sendKeys("privacyfield");
		driver.findElement(By.xpath(or_secondpassword)).sendKeys("privacyfield");

	}
}