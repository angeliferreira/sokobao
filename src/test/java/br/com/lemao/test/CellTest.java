package br.com.lemao.test;

import static br.com.lemao.game_element.Block.BLOCK;
import static br.com.lemao.game_element.DumbElement.DUMB;
import static br.com.lemao.game_element.Hero.HERO;
import static br.com.lemao.game_element.Target.TARGET;
import static br.com.lemao.game_element.Target.TARGET_WITH_BLOCK;
import static br.com.lemao.game_element.Target.TARGET_WITH_HERO;
import static br.com.lemao.game_element.Wall.WALL;
import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

import br.com.lemao.core.Cell;
import br.com.lemao.game_element.GameElementFactory;


public class CellTest {

	@Test
	public void newDumbCellTest() {
		Cell cellWithDumbElement = Cell.newWithDumbElement(new Point());
		assertEquals(DUMB, cellWithDumbElement.getSecondaryElement().toString());
		assertEquals(DUMB, cellWithDumbElement.toString());
	}
	
	@Test
	public void newWallCellTest() {
		Cell cellWithWallElement = Cell.newWithWall(new Point());
		assertEquals(WALL, cellWithWallElement.getSecondaryElement().toString());
		assertEquals(WALL, cellWithWallElement.toString());
	}
	
	@Test
	public void newCellWithBlockTest() {
		Cell cellWithBlock = Cell.newWithBlock(new Point());
		assertEquals(BLOCK, cellWithBlock.getSecondaryElement().toString());
		assertEquals(BLOCK, cellWithBlock.toString());
	}
	
	@Test
	public void newCellWithHeroTest() {
		Cell cellWithHero = Cell.newWithHero(new Point());
		assertEquals(HERO, cellWithHero.getSecondaryElement().toString());
		assertEquals(HERO, cellWithHero.toString());
	}
	
	@Test
	public void newCellWithTarget() {
		Cell cellWithTarget = Cell.newWithTarget(new Point());
		assertEquals(TARGET, cellWithTarget.toString());
	}
	
	@Test
	public void newCellWithTargetAndHero() {
		Cell cellWithTarget = Cell.newWithTarget(new Point());
		cellWithTarget.setSecondaryElement(GameElementFactory.newHero());
		assertEquals(HERO, cellWithTarget.getSecondaryElement().toString());
		assertEquals(TARGET_WITH_HERO, cellWithTarget.toString());
	}
	
	@Test
	public void newCellWithTargetAndBlock() {
		Cell cellWithTarget = Cell.newWithTarget(new Point());
		cellWithTarget.setSecondaryElement(GameElementFactory.newBlock());
		assertEquals(BLOCK, cellWithTarget.getSecondaryElement().toString());
		assertEquals(TARGET_WITH_BLOCK, cellWithTarget.toString());
	}

	
}
