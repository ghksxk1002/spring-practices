package com.douzone.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapperFinal implements CompactDisct{
	private String artist = "김하온";
	private String title = "붕붕";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
