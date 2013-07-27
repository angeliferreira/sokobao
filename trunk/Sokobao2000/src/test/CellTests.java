package test;

import static main.gameElement.GameElement.StringRepresentation.BLOCK;
import static main.gameElement.GameElement.StringRepresentation.DUMB;
import static main.gameElement.GameElement.StringRepresentation.HERO;
import static main.gameElement.GameElement.StringRepresentation.TARGET;
import static main.gameElement.GameElement.StringRepresentation.TARGET_WITH_BLOCK;
import static main.gameElement.GameElement.StringRepresentation.TARGET_WITH_HERO;
import static main.gameElement.GameElement.StringRepresentation.WALL;
import static org.junit.Assert.assertEquals;

import java.awt.Point;

import main.core.Cell;
import main.gameElement.GameElementFactory;

import org.junit.Test;

public class CellTests {

	@Test
	public void newDumbCellTest() {
		Cell cellWithDumbElement = Cell.newCellWithDumbElement(new Point());
		assertEquals(DUMB.represent(), cellWithDumbElement.getSecondaryElement().toString());
		assertEquals(DUMB.represent(), cellWithDumbElement.toString());
	}
	
	@Test
	public void newWallCellTest() {
		Cell cellWithWallElement = Cell.newCellWithWall(new Point());
		assertEquals(WALL.represent(), cellWithWallElement.getSecondaryElement().toString());
		assertEquals(WALL.represent(), cellWithWallElement.toString());
	}
	
	@Test
	public void newCellWithBlockTest() {
		Cell cellWithBlock = Cell.newCellWithBlock(new Point());
		assertEquals(BLOCK.represent(), cellWithBlock.getSecondaryElement().toString());
		assertEquals(BLOCK.represent(), cellWithBlock.toString());
	}
	
	@Test
	public void newCellWithHeroTest() {
		Cell cellWithHero = Cell.newCellWithHero(new Point());
		assertEquals(HERO.represent(), cellWithHero.getSecondaryElement().toString());
		assertEquals(HERO.represent(), cellWithHero.toString());
	}
	
	@Test
	public void newCellWithTarget() {
		Cell cellWithTarget = Cell.newCellWithTarget(new Point());
		assertEquals(TARGET.represent(), cellWithTarget.toString());
	}
	
	@Test
	public void newCellWithTargetAndHero() {
		Cell cellWithTarget = Cell.newCellWithTarget(new Point());
		cellWithTarget.setSecondaryElement(GameElementFactory.newHero());
		assertEquals(HERO.represent(), cellWithTarget.getSecondaryElement().toString());
		assertEquals(TARGET_WITH_HERO.represent(), cellWithTarget.toString());
	}
	
	@Test
	public void newCellWithTargetAndBlock() {
		Cell cellWithTarget = Cell.newCellWithTarget(new Point());
		cellWithTarget.setSecondaryElement(GameElementFactory.newBlock());
		assertEquals(BLOCK.represent(), cellWithTarget.getSecondaryElement().toString());
		assertEquals(TARGET_WITH_BLOCK.represent(), cellWithTarget.toString());
	}

	
}
