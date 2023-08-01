package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.get("https://www.bluestone.com");
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
			
			WebElement target = driver.findElement(By.xpath("//span[.='Offers ']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(target).perform();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("10% Making Charges Off on Plain Gold Jewellery")).click();
	}
}
