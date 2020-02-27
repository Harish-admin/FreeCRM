package LoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D://drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
