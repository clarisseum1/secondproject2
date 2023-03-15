package review;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_popup {
WebDriver driver;
@Before
public void init() {
	driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
}
@Test
public void alert_test() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='proceed']")).click();
	Thread.sleep(2000);
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
	//wait.until(ExpectedConditions.visibilityOfElementLocated();
	String alertText=driver.switchTo().alert().getText();
	System.out.println(alertText);
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	
	
}
}
