package test;

import junit.framework.Assert;
import main.gameElement.GameElement;
import main.gameElement.GameElementFactory;

import org.junit.Test;

public class GameElementTests {
	
	@Test
	public void newHeroTest() {
		GameElement hero = GameElementFactory.newInstance('H'); 
		Assert.assertEquals('H', hero.getSingleName());
	}
	
	@Test
	public void newWallTest() {
		GameElement wall = GameElementFactory.newInstance('W'); 
		Assert.assertEquals('W', wall.getSingleName());
	}
	
	@Test
	public void newBlockTest() {
		GameElement block = GameElementFactory.newInstance('B'); 
		Assert.assertEquals('B', block.getSingleName());
	}
	
	@Test
	public void newDumbElementTest() {
		GameElement dumbElement = GameElementFactory.newInstance(' '); 
		Assert.assertEquals(' ', dumbElement.getSingleName());
	}
	
	@Test
	public void newTargetTest() {
		GameElement dumbElement = GameElementFactory.newInstance('X'); 
		Assert.assertEquals('X', dumbElement.getSingleName());
	}

}
