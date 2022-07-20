package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private SqlSessionFactory seqlSessionFactory;

	// testMyBatis()는 설정된 SqlSessionFactory 인터페이스 타입의 SqlSessionFactoryBean을 이용해서 생성하고, 이를 이용해서 Connection까지 테스트 함
	@Test
	public void testMyBatis() {
		try (SqlSession session = seqlSessionFactory.openSession(); Connection con = dataSource.getConnection();) {
			log.info(session);
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testConnection() {
		try (Connection con = dataSource.getConnection()) {
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
