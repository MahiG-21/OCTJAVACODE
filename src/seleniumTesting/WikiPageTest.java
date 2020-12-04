package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPageTest {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		//Test Step 1: locate the textbox and enter data in the text box

		
driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium Testing");

Thread.sleep(2000);

//Test Step 2: Locate the button and click on it
		
driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/button")).click();
		
		
	Thread.sleep(2000);	
	
	driver.close();
		
		
		
		
		
			
	
		
		
		
		
		
		
		
	}

}
