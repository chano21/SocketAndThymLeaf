package crazypco.start.main.service;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 인증 이력 스케쥴 관리
 */
@Component
public class RestServcie2 {

	private Logger logger = LoggerFactory.getLogger(RestServcie2.class);
	
	@Scheduled(fixedRate = 5000) // 10초주기실행
	public void deleteOldAuthHistory() {
		logger.info("#### Test Scheduled!!! ####");

	}
}
