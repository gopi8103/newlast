package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaForgotPassword {
	
	//variable declaration
	@FindBy(xpath="//input[@placeholder='Email, Phone, or Username']")
	private WebElement username;
	
	@FindBy(xpath="//div[text()='Send login link']")
	private WebElement Sendloginlink;
	
	@FindBy(xpath="(//a[@role='link'])[2]")
	private WebElement cannotresetpassword;
	
	@FindBy(xpath="//a[text()='Create new account'] ")
	private WebElement createnewacc;
	
	//variable initilization
	public InstaForgotPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//variable use
	public void Sendusername(String name) { 	
	  username.sendKeys(name);
	}
	public void ClickSendloginlink() {
		boolean beforeresult=Sendloginlink.isDisplayed();
		if(beforeresult=true)
		{
			System.out.println(" before clicking button is not dispalay");	
		}	
		else
		{
			System.out.println("before clicking button is dispalay");
		}	
		Sendloginlink.click();
		boolean afterresult=Sendloginlink.isDisplayed();
		if(afterresult=true)
		{
			System.out.println(" after clicking button is dispalay");	
		}	
		else
		{
			System.out.println("after clicking button is not dispalay");
		}	
	}
	public void cannotresetpassword() {
		cannotresetpassword.click();
	}
	public void Clickcreatenewacc() {
		createnewacc.click();
	}
	
	
	

}
