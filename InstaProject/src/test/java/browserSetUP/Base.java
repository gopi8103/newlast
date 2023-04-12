package browserSetUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	public static WebDriver OpenChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gopik\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
    public static WebDriver OpenEdgeBrowser() {
		
    	System.setProperty("webdriver.edge.driver","C:\\Users\\gopik\\Downloads\\selenium\\edgedriver_win64\\msedgedriver.exe");
    	WebDriver driver=new EdgeDriver();
		return driver;
	}

}
