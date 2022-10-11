package com.training.project.DTO;

import com.training.project.Clubs.ClubModel;

public class PlayerDto {

	private String name;
	private String pos;
	private Integer jno;
	ClubModel club;
	
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
	public ClubModel getClub() {
		return club;
	}
	public void setClub(ClubModel club) {
		this.club = club;
	}
	
}
