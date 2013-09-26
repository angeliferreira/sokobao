package main.core;

import static main.gameElement.GameElement.StringRepresentation.BLOCK;
import static main.gameElement.GameElement.StringRepresentation.DUMB;
import static main.gameElement.GameElement.StringRepresentation.HERO;
import static main.gameElement.GameElement.StringRepresentation.TARGET;
import static main.gameElement.GameElement.StringRepresentation.TARGET_WITH_BLOCK;
import static main.gameElement.GameElement.StringRepresentation.TARGET_WITH_HERO;
import static main.gameElement.GameElement.StringRepresentation.WALL;

import java.awt.Point;

import junit.framework.Assert;
import main.gameElement.GameElement;
import main.gameElement.GameElementFactory;

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
		if(elementString.equals(BLOCK.represent()))
			return newWithBlock(position);
		
		if(elementString.equals(HERO.represent()))
			return newWithHero(position);
		
		if(elementString.equals(WALL.represent()))
			return newWithWall(position);
		
		if(elementString.equals(TARGET.represent()))
			return newWithTarget(position);
		
		if(elementString.equals(DUMB.represent()))
			return newWithDumbElement(position);
		
		Assert.fail("Ops, couldn't create new Cell. :(");
		return null;
	}
	
	@Override
	public String toString() {
		if(primaryElement.toString().equals(DUMB.represent()))
			return getSecondaryElement().toString();
		
		if(getSecondaryElement().toString().equals(DUMB.represent()))
			return primaryElement.toString();
		
		if(getSecondaryElement().toString().equals(HERO.represent()))
			return TARGET_WITH_HERO.represent();
			
		return TARGET_WITH_BLOCK.represent();
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
