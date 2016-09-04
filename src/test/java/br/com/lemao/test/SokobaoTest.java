package br.com.lemao.test;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

import br.com.lemao.Sokobao;
import br.com.lemao.core.Grid;
import br.com.lemao.utils.TestLevels;
import br.com.lemao.utils.Utils;

public class SokobaoTest {
	
	@Test
	public void checkInitialGrid() {
		Sokobao sokobao = new Sokobao();

		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W H      W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}

	@Test
	public void moveHeroEast() {
		Sokobao sokobao = new Sokobao();
		sokobao.moveHeroEast();
				
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W  H     W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void moveHeroWest() {
		Sokobao sokobao = new Sokobao();
		sokobao.moveHeroWest();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("WH       W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void moveHeroNorth() {
		Sokobao sokobao = new Sokobao();
		sokobao.moveHeroNorth();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W H   B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void moveHeroSouth() {
		Sokobao sokobao = new Sokobao();
		sokobao.moveHeroSouth();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W H   X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void getHeroInitialPositionLevel1() {
		Sokobao sokobao = new Sokobao();
		
		Assert.assertEquals(2, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(4, sokobao.getGrid().getCellWithHero().getPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingEast() {
		Sokobao sokobao = new Sokobao();
		sokobao.moveHeroEast();
		
		Assert.assertEquals(3, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(4, sokobao.getGrid().getCellWithHero().getPosition().y);
	}

	@Test
	public void getHeroPositionLevel1AfterMovingWest() {
		Sokobao sokobao = new Sokobao();
		sokobao.moveHeroWest();
		
		Assert.assertEquals(1, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(4, sokobao.getGrid().getCellWithHero().getPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingNorth() {
		Sokobao sokobao = new Sokobao();
		sokobao.moveHeroNorth();
		
		Assert.assertEquals(2, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(3, sokobao.getGrid().getCellWithHero().getPosition().y);
	}
	
	@Test
	public void getHeroPositionLevel1AfterMovingSouth() {
		Sokobao sokobao = new Sokobao();
		sokobao.moveHeroSouth();
		
		Assert.assertEquals(2, sokobao.getGrid().getCellWithHero().getPosition().x);
		Assert.assertEquals(5, sokobao.getGrid().getCellWithHero().getPosition().y);
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingEast() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(8,4));
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W       HW");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroEast();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W       HW");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingWest() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(1,4));
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("WH       W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroWest();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("WH       W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingNorth() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(2,1));
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W H      W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroNorth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W H      W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassHeroThroughWallMovingSouth() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(3,8));
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W  H  X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());		
		
		sokobao.moveHeroSouth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W  H  X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void heroMoveBlockEast() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(2,2));
		
		sokobao.moveHeroEast();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  HB  X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void heroMoveBlockWest() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(4,2));
		
		sokobao.moveHeroWest();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W BH   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void heroMoveBlockNorth() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(3,3));
		
		sokobao.moveHeroNorth();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W  B     W"); 
		template.append("W  H   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void heroMoveBlockSouth() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(4,5));
		
		sokobao.moveHeroSouth();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   H    W");
		template.append("W X B  B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingEast() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells());
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W      HBW");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroEast();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W      HBW");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingWest() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells());
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("WBH    X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroWest();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("WBH    X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingNorth() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell());
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W  B     W"); 
		template.append("W  H   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroNorth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W  B     W"); 
		template.append("W  H   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassBlockThroughWallMovingSouth() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells());
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W        W");
		template.append("W X H  B W");
		template.append("W   B X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroSouth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W        W");
		template.append("W X H  B W");
		template.append("W   B X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingEast() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock());
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W      X W"); 
		template.append("W   HBB  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroEast();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W      X W"); 
		template.append("W   HBB  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingWest() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1WithHorizontalPositioningBlockBlockHero());
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  BBH X W"); 
		template.append("W        W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroWest();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  BBH X W"); 
		template.append("W        W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}

	@Test
	public void tryToPassBlockThroughAnotherBlockMovingNorth() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1WithVerticalPositioningBlockBlockHero());
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W  B     W");
		template.append("W  H     W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroNorth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W  B     W");
		template.append("W  H     W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void tryToPassBlockThroughAnotherBlockMovingSouth() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1WithVerticalPositioningHeroBlockBlock());
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W        W");
		template.append("W   H    W");
		template.append("W   B X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroSouth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W        W");
		template.append("W   H    W");
		template.append("W   B X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void passHeroThroughTargetMovingEast() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(6,2));
		
		sokobao.moveHeroEast();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   # W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroEast();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   XHW"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void passHeroThroughTargetMovingWest() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(8,2));
		
		sokobao.moveHeroWest();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   # W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroWest();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B  HX W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void passHeroThroughTargetMovingNorth() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(7,3));
		
		sokobao.moveHeroNorth();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   # W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroNorth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W      H W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void passHeroThroughTargetMovingSouth() {
		Sokobao sokobao = getSokobaoMovingHero(new Point(7,1));
		
		sokobao.moveHeroSouth();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   # W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroSouth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     BH W");
		template.append("W        W");
		template.append("W     X  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void passBlockThroughTargetMovingEast() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1WithHorizontalPositioningHeroBlockTarget());
		
		sokobao.moveHeroEast();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W        W");
		template.append("W        W");
		template.append("W    H$  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroEast();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W        W");
		template.append("W        W");
		template.append("W     #B W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void passBlockThroughTargetMovingWest() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1WithHorizontalPositioningTargetBlockHero());
		
		sokobao.moveHeroWest();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W        W");
		template.append("W        W");
		template.append("W     $H W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroWest();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W        W");
		template.append("W        W");
		template.append("W    B#  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void passBlockThroughTargetMovingNorth() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1WithVerticalPositioningTargetBlockHero());
		
		sokobao.moveHeroNorth();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W        W");
		template.append("W     $  W");
		template.append("W     H  W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroNorth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W     B  W");
		template.append("W     B  W");
		template.append("W     #  W");
		template.append("W        W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}
	
	@Test
	public void passBlockThroughTargetMovingSouth() {
		Sokobao sokobao = new Sokobao(TestLevels.gridTemplateLevel1WithVerticalPositioningHeroBlockTarget());
		
		sokobao.moveHeroSouth();
		
		StringBuilder template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W        W");
		template.append("W     H  W");
		template.append("W     $  W");
		template.append("W   B    W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
		
		sokobao.moveHeroSouth();
		
		template = new StringBuilder();
		template.append("WWWWWWWWWW");
		template.append("W        W"); 
		template.append("W  B   X W"); 
		template.append("W        W");
		template.append("W        W");
		template.append("W     #  W");
		template.append("W   B B  W");
		template.append("W X    B W");
		template.append("W     X  W");
		template.append("WWWWWWWWWW");
		
		assertGrid(template, sokobao.getGrid());
	}

	private Sokobao getSokobaoMovingHero(Point newHeroPosition) {
		Sokobao sokobao = new Sokobao();
		sokobao.moveGameElement(sokobao.getGrid().getCellWithHero().getPosition(), newHeroPosition);
		
		return sokobao;
	}
	
	private void assertGrid(StringBuilder template, Grid grid) {
		Assert.assertEquals(template.toString(), Utils.bidimensionalArrayAsStringOfElementsConcatenated(grid));
	}
}
