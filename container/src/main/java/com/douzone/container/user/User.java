package com.douzone.container.user;

import java.util.List;

public class User {
	private Long no = 0L;
	private String name = "이승현";
	private Friend friend;
	private List<String> friends;
	

	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	public User(Long no, String name) {
		this.name = name;
		this.no = no;
	}
	
	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	
	public void setNo(Long no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}

	
	
}
