package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckboxes {
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		try {
		driver.findElement(by);
		return true;
		} catch(Throwable t) {
			return false;
		}
	}
	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		boolean chekbxPresent = isElementPresent(By.xpath("//div[contains(@class,'display')][1]/input[1]"));
		
		System.out.println("Is the checkBox present " +chekbxPresent);
//		driver.findElement(By.xpath("//div[contains(@class,'display')][1]/input[1]")).click();
//		driver.findElement(By.xpath("//div[contains(@class,'display')][1]/input[2]")).click();
	
//		for (int i =1; i <=4; i++) {
//			driver.findElement(By.xpath("//div[contains(@class,'display')][1]/input["+i+"]")).click();
//			
//		}
		
		int i = 1;
		
		int count = 0;
		while(isElementPresent(By.xpath("//div[contains(@class,'display')][1]/input["+i+"]"))){
			
			driver.findElement(By.xpath("//div[contains(@class,'display')][1]/input["+i+"]")).click();
			i++;
			count++;
		}
		
		System.out.println("All the checkboxes checked. Total checkboxes are " +count);
	}

}
