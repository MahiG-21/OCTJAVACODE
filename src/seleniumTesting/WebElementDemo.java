package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//WebElement : is an object in selenium that is used to store element location

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		
		driver.manage().window().maximize();
		
	//Username Text box
	WebElement e=driver.findElement(By.xpath("//input[@id='wpName2']"));
	
	WebElement e1= driver.findElement(By.xpath("//input[@id='wpPassword2']"));
	
	WebElement e3= driver.findElement(By.xpath("//input[@id='wpRetype']"));
	
	WebElement e4 = driver.findElement(By.xpath("//input[@id='wpEmail']"));
	
	WebElement e5 = driver.findElement(By.xpath("//button[@id='wpCreateaccount']"));
	
	
	e.isDisplayed();
	e.isEnabled();
	e.sendKeys("seleniumsonal");
	
	e1.isDisplayed();
	e1.isEnabled();
	e1.sendKeys("passwrdsonal@123");
	
	e3.isDisplayed();
	e3.isEnabled();
	e3.sendKeys("passwrdsonal@123");
	
	e4.isDisplayed();
	e4.isEnabled();
	e4.sendKeys("ancdef@gmail.com");
	
	
	e5.isDisplayed();
	e5.isEnabled();
	e5.click();
	
	
	
	
	
	
		
		
	}

}
