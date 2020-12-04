package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		
		driver.manage().window().maximize();
		
	// check if the textbox is displayed on the webpage or not
		
boolean display=driver.findElement(By.xpath("//input[@id='wpName2']")).isDisplayed();
		
	System.out.println(display);  //true
	
	
boolean enable=	driver.findElement(By.xpath("//input[@id='wpName2']")).isEnabled();		
		
		System.out.println(enable);  // true
		
		
		driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("sonal");		
	
		//Test Step2 : password text box
		
boolean display2=	driver.findElement(By.xpath("//input[@id='wpPassword2']")).isDisplayed();
System.out.println(display2);
	
boolean enable2=	driver.findElement(By.xpath("//input[@id='wpPassword2']")).isEnabled();
System.out.println(enable2);	
		
		
driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("Mittal");		

//Test Step 3: enter data in confirm password

driver.findElement(By.xpath("//input[@id='wpRetype']")).sendKeys("Mittal");


driver.findElement(By.xpath("//input[@id='wpEmail']")).sendKeys("abc@gmail.com");

	

//enter captcha
Thread.sleep(7000);

boolean buttonenabled= 	driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).isEnabled();

System.out.println("button is enabled" + buttonenabled);

boolean buttondisplayed= 	driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).isDisplayed();

System.out.println("button is displayed" + buttondisplayed);

driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).click();
		
		



	}

}
