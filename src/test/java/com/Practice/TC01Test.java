package com.Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01Test extends BaseClass{

	@Test
	public void tc01Test()
	{
		driver.get("https://www.amazon.in");
	}
}
