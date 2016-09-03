package br.com.lemao.test;

import static org.junit.Assert.assertEquals;
import static br.com.lemao.game_element.GameElement.StringRepresentation.*;

import java.awt.Point;

import org.junit.Test;

import br.com.lemao.core.Cell;
import br.com.lemao.game_element.GameElementFactory;

public class CellTests {

	@Test
	public void newDumbCellTest() {
		Cell cellWithDumbElement = Cell.newWithDumbElement(new Point());
		assertEquals(DUMB.represent(), cellWithDumbElement.getSecondaryElement().toString());
		assertEquals(DUMB.represent(), cellWithDumbElement.toString());
	}
	
	@Test
	public void newWallCellTest() {
		Cell cellWithWallElement = Cell.newWithWall(new Point());
		assertEquals(WALL.represent(), cellWithWallElement.getSecondaryElement().toString());
		assertEquals(WALL.represent(), cellWithWallElement.toString());
	}
	
	@Test
	public void newCellWithBlockTest() {
		Cell cellWithBlock = Cell.newWithBlock(new Point());
		assertEquals(BLOCK.represent(), cellWithBlock.getSecondaryElement().toString());
		assertEquals(BLOCK.represent(), cellWithBlock.toString());
	}
	
	@Test
	public void newCellWithHeroTest() {
		Cell cellWithHero = Cell.newWithHero(new Point());
		assertEquals(HERO.represent(), cellWithHero.getSecondaryElement().toString());
		assertEquals(HERO.represent(), cellWithHero.toString());
	}
	
	@Test
	public void newCellWithTarget() {
		Cell cellWithTarget = Cell.newWithTarget(new Point());
		assertEquals(TARGET.represent(), cellWithTarget.toString());
	}
	
	@Test
	public void newCellWithTargetAndHero() {
		Cell cellWithTarget = Cell.newWithTarget(new Point());
		cellWithTarget.setSecondaryElement(GameElementFactory.newHero());
		assertEquals(HERO.represent(), cellWithTarget.getSecondaryElement().toString());
		assertEquals(TARGET_WITH_HERO.represent(), cellWithTarget.toString());
	}
	
	@Test
	public void newCellWithTargetAndBlock() {
		Cell cellWithTarget = Cell.newWithTarget(new Point());
		cellWithTarget.setSecondaryElement(GameElementFactory.newBlock());
		assertEquals(BLOCK.represent(), cellWithTarget.getSecondaryElement().toString());
		assertEquals(TARGET_WITH_BLOCK.represent(), cellWithTarget.toString());
	}

	
}
