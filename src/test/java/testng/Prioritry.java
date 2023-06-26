package testng;

import java.security.PublicKey;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Prioritry 
{
	
	
	@Test(priority = 0,dependsOnMethods = "a")
	public void b()
	{
		System.out.println("b");
	}
	
	@Test(priority = 1, invocationCount = 5)
	public void a()
	{
		Assert.assertEquals("saurabh", "saurabh");
	}
	
	@Test(dataProvider = "data")
	public void c(String key, String value) 
	{
		System.out.println("Key => "+key+" value =>"+value);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] ar = new Object[2][2];
		
		ar[0][0] = "url";
		ar[0][1] = "https://demo.actitime.com/login.do";
		
		ar[1][0] = "user";
		ar[1][1] = "password";
		
		
		return ar;
		
	}
	
	
}
