package com.training.project.Clubs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.training.project.DTO.ClubDto;
import com.training.project.DTO.ClubListDto;

import com.training.project.repository.ClubRepository;

@Service
public class ClubServiceImplementation implements ClubServiceInterface {

	@Autowired
	private ClubRepository clubrepository;
	
	public List<ClubModel> getall() {
		ClubListDto clubdto = new ClubListDto();
		clubdto.setClubList(clubrepository.findAll());
		return (clubdto.getClubList());
	}
	
	public ResponseEntity<ClubDto> getClub(Long id) throws ResourceNotFoundException {
		ClubModel club = clubrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Club not found!"));
		ClubDto c = new ClubDto();
		c.setName(club.getName());
		c.setLeague(club.getLeague());
		
		return ResponseEntity.ok().body(c);
	}
	
	public ClubModel postClub(ClubDto club) {
		ClubModel c = new ClubModel(null, null);
		c.setName(club.getName());
		c.setLeague(club.getLeague());
		return clubrepository.save(c);
	}

	public void updateClub(ClubDto club, Long id) throws ResourceNotFoundException {
		if (!clubrepository.existsById(id))
			throw new ResourceNotFoundException("Club not found!");

		ClubModel c = clubrepository.findById(id).get();
		c.setName(club.getName());
		c.setLeague(club.getLeague());
		clubrepository.save(c);

	}

	public void deleteClub(Long id) throws ResourceNotFoundException {
		ClubModel club = clubrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Club not found!"));
		clubrepository.delete(club);

	}
}
