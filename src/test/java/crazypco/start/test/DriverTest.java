package crazypco.start.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import crazypco.start.main.crawl.DriverInfo;

@RunWith(SpringRunner.class)
@TestPropertySource("classpath:driver.properties")
@SpringBootTest
public class DriverTest {

	@Test
	public void contextLoads() {
		DriverInfo test =new DriverInfo();
		System.out.println(test.toString());
	}

}
