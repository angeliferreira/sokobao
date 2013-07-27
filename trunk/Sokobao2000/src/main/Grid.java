package main;

import static main.gameElement.GameElement.StringRepresentation.BLOCK;
import static main.gameElement.GameElement.StringRepresentation.HERO;
import static main.gameElement.GameElement.StringRepresentation.WALL;

import java.awt.Point;

import junit.framework.Assert;
import main.core.Cell;
import main.directions.Direction;
import main.gameElement.GameElement;
import main.gameElement.GameElementFactory;

public class Grid {

	private Cell[][] grid;
		
	public Grid(Cell[][] level) {
		grid = level;
	}
	
	private boolean isDesiredPositionAWall(Point desiredPosition) {
		return getElement(desiredPosition).toString().equals(WALL.represent());
	}

	private boolean isDesiredPositionABlock(Point desiredPosition) {
		return getElement(desiredPosition).toString().equals(BLOCK.represent());
	}

	private boolean isDesiredPositionABlockOrWall(Point desiredPosition) {
		return isDesiredPositionABlock(desiredPosition) || isDesiredPositionAWall(desiredPosition);
	}
	
	public Cell getCellWithHero() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].toString().equals(HERO.represent()))
					return grid[i][j];
			}
		}
		
		Assert.fail("Ops, no cell with Hero found here! :(");
		return null;		
	}

	public Cell[][] getGrid() {
		return grid;
	}
	
	public GameElement getElement(Point position) {
		return getCell(position).getSecondaryElement();
	}
	
	void setElement(GameElement gameElement, Point position) {
		getCell(position).setSecondaryElement(gameElement);
	}

	public Cell getCell(Point position) {
		return grid[position.y][position.x];
	}
	
	public void moveHero(Direction direction) {
		Point originalHeroPosition = getCellWithHero().getPosition();
		Point desiredPosition = direction.newPosition(originalHeroPosition);
		
		if (isDesiredPositionAWall(desiredPosition))
			return;
		
		if (isDesiredPositionABlock(desiredPosition)) {
			Point blockDesiredPosition = direction.newPosition(desiredPosition);
			
			if (isDesiredPositionABlockOrWall(blockDesiredPosition))
				return;
			
			moveGameElements(originalHeroPosition, desiredPosition, blockDesiredPosition);
		}
		
		moveGameElement(originalHeroPosition, desiredPosition);
	}

	public void moveGameElement(Point originalHeroPosition, Point desiredPosition) {
		moveGameElements(originalHeroPosition, desiredPosition, null);
	}
	
	private void moveGameElements(Point originalHeroPosition, Point desiredPosition, Point blockDesiredPosition) {
		if(blockDesiredPosition != null)
			getCell(blockDesiredPosition).setSecondaryElement(getElement(desiredPosition));
		
		getCell(desiredPosition).setSecondaryElement(getElement(originalHeroPosition));
		getCell(originalHeroPosition).setSecondaryElement(GameElementFactory.newDumbElement());
		
	}

	public void setCell(Cell cell) {
		grid[cell.getPosition().y][cell.getPosition().x] = cell; 
	}
	
}