package com.training.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.Clubs.ClubModel;

@Repository
public interface ClubRepository extends JpaRepository<ClubModel,Long>{

}
