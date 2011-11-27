package test;

import java.awt.Point;

import junit.framework.Assert;

import main.gameElement.GameElement;
import main.gameElement.GameElementFactory;

import org.junit.Test;

public class GameElementTests {
	
	@Test
	public void newHeroTest() {
		GameElement hero = GameElementFactory.newInstance('H', new Point(0, 0)); 
		
		Assert.assertEquals("Hero", hero.getClass().getSimpleName());
		Assert.assertEquals(0, hero.getPosition().x);
		Assert.assertEquals(0, hero.getPosition().y);
	}
	
	@Test
	public void newWallTest() {
		GameElement wall = GameElementFactory.newInstance('W', new Point(1, 1)); 
		
		Assert.assertEquals("Wall", wall.getClass().getSimpleName());
		Assert.assertEquals(1, wall.getPosition().x);
		Assert.assertEquals(1, wall.getPosition().y);
	}
	
	@Test
	public void newBlockTest() {
		GameElement block = GameElementFactory.newInstance('B', new Point(0, 0)); 
		
		Assert.assertEquals("Block", block.getClass().getSimpleName());
		Assert.assertEquals(0, block.getPosition().x);
		Assert.assertEquals(0, block.getPosition().y);
	}
	
	@Test
	public void newDumbElementTest() {
		GameElement dumbElement = GameElementFactory.newInstance(' ', new Point(0, 0)); 
		
		Assert.assertEquals("DumbElement", dumbElement.getClass().getSimpleName());
		Assert.assertEquals(0, dumbElement.getPosition().x);
		Assert.assertEquals(0, dumbElement.getPosition().y);
	}

}
