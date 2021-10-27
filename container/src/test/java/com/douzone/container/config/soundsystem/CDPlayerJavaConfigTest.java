package com.douzone.container.config.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.soundsystem.CDPlayer;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit4ClassRunner가 컨테이너를 말들고
@ContextConfiguration(classes= {CDPlayerConfig.class}) // 컴피그 파일 위치를 알려주어야 한다
public class CDPlayerJavaConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CDPlayer cdplayer;
	
	// 테스트할 함수를 만든다
	// junit이 Test 어노테이션을 보고 빌드를 한다
	
	@Test
	public void testCDPlayerNotNull() {
		assertNotNull(cdplayer);
	}
	
	@Test
	public void testPlay() {
		cdplayer.play();
		assertEquals("Playing 붕붕 by 김하온", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
