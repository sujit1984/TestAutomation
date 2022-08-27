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

public class TestAssignment1 {
	
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
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("way2automation");
		
		boolean searchBtnExists = isElementPresent(By.xpath("//input[@aria-label='Google Search' and @value='Google Search']"));
		
		System.out.println("The search button is present " +searchBtnExists);
		driver.findElement(By.xpath("//input[@aria-label='Google Search' and @value='Google Search']")).click();
		
		driver.findElement(By.partialLinkText("Way2Automation")).click();
		
		System.out.println(driver.getTitle());
		
		//find all the links on the page
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links present on the page are " +allLinks.size());
//		
//		for(WebElement link:allLinks)
//		{
//			System.out.println(link.getText());
//		}
		
		driver.findElement(By.xpath("//*[@id='menu-item-27617']")).click();
		driver.findElement(By.xpath("//*[@id='menu-item-27618']")).click();
		
		
		boolean nameLabelExists = isElementPresent(By.xpath("//*[@id='load_form']/fieldset[1]/input[@name='name']"));
		System.out.println(nameLabelExists);
        driver.findElement(By.xpath("//*[@id='load_form']/fieldset[1]/input[@name='name']")).sendKeys("DarkLord");
//		WebElement submitBtn = driver.findElement(By.xpath("//div[@class='button' and @value='Submit']")));
//		submitBtn.click();
//		
		
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input"));  //*[@id="load_form"]/div[1]/div[2]/input
	
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
	    
	    executor.executeScript("arguments[0].click()", submitBtn);
	    
	    System.out.println("Please check the broswer");
	}

}
