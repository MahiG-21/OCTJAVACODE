package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Issues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();		
		
		
		 driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Help%3ALogging+in");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("Upasana");
        driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("Garg");
        driver.findElement(By.xpath("//input[@id='wpRetype']")).sendKeys("Garg");
        driver.findElement(By.xpath("//input[@id='wpEmail']")).sendKeys("upasana_garg2002@yahoo.com");
        Thread.sleep(6000);
        boolean buttonenabled=driver.findElement(By.xpath("//*[@id='wpCreateaccount']")).isEnabled();
        System.out.println(buttonenabled); 
        
        driver.findElement(By.xpath("//input[@id='wpCreateaccount']")).click();
  
	}

}
