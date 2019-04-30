package crazypco.start.resttest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
	public void RunCroll() {
		
	}
	public static void main(String args[]) throws InterruptedException {
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver","E:\\Attam\\AttamProject\\src\\main\\resources\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("test-type");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://touch.facebook.com/login/");
		WebElement login=driver.findElement(By.id("m_login_email"));
		WebElement password=driver.findElement(By.id("m_login_password"));
		
		login.sendKeys("821029391943");
		password.sendKeys("sky2121");
		System.out.println(driver.getWindowHandle());
		password.submit();
		Thread.sleep(1000);
		driver.get("https://m.facebook.com/search/top/?q=치킨&epa=FILTERS&filters=eyJycF9hdXRob3IiOiJ7XCJuYW1lXCI6XCJtZXJnZWRfcHVibGljX3Bvc3RzXCIsXCJhcmdzXCI6XCJcIn0ifQ%3D%3D");
		
		WebElement page=driver.findElement(By.tagName("body"));
		for(int i=0; i<10; i++) {
	//		System.out.println("gd");
			Thread.sleep(1);
		page.sendKeys(Keys.DOWN);
		}
		String test;
		
		Thread.sleep(500);
		 test=driver.findElement(By.id("xt_uniq_"+3)).getText();
		
		 System.out.println("테스트dddd : " + test);
		 
		 String contents = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;", test);
		 
		 
			Document doc=Jsoup.parse(contents); 
			  String length=doc.getElementsByAttribute("data-sigil").attr("feed-ufi-trigger");
			  System.out.println("엘레먼트 확인 : " + length);
		// System.out.println(test);
		 
		 
		 //data-sigil="feed-ufi-trigger"
		 
		 
	/*	
		
		 		
		 WebElement mytest=  driver.findElement(By.id("xt_uniq_"+4));
		
		 String contents = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;", mytest);
		 System.out.println("안에 태그들 :"+ contents);
		 System.out.println(test);	
		System.out.println("댓긁ㄱ");
		driver.findElement(By.id("xt_uniq_"+1)).click();
	*/
		/*
		System.out.println("///////////////////////////////////////////");
		*/
	//	driver.findElement(By.className(className))
		
	/*	 try {
			for(int i=1; i<20; i++) {
				Thread.sleep(500);
				test=driver.findElement(By.id("xt_uniq_"+i)).getText();
				System.out.println(test);	
				System.out.println("///////////////////////////////////////////");
			
			}	
		}catch (Exception e) {
			System.out.println("검색될게없음.");
			// TODO: handle exception
		}*/
		
		/*		String winHandle = driver.getWindowHandle(); //Get current window handle.
		for(String windowsHandle : driver.getWindowHandles()) {
		     driver.switchTo().window(windowsHandle); //Iterate to the new window handle.
		     System.out.println(driver.getWindowHandle());
		     driver.close();
		     System.out.println("gd" );
		}*/
		//*[@id="facebook"]/body/div[21]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/a[1]
		//driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[18]/div[2]/div/div/div/div/div[1]/div/div[2]/div/button")).click();
		
		//*[@id="u_d_2"]/input[2]
		/*System.out.println(driver.manage().window().getSize());
		driver.switchTo().parentFrame().close();
			driver.manage().window().maximize();
		*/
		
		/*System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		Thread.sleep(4000);
		System.out.println("분기점");
		driver.switchTo().parentFrame();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		Thread.sleep(4000);
		driver.findElement(By.ByClassName.className("layerButton _4jy0 _4jy4 _517h _51sy _42ft")).click();
		
		//*[@id="u_6_2"]/input[2]
		driver.findElement(By.cssSelector("div[aria-label='검색']")).sendKeys("검색테스트");
		driver.findElement(By.cssSelector("button[aria-label='검색']")).submit();
		
		
		System.out.println(driver.getPageSource());
*/
		
	}
	
}
