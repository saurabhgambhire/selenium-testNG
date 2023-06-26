package ActiTime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeClass
	public void openBrowser()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBroser()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void login()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginCredentials("admin", "manager");
	}
	
	@AfterMethod
	public void logout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LogOut logOut = new LogOut(driver);
		logOut.logOutCrendantials();
	}
}
