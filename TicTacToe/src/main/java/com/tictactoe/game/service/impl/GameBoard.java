package com.tictactoe.game.service.impl;

import org.springframework.stereotype.Service;

import com.tictactoe.game.enums.Player;

@Service
public class GameBoard {

	private char[][] board = new char[3][3];

	public void setPlayerInPosition(int row, int column, Player player) {
		board[row][column] = player.getValue();
	}

	public char getPlayerInPosition(int row, int column) {
		return board[row][column];
	}
}