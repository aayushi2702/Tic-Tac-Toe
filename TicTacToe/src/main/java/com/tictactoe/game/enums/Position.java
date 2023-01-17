package com.tictactoe.game.enums;

import java.util.Arrays;

public enum Position {

	ONE(1, 0, 0), 
	TWO(2, 0, 1), 
	THREE(3, 0, 2), 
	FOUR(4, 1, 0), 
	FIVE(5, 1, 1), 
	SIX(6, 1, 2), 
	SEVEN(7, 2, 0),
	EIGHT(8, 2, 1), 
	NINE(9, 2, 2), 
	DEFAULT(0, 9, 9);

	private final int value;
	private final int row;
	private final int column;

	Position(int value, int row, int column) {
		this.value = value;
		this.row = row;
		this.column = column;
	}

	public static Position getRowColumnValueOfPosition(int position) {
		return Arrays.stream(Position.values()).filter(p -> p.getValue() == position).findAny()
				.orElse(Position.DEFAULT);
	}

	public int getValue() {
		return value;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
}