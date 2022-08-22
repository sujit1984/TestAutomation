package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
		
		//driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]/../option[@value=\"za\"]")).click();
		
		//creating an object of the Select class 
		
		Select select = new Select(sortDropdown);
		select.selectByValue("za");  //NAME (Z TO A)
		//select.selectByIndex(2);   //Price (low to High)
		//select.selectByVisibleText("Price (high to low)"); 

	}

}
