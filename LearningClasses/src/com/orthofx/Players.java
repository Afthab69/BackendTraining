package com.orthofx;
import java.util.*;
public class Players {
	private int id;
	int jno;
	String name;
	Club club;
	
	public Players(int id,int jno, String name, Club club) {
		this.id = id;
		this.jno = jno;
		this.name = name;
		this.club = club;
	}
	public int getId() {
		return id;
	}
	
	public int getJno() {
		return jno;
	}
	
	public String getName() {
		return name;
	}
	public Club getClub() {
		return club;
	}
	public String getClubName() {
		return club.getName();
	}

}
