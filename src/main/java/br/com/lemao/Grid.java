package br.com.lemao;

import java.awt.Point;

import org.junit.Assert;

import br.com.lemao.core.Cell;
import br.com.lemao.directions.Direction;
import br.com.lemao.game_element.GameElement;
import br.com.lemao.game_element.GameElementFactory;

public class Grid {

	private Cell[][] grid;
		
	public Grid(Cell[][] level) {
		grid = level;
	}
	
	private boolean isDesiredPositionAWall(Point desiredPosition) {
		return getElement(desiredPosition).toString().equals(GameElement.StringRepresentation.WALL.represent());
	}

	private boolean isDesiredPositionABlock(Point desiredPosition) {
		return getElement(desiredPosition).toString().equals(GameElement.StringRepresentation.BLOCK.represent());
	}

	private boolean isDesiredPositionABlockOrWall(Point desiredPosition) {
		return isDesiredPositionABlock(desiredPosition) || isDesiredPositionAWall(desiredPosition);
	}
	
	public Cell getCellWithHero() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].toString().equals(GameElement.StringRepresentation.HERO.represent()) || grid[i][j].toString().equals(GameElement.StringRepresentation.TARGET_WITH_HERO.represent()))
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
	
	public GameElement getElement(int x, int y) {
		return getElement(new Point(x, y));
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
		
		if (!isDesiredPositionABlock(desiredPosition)) {
			moveGameElement(originalHeroPosition, desiredPosition);
			return;
		}
		
		Point blockDesiredPosition = direction.newPosition(desiredPosition);
		
		if (isDesiredPositionABlockOrWall(blockDesiredPosition))
			return;
		
		moveGameElements(originalHeroPosition, desiredPosition, blockDesiredPosition);
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
	
	@Override
	public String toString() {
		return grid.toString();
	}
	
}
