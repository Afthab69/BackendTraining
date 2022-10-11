package com.training.project.Players;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.training.project.Clubs.ClubModel;
import com.training.project.DTO.PCDto;
import com.training.project.DTO.PlayerDto;
import com.training.project.DTO.PlayerListDto;
import com.training.project.repository.ClubRepository;
import com.training.project.repository.PlayerRepository;

@Service
public class PlayerServiceImplementation implements PlayerServiceInterface{

	@Autowired
	private PlayerRepository playerrepository;

	@Autowired
	private ClubRepository clubrepository;

	ClubModel club;

	public List<PlayerModel> getall(Long Id) throws ResourceNotFoundException {
		ClubModel c = clubrepository.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("Players not found!"));

		PlayerListDto playerlist = new PlayerListDto();
		playerlist.setPlayers(c.getPlayers());
		return (playerlist.getPlayers());

	}

	public List<PlayerModel> getallplayers() {
		PlayerListDto playerlist = new PlayerListDto();
		playerlist.setPlayers(playerrepository.findAll());
		return (playerlist.getPlayers());
	}

	public ResponseEntity<PlayerDto> getPlayer(long id) throws ResourceNotFoundException {
		PlayerModel player = playerrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found!"));
		PlayerDto p = new PlayerDto();
		p.setName(player.getName());
		p.setPos(player.getPos());
		p.setJno(player.getJno());
		p.setClub(player.getClub());
		return ResponseEntity.ok().body(p);
	}

	public void postPlayer(PCDto player, Long id) throws ResourceNotFoundException {
		ClubModel club = clubrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Club not found!"));

		PlayerModel p = new PlayerModel(null, null, null);
		p.setClub(club);
		p.setJno(player.getJno());
		p.setName(player.getName());
		p.setPos(player.getPos());
		playerrepository.save(p);

	}

	public void putPlayers(PlayerDto player, Long id) throws ResourceNotFoundException {
		if (!playerrepository.existsById(id))
			throw new ResourceNotFoundException("Player not found");
		PlayerModel p = playerrepository.findById(id).get();
		p.setName(player.getName());
		p.setJno(player.getJno());
		p.setPos(player.getPos());
		p.setClub(club);
		playerrepository.save(p);
	}

	public void deletePlayer(Long id) throws ResourceNotFoundException {
		PlayerModel player = playerrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found"));
		playerrepository.delete(player);

	}

	@Override
	public void putPlayer(PlayerDto player, Long id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PlayerModel> getallPlayers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
