package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTests {
	
	@Parameters({"URL"})
	@Test(groups={"Smoke"})
	public void PersonalLoan(String webAddress)
	{
		System.out.println("personal loans");
		System.out.println(webAddress);
		Assert.assertEquals(true,true);
	}
	
	@BeforeTest
	public void DeleteOldLoanData()
	{
		System.out.println("Delete old data before tests");
	}

}
