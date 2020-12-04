package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");

//enter exustung username on the username field

driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("abcd");

Thread.sleep(3000);
			

// error message will be displayed.
//Once error message is displayed, we have to capture it
//getText() method which is sued to fetch the text from the

////*[@id="userlogin2"]/div/div[2]/div/div

//   xpth("//*[@id='userlogin2']/div/div[2]/div/div")

String errorText= driver.findElement(By.xpath("//*[@id=\"userlogin2\"]/div/div[2]/div/div")).getText();


System.out.println(errorText);

if(errorText.contains("Username entered already in use. Please choose a different name."))
{
	System.out.println("Error message on the webpage is correct");
}
else
{
	System.out.println("error message is incorrect");
}


driver.close();













	}

}
