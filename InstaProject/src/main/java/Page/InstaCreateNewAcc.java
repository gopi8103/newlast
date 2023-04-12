package Page;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaCreateNewAcc {
	

	//variable declaration
	@FindBy(xpath=" //input[@name='emailOrPhone']")
	private WebElement emailOrPhone;
	
	@FindBy(xpath=" //input[@name='fullName']")
	private WebElement fullName;

	@FindBy(xpath="  //input[@name='username']")
	private WebElement username;

	@FindBy(xpath=" //input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement signUP;
	
	@FindBy(xpath="//button[text()='Log in with Facebook']")
	private WebElement LogIn;
	
	@FindBy(xpath="//form[@method='post']//div")
	private WebElement presenttext;
	
	WebDriver driver;
	
	//variable initilization
	public InstaCreateNewAcc(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//variable use
	public void SendemailOrPhone() {
		emailOrPhone.sendKeys("gopinath@123");
	}
	public void SendefullName() {
		fullName.sendKeys("gopi kahandal");
	}
	public void Sendusername() {
		username.sendKeys("gopinath");
	}
	public void Sendepassword() {
		password.sendKeys("1234656");
	}
	public void ClicksignUP() {
		signUP.click();
	}
	public void ClickLogIn() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView(true);",LogIn);
		LogIn.click();
		
	}
	public String Printpresenttext () {
		String text=presenttext.getText();
		Dimension size=presenttext.getSize();
		System.out.println(text);
		System.out.println(size);
		return text;
	}
	


}
