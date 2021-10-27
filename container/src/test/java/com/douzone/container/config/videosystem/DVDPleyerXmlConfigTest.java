package com.douzone.container.config.videosystem;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.videosystem.DigitalVideoDisc;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit4ClassRunner가 컨테이너를 말들고
@ContextConfiguration(locations={"classpath:com/douzone/container/config/videosystem/DVDPlayerConfig.xml"}) // 컴피스 파일 위치를 알려주어야 한다
public class DVDPleyerXmlConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	//@Autowired
	// 예외발생 : xml bean 설정(Avengers)에서는 id를 자동으로 부여하지 않는다
	// ... @Quralifier를 사용할수 없다
	private DigitalVideoDisc dvd1;
	
	// id 지정해서 받기 @Qualifier("받을 아이디")
	@Autowired
	@Qualifier("IronMan")
	private DigitalVideoDisc dvd2;
	
	// 생성자로 값 받아오기
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengerEndgame")
	private DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengerAgeOfUltron")
	private DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DigitalVideoDisc dvd6;
	
	
	@Ignore
	@Test
	public void testDVD1() {
		assertNotNull(dvd1);
	}
	
	
	@Test
	public void testDVD2() {
		assertNotNull(dvd2);
	}
	
	
	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
	}
	
	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
	}
	
	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
	}
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
	}
	
}
