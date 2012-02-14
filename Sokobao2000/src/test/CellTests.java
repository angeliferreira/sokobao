package test;

import static org.junit.Assert.*;
import main.core.Cell;

import org.junit.Test;

public class CellTests {

	@Test
	public void newDumbCellTest() {
		Cell cellWithDumbElement = Cell.newCellWithDumbElement();
		assertNull(cellWithDumbElement.getPrimaryElement());
		assertEquals(" ", cellWithDumbElement.toString());
	}
	
	public void newWallCellTest() {
		Cell newCellWithWallElement = Cell.newCellWithWallElement();
		assertNull(newCellWithWallElement.getPrimaryElement());
		assertEquals("W", newCellWithWallElement.toString());
	}

	
}
