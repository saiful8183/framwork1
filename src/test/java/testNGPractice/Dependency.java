package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

	
	
	

	@Test
	  public void testOne() {
		  
		  System.out.println("This is testOne");
		  Assert.fail();
	  }
	  
	  @Test(dependsOnMethods= {"testOne"})
	  public void testTwo() {
		  
		  System.out.println("This is testTwo");
		  
		  
	  }
	  
	
	  @Test(dependsOnMethods= {"testTwo"})
	  public void testThree() {
		  
		  System.out.println("This is testThree");
	  }
	  
	 // @Test(dependsOnMethods= {"testThree","testTwo"},alwaysRun=true)
	  @Test(dependsOnMethods= {"testThree","testTwo"},alwaysRun=true)
	  public void testFour() {
		  
		  System.out.println("This is testFour");
		  
		  
	  }
	
}
