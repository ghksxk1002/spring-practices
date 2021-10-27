package com.douzone.container.videosystem;

import java.util.List;

public class DVDPack {
	private String title;
	private List<BlankDisc> dvds;
	
	public DVDPack() {}
	
	public DVDPack(String title, List<BlankDisc> dvds) {
		this.title = title;
		this.dvds = dvds;
	}
	
	@Override
	public String toString() {
		return "DVDPack [title=" + title + ", dvds=" + dvds + "]";
	}
	
}
