package com.douzone.container.config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;
/*
 * 
 * javaConfig2가 하나 있으면 javaConnfig1을 때겨온다 import 
 * 
 * JavaConfig1+JavaConfig2
 */
@Configuration
@Import({DVDConfig.class})
public class DVDPlayerConfig {
	
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
}
