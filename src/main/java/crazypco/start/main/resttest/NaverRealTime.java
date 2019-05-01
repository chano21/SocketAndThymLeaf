package crazypco.start.main.resttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NaverRealTime {
	public static void main(String args[]) throws InterruptedException {
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chano\\git\\attamrepository\\AttamProject\\src\\main\\resources\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("test-type");
		
		//#nxfr_htp > div.realtime_srch._aside_news_tab

		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://m.search.daum.net/search?nil_profile=btn&w=tot&DA=SBC&q=%EC%95%84%EB%AC%B4%EA%B1%B0%EB%82%98");
		
		WebElement element=driver.findElement(By.cssSelector("#keySlide > div:nth-child(1) > ol"));
		
		System.out.println(element.getText());
	
			
		
	}
	
	
}
