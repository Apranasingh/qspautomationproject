package assignment1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario10 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.bluestone.com");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		driver.switchTo().frame("chat-widget");
	
		WebElement chatWithOurExperts = driver.findElement(By.xpath("//button[@aria-label='Open LiveChat chat widget']"));
		chatWithOurExperts.click();
	
		driver.findElement(By.id("name")).sendKeys("aprana");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("aprana1204@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("0uzf5ihr786_3")).sendKeys("abcdeft");
		Thread.sleep(3000);
		
		driver.findElement(By.id("wczihpo6ioh_4")).sendKeys("math");
		Thread.sleep(2000);
		driver.findElement(By.id("xfr90k4kpw_5")).sendKeys("msg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
				
		
		
	
	
	}
}
