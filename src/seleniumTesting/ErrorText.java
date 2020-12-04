package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();	
		 driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
			
			// To check if the text of the error message is correct or not	
				
				// getText() -- will fetch any text from the webpage
				
			// Provide invalid data in the username text box
			  
			   driver.findElement(By.id("wpName2")).sendKeys("abcdf");
			   
			   Thread.sleep(2000);
			    
			 String  actualtext =driver.findElement(By.xpath("//*[@id=\"userlogin2\"]/div/div[2]/div/div")).getText();
			    
			    System.out.println("actual error message = " + actualtext);
			    

	}

}
