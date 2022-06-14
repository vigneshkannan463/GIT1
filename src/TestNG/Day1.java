package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("am before method which means i run based on test available");
	}
	@Parameters({"URL"})
	@Test
	public void Day1Start(String userName)
	{
	System.out.println("am depend method form different class day 1");	
	System.out.println(userName);
	}

	
	@Test
	public void Day2Middle()
	{
		System.out.println("Day 1 middle class");
	}

@AfterMethod
public void afterMethod()
{
	System.out.println("this is afer method which means i run based on test available");
}
}

