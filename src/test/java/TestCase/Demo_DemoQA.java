package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_DemoQA {
	
	{
		String p1 = System.getProperty("user.dir");
		System.out.println("directory = " + p1);
		System.setProperty("webdriver.chrome.driver", p1 + "/Drivers/chromedriver.exe");

		// Instance a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		
		// Launch Website
		System.out.println("Open URL");
		driver.get("https://demoqa.com/automation-practice-form");

		System.out.println("First Name");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Piyush");

		System.out.println("Last Name");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jambhulkar");

		System.out.println("E mail");
		WebElement E = driver.findElement(By.xpath("//input[@id='userEmail']"));
		E.sendKeys("piyush@mailme.com");

		System.out.println("Gender");
		WebElement G = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		G.click();

		System.out.println("Mobile");
		WebElement M = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		M.sendKeys("9876543210");

		System.out.println("Date of Birth");
		WebElement Z = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		Z.click();
//		WebElement X = driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, November 1st, 2023']"));
		WebElement X = driver.findElement(By.xpath("//div[@aria-label=\"Choose Wednesday, November 8th, 2023\"]"));
//		WebElement X = driver.findElement(By.xpath("//div[@aria-label=\"Choose Tuesday, October 31st, 2023\"]"));
//		WebElement X = driver.findElement(By.xpath("//div[@aria-label=\'Choose Sunday, January 1st, 2023\']"));
//		WebElement X = driver.findElement(By.xpath("//div[@aria-label=\"Choose Tuesday, January 31st, 2023\"]"));
		X.click();

		System.out.println("Subjects");
		driver.findElement(By.xpath("(//div[@class=\"css-1g6gooi\"])[1]/div/input")).sendKeys("maths");
		WebElement S = driver.findElement(By.xpath("//div[@id='react-select-2-option-0']"));
		S.click();
		driver.findElement(By.xpath("(//div[@class=\"css-1g6gooi\"])[1]/div/input")).sendKeys("phy");
		WebElement U = driver.findElement(By.xpath("//div[@id='react-select-2-option-0']"));
		U.click();

		System.out.println("Address");
		WebElement A = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		A.sendKeys("Civil Lines, Nagpur");

		System.out.println("Hobbies");
		WebElement H = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		H.click();
		WebElement O = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
		O.click();
		WebElement B = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		B.click();

//		

		System.out.println("States");
		WebElement k = driver.findElement(By.xpath("//div[@class=\" css-1wa3eu0-placeholder\"]"));
		k.click();
		WebElement K = driver.findElement(By.xpath("//*[@id=\"react-select-3-option-0\"]"));
		K.click();

		System.out.println("City");
		WebElement C = driver.findElement(By.xpath("//div[@class=\" css-1wa3eu0-placeholder\"]"));
		C.click();
		WebElement c = driver.findElement(By.xpath("//div[@id=\"react-select-4-option-0\"]"));
		c.click();

		System.out.println("Upload Picture");
		WebElement Q = driver.findElement(By.xpath("//input[@id=\"uploadPicture\"]")); // Q.click();
		Q.sendKeys("C:/Users/PiyushJambhulkar/Desktop/Appointment Booking.txt");

		System.out.println("Submit Button");
		WebElement I = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
		I.submit();

	}


}


