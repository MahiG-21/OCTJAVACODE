package seleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
	

WebDriver driver = new ChromeDriver();

   driver.get("https://www.h2kinfosys.com/");
   
   //Maxamise the browser window
   
   driver.manage().window().maximize();

  
// To fetch the Title of my webpage
// getTitle() method will fetch title of the webpage on my eclipse console
 //  getTitle() method return the title of the webpage to the script

      String t=driver.getTitle();

 System.out.println(t);
 
 // verification of title is correct or not as per the requirement or not
 
 if(t.equals("IT Online Courses with Certificates | IT Online Training - H2kinfosys"))
 {
	 System.out.println("My title for webpage is correct");
 }
 else
 {
	 System.out.println("My title for webpage is not correct");
 }
 
 // naviagtion method
 
// if we want to navigate from current webpage to a new webpage we can use navigate method
 
 driver.navigate().to("https://www.selenium.dev/downloads/");
 
 String t1= driver.getTitle();  // title of which webpage will be returned
 
 System.out.println(t1);
 
 if(t1.equalsIgnoreCase("Downloads"))
 {
	 System.out.println("My title for selenium webpage is correct");
 }
 else
 {
	 System.out.println("My title for selenium webpage is not correct");
 }
 
 // Currently we are on selenium webpage ,if we want to go back to h2k page
 
 driver.navigate().back(); // naviagte back to previous page
 
 System.out.println("navigated back to h2k webpage");
 
 String url= driver.getCurrentUrl();  // return the url of the current webpage open on the browser window
 
 System.out.println("URl of current page" + url);
 
 if(url.equals("https://www.h2kinfosys.com/"))
 {
	 System.out.println("naviagted back to correct webpage");
 }
 else
 {
	 System.out.println("you are on a wrong page");
 }
 // forward() method will go to next page on the same browser
 driver.navigate().forward();
 // refresh() method will just reload the webpage
 driver.navigate().refresh();
 
 driver.close();
 
 
 
 
 
 
 
 
 
 
 
 
 
 














	}
}
