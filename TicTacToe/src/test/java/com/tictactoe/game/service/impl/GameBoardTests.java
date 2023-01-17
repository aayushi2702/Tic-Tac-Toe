package com.tictactoe.game.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.tictactoe.game.enums.Player;

@RunWith(MockitoJUnitRunner.class)
public class GameBoardTests {

	@Test
	public void shouldSaveInputValueOnGameBoard() {
		GameBoard gameBoard = new GameBoard();
		gameBoard.setPlayerInPosition(0, 1, Player.X);
		assertThat(gameBoard.getPlayerInPosition(0, 1)).isEqualTo(Player.X.getValue());
	}
}