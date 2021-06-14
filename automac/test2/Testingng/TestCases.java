package Testingng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("/Users/tonystark36/Documents/AutomationMac/Drivers/chromedriver90.exe","webdriver.chrome.driver");
		WebDriver driver = ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void Browser() {
		System.out.println("Browser Open Successful");
		driver.get("https://neufund.org");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void Navigation() {
		System.out.println("Navigation Successful");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void Register() {
		System.out.println("Registeration Successful");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 2,dependsonMethod = "Register")
	public void Signup() {
		System.out.println("Navigation Successful");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 3,dependsonMethod = "Register")
	public void Login() {
		System.out.println("Navigation Successful");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 4,dependsonMethod = "Register")
	public void Logout() {
		System.out.println("Navigation Successful");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 5,dependsonMethod = "Register")
	public void CloseBrowser() {
		System.out.println("Navigation Successful");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
