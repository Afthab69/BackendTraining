package com.training.project.Clubs;

import java.util.List;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;

import com.training.project.DTO.ClubDto;

public interface ClubServiceInterface {
	
	public List<ClubModel> getall();

	public ResponseEntity<ClubDto> getClub(Long id) throws ResourceNotFoundException;

	public ClubModel postClub(ClubDto club);

	public void updateClub(ClubDto club, Long id) throws ResourceNotFoundException;

	public void deleteClub(Long id) throws ResourceNotFoundException;
}
