package com.training.project.Clubs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.project.DTO.ClubDto;

@RestController
public class ClubController {

	@Autowired
	private ClubServiceInterface clubservice;

	@RequestMapping("/Clubs")
	public List<ClubModel> getall() {
		return clubservice.getall();
	}

	@RequestMapping("/Club/{id}")
	public ResponseEntity<ClubDto> getClub(@PathVariable Long id) throws ResourceNotFoundException {
		return clubservice.getClub(id);
	}

	@RequestMapping(value = "/Club", method = RequestMethod.POST)
	public void postClub(@RequestBody ClubDto club) {
		clubservice.postClub(club);
	}

	@RequestMapping(value = "/Club/{id}", method = RequestMethod.PUT)
	public void updateClub(@RequestBody ClubDto club,@PathVariable Long id) throws ResourceNotFoundException {
		clubservice.updateClub(club,id);
	}
	@RequestMapping(value = "/Club/{id}", method = RequestMethod.DELETE)
	public void deleteClub(@PathVariable Long id) throws ResourceNotFoundException {
		clubservice.deleteClub(id);
	}
}
