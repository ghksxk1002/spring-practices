package com.douzone.container.config.videosystem;

public class Avengers implements DigitalVideoDisc {

	private String title = "AVENGERS";
	private String studio ="MARVEL";
	
	@Override
	public void play() {
		System.out.println("Playing Movie" + studio + "'s" + title);
	}

}
