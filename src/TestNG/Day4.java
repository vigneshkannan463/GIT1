package TestNG;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test(groups="smoke")
	public void Day3Start()
	{
	System.out.println("groups as smoke");	
	}

	
	@Test(enabled=false)
	public void Day3Middle()
	{
		System.out.println("depends on day3END");
	}
	
	@Test(dependsOnMethods={"Day33Middle"})
	public void Day3End()
	{
		System.out.println("dependos mehtod");
	}
	
	@Test
			public void Day33Middle()
	{
		System.out.println("depends on day3END");
	}
}