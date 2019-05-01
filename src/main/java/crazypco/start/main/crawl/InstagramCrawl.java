package crazypco.start.main.crawl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

@Component
public class InstagramCrawl extends DriverInfo {
	
	public void TestDo() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println();
		System.out.println("드라이버출력 : " + this.getChromelocation());
		System.setProperty("webdriver.chrome.driver",this.getChromelocation());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("test-type");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		
		//driver.findElement(By.cssSelector("div[aria-label='검색']")).sendKeys("검색테스트");
			
		WebElement login=driver.findElement(By.cssSelector("input[name='username']"));
		WebElement password=driver.findElement(By.cssSelector("input[name='password']"));
		
		login.sendKeys(this.getInstagramid());
		password.sendKeys(this.getInstagrampassword());
		System.out.println(driver.getWindowHandle());
		password.submit();
		
		System.out.println("쿠키값들 : " + driver.manage().getCookies());
		driver.manage().deleteAllCookies();
	//driver.close();
	
		
	}
	
	
	public static void main(String args[]) throws InterruptedException {
				
	}
	
}
