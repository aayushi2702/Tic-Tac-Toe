package com.tictactoe.game.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.tictactoe.game.service.GameService;
import com.tictcatoe.game.exceptions.InvalidTurnException;

@RunWith(SpringRunner.class)
@WebMvcTest
class GameControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Mock
	private GameService gameService;

	@Test
	void playGameAPIShouldGive200Response() throws Exception {
		when(gameService.playGame('X')).thenReturn("Player X moved first");
		mockMvc.perform(post("/tictactoe/play/{player}", 'X')).andExpect(status().isOk());
	}

	@Test
	public void shouldShow403HttpStatusWhenInValidExceptionIsThrown() throws Exception {
		when(gameService.playGame('O')).thenThrow(new InvalidTurnException("Player X should move first"));
		mockMvc.perform(post("/tictactoe/play/{player}", 'O')).andExpect(status().isForbidden());
	}

}