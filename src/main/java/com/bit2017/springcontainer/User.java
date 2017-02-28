package com.bit2017.springcontainer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Autowired
	private Student student;
	
	private Friend friend;
	private List<String> friends;
	
	private int no;
	private String name;
	
	public User(){
	}
	
	public User( int no, String name ) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [student=" + student + ", friend=" + friend + ", friends=" + friends + ", no=" + no + ", name="
				+ name + "]";
	}
}
