package Automation_Project.Automation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		{
			String p1 = System.getProperty("user.dir");
			System.out.println("P1 = "+p1);
			System.setProperty("webdriver.chrome.driver", p1+"/Drivers/chromedriver.exe");
			// Instantiate a ChromeDriver class.
			WebDriver driver = new ChromeDriver();

			// Maximize the browser
			driver.manage().window().maximize();

			// Launch Website
			driver.get("https://demoqa.com/automation-practice-form");
			
			
		}
		
		
	}

}
