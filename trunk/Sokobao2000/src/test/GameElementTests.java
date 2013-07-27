package test;

import static main.gameElement.GameElement.StringRepresentation.BLOCK;
import static main.gameElement.GameElement.StringRepresentation.DUMB;
import static main.gameElement.GameElement.StringRepresentation.HERO;
import static main.gameElement.GameElement.StringRepresentation.TARGET;
import static main.gameElement.GameElement.StringRepresentation.WALL;
import junit.framework.Assert;
import main.gameElement.GameElement;
import main.gameElement.GameElementFactory;

import org.junit.Test;

public class GameElementTests {
	
	@Test
	public void newHeroTest() {
		GameElement hero = GameElementFactory.newHero();
		Assert.assertEquals(HERO.represent(), hero.toString());
	}
	
	@Test
	public void newWallTest() {
		GameElement wall = GameElementFactory.newWall();
		Assert.assertEquals(WALL.represent(), wall.toString());
	}
	
	@Test
	public void newBlockTest() {
		GameElement block = GameElementFactory.newBlock();
		Assert.assertEquals(BLOCK.represent(), block.toString());
	}
	
	@Test
	public void newDumbElementTest() {
		GameElement dumb = GameElementFactory.newDumbElement();
		Assert.assertEquals(DUMB.represent(), dumb.toString());
	}
	
	@Test
	public void newTargetTest() {
		GameElement target = GameElementFactory.newTarget(); 
		Assert.assertEquals(TARGET.represent(), target.toString());
	}
	
}
