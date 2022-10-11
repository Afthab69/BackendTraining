package com.training.project.Players;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.project.DTO.PCDto;
import com.training.project.DTO.PlayerDto;

@RestController
public class PlayerController {

	@Autowired
	private PlayerServiceInterface playerservice;
	
	@RequestMapping("/Club/{id}/Players")
	public List<PlayerModel> getall(@PathVariable long id) throws ResourceNotFoundException {
		return playerservice.getall(id);
	}
	
	@RequestMapping("/Players")
	public List<PlayerModel> getallplayers() {
		return (List<PlayerModel>) playerservice.getallPlayers();
	}

	@RequestMapping("/Player/{id}")
	public ResponseEntity<PlayerDto> getPlayer(@PathVariable Long id) throws ResourceNotFoundException {
		return playerservice.getPlayer(id);
	}
	
	@RequestMapping(value = "/Club/{id}/Players", method = RequestMethod.POST)
	public void postPlayer(@RequestBody PCDto p, @PathVariable Long id) throws ResourceNotFoundException {
		
		playerservice.postPlayer(p,id);
	}

	@RequestMapping(value = "/Player/{id}", method = RequestMethod.PUT)
	public void updatePlayers(@RequestBody PlayerDto p, @PathVariable Long id) throws ResourceNotFoundException {

		playerservice.putPlayer(p, id);
	}
	
	@RequestMapping(value = "/Player/{id}", method = RequestMethod.DELETE)
	public void deletePlayer(@PathVariable Long id) throws ResourceNotFoundException {
		playerservice.deletePlayer(id);
	}
}
