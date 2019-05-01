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
public class FaceBookCrawl extends DriverInfo {
	
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
		driver.get("https://touch.facebook.com/login/");
		WebElement login=driver.findElement(By.id("m_login_email"));
		
		
		WebElement password=driver.findElement(By.id("m_login_password"));
		System.out.println("패스워드입니다. "+ password);
		
		
		login.sendKeys(this.getFacebookid());
		password.sendKeys(this.getFacebookpassword());
		System.out.println(driver.getWindowHandle());
		password.submit();
		Thread.sleep(1000);
		driver.get("https://touch.facebook.com/graphsearch/str/드라마/stories-keyword/stories-public?tsid=0.667307782497977&source=pivot");
		
		WebElement page=driver.findElement(By.tagName("body"));
		for(int i=0; i<1; i++) {
			System.out.println("gd");
			Thread.sleep(1);
		page.sendKeys(Keys.DOWN);
		}
		String test;

		System.out.println("///////////////////////////////////////////");
		
			for(int i=1; i<10; i++) {
				try {
					
				test=driver.findElement(By.id("xt_uniq_"+i)).getText();
				System.out.println("내용 : "+ test);	
				
				
				WebElement element;
				element=driver.findElement(By.id("xt_uniq_"+i));
				test=driver.findElement(By.id("xt_uniq_"+i)).getText();
					
					String contents = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;", element);
					
					Pattern urlid = Pattern.compile("<a href=\"\\S+&amp+");
					
					Matcher m = urlid.matcher(contents);
					  
					  while(m.find()) {
						  System.out.println("아이디 : "+m.group());
					  }
					  
					  
				
				System.out.println("///////////////////////////////////////////");
			}catch (Exception e) {
				System.out.println("검색될게없음.");
				// TODO: handle exception
			}
			}	
		
			System.out.println("쿠키값들 : " + driver.manage().getCookies());
			driver.manage().deleteAllCookies();
	//	driver.close();
		
		
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
	
	
	public static void main(String args[]) throws InterruptedException {
				
	}
	
}
