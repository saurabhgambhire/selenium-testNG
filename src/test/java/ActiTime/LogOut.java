package ActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut 
{
	public LogOut(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "logoutLink")
	private WebElement logout;

	public WebElement getLogOut() {
		return logout;
	}
	
	public void logOutCrendantials() 
	{
		logout.click();
	}
}
