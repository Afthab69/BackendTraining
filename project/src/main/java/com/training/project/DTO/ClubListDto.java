package com.training.project.DTO;

import java.util.List;

import com.training.project.Clubs.ClubModel;

public class ClubListDto {

	private List<ClubModel> clubs;
	
	public List<ClubModel> getClubList() {
		return clubs;
	}
	public void setClubList(List<ClubModel> clubs) {
		this.clubs = clubs;
	}
	
}
