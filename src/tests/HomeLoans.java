
package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoans {
	
	
	@BeforeMethod			//Used to clean up cache and cookies before each test case method
	public void PreSetup()
	{
		//Selenium code
		System.out.println("Setup before all methods of HomeLoans class");
	}
	@BeforeClass
	public void WebLoginHome()
	{
		//Selenium code
		System.out.println("Before Class method of HomeLoans class");
	}
	
	@Test(dependsOnMethods= {"MobileSearchHome"})
	public void MobileLoginHome()
	{
		//Appium tests

		System.out.println("Appium HOME1 tests");
	}
	@Test(groups={"Smoke"})
	public void MobileSearchHome()
	{
		//Appium tests

		System.out.println("Appium HOME2 tests");
	}
	@AfterClass
	public void MobilePayHome()
	{
		//Appium tests

		System.out.println("After methods of HomeLoans class, run this at end of class");
	}
	
	@BeforeTest
	public void APILoginHome()
	{
		//Rest Assured Tests

		System.out.println("Before Test at end of last class");
	}

}

