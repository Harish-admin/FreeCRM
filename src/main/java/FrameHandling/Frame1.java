package FrameHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D://drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
	
	WebElement a2=driver.findElement(By.name("mainpanel"));
		 driver.switchTo().frame(a2);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	
		Thread.sleep(2000);

	}

}
