package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Module.InstaForgotPassword;
import Page.InstaCreateNewAcc;
import Page.InstaLoginPage;

public class TestNg {
	
	WebDriver driver;
	InstaLoginPage instaLoginPage;
	InstaForgotPassword instaForgotPassword;
	InstaCreateNewAcc instaCreateNewAcc;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		System.out.println("BeforeTest TestNg");
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\gopik\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\gopik\\Downloads\\selenium\\edgedriver_win64\\msedgedriver.exe");
			 driver=new EdgeDriver();
			 
		}
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\gopik\\Downloads\\selenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
	/*	if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\gopik\\Downloads\\selenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		if(browserName.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver","C:\\Users\\gopik\\Downloads\\selenium\\operadriver_win32\\operadriver_win32\\operadriver.exe");
			 driver=new OperaDriver();
		}*/
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	    instaLoginPage=new InstaLoginPage(driver);
	    instaForgotPassword=new InstaForgotPassword(driver);
	    instaCreateNewAcc=new InstaCreateNewAcc(driver);

	}	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		driver.get("https://www.instagram.com/");
		
	}	
	@Test
	public void test() {
		System.out.println("Test");
		instaLoginPage.ClickForgotpassword();
		instaForgotPassword.Sendusername("gopinath@123");
		instaForgotPassword.ClickSendloginlink();
	}
	@Test
	public void test1() {
		System.out.println("Test1");
	   // instaLoginPage=new InstaLoginPage(driver);
		instaLoginPage.ClickForgotpassword();
		//instaForgotPassword=new InstaForgotPassword(driver);
		instaForgotPassword.Clickcreatenewacc();
	//	InstaCreateNewAcc instaCreateNewAcc=new InstaCreateNewAcc(driver);
		instaCreateNewAcc.Printpresenttext();
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class ");
		  instaLoginPage=null;
		  instaForgotPassword=null;

	}
	@AfterTest
	public void ClosedBrowser() {
		System.out.println("After Test ");
		driver.quit();
		driver=null;
		System.gc();
		
	}
	
	
}
