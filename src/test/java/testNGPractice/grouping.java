package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class grouping {

	/*
	 * @Test public void testFacebook() throws Exception {
	 * WebDriverManager.edgedriver().setup(); WebDriver driver = new EdgeDriver();
	 * driver.manage().window().maximize(); driver.get("https://www.facebook.com");
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * driver.findElement(By.name("email")).sendKeys("OrangeHRMTest", Keys.ENTER);
	 * 
	 * SoftAssert softAssert = new SoftAssert();
	 * 
	 * //title assertion String actualTitle = driver.getTitle(); String
	 * expectedTitle = "Facebook - log in or sign up";
	 * softAssert.assertEquals(actualTitle, expectedTitle, "Title mismathch !");
	 * 
	 * //url assertion String actualurl = driver.getCurrentUrl(); String expectedUrl
	 * = "https://www.facebook.com"; softAssert.assertNotEquals(actualurl,
	 * expectedUrl, "Url mismatch"); //fail
	 * 
	 * //input text assertion String actualText =
	 * driver.findElement(By.name("email")).getAttribute("value"); String
	 * expectedText = "_"; softAssert.assertEquals(actualText, expectedText,
	 * "Text mismatch");
	 * 
	 * 
	 * //border assertion String actualBorder =
	 * driver.findElement(By.name("email")).getCssValue("border"); String
	 * expectedBorder = "1px solid rgb(240, 40, 73)";
	 * softAssert.assertEquals(actualBorder, expectedBorder, "Border mismatch");
	 * 
	 * 
	 * //error message assertion String actualErrorMessage = driver.findElement(By.
	 * xpath("//div[contains(text(),'The email or mobile number ')]")).getText();
	 * String expectedErrorMessage =
	 * "The email or mobile number you entered isn’t connected to an account. Find your account and log in."
	 * ; softAssert.assertEquals(actualErrorMessage, expectedErrorMessage,
	 * "Error message mismatch");
	 * 
	 * 
	 * System.out.println(driver.getTitle()); Thread.sleep(2000); driver.close();
	 * 
	 * 
	 * System.out.println("Browser closed and assertion learning is over.");
	 * softAssert.assertAll(); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	WebDriver driver;

	@BeforeClass
	public void setup() {

		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("This is sixth");
	}

	@Test (groups= {"sanity"})
	public void logoTest() {

		WebElement logo = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img"));
		//Assert.assertFalse(logo.isDisplayed(), "logo not displayed");
		Assert.assertTrue(logo.isDisplayed(), "logo not displayed");
		
		System.out.println("This is seven");
	}

	@Test(groups= {"sanity"})
	public void Title() {

		String actualtitle = driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		Assert.assertEquals(ExpectedTitle, actualtitle, "Title is not match");
		
		//System.out.println("This is eight");

	}

	

	@Test(groups={"sanity"})
	  public void testOne() {
		  
		  System.out.println("This is testOne");
	
	  }
	  
	@Test(groups={"sanity"})
	  public void testTwo() {
		  
		  System.out.println("This is testTwo");
		  
		  
	  }
	  
	
	@Test(groups={"regression"})
	  public void testThree() {
		  
		  System.out.println("This is testThree");
	  }
	  
	@Test(groups={"regression"})
	  public void testFour() {
		  
		  System.out.println("This is testFour");
		  
		  
	  }
	  
	@Test(groups={"sanity","regression"})
	  public void testFifth() {
		  
		  System.out.println("This is testFifth");
		  
		  
	  }
	
	@AfterClass
	void teardown() {

		driver.quit();

	}

}
