package BusinessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Operation {

	WebDriver driver;
	ChromeOptions co;

	public void openurl(String URL) {

		String a1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", a1 + "\\Drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void sendtxt(String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}

	public void submit(String xpath) {
		driver.findElement(By.xpath(xpath)).submit();
	}

	public void gettext(String xpath, String note) {
		WebElement txt1 = driver.findElement(By.xpath(xpath));
		System.out.println(note + " = " + txt1.getText());
	}

	public void close(String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}
}
