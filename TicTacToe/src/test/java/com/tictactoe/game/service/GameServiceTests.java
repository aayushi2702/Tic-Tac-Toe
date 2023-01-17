package com.tictactoe.game.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.tictactoe.game.enums.Player;
import com.tictcatoe.game.exceptions.InvalidTurnException;

@RunWith(MockitoJUnitRunner.class)
public class GameServiceTests {

	private GameService gameService;

	@Before
	public void setUp() {
		gameService = new GameService();
	}

	@Test
	public void playerXShouldAlwaysGoFirst() {
		assertThat(gameService.playGame(Player.X)).isEqualTo("Player X moved first");
	}

	@Test(expected = InvalidTurnException.class)
	public void shouldThrowInvalidTurnExceptionIfOMovesFirst() {
		gameService.playGame(Player.O);
	}

}