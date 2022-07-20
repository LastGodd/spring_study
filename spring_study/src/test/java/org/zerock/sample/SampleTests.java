package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {

	@Autowired
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("================================");
		log.info(restaurant.getChef());
		
	}
	
	// 의존성 주입을 위해서 @Component 어노테이션을 붙인 다음 root-context.xml에 context-scan할 수 있도록 패키지를 등록하고
	// JUnit을 이용하여 test실행한다.
}
