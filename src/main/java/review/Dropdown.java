package review;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Dropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		By USER_NAME_FIELD = By.xpath("//input[@id='username']");
		By PASSWORD_FIELD = By.xpath("//input[@name='password']");
		By SIGNIN_BUTTON_FIELD = (By.xpath("//button[@name='login']"));
		driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_FIELD).click();
		By DASHBOARD_HEADER_FIELD = (By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
		By CUSTOME_FIELD = By.xpath("//*[@id=\"side-menu\"]/li[3]/a");
		By ADD_CUSTOME_FIELD = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
		By ADD_CONTACT_FIELD = By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5");
		driver.findElement(CUSTOME_FIELD).click();
		driver.findElement(ADD_CUSTOME_FIELD).click();
		// Thread.sleep(4000);
		// WebDriverWait wait= new WebDriverWait(driver;);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(ADD_CONTACT_FIELD));
		Assert.assertTrue("Add contact page no found", driver.findElement(ADD_CONTACT_FIELD).isDisplayed());
		
		
		List<WebElement> myValue=driver.findElements(By.xpath("//select[@id='cid']//option"));
		System.out.println(myValue.size());
		for(int i=0;i<myValue.size();i++) {
			System.out.println(myValue.get(i).getText());
			if(myValue.get(i).getText().equals("ATT")) {
			myValue.get(i).click();
			break;
		 
			
		}
			}
		}
	}
		
	


