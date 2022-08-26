package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementsPresence {
	
	/*
	 * Examples of isElementPresent , isDisplayed, isEnabled and isSelected 
	 * 
	 */
	
	public static WebDriver driver;
	public static boolean isElementPresent(String locator) {
		try {
		driver.findElement(By.xpath(locator));
		return true;
		} catch(Throwable t) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		
		/*
		 * 1. isElementPresent -- There is no method in WebDriver to check if the element is present on the page or not. 
		 * 
		 */
		
		 boolean menuPresent = isElementPresent("//*[@id=\"react-burger-menu-btn\"]");
		 
		 if(menuPresent) {
			 System.out.println("The element is present on the page");
		  }
	}

}
