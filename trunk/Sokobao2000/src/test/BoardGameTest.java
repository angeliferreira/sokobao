package test;

import static org.junit.Assert.*;

import main.core.BoardGame;

import org.junit.Test;

public class BoardGameTest {

	@Test
	public void newEmptyBoard() {
		BoardGame boardGame = new BoardGame();
		assertArrayEquals(new String []{
				"     ",
				"     ",
				"     ",
				"     ",
				"     "
				}, boardGame.status());
	}

}
