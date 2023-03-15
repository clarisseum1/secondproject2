package review;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Xpath {
WebDriver driver;
By USER_NAME_FIELD=By.xpath("//input[@id='username']");
By PASSWORD_FIELD=By.xpath("//input[@name='password']");
By SIGNIN_BUTTON_FIELD=(By.xpath("//button[@name='login']"));
By DASHBOARD_HEADER_FIELD=(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
By CUSTOME_FIELD=By.xpath("//*[@id=\"side-menu\"]/li[3]/a");
By ADD_CUSTOME_FIELD=By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
By ADD_CONTACT_FIELD=By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5");
By FULL_NAME_FIELD=By.xpath("//*[@id=\"account\"]");
By CAMPANY_DROPDOWN_FIELD=By.xpath("//*[@id=\"cid\"]");
By EMAIL_FIELD=By.xpath("//input[@id='email']");
By PHONE_FIELD=By.xpath("//input[@id='phone']");
By ADDRESS_FIELD=By.xpath("//input[@id='address']");
By CITY_FIELD=By.xpath("//*[@id=\"city\"]");
By STATE_FIELD=By.xpath("//*[@id=\"state\"]");
By ZIP_CODE_FIELD=By.xpath("//*[@id=\"zip\"]");
By COUNTRY_FIELD=By.xpath("//*[@id=\"select2-country-container\"]");
//By TAGS_FIELD=By.xpath("//*[@id=\"rform\"]/div[1]/div[1]/div[10]/div/span/span[1]/span/ul");
//By CURRENCY_FIELD=By.xpath("//*[@id=\"currency\"]");
//By GROUP_FIELD=By.xpath("//*[@id=\"group\"]");
//By PASSWORD_FIELD1=By.xpath("//*[@id=\"password\"]");
//By PASSWORD_CONFERM_FIELD1=By.xpath("//*[@id=\"cpassword\"]");
By SAVE_FIELD=By.xpath("//*[@id=\"rform\"]/div[2]/div/div/div");

@Before
public  void init() {
	System.setProperty("webdrive.driver.chrome", "\\review-exam\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://techfios.com/billing/?ng=login/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
}
@Test
public void login() {
	
	/*store in webelement
	// type name=value
	 //WebElement USER_NAME_ELEMENT=driver.findElement(By.xpath("//input[@id='username']"));
	 //WebElement PASSWORD_ELEMENT=driver.findElement(By.xpath("//input[@name='password']"));
	 //WebElement SIGNIN_BUTTON_ELEMENT=driver.findElement(By.xpath("//button[@name='login']"));
	//store by class*/
	
	
	 driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
	 driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
	 driver.findElement(SIGNIN_BUTTON_FIELD).click();
	 //driver.findElement(DASHBOARD_HEADER_FIELD).getText();

		
Assert.assertTrue("dashbood no found",driver.findElement(DASHBOARD_HEADER_FIELD).isDisplayed());
//Assert.assertEquals("dashbood no found"," Dashboard ",driver.findElement(DASHBOARD_HEADER_FIELD).getText() );
	 
} 
@Test
public  void testcustome() {
	login();
	driver.findElement(CUSTOME_FIELD).click();
	driver.findElement(ADD_CUSTOME_FIELD).click();
	//Thread.sleep(4000);
	//WebDriverWait wait= new WebDriverWait(driver;);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(ADD_CONTACT_FIELD));
	Assert.assertTrue("Add contact page no found",driver.findElement(ADD_CONTACT_FIELD).isDisplayed());
	driver.findElement(FULL_NAME_FIELD).sendKeys("clarisse umuhoza");
	//driver.findElement(CAMPANY_DROPDOWN_FIELD);
	Select sel=new Select(driver.findElement(CAMPANY_DROPDOWN_FIELD));
	sel.selectByVisibleText("Techfios");
	driver.findElement(EMAIL_FIELD).sendKeys("clarisseum1@gmail.com");
	driver.findElement(PHONE_FIELD).sendKeys("5124094223");
	driver.findElement(ADDRESS_FIELD).sendKeys("1304 branwell driver");
	driver.findElement(CITY_FIELD).sendKeys("Austin");
	driver.findElement(STATE_FIELD).sendKeys("Texas");
	driver.findElement(ZIP_CODE_FIELD).sendKeys("787865");
	driver.findElement(COUNTRY_FIELD).sendKeys("USA");
	//driver.findElement(TAGS_FIELD).sendKeys("#5");
	//driver.findElement(CURRENCY_FIELD).sendKeys("$");
	//driver.findElement(GROUP_FIELD).sendKeys("1");
	//driver.findElement(PASSWORD_FIELD1).sendKeys("abc124");
	//driver.findElement(PASSWORD_CONFERM_FIELD1).sendKeys("abc124");
	driver.findElement(SAVE_FIELD).click();
}
	@After
	public void teardown(){
	driver.close();
	driver.quit();
	

	
}
}
