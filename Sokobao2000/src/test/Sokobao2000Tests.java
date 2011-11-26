package test;

import java.awt.Point;

import junit.framework.Assert;
import main.Sokobao2000;

import org.junit.Test;

import test.Utils.LevelTest;
import test.Utils.Utils;

public class Sokobao2000Tests {
	
	@Test
	public void checkInitialGrid() {
		Sokobao2000 sokobao = new Sokobao2000();

		Assert.assertEquals(Utils.gridTemplateLevel1(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}

	@Test
	public void moveHeroEast() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroEast();
				
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void moveHeroWest() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroWest();
				
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroWest1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void moveHeroNorth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroNorth();
				
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void moveHeroSouth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroSouth();
				
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroSouth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void getHeroInitialPositionLevel1() {
		Sokobao2000 sokobao = new Sokobao2000();
		
		Assert.assertEquals(2, sokobao.getHero().getPosition().x);
		Assert.assertEquals(4, sokobao.getHero().getPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingEast() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroEast();
		
		Assert.assertEquals(3, sokobao.getGrid().getHeroPosition().x);
		Assert.assertEquals(4, sokobao.getGrid().getHeroPosition().y);
	}

	@Test
	public void getHeroPositionLevel1AfterMovingWest() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroWest();
		
		Assert.assertEquals(1, sokobao.getGrid().getHeroPosition().x);
		Assert.assertEquals(4, sokobao.getGrid().getHeroPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingNorth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(2, sokobao.getGrid().getHeroPosition().x);
		Assert.assertEquals(3, sokobao.getGrid().getHeroPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingSouth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(2, sokobao.getGrid().getHeroPosition().x);
		Assert.assertEquals(5, sokobao.getGrid().getHeroPosition().y);
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingEast() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setHeroPosition(new Point(8,4));
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast6Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingWest() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setHeroPosition(new Point(1,4));
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroWest1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingNorth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setHeroPosition(new Point(2,1));
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth3Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingSouth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setHeroPosition(new Point(3,8));
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1CellAndSouth4Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void heroMoveBlockEast() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setHeroPosition(new Point(2,2));
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth2CellsAndHeroMoveBlockEast1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void heroMoveBlockWest() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setHeroPosition(new Point(4,2));
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void heroMoveBlockNorth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setHeroPosition(new Point(3,3));
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void heroMoveBlockSouth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setHeroPosition(new Point(4,5));
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingEast() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setGrid(LevelTest.gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells());
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingWest() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setGrid(LevelTest.gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells());
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingNorth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setGrid(LevelTest.gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell());
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingSouth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setGrid(LevelTest.gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells());
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingEast() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setGrid(LevelTest.gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock());
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingWest() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setGrid(LevelTest.gridTemplateLevel1WithHorizontalPositioningBlockBlockHero());
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHorizontalPositioningBlockBlockHero(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}

	@Test
	public void tryToPassBlockThroughAnotherBlockMovingNorth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setGrid(LevelTest.gridTemplateLevel1WithVerticalPositioningBlockBlockHero());
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithVerticalPositioningBlockBlockHero(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingSouth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.setGrid(LevelTest.gridTemplateLevel1WithVerticalPositioningHeroBlockBlock());
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithVerticalPositioningHeroBlockBlock(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
}
