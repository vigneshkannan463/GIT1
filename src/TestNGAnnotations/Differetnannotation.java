package TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Differetnannotation {
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}

	
	@Test
	public void Test1()
	{
		System.out.println("test 1");
	}
	
	
	@AfterTest()
	public void afterTest()
	{
		System.out.println("After Test");
	}
}
