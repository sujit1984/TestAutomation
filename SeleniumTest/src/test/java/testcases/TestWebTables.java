package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTables {
	
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
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//find the number of rows and columns present in the table
		
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class=\'dataTable\']/tbody/tr"));
		
		System.out.println("The number of rows present in the table are " +rowNum.size());
		
		List<WebElement> colNum = driver.findElements(By.xpath("//table[@class=\'dataTable\']/tbody/tr[1]/td"));
		
		System.out.println("The number of rows present in the table are " +colNum.size());
		
		for (int row = 1; row <= rowNum.size(); row++) {
			for (int col = 1; col <=colNum.size(); col++) {
				System.out.print(driver.findElement(By.xpath("//table[@class=\'dataTable\']/tbody/tr["+row+"]/td["+col+"]")).getText() + "  ");
			}
			System.out.println();
		}
		
	}

}
