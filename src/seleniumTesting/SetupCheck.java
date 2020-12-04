package seleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// give the path of your chromedriver exe file, so as to open chrome browser
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		
// 2 . creating a reference object for interface WebDriver and access the child class 
		// ChromeDriver  -- chromebrowser
	
		// we have to import this class and interface from selenium packages
		
		WebDriver driver = new ChromeDriver();
		
// get() method : to open our application URL on the browser
		
		driver.get("https://www.h2kinfosys.com/");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
