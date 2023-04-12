package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLoginPage {
	
	//variable declaration
	@FindBy(xpath="//i[@aria-label='Instagram']")
	private WebElement Text;
	
	@FindBy(xpath="//input[@name='username']")
    private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
    private WebElement password;
	
	@FindBy(xpath="//button[contains(@class,'_acan _acap _acas _aj1-')] ")
    private WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement Forgotpassword;

	@FindBy(xpath="//span[contains(@class,'_aacl _aaco _aacw _aad0 _aad7')] ")
    private WebElement signUp;
	
	//variable initilization
	public InstaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//variable use
	public void GetText() {
		//String text=Text.getText();
	}
	public void Sendusername() {
		username.sendKeys("gopinath@23");
	}
	public void Sendpassword() {
		password.sendKeys("123467");
	}
	public void Clickloginbutton() {
		loginbutton.click();
	}
	public void ClickForgotpassword() {
		Forgotpassword.click();
	}
	public void ClicksignUp() {
		signUp.click();
	}
	public void LogInToApplication() {
		username.sendKeys("gopinath@23");
		password.sendKeys("123467");
		loginbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
