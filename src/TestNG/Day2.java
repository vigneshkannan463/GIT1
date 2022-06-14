package TestNG;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups="smoke")
	public void Day2Start()
	{
	System.out.println("grouops 2");	
	}

	
	@Test
	public void Day2Middle()
	{
		System.out.println("day 2 middle class, depends on method");
	}
}
