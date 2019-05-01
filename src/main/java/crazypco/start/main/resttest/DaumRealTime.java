package crazypco.start.main.resttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DaumRealTime {
	public static void main(String args[]) throws InterruptedException {
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chano\\git\\attamrepository\\AttamProject\\src\\main\\resources\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("test-type");
		
		//#nxfr_htp > div.realtime_srch._aside_news_tab

		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=");
		
		WebElement element=driver.findElement(By.cssSelector("#nxfr_htp > div.realtime_srch._aside_news_tab"));
		
		System.out.println(element.getText());
	
			
		
	}
	
	
}
