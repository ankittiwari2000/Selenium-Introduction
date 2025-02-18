package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am the last");
	}
	 
	@AfterTest
	public void Postexecute()
	{
		System.out.println("I'll execute at last");
	}
	
	@Test(groups= {"Smoke"})
	public void Demo1()
	{
		System.out.println("Hello Ankit!");
		Assert.assertTrue(false);
	}
	
	@Parameters({"URL", "username"})
	@Test
	public void SecondTest(String urlname, String user)
	{
		System.out.println("How are you");
		System.out.println(urlname);
		System.out.println(user);
	}
	
	@Test
	public void ThirdTest()
	{
		System.out.println("This is 3rd test");
	}
	
	@BeforeTest
	public void Prerequisites()
	{
		System.out.println("I'll execute first");
	}
	
	
	

}
