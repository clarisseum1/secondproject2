package review;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
 static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.switchTo().frame("packageListFrame");
driver.findElement(By.linkText("java.applet")).click();
driver.switchTo().parentFrame();
driver.switchTo().frame("packageFrame");
driver.findElement(By.linkText("AppletContext")).click();

	}

}
