package com.training.project.Players;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.training.project.Clubs.ClubModel;

@Entity
@Table(name = "players")
public class PlayerModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	private String pos;
	private Integer jno;
	
	
	@JsonIgnore
	@ManyToOne
	private ClubModel club;
	public PlayerModel(String name,String pos,Integer jno) {
		this.name=name;
		this.pos = pos;
		this.jno = jno;
	}
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
