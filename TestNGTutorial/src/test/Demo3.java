package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before executing any method in the class");
	}
	
	@Parameters({"URL", "username"})
	@Test
	public void Weblogincarloan(String urlname, String user)
	{
		System.out.println("Weblogincar");
		System.out.println(urlname);
		System.out.println(user);
	}
	
	@BeforeMethod
	public void Beforeevery()
	{
		System.out.println("I will execute before every test method in Demo3 class");
	}
	
	@AfterMethod
	public void Afterevery()
	{
		System.out.println("I will execute after every test method in Demo3 class");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After executing all method in the class");
	}
	
	@Test
	public void Mobilelogincarloan()
	{
		System.out.println("Mobilelogincar");
	}
	
	@Test(groups= {"Smoke"})
	public void Mobilesignincarloan()
	{
		System.out.println("Mobile Signin");
	}
	
	@Test(dataProvider = "getData")
	public void Mobilesignoutcarloan(String username, String password)
	{
		System.out.println("Mobile Signout");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void APIcarloan()
	{
		System.out.println("APIlogincar");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am the 1st");
	}
	@DataProvider
	public Object[][] getData()
	{
		// 1st: username , password (good credit history)
		// 2nd: username , password (no credit history)
		// 3rd: username , password (fraudulent credit history)
		
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0]= "firstuser";
		data[0][1]= "firstpassword";
		
	// columns in the row are nothing but values for that particular combination
		
		// 2nd set
		data[1][0]= "seconduser";
		data[1][1]= "secondpassword";
		
		// 3rd set
		data[2][0] = "thirduser";
		data[2][1] = "thirdpassword";
		
		return data;
		
		
		
	}
	

}
