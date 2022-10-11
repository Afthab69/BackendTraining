package com.training.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.Players.PlayerModel;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel,Long>{

}
