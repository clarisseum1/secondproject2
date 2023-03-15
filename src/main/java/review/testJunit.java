package review;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testJunit {
	
	WebDriver driver;
	@Before
	public void init() {
		driver=new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@After
public void tearDown() {
	driver.close();
	driver.quit();
}
@Test
public void loginTest() {
	driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();

}
@Test
public void negLogin() {
	driver.findElement(By.name("username1")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();

}
}
