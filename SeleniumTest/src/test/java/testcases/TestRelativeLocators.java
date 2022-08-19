package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("user-name"))).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		

	}

}
