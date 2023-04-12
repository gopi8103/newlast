package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Module.InstaForgotPassword;
import Page.InstaCreateNewAcc;
import Page.InstaLoginPage;

public class Test {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gopik\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);  //until 3.141.59 version	
				
				driver.get("https://www.instagram.com/");

				InstaLoginPage instaLoginPage=new InstaLoginPage(driver);
				
				instaLoginPage.Sendusername();
				instaLoginPage.Sendpassword();
				instaLoginPage.Clickloginbutton();
				instaLoginPage.ClickForgotpassword();
				
				InstaForgotPassword instaForgotPassword=new InstaForgotPassword(driver);
				
				instaForgotPassword.Sendusername("gopinath@123");
				instaForgotPassword.ClickSendloginlink();
				instaForgotPassword.Clickcreatenewacc();
				
				InstaCreateNewAcc instaCreateNewAcc=new InstaCreateNewAcc(driver);
				
				instaCreateNewAcc.SendemailOrPhone();
				instaCreateNewAcc.SendefullName();
				instaCreateNewAcc.Sendusername();
				instaCreateNewAcc.Sendepassword();
				instaCreateNewAcc.ClicksignUP();
				instaCreateNewAcc.ClickLogIn();
		
			}

}
