package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.entities.Games;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GamesService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Games> findAll(){
		List<Games> result = gameRepository.findAll();
		
		return result;
	}
	
}
