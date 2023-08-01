package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario9 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.in/");
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[.='TV, Appliances, Electronics']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[.='Cameras']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[.='Canon']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[.='₹10,000 - ₹20,000']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[.='4 Stars & Up']")).click();
			
	}
}
