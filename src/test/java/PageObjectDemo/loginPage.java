package PageObjectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	//Constructor 
	loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_Username;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement but_Login;	
	
	//Action Methods
	
	public void setUsername(String username) 
	{
		txt_Username.sendKeys(username);
	}
	
	public void setPasswords(String pass) 
	{
		txt_Password.sendKeys(pass);
	}
	
	public void clickLigin() 
	{
		but_Login.click();
	}
}
