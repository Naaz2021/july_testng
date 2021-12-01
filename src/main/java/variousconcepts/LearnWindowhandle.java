package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowhandle {
	
	
WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void windowhandle() {
		
		System.out.println(driver.getTitle());
		String handle1=driver.getWindowHandle();
		System.out.println(handle1);
				
	driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("selenium");
			
	driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
	driver.findElement(By.xpath("//div[@id='web']/descendant::li[1]/descendant::a[1]"));
	System.out.println(driver.getTitle());
	
	
	
	// ctrl+/
	// ctrl+ shift+/
	//driver.findElement(By.linkText("Selenium")).click();
	//driver.findElement(By.partialLinkText("Selenium")).click();
	
			
			
		
			
		
		
	}

}
