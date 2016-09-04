package br.com.lemao.core;

import static br.com.lemao.game_element.Block.BLOCK;
import static br.com.lemao.game_element.DumbElement.DUMB;
import static br.com.lemao.game_element.Hero.HERO;
import static br.com.lemao.game_element.Target.TARGET;
import static br.com.lemao.game_element.Target.TARGET_WITH_BLOCK;
import static br.com.lemao.game_element.Target.TARGET_WITH_HERO;
import static br.com.lemao.game_element.Wall.WALL;

import java.awt.Point;

import org.junit.Assert;

import br.com.lemao.game_element.GameElement;
import br.com.lemao.game_element.GameElementFactory;

public class Cell {

	private GameElement primaryElement;
	private GameElement secondaryElement;
	private Point position;

	private Cell() { }
	
	private Cell(GameElement secondaryGameElement, Point newPosition) {
		primaryElement = GameElementFactory.newDumbElement(); 
		secondaryElement = secondaryGameElement;
		position = newPosition;
	}

	public static Cell newWithDumbElement(Point position) {
		return new Cell(GameElementFactory.newDumbElement(), position);
	}

	public static Cell newWithWall(Point position) {
		return new Cell(GameElementFactory.newWall(), position);
	}
	
	public static Cell newWithHero(Point position) {
		return new Cell(GameElementFactory.newHero(), position);
	}
	
	public static Cell newWithBlock(Point position) {
		return new Cell(GameElementFactory.newBlock(), position);
	}
	
	public static Cell newWithTarget(Point position) {
		Cell cell = new Cell();
		cell.position = position;
		cell.primaryElement = GameElementFactory.newTarget();
		cell.secondaryElement = GameElementFactory.newDumbElement();
		return cell;
	}
	
	public static Cell newInstance(String elementString, Point position) {
		if(elementString.equals(BLOCK))
			return newWithBlock(position);
		
		if(elementString.equals(HERO))
			return newWithHero(position);
		
		if(elementString.equals(WALL))
			return newWithWall(position);
		
		if(elementString.equals(TARGET))
			return newWithTarget(position);
		
		if(elementString.equals(DUMB))
			return newWithDumbElement(position);
		
		Assert.fail("Ops, couldn't create new Cell. :(");
		return null;
	}
	
	@Override
	public String toString() {
		if(primaryElement.toString().equals(DUMB))
			return getSecondaryElement().toString();
		
		if(getSecondaryElement().toString().equals(DUMB))
			return primaryElement.toString();
		
		if(getSecondaryElement().toString().equals(HERO))
			return TARGET_WITH_HERO;
			
		return TARGET_WITH_BLOCK;
	}

	public GameElement getSecondaryElement() {
		return secondaryElement;
	}
	
	public void setSecondaryElement(GameElement secondaryElement) {
		this.secondaryElement = secondaryElement;
	}

	public Point getPosition() {
		return position;
	}

}
