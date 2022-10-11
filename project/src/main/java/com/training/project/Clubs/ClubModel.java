package com.training.project.Clubs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.training.project.Players.PlayerModel;

@Entity
@Table(name = "clubs")
public class ClubModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	private String league;
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "club")
	private List<PlayerModel> players = new ArrayList<>();
	public ClubModel(String name,String league) {
		this.name = name;
		this.league = league;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public List<PlayerModel> getPlayers() {
		return players;
	}
	public void setPlayers(List<PlayerModel> players) {
		this.players = players;
	}
	
}
