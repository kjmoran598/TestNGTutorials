package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoanLogins {
	
	@AfterTest
	public void CleanUpCode()
	{
		//Selenium code
		System.out.println("Last code to clean up data");
	}
	@Test(enabled=false)
	public void WebLogin()
	{
		//Selenium code
		System.out.println("Selenium tests");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLogin()
	{
		//Appium tests

		System.out.println("Appium tests");
	}
	
	@Test(timeOut=4000)
	public void APILogin()
	{
		//Rest Assured Tests

		System.out.println("Rest API tests");
	}
	@Test(dataProvider="getData")
	public void APICarLogin(String user, String pw)
	{
		//Rest Assured Tests

		System.out.println("Rest API tests");
		System.out.println(user + " and the pw is: "+ pw);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "Kevin";
		data[0][1] = "mypassword";
		
		data[1][0] = "Jack";
		data[1][1] = "hispw";
		
		data[2][0] = "Alice";
		data[2][1] = "herpw";
		
		return data;
		
				
	}
	

}
