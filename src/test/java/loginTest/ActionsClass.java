package loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActionsClass {
	WebDriver driver;
	@Test
	public void actions( ) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssk\\eclipse-workspace_v2\\SeleniumPractice\\chromedriver.exe");

		 driver = new ChromeDriver(); // launch chrome
		
		driver.get("https://www.amazon.in/dp/B084DWH53T/ref=gw_PC_echo_new_nov?pf_rd_r=6YH2TAZ0T0DKN5GBT3BJ&pf_rd_p=1814c240-b03e-4c47-ba0a-99fa581ac373");

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.xpath("//span[@class='nav-line-2']/span[contains(@class,'icp-nav-flag')]"));
		
		Actions action = new Actions(driver);
		
	
		
		//action.moveToElement(dropdown).click(driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//a[@href='#switch-lang=te_IN']"))).click().build().perform();
	action.moveToElement(dropdown).build().perform();
		Thread.sleep(10000);
		
		driver.quit();
	}

}
