package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {

	
	
	
	WebDriver driver;
	
	@BeforeTest
	//@Parameters({ "browser", "url" })
	@Parameters({"browser","url"})
	public void setup(String browser,String app) {
		
		if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}else if(browser.equalsIgnoreCase("chrome")) {
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Manha\\OneDrive\\Desktop\\DRiverBrowser\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
	}
	
	
		driver.get(app);
		
		
		
		
		
		
		
}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * WebDriver driver;
	 * 
	 * @BeforeClass
	 * 
	 * @Parameters({ "browser", "url" })
	 *  public void setup(String browser, String app) {
	 * 
	 * if (browser.equalsIgnoreCase("edge")) {
	 * 
	 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * } else if (browser.equalsIgnoreCase("firefox")) {
	 * 
	 * WebDriverManager.firefoxdriver().setup(); 
	 * driver = new FirefoxDriver();
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * } else if (browser.equalsIgnoreCase("chrome")) {
	 * 
	 * System.setProperty(
	 * "webDriver.Chrome.driver","C:\\Users\\Manha\\OneDrive\\Desktop\\DRiverBrowser\\chromedriver-win64 "
	 * );
	 * 
	 * driver = new ChromeDriver();
	 * 
	 * 
	 * ChromeOptions co = new ChromeOptions();
	 * 
	 * co.addArguments("--remote-allow-origins=*"); driver = new ChromeDriver();
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * }
	 * 
	 * driver.get(app);
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void logoTest() {

		WebElement logo = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertFalse(logo.isDisplayed());
		// Assert.assertTrue(logo.isDisplayed(), "logo not displayed");
		
		
	}

	@Test(priority = 2)
	public void Title() {

		String actualtitle = driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		Assert.assertEquals(ExpectedTitle,actualtitle);

	}

	@AfterClass
	void teardown() {

		driver.quit();

	}
	
}
