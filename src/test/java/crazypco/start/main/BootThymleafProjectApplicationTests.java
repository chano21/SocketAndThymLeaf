package crazypco.start.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import crazypco.start.main.crawl.DriverInfo;

@RunWith(SpringRunner.class)
@PropertySource("driver.properties")
@SpringBootTest
public class BootThymleafProjectApplicationTests {

	@Test
	public void contextLoads() {
		DriverInfo test =new DriverInfo();
		System.out.println(test.toString());
	}

}
