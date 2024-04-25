package tests;

import org.testng.annotations.Test;

public class FirstTests {

	@Test(groups={"Smoke"})
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
}
