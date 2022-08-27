package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAssignment3 {
	
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
		// TODO Auto-generated method stub
		
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//*[@id="pollform"]/table/tbody/tr[2]/td/input[1]
		driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[2]/td/input[1]")).click();
		String pollValue=driver.findElement(By.id("mathq2")).getText();
		
		System.out.println("The string values of the operation is --> " +pollValue);
		
		String numbers = pollValue.replaceAll("[^0-9]|[+-/*///^]", ""); 
		
		char[] c = numbers.toCharArray();
		
		int sum = 0;
		
		for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                System.out.print("Digits in the String : " + c[i]);
                System.out.println();
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        System.out.println("Sum of Digits is : " + sum);
        
        driver.findElement(By.id("mathuserans2")).sendKeys(""+sum);
        
        driver.findElement(By.xpath("//div[@pg='Vote']")).click();
        System.out.println(driver.getTitle());
        
	}

}