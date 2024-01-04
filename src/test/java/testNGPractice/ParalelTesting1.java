package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParalelTesting1 {


	//By XML
	
	// Method Level
	//Class level
	//Suite Level
	
	WebDriver driver;

	/*
	 * @BeforeClass public void setup() {
	 * 
	 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
	 * driver.manage().window().maximize(); driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * }
	 */
	 

	@Test(priority = 1)
	public void logoTest() {
		
		  WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		  driver.manage().window().maximize(); driver.get(
		  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement logo = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertFalse(logo.isDisplayed(), "logo displayed");
		// Assert.assertTrue(logo.isDisplayed(), "logo not displayed");
	}

	@Test(priority = 2)
	public void Title() {
		
		  WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		  driver.manage().window().maximize(); driver.get(
		  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String actualtitle = driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		Assert.assertEquals(ExpectedTitle, actualtitle, "Title is not match");

	}

	@AfterMethod
	void teardown() {

		driver.quit();

	}

}
