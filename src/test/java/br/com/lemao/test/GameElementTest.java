package br.com.lemao.test;

import static br.com.lemao.game_element.Block.BLOCK;
import static br.com.lemao.game_element.DumbElement.DUMB;
import static br.com.lemao.game_element.Hero.HERO;
import static br.com.lemao.game_element.Target.TARGET;
import static br.com.lemao.game_element.Wall.WALL;

import org.junit.Assert;
import org.junit.Test;

import br.com.lemao.game_element.GameElement;
import br.com.lemao.game_element.GameElementFactory;

public class GameElementTest {
	
	@Test
	public void newHeroTest() {
		GameElement hero = GameElementFactory.newHero();
		Assert.assertEquals(HERO, hero.toString());
	}
	
	@Test
	public void newWallTest() {
		GameElement wall = GameElementFactory.newWall();
		Assert.assertEquals(WALL, wall.toString());
	}
	
	@Test
	public void newBlockTest() {
		GameElement block = GameElementFactory.newBlock();
		Assert.assertEquals(BLOCK, block.toString());
	}
	
	@Test
	public void newDumbElementTest() {
		GameElement dumb = GameElementFactory.newDumbElement();
		Assert.assertEquals(DUMB, dumb.toString());
	}
	
	@Test
	public void newTargetTest() {
		GameElement target = GameElementFactory.newTarget(); 
		Assert.assertEquals(TARGET, target.toString());
	}
	
}
