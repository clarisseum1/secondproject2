package review;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
	WebDriver driver;
@Before
	public void init() {
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("hny");
driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("kins");
driver.findElement(By.cssSelector("input[ name='Password']")).sendKeys("abc");
driver.findElement(By.cssSelector("input#sex-1")).click();
driver.findElement(By.cssSelector("input#exp-6")).click();
driver.findElement(By.cssSelector("input#profession-0")).click();
driver.findElement(By.cssSelector("input#photo")).sendKeys("C:\\Users\\clari\\OneDrive\\Documents\\Book1.xlsx");
	}

}
