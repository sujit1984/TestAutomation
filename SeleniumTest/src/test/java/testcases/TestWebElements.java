package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		System.out.println(driver.getTitle());
		
		//driver.close();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//implementing FluentWait for this code
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);

		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"))).click();
		
		//click on the cart
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shopping_cart_container\"]/a"))).click();
		
		//Click on the remove button
		
		driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
		
		//Click on Continue Shopping
		
	
		driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
		
		System.out.println("Completed Testing....");
	}	

}
