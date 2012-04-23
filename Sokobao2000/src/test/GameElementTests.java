package test;

import junit.framework.Assert;
import main.gameElement.GameElement;
import main.gameElement.GameElementFactory;

import org.junit.Test;

public class GameElementTests {
	
	@Test
	public void newHeroTest() {
		GameElement hero = GameElementFactory.newHero();
		Assert.assertEquals('H', hero.getSingleName());
	}
	
	@Test
	public void newWallTest() {
		GameElement hero = GameElementFactory.newWall();
		Assert.assertEquals('W', hero.getSingleName());
	}
	
	@Test
	public void newBlockTest() {
		GameElement hero = GameElementFactory.newBlock();
		Assert.assertEquals('B', hero.getSingleName());
	}
	
	@Test
	public void newDumbElementTest() {
		GameElement hero = GameElementFactory.newDumbElement();
		Assert.assertEquals(' ', hero.getSingleName());
	}
	
	@Test
	public void newTargetTest() {
		GameElement dumbElement = GameElementFactory.newInstance('X'); 
		Assert.assertEquals('X', dumbElement.getSingleName());
	}

}
