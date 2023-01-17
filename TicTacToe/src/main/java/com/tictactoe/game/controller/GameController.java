package com.tictactoe.game.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tictactoe.game.service.GameService;

@RestController
public class GameController {

	private final GameService gameService;

	public GameController(GameService gameService) {
		this.gameService = gameService;
	}

	@PostMapping(value = "/tictactoe/play/{player}")
	public ResponseEntity<String> playGameHandler(@PathVariable(name = "player") char player) {
		return ResponseEntity.status(HttpStatus.OK).body(gameService.playGame(player));
	}

}