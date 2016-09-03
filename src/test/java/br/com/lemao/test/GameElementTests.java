package br.com.lemao.test;

import static br.com.lemao.game_element.GameElement.StringRepresentation.BLOCK;
import static br.com.lemao.game_element.GameElement.StringRepresentation.DUMB;
import static br.com.lemao.game_element.GameElement.StringRepresentation.HERO;
import static br.com.lemao.game_element.GameElement.StringRepresentation.TARGET;
import static br.com.lemao.game_element.GameElement.StringRepresentation.WALL;

import org.junit.Assert;
import org.junit.Test;

import br.com.lemao.game_element.GameElement;
import br.com.lemao.game_element.GameElementFactory;

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
