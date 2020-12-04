package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Identify element (text box & button) on the webpage and perform action on them

		// Action ( text box -- enter data , button --click)
		
		//Selenium tool needs the address of the element
		
		//Selenium-->
		// go to wikipage ==> get("wiki page")
		// find the element on webpage at the location (details) and then enter data on it
	    // sendKeys() -- this method will enter data on the text box
	    // findElement(location of text box).sendKeys("data to be enetered")
		// findElement(location of button).click()
		
// to find location or address of an element we will use developer tool	
		
// developer tool --open a HTML document --html code for all the element that are present on the webpage
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.id("searchInput")).sendKeys("selenium Testing");
		
		// 2nd locator
		
		driver.findElement(By.name("search")).sendKeys("selenium Testing");
		//3rd locator
		
	//	driver.findElement(By.className(" ")) --- Not applicable for this element
		
		//4th locator
		
		driver.findElement(By.tagName("input")).sendKeys("Selenium Testing");
		
// cannot use in script because tagnames are not unique
		
		//5th locator--> XPATH -- Relative Xpth
		
		driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Selenium Testing");
		
		
		//5th locator--> XPATH -- Absolute Xpth
		
driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/div/input")).sendKeys("Selenium Testing");
				
				
	//6th CSS

 driver.findElement(By.cssSelector("#searchInput")).sendKeys("Selenium Testing");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
