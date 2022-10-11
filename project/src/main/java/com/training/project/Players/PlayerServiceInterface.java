package com.training.project.Players;

import java.util.List;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;

import com.training.project.DTO.PCDto;
import com.training.project.DTO.PlayerDto;

public interface PlayerServiceInterface {

	public List<PlayerModel> getall(Long Id) throws ResourceNotFoundException;

	public ResponseEntity<PlayerDto> getPlayer(long id) throws ResourceNotFoundException;

	public void putPlayer(PlayerDto player, Long id) throws ResourceNotFoundException;

	public void deletePlayer(Long id) throws ResourceNotFoundException;

	public List<PlayerModel> getallPlayers();

	public void postPlayer(PCDto p, Long id) throws ResourceNotFoundException;
	
}
