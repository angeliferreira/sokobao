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

	public static Cell newCellWithDumbElement(Point position) {
		return new Cell(GameElementFactory.newDumbElement(), position);
	}

	public static Cell newCellWithWall(Point position) {
		return new Cell(GameElementFactory.newWall(), position);
	}
	
	public static Cell newCellWithHero(Point position) {
		return new Cell(GameElementFactory.newHero(), position);
	}
	
	public static Cell newCellWithBlock(Point position) {
		return new Cell(GameElementFactory.newBlock(), position);
	}
	
	public static Cell newCellWithTarget(Point position) {
		Cell cell = new Cell();
		cell.position = position;
		cell.primaryElement = GameElementFactory.newTarget();
		cell.secondaryElement = GameElementFactory.newDumbElement();
		return cell;
	}
	
	public static Cell newCell(String elementString, Point position) {
		if(elementString.equals(BLOCK.represent()))
			return newCellWithBlock(position);
		
		if(elementString.equals(HERO.represent()))
			return newCellWithHero(position);
		
		if(elementString.equals(WALL.represent()))
			return newCellWithWall(position);
		
		if(elementString.equals(TARGET.represent()))
			return newCellWithTarget(position);
		
		if(elementString.equals(DUMB.represent()))
			return newCellWithDumbElement(position);
		
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
