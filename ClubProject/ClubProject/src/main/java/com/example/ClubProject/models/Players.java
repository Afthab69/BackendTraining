package com.example.ClubProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Players {
	private String name;
	private String pos;
	private Integer jno;
	@ManyToOne
	Club club;
	
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public Integer getJno() {
		return jno;
	}
	public void setJno(Integer jno) {
		this.jno = jno;
	}
	
}
