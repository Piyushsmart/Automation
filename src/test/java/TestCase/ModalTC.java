package TestCase;

import org.testng.annotations.Test;
import Config.configuration;
import ObjectRepo.ModalTC_Objects;

public class ModalTC extends ModalTC_Objects {

	@Test(priority = 1)
	public void smallmodal() {

		configuration.obj_op.openurl(or_url);
		configuration.obj_op.click(or_smallmodal);
		configuration.obj_op.gettext(or_modaltext, "Small");
		configuration.obj_op.close(or_closesmallmodal);
	}

	@Test(priority = 2)

	public void largemodal() {
		configuration.obj_op.click(or_largemodal);
		configuration.obj_op.gettext(or_modaltext, "Large");
		configuration.obj_op.close(or_closelargemodal);
	}
}



//		String a1 = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", a1+ "/Drivers/chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/modal-dialogs");
//		
//		WebElement small = driver.findElement(By.xpath(or_smallmodal));
//		small.click();
//		System.out.println("Small Modal: " +driver.findElement(By.xpath(or_modaltext)).getText());
//		driver.findElement(By.xpath(or_closesmallmodal)).click();
//		
//		driver.findElement(By.xpath(or_largemodal)).click();
//		System.out.println("Large Modal: " +driver.findElement(By.xpath(or_modaltext)).getText());
//		driver.findElement(By.xpath(or_closelargemodal)).click();
//		
