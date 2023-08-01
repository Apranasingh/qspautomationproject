package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.bluestone.com");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[.='Diamond' and @title='Diamond Rings']")).click();
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[@class='p-wrap']"));
		
		for(WebElement sugg : suggestions)
		{
			String textOfTheWebElement = sugg.getText();
			System.out.println(textOfTheWebElement);
		}
		
	}
}
