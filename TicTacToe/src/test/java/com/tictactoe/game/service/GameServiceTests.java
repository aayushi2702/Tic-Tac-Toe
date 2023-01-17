package com.tictactoe.game.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameServiceTests {

	@Test
	public void playerXShouldAlwaysGoFirst() {
		GameService gameService = new GameService();
		assertThat(gameService.playGame('X')).isEqualTo("Player X moved first");
	}

}