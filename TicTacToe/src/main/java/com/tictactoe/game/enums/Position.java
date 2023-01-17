package com.tictactoe.game.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
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

	public static Position getRowColumnValueOfPosition(int position) {
		return Arrays.stream(Position.values()).filter(p -> p.getValue() == position).findAny()
				.orElse(Position.DEFAULT);
	}

}