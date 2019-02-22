package Exercici_Videos;

import java.util.*;
import java.util.Date;

public class User {
	
	public String name;
	public String surname;
	private String password;
	private Date regDate;
	private List<Video> videoList;
	

	public User ( String name, String surname, String password, Date regDate,
				ArrayList<Video> videoList) throws Exception {
		
		if (name == null) throw new Exception ("name can't be blank");
		this.name = name;
		if (surname == null) throw new Exception ("surname can't be blank");
		this.surname = surname;
		if (password == null) throw new Exception ("surname can't be blank");
		this.password = password;
		if (regDate == null) throw new Exception ("regDate can't be blank");
		this.regDate = regDate;
		videoList = new ArrayList<Video>();
	}
	
	public User () {
		videoList = new  ArrayList<Video>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	public void setVideoList(ArrayList<Video> videoList) {
		this.videoList = videoList;
	}
	
	public String toString() {
		String results = "+";
		for (int i= 0; i< this.videoList.size(); i++){
			results += " " + this.videoList.get(i);
		}
		return results;
	}

	public void addVideo(Video title) throws Exception {
		if (title == null) throw new Exception ("the title can't be blank!!!");
		this.videoList.add(title);
	}
		
	public List<Video> getVideoList() {
		return videoList;
	}
	
}