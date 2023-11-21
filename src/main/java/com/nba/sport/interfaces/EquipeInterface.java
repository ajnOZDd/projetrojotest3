package com.nba.sport.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nba.sport.models.Equipe;

public interface EquipeInterface extends JpaRepository<Equipe, String> {
    
}
