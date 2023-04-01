package learningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumCode {

	
	public WebDriver driver; 
	public ChromeOptions options;
	
	@BeforeMethod
	public void setUp(){
		options = new ChromeOptions ();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
	}
	
	@Test
	public void  loginWithValidCredintials () {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
}
