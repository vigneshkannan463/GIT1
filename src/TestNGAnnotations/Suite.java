package TestNGAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite {
	
	@BeforeSuite
	public void beforeTest()
	{
		System.out.println("Suite i run first");
	}

	
	@Test
	public void Test1()
	{
		System.out.println("test 1");
	}
	
	
	@AfterSuite()
	public void afterTest()
	{
		System.out.println("Suite i run last at then end ");
	}

}
