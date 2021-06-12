package automac;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ScriptMac {
	static WebDriver driver;
	public static void main(String[] args) {
	System.out.println("Enter BROWSER Name :");
	String browserName;
	Scanner brow1 = new Scanner(System.in);

	browserName = brow1.nextLine();
	switch(browserName) {
	case "FIREFOX" :
		System.setProperty("webdriver.gecko.driver","/Users/tonystark36/Documents/AutomationMac/Drivers/geckodriver");
		driver = new FirefoxDriver();
		System.out.println("Launching FIREFOX for Automation");
		driver.navigate().to("http://www.google.com/");
		break;

	case "CHROME" :
		System.setProperty("webdriver.chrome.driver","/Users/tonystark36/Documents/AutomationMac/Drivers/chromedriver90");
		driver = new ChromeDriver();
		System.out.println("Launching CHROME for Automation");
		driver.get("http://www.google.com/");
		break;

	case "SAFARI" :
		driver = new SafariDriver();
		System.out.println("Launching SAFARI for Automation");
		driver.get("http://www.google.com/");
		driver.quit();
		break;
	
	default :
		System.out.println("Enter Correct Browser Name as Follows \n 1. FIREFOX \n 2. CHROME \n 3. SAFARI ");
		driver.quit();
		break;
	}
	
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	// Click on the search text box and send value 
	driver.findElement(By.name("q")).sendKeys("Automation Anywhere"); 
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	// Click on the search button 
	driver.findElement(By.name("btnK")).click(); 
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	// Close the Browser 
	driver.close(); 
	System.out.println("Automation on Mac executed Successfully");

}
}
