package ActiTime;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass
{
	@Test(priority = 3, invocationCount = 2)
	public void a()
	{
		System.out.println("TestCase 1 : methed 1");
	}
	
	@Test(priority = 2)
	public void b() {
		System.out.println("TestCase 1 : method 2");
	}
	
	@Test(dataProvider = "data", priority = 0)
	public void c(String data, String value)
	{
		System.out.println("Data : "+data +" Value : "+value);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] arr = new Object[2][2];
		
		arr[0][0] = "name";
		arr[0][1] = "saurabh";
		
		arr[1][0] = "location";
		arr[1][1] = "pune";
		
		return arr;
		
	}
}
