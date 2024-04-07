package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result)
	{
		// TODO Auto-generated methods stub
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated methods stub
		//System.out.println("I Succesfully executed listeners pass code");	
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		// TODO Auto-generated methods stub
		System.out.println("I Failed executed listeners fail code" + result.getName());
	}
	

}
