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
		
		Assert.assertEquals(2, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(4, sokobao.getGrid().getCellWithHero().getPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingEast() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroEast();
		
		Assert.assertEquals(3, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(4, sokobao.getGrid().getCellWithHero().getPosition().y);
	}

	@Test
	public void getHeroPositionLevel1AfterMovingWest() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroWest();
		
		Assert.assertEquals(1, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(4, sokobao.getGrid().getCellWithHero().getPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingNorth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(2, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(3, sokobao.getGrid().getCellWithHero().getPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingSouth() {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(2, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(5, sokobao.getGrid().getCellWithHero().getPosition().y);
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingEast() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(8,4));
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast6Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast6Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingWest() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(1,4));
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroWest1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroWest1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingNorth() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(2,1));
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth3Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth3Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingSouth() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(3,8));
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1CellAndSouth4Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1CellAndSouth4Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void heroMoveBlockEast() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(2,2));
		
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth2CellsAndHeroMoveBlockEast1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void heroMoveBlockWest() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(4,2));
		
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void heroMoveBlockNorth() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(3,3));
		
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void heroMoveBlockSouth() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(4,5));
		
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingEast() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells());
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingWest() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells());
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingNorth() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell());
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingSouth() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells());
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingEast() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock());
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingWest() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1WithHorizontalPositioningBlockBlockHero());
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHorizontalPositioningBlockBlockHero(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHorizontalPositioningBlockBlockHero(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}

	@Test
	public void tryToPassBlockThroughAnotherBlockMovingNorth() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1WithVerticalPositioningBlockBlockHero());
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithVerticalPositioningBlockBlockHero(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithVerticalPositioningBlockBlockHero(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingSouth() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1WithVerticalPositioningHeroBlockBlock());
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithVerticalPositioningHeroBlockBlock(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithVerticalPositioningHeroBlockBlock(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void passHeroThroughTargetMovingEast() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(6,2));
		
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHeroOnTheTarget(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHorizontalPositioningTargetHero(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void passHeroThroughTargetMovingWest() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(8,2));
		
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHeroOnTheTarget(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHorizontalPositioningHeroTarget(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void passHeroThroughTargetMovingNorth() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(7,3));
		
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHeroOnTheTarget(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithVerticalPositioningHeroTarget(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void passHeroThroughTargetMovingSouth() {
		Sokobao2000 sokobao = getSokobaoMovingHero(new Point(7,1));
		
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHeroOnTheTarget(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithVerticalPositioningTargetHero(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void passBlockThroughTargetMovingEast() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1WithHorizontalPositioningHeroBlockTarget());
		
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithBlockOnTheTarget(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroEast();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHeroOnTheTargetAfterMoveBlockEast(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void passBlockThroughTargetMovingWest() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1WithHorizontalPositioningTargetBlockHero());
		
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithBlockOnTheTarget1(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroWest();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHeroOnTheTargetAfterMoveBlockWest(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void passBlockThroughTargetMovingNorth() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1WithVerticalPositioningTargetBlockHero());
		
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithBlockOnTheTarget2(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHeroOnTheTargetAfterMoveBlockNorth(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}
	
	@Test
	public void passBlockThroughTargetMovingSouth() {
		Sokobao2000 sokobao = new Sokobao2000(LevelTest.gridTemplateLevel1WithVerticalPositioningHeroBlockTarget());
		
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithBlockOnTheTarget3(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
		
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(Utils.gridTemplateLevel1WithHeroOnTheTargetAfterMoveBlockSouth(),
				Utils.bidimensionalArrayAsStringOfElementsConcatenated(sokobao.getGrid()));
	}

	private Sokobao2000 getSokobaoMovingHero(Point newHeroPosition) {
		Sokobao2000 sokobao = new Sokobao2000();
		sokobao.getGrid().moveGameElement(sokobao.getGrid().getCellWithHero().getPosition(), newHeroPosition);
		
		return sokobao;
	}
}
