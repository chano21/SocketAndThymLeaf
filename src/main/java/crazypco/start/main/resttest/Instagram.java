package crazypco.start.main.resttest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Instagram {
	public void RunCroll() {
		
	}
	public static void main(String args[]) throws InterruptedException {
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chano\\git\\attamrepository\\AttamProject\\src\\main\\resources\\driver\\chromedriver.exe");
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
		driver.get("https://touch.facebook.com/graphsearch/str/치킨/stories-keyword/stories-public?tsid=0.667307782497977&source=pivot");
		
		WebElement page=driver.findElement(By.tagName("body"));
		for(int i=0; i<1000; i++) {
			System.out.println("gd");
			Thread.sleep(1);
		page.sendKeys(Keys.DOWN);
		}
		String test;
		 test=driver.findElement(By.id("xt_uniq_"+1)).getText();
			System.out.println(test);	
		System.out.println("댓긁ㄱ");
		driver.findElement(By.id("xt_uniq_"+1)).click();
		
		System.out.println("///////////////////////////////////////////");
		
	//	driver.findElement(By.className(className))
	/*	try {
			for(int i=1; i<200; i++) {
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
