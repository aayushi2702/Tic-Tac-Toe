package com.tictactoe.game.service.impl;

import java.nio.CharBuffer;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.tictactoe.game.enums.Player;

@Service
public class GameBoard {

	private static final int EMPTY_POSITION_ON_BOARD = 0;
	private char[][] board = new char[3][3];

	public void setPlayerInPosition(int row, int column, Player player) {
		board[row][column] = player.getValue();
	}

	public char getPlayerInPosition(int row, int column) {
		return board[row][column];
	}

	public int getCountOfPositionsOccupied() {
		return (int) Arrays.stream(board).map(CharBuffer::wrap).flatMapToInt(CharBuffer::chars)
				.filter(position -> position != EMPTY_POSITION_ON_BOARD).count();
	}
}